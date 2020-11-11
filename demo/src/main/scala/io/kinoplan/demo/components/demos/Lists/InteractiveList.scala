package io.kinoplan.demo.components.demos.Lists

import japgolly.scalajs.react.{BackendScope, ReactEventFromInput, ScalaComponent}
import japgolly.scalajs.react.vdom.Attr
import japgolly.scalajs.react.vdom.all._
import scalacss.ScalaCssReactImplicits

import io.kinoplan.demo.components.{ComponentContainer, Layout}
import io.kinoplan.demo.styles.demos.Lists.{DefaultInteractiveListStyle, InteractiveListStyle}
import io.kinoplan.scalajs.react.material.ui.core.{MuiAvatar, MuiCheckbox, MuiFormControlLabel, MuiFormGroup, MuiGrid, MuiIconButton, MuiList, MuiListItem, MuiListItemAvatar, MuiListItemIcon, MuiListItemSecondaryAction, MuiListItemText, MuiTypography}
import io.kinoplan.scalajs.react.material.ui.icons.{MuiIcons, MuiIconsModule}

object InteractiveList extends ScalaCssReactImplicits {
  case class Props(style: InteractiveListStyle)

  case class State(dense: Boolean = false, secondary: Boolean = false) {
    def handleDense(value: Boolean) = copy(dense = value)

    def handleSecondary(value: Boolean) = copy(secondary = value)
  }

  class Backend(t: BackendScope[Props, State]) {
    def handleDense(event: ReactEventFromInput) = {
      val value = event.target.checked

      t.modState(_.handleDense(value))
    }

    def handleSecondary(event: ReactEventFromInput) = {
      val value = event.target.checked

      t.modState(_.handleSecondary(value))
    }

    def render(props: Props, state: State): VdomElement = {
      val css = props.style

      val demoStyle = css.demo(Layout.isPaletteLight)

      div(
        ComponentContainer("Interactive List")(
          div(css.root,
            MuiFormGroup(row = true)(
              MuiFormControlLabel(
                control = MuiCheckbox()(
                  onChange ==> handleDense,
                  value := "dense",
                  checked := state.dense
                ).rawElement,
                label = VdomNode("Enable dense")
              ),
              MuiFormControlLabel(
                control = MuiCheckbox()(
                  onChange ==> handleSecondary,
                  value := "secondary",
                  checked := state.secondary
                ).rawElement,
                label = VdomNode("Enable secondary text")
              )
            ),
            MuiGrid(container = true, spacing = MuiGrid.Spacing.`16`)(
              MuiGrid(item = true, xs = 12, md = 6)(
                MuiTypography(variant = MuiTypography.Variant.h6)(css.title, "Text only"),
                div(demoStyle,
                  MuiList(dense = state.dense)(
                    List(1, 2, 3).toVdomArray { generateKey =>
                      MuiListItem()(Attr("key") := generateKey,
                        MuiListItemText(
                          primary = VdomNode("Single-line item"),
                          secondary = if (state.secondary) VdomNode("Secondary text") else EmptyVdom
                        )
                      )
                    }
                  )
                )
              ),
              MuiGrid(item = true, xs = 12, md = 6)(
                MuiTypography(variant = MuiTypography.Variant.h6)(css.title, "Icon with text"),
                div(demoStyle,
                  MuiList(dense = state.dense)(
                    List(1, 2, 3).toVdomArray { generateKey =>
                      MuiListItem()(Attr("key") := generateKey,
                        MuiListItemIcon()(
                          MuiIcons(MuiIconsModule.Folder)()
                        ),
                        MuiListItemText(
                          primary = VdomNode("Single-line item"),
                          secondary = if (state.secondary) VdomNode("Secondary text") else EmptyVdom
                        )
                      )
                    }
                  )
                )
              )
            ),
            MuiGrid(container = true, spacing = MuiGrid.Spacing.`16`)(
              MuiGrid(item = true, xs = 12, md = 6)(
                MuiTypography(variant = MuiTypography.Variant.h6)(css.title, "Avatar with text"),
                div(demoStyle,
                  MuiList(dense = state.dense)(
                    List(1, 2, 3).toVdomArray { generateKey =>
                      MuiListItem()(Attr("key") := generateKey,
                        MuiListItemAvatar()(
                          MuiAvatar()(
                            MuiIcons(MuiIconsModule.Folder)()
                          )
                        ),
                        MuiListItemText(
                          primary = VdomNode("Single-line item"),
                          secondary = if (state.secondary) VdomNode("Secondary text") else EmptyVdom
                        )
                      )
                    }
                  )
                )
              ),
              MuiGrid(item = true, xs = 12, md = 6)(
                MuiTypography(variant = MuiTypography.Variant.h6)(css.title, "Avatar with text and icon"),
                div(demoStyle,
                  MuiList(dense = state.dense)(
                    List(1, 2, 3).toVdomArray { generateKey =>
                      MuiListItem()(Attr("key") := generateKey,
                        MuiListItemAvatar()(
                          MuiAvatar()(
                            MuiIcons(MuiIconsModule.Folder)()
                          )
                        ),
                        MuiListItemText(
                          primary = VdomNode("Single-line item"),
                          secondary = if (state.secondary) VdomNode("Secondary text") else EmptyVdom
                        ),
                        MuiListItemSecondaryAction()(
                          MuiIconButton()(
                            aria.label := "Delete",
                            MuiIcons(MuiIconsModule.Delete)()
                          )
                        )
                      )
                    }
                  )
                )
              )
            )
          )
        )
      )
    }
  }

  private val component = ScalaComponent.builder[Props]("InteractiveList")
    .initialState(State())
    .renderBackend[Backend]
    .build

  def apply(style: InteractiveListStyle = DefaultInteractiveListStyle) = component(Props(style))
}

