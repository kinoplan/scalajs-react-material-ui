package io.kinoplan.demo.components.demos.Chips

import scala.scalajs.js.JSConverters._

import japgolly.scalajs.react.{BackendScope, Callback, ReactEvent, ReactEventFromInput, ScalaComponent}
import japgolly.scalajs.react.vdom.all._
import scalacss.ScalaCssReactImplicits

import io.kinoplan.demo.components.ComponentContainer
import io.kinoplan.demo.styles.demos.Chips.{ChipsPlaygroundStyle, DefaultChipsPlaygroundStyle}
import io.kinoplan.demo.utils.Helpers.StringExtended
import io.kinoplan.scalajs.react.material.ui.core._
import io.kinoplan.scalajs.react.material.ui.icons.{MuiIcons, MuiIconsModule}

object ChipsPlayground extends ScalaCssReactImplicits {
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
    def handleChangeColor: ReactEventFromInput => Callback = e => {
      val value = e.target.value

      t.modState(_.handleChangeColor(value))
    }

    def handleChangeOnDelete: ReactEventFromInput => Callback = e => {
      val value = e.target.value

      t.modState(_.handleChangeOnDelete(value))
    }

    def handleChangeAvatar: ReactEventFromInput => Callback = e => {
      val value = e.target.value

      t.modState(_.handleChangeAvatar(value))
    }

    def handleChangeIcon: ReactEventFromInput => Callback = e => {
      val value = e.target.value

      t.modState(_.handleChangeIcon(value))
    }

    def handleChangeVariant: ReactEventFromInput => Callback = e => {
      val value = e.target.value

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
          case _ => Some(MuiIcons(MuiIconsModule.Face)()().rawElement)
        }
      }

      val avatarToPlayground = state.avatar match {
        case "none" => None
        case "img" => Some(MuiAvatar()(src := "/static/images/avatar/1.jpg")().rawElement)
        case "letter" => Some(MuiAvatar()("FH").rawElement)
        case _ => Some(MuiAvatar()(MuiIcons(MuiIconsModule.Face)()).rawElement)
      }

      div(
        ComponentContainer("Chip Playground")(
          MuiGrid(item = true, container = true)(css.root,
            MuiGrid(item = true, xs = 12)(
              MuiGrid(
                container = true,
                justify = MuiGrid.Justify.center,
                alignItems = MuiGrid.AlignItems.center,
                spacing = MuiGrid.Spacing.`40`
              )(
                MuiGrid(item = true)(css.chipWrapper,
                  MuiChip(
                    label = "Awesome Chip Component".toVdom,
                    color = state.color,
                    deleteIcon = (if (state.isOnDeleteCustom) {
                      Some(MuiIcons(MuiIconsModule.Done)()().rawElement)
                    } else {
                      None
                    }).orUndefined,
                    onDelete = handleDeleteExample(state),
                    avatar = avatarToPlayground.orUndefined,
                    icon = iconToPlayground.orUndefined,
                    variant = state.variant
                  )
                )
              )
            ),
            MuiGrid(item = true, xs = 12)(
              MuiPaper()(css.control,
                MuiGrid(item = true, container = true, spacing = MuiGrid.Spacing.`24`)(
                  MuiGrid(item = true, xs = 12)(
                    MuiFormControl(component = "fieldset")(
                      MuiFormLabel()("color"),
                      MuiRadioGroup(row = true)(
                        name := "color",
                        value := state.color,
                        onChange ==> handleChangeColor,
                        aria.label := "color",
                        MuiFormControlLabel(
                          control = MuiRadio()().rawElement,
                          label = "default".toVdom
                        )(value := "default"),
                        MuiFormControlLabel(
                          control = MuiRadio()().rawElement,
                          label = "primary".toVdom
                        )(value := "primary"),
                        MuiFormControlLabel(
                          control = MuiRadio()().rawElement,
                          label = "secondary".toVdom
                        )(value := "secondary")
                      )
                    )
                  ),
                  MuiGrid(item = true, xs = 12)(
                    MuiFormControl(component = "fieldset")(
                      MuiFormLabel()("onDelete"),
                      MuiRadioGroup(row = true)(
                        name := "onDelete",
                        value := state.onDelete,
                        onChange ==> handleChangeOnDelete,
                        aria.label := "onDelete",
                        MuiFormControlLabel(
                          control = MuiRadio()().rawElement,
                          label = "none".toVdom
                        )(value := "none"),
                        MuiFormControlLabel(
                          control = MuiRadio()().rawElement,
                          label = "default".toVdom
                        )(value := "default"),
                        MuiFormControlLabel(
                          control = MuiRadio()().rawElement,
                          label = "custom".toVdom
                        )(value := "custom")
                      )
                    )
                  ),
                  MuiGrid(item = true, xs = 12)(
                    MuiFormControl(component = "fieldset")(
                      MuiFormLabel()("icon"),
                      MuiRadioGroup(row = true)(
                        name := "icon",
                        value := state.icon,
                        onChange ==> handleChangeIcon,
                        aria.label := "icon",
                        MuiFormControlLabel(
                          control = MuiRadio()().rawElement,
                          label = "none".toVdom
                        )(value := "none"),
                        MuiFormControlLabel(
                          control = MuiRadio()().rawElement,
                          label = "icon".toVdom
                        )(value := "icon")
                      )
                    )
                  ),
                  MuiGrid(item = true, xs = 12)(
                    MuiFormControl(component = "fieldset")(
                      MuiFormLabel()("avatar"),
                      MuiRadioGroup(row = true)(
                        name := "avatar",
                        value := state.avatar,
                        onChange ==> handleChangeAvatar,
                        aria.label := "avatar",
                        MuiFormControlLabel(
                          control = MuiRadio()().rawElement,
                          label = "none".toVdom
                        )(value := "none"),
                        MuiFormControlLabel(
                          control = MuiRadio()().rawElement,
                          label = "letter".toVdom
                        )(value := "letter"),
                        MuiFormControlLabel(
                          control = MuiRadio()().rawElement,
                          label = "img".toVdom
                        )(value := "img"),
                        MuiFormControlLabel(
                          control = MuiRadio()().rawElement,
                          label = "icon".toVdom
                        )(value := "icon")
                      )
                    )
                  ),
                  MuiGrid(item = true, xs = 12)(
                    MuiFormControl(component = "fieldset")(
                      MuiFormLabel()("variant"),
                      MuiRadioGroup(row = true)(
                        name := "variant",
                        value := state.variant,
                        onChange ==> handleChangeVariant,
                        aria.label := "variant",
                        MuiFormControlLabel(
                          control = MuiRadio()().rawElement,
                          label = "default".toVdom
                        )(value := "default"),
                        MuiFormControlLabel(
                          control = MuiRadio()().rawElement,
                          label = "outlined".toVdom
                        )(value := "outlined")
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
