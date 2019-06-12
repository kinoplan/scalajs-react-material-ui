package io.kinoplan.demo.components.demos.Chips

import io.kinoplan.demo.components.ComponentContainer
import io.kinoplan.demo.styles.demos.Chips.{ChipsPlaygroundStyle, DefaultChipsPlaygroundStyle}
import io.kinoplan.demo.utils.Constants.HOST
import io.kinoplan.scalajs.react.material.ui.core.{MuiAvatar, MuiChip, MuiFormControl, MuiFormControlLabel, MuiFormLabel, MuiGrid, MuiPaper, MuiRadio, MuiRadioGroup}
import io.kinoplan.scalajs.react.material.ui.icons.{MuiDoneIcon, MuiFaceIcon}
import japgolly.scalajs.react.vdom.all.{VdomElement, _}
import japgolly.scalajs.react.{BackendScope, Callback, ReactEvent, ScalaComponent}
import scalacss.ScalaCssReact._

object ChipsPlayground {
  case class Props(style: ChipsPlaygroundStyle)

  case class State(
    color: MuiChip.Color.Value = MuiChip.Color.default,
    onDelete: String = "none",
    avatar: String = "none",
    icon: String = "none",
    variant: String = "default"
  ) {
    val isOnDeleteCustom = onDelete == "custom"

    val isOnDeleteNotNone = onDelete != "none"

    val isAvatarNotNone = avatar != "none"

    def handleChangeColor(value: String) = copy(color = value)

    def handleChangeOnDelete(value: String) = copy(onDelete = value)

    def handleChangeAvatar(value: String) = copy(avatar = value)

    def handleChangeIcon(value: String) = copy(icon = value)

    def handleChangeVariant(value: String) = copy(variant = value)
  }

  class Backend(t: BackendScope[Props, State]) {
    def handleChangeColor: (ReactEvent, String) => Callback = (_, value) => {
      t.modState(_.handleChangeColor(value))
    }

    def handleChangeOnDelete: (ReactEvent, String) => Callback = (_, value) => {
      t.modState(_.handleChangeOnDelete(value))
    }

    def handleChangeAvatar: (ReactEvent, String) => Callback = (_, value) => {
      t.modState(_.handleChangeAvatar(value))
    }

    def handleChangeIcon: (ReactEvent, String) => Callback = (_, value) => {
      t.modState(_.handleChangeIcon(value))
    }

    def handleChangeVariant: (ReactEvent, String) => Callback = (_, value) => {
      t.modState(_.handleChangeVariant(value))
    }

    def handleDeleteExample(state: State): ReactEvent => Callback = _ => {
      Callback.alert("You clicked the delete icon.").when_(state.isOnDeleteNotNone)
    }

