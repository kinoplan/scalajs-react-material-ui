package io.kinoplan.demo.components.demos.Buttons

import japgolly.scalajs.react.{BackendScope, ScalaComponent}
import japgolly.scalajs.react.vdom.all.{VdomElement, _}
import scalacss.ScalaCssReactImplicits

import io.kinoplan.demo.components.ComponentContainer
import io.kinoplan.demo.styles.demos.Buttons.{CommonButtonStyle, DefaultCommonButtonStyle}
import io.kinoplan.scalajs.react.material.ui.core.{MuiButton, MuiFab, MuiIconButton}
import io.kinoplan.scalajs.react.material.ui.icons.{MuiIcons, MuiIconsModule}

object ButtonSizes extends ScalaCssReactImplicits {
  case class Props(style: CommonButtonStyle)

  class Backend(t: BackendScope[Props, Unit]) {
    def render(props: Props): VdomElement = {
      val css = props.style

      div(
        ComponentContainer("Sizes")(
          div(
            div(
              MuiButton(size = MuiButton.Size.small)(css.marginButton,
                "Small"
              ),
              MuiButton(size = MuiButton.Size.medium)(css.marginButton,
                "Medium"
              ),
              MuiButton(size = MuiButton.Size.large)(css.marginButton,
                "Large"
              )
            ),
            div(
              MuiButton(
                variant = MuiButton.Variant.outlined,
                size = MuiButton.Size.small,
                color = MuiButton.Color.primary
              )(css.marginButton,
                "Small"
              ),
              MuiButton(
                variant = MuiButton.Variant.outlined,
                size = MuiButton.Size.medium,
                color = MuiButton.Color.primary
              )(css.marginButton,
                "Medium"
              ),
              MuiButton(
                variant = MuiButton.Variant.outlined,
                size = MuiButton.Size.large,
                color = MuiButton.Color.primary
              )(css.marginButton,
                "Large"
              )
            ),
            div(
              MuiButton(
                variant = MuiButton.Variant.contained,
                size = MuiButton.Size.small,
                color = MuiButton.Color.primary
              )(css.marginButton,
                "Small"
              ),
              MuiButton(
                variant = MuiButton.Variant.contained,
                size = MuiButton.Size.medium,
                color = MuiButton.Color.primary
              )(css.marginButton,
                "Medium"
              ),
              MuiButton(
                variant = MuiButton.Variant.contained,
                size = MuiButton.Size.large,
                color = MuiButton.Color.primary
              )(css.marginButton,
                "Large"
              )
            ),
            div(
              MuiFab(size = MuiFab.Size.small, color = MuiFab.Color.secondary)(css.marginButton,
                aria.label := "Add",
                MuiIcons(MuiIconsModule.Add)()
              ),
              MuiFab(size = MuiFab.Size.medium, color = MuiFab.Color.secondary)(css.marginButton,
                aria.label := "Add",
                MuiIcons(MuiIconsModule.Add)()
              ),
              MuiFab(color = MuiFab.Color.secondary)(css.marginButton,
                aria.label := "Add",
                MuiIcons(MuiIconsModule.Add)()
              )
            ),
            div(
              MuiFab(
                variant = MuiFab.Variant.extended,
                size = MuiFab.Size.small,
                color = MuiFab.Color.primary
              )(css.marginButton,
                aria.label := "Add",
                MuiIcons(MuiIconsModule.Navigation)()(css.extendedIcon),
                "Extended"
              ),
              MuiFab(
                variant = MuiFab.Variant.extended,
                size = MuiFab.Size.medium,
                color = MuiFab.Color.primary
              )(css.marginButton,
                aria.label := "Add",
                MuiIcons(MuiIconsModule.Navigation)()(css.extendedIcon),
                "Extended"
              ),
              MuiFab(variant = MuiFab.Variant.extended, color = MuiFab.Color.primary)(css.marginButton,
                aria.label := "Add",
                MuiIcons(MuiIconsModule.Navigation)()(css.extendedIcon),
                "Extended"
              )
            ),
            div(
              MuiIconButton()(css.marginButton,
                aria.label := "Delete",
                MuiIcons(MuiIconsModule.Delete)(fontSize = MuiIcons.FontSize.small)
              ),
              MuiIconButton()(css.marginButton,
                aria.label := "Delete",
                MuiIcons(MuiIconsModule.Delete)()
              ),
              MuiIconButton()(css.marginButton,
                aria.label := "Delete",
                MuiIcons(MuiIconsModule.Delete)(fontSize = MuiIcons.FontSize.large)
              )
            )
          )
        )
      )
    }
  }

  private val component = ScalaComponent.builder[Props]("ButtonSizes")
    .renderBackend[Backend]
    .build

  def apply(style: CommonButtonStyle = DefaultCommonButtonStyle) = component(Props(style))
}
