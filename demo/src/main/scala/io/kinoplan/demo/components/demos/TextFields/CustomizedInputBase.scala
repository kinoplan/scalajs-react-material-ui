package io.kinoplan.demo.components.demos.TextFields

import japgolly.scalajs.react.{BackendScope, ScalaComponent}
import japgolly.scalajs.react.vdom.all._
import scalacss.ScalaCssReactImplicits

import io.kinoplan.demo.components.ComponentContainer
import io.kinoplan.demo.styles.demos.TextFields.{CustomizedInputBaseStyle, DefaultCustomizedInputBaseStyle}
import io.kinoplan.scalajs.react.material.ui.core.{MuiDivider, MuiIconButton, MuiInputBase, MuiPaper}
import io.kinoplan.scalajs.react.material.ui.icons.{MuiIcons, MuiIconsModule}

object CustomizedInputBase extends ScalaCssReactImplicits {
  case class Props(style: CustomizedInputBaseStyle)

  class Backend(t: BackendScope[Props, Unit]) {
    def render(props: Props): VdomElement = {
      val css = props.style

      div(
        ComponentContainer("Customized Input Base")(
          MuiPaper(elevation = 1)(css.root,
            MuiIconButton()(css.iconButton,
              aria.label := "Menu",
              MuiIcons(MuiIconsModule.Menu)()
            ),
            MuiInputBase()(css.input, placeholder := "Search Google Maps"),
            MuiIconButton()(css.iconButton,
              aria.label := "Search",
              MuiIcons(MuiIconsModule.Search)()
            ),
            MuiDivider()(css.divider),
            MuiIconButton(color = MuiIconButton.Color.primary)(css.iconButton,
              aria.label := "Directions",
              MuiIcons(MuiIconsModule.Directions)()
            )
          )
        )
      )
    }
  }

  private val component = ScalaComponent.builder[Props]("CustomizedInputBase")
    .renderBackend[Backend]
    .build

  def apply(style: CustomizedInputBaseStyle = DefaultCustomizedInputBaseStyle) = component(Props(style))
}
