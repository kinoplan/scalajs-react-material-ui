package io.kinoplan.demo.components.demos.Buttons

import japgolly.scalajs.react.{BackendScope, ScalaComponent}
import japgolly.scalajs.react.vdom.all.{VdomElement, _}
import scalacss.ScalaCssReactImplicits

import io.kinoplan.demo.components.ComponentContainer
import io.kinoplan.demo.styles.demos.Buttons.{CommonButtonStyle, DefaultCommonButtonStyle}
import io.kinoplan.scalajs.react.material.ui.core.{MuiIcon, MuiIconButton}
import io.kinoplan.scalajs.react.material.ui.icons.{MuiIcons, MuiIconsModule}

object IconButtons extends ScalaCssReactImplicits {
  case class Props(style: CommonButtonStyle)

  class Backend(t: BackendScope[Props, Unit]) {
    def render(props: Props): VdomElement = {
      val css = props.style

      div(
        ComponentContainer("Icon Buttons")(
          div(
            MuiIconButton()(css.marginButton,
              aria.label := "Delete",
              MuiIcons(MuiIconsModule.Delete)()
            ),
            MuiIconButton(color = MuiIconButton.Color.primary)(css.marginButton,
              disabled := true,
              aria.label := "Delete",
              MuiIcons(MuiIconsModule.Delete)()
            ),
            MuiIconButton(color = MuiIconButton.Color.secondary)(css.marginButton,
              aria.label := "Add an alarm",
              MuiIcon()("alarm")
            ),
            MuiIconButton(color = MuiIconButton.Color.primary)(css.marginButton,
              aria.label := "Add to shopping cart",
              MuiIcons(MuiIconsModule.AddShoppingCart)()
            ),
            input.file(css.inputButton, accept := "image/*", id := "icon-button-file"),
            label(htmlFor := "icon-button-file")(
              MuiIconButton(color = MuiIconButton.Color.primary, component = "span")(css.marginButton,
                MuiIcons(MuiIconsModule.PhotoCamera)()
              )
            )
          )
        )
      )
    }
  }

  private val component = ScalaComponent.builder[Props]("IconButtons")
    .renderBackend[Backend]
    .build

  def apply(style: CommonButtonStyle = DefaultCommonButtonStyle) = component(Props(style))
}