    def render(props: Props, state: State): VdomElement = {
      val css = props.style

      val iconToPlayground = if (state.isAvatarNotNone) {
        None
      } else {
        state.icon match {
          case "none" => None
          case _ => Some(MuiFaceIcon()().rawElement)
        }
      }

      val avatarToPlayground = state.avatar match {
        case "none" => None
        case "img" => Some(MuiAvatar(src = Some(s"$HOST/static/images/avatar/1.jpg"))().rawElement)
        case "letter" => Some(MuiAvatar()("FH").rawElement)
        case _ => Some(MuiAvatar()(MuiFaceIcon()).rawElement)
      }

      div(
        ComponentContainer("Chip Playground")(
          MuiGrid(item = true, container = true)(css.root,
            MuiGrid(item = true, xs = 12)(
              MuiGrid(
                container = true,
                justify = MuiGrid.Justify.center,
                alignItems = MuiGrid.AlignItems.center,
                spacing = MuiGrid.Spacing.forty
              )(
                MuiGrid(item = true)(css.chipWrapper,
                  MuiChip(
                    label = Some("Awesome Chip Component"),
                    color = state.color,
                    deleteIcon = if (state.isOnDeleteCustom) Some(MuiDoneIcon()().rawElement) else None,
                    onDelete = handleDeleteExample(state),
                    avatar = avatarToPlayground,
                    icon = iconToPlayground,
                    variant = state.variant
                  )
                )
              )
            ),
            MuiGrid(item = true, xs = 12)(
              MuiPaper()(css.control,
                MuiGrid(item = true, container = true, spacing = MuiGrid.Spacing.twentyFour)(
                  MuiGrid(item = true, xs = 12)(
                    MuiFormControl(component = "fieldset")(
                      MuiFormLabel()("color"),
                      MuiRadioGroup(
                        row = true,
                        name = Some("color"),
                        value = Some(state.color),
                        onChange = handleChangeColor
                      )(
                        aria.label := "color",
                        MuiFormControlLabel(
                          value = Some("default"),
                          control = Some(MuiRadio()().rawElement),
                          label = Some("default")
                        ),
                        MuiFormControlLabel(
                          value = Some("primary"),
                          control = Some(MuiRadio()().rawElement),
                          label = Some("primary")
                        ),
                        MuiFormControlLabel(
                          value = Some("secondary"),
                          control = Some(MuiRadio()().rawElement),
                          label = Some("secondary")
                        )
                      )
                    )
                  ),
                  MuiGrid(item = true, xs = 12)(
                    MuiFormControl(component = "fieldset")(
                      MuiFormLabel()("onDelete"),
                      MuiRadioGroup(
                        row = true,
                        name = Some("onDelete"),
                        value = Some(state.onDelete),
                        onChange = handleChangeOnDelete
                      )(
                        aria.label := "onDelete",
                        MuiFormControlLabel(
                          value = Some("none"),
                          control = Some(MuiRadio()().rawElement),
                          label = Some("none")
                        ),
                        MuiFormControlLabel(
                          value = Some("default"),
                          control = Some(MuiRadio()().rawElement),
                          label = Some("default")
                        ),
                        MuiFormControlLabel(
                          value = Some("custom"),
                          control = Some(MuiRadio()().rawElement),
                          label = Some("custom")
                        )
                      )
                    )
                  ),
                  MuiGrid(item = true, xs = 12)(
                    MuiFormControl(component = "fieldset")(
                      MuiFormLabel()("icon"),
                      MuiRadioGroup(
                        row = true,
                        name = Some("icon"),
                        value = Some(state.icon),
                        onChange = handleChangeIcon
                      )(
                        aria.label := "icon",
                        MuiFormControlLabel(
                          value = Some("none"),
                          control = Some(MuiRadio()().rawElement),
                          label = Some("none")
                        ),
                        MuiFormControlLabel(
                          value = Some("icon"),
                          control = Some(MuiRadio()().rawElement),
                          label = Some("icon")
                        )
                      )
                    )
                  ),
                  MuiGrid(item = true, xs = 12)(
                    MuiFormControl(component = "fieldset")(
                      MuiFormLabel()("avatar"),
                      MuiRadioGroup(
                        row = true,
                        name = Some("avatar"),
                        value = Some(state.avatar),
                        onChange = handleChangeAvatar
                      )(
                        aria.label := "avatar",
                        MuiFormControlLabel(
                          value = Some("none"),
                          control = Some(MuiRadio()().rawElement),
                          label = Some("none")
                        ),
                        MuiFormControlLabel(
                          value = Some("letter"),
                          control = Some(MuiRadio()().rawElement),
                          label = Some("letter")
                        ),
                        MuiFormControlLabel(
                          value = Some("img"),
                          control = Some(MuiRadio()().rawElement),
                          label = Some("img")
                        ),
                        MuiFormControlLabel(
                          value = Some("icon"),
                          control = Some(MuiRadio()().rawElement),
                          label = Some("icon")
                        )
                      )
                    )
                  ),
                  MuiGrid(item = true, xs = 12)(
                    MuiFormControl(component = "fieldset")(
                      MuiFormLabel()("variant"),
                      MuiRadioGroup(
                        row = true,
                        name = Some("variant"),
                        value = Some(state.variant),
                        onChange = handleChangeVariant
                      )(
                        aria.label := "variant",
                        MuiFormControlLabel(
                          value = Some("default"),
                          control = Some(MuiRadio()().rawElement),
                          label = Some("default")
                        ),
                        MuiFormControlLabel(
                          value = Some("outlined"),
                          control = Some(MuiRadio()().rawElement),
                          label = Some("outlined")
                        )
                      )
                    )
                  )
                )
              )
            )
          )
        )
      )
    }
  }

  private val component = ScalaComponent.builder[Props]("ChipsPlayground")
    .initialState(State())
    .renderBackend[Backend]
    .build

  def apply(style: ChipsPlaygroundStyle = DefaultChipsPlaygroundStyle) = component(Props(style))
}
