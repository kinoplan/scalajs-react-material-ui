package io.kinoplan.demo.components.demos.TextFields

import io.kinoplan.demo.components.ComponentContainer
import io.kinoplan.demo.styles.demos.TextFields.{CustomizedInputBaseStyle, DefaultCustomizedInputBaseStyle}
import io.kinoplan.scalajs.react.material.ui.core.{MuiDivider, MuiIconButton, MuiInputBase, MuiPaper}
import io.kinoplan.scalajs.react.material.ui.icons.{MuiDirectionsIcon, MuiMenuIcon, MuiSearchIcon}
import japgolly.scalajs.react.vdom.all._
import japgolly.scalajs.react.{BackendScope, ScalaComponent}
import scalacss.ScalaCssReactImplicits

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
              MuiMenuIcon()
            ),
            MuiInputBase()(css.input, placeholder := "Search Google Maps"),
            MuiIconButton()(css.iconButton,
              aria.label := "Search",
              MuiSearchIcon()
            ),
            MuiDivider()(css.divider),
            MuiIconButton(color = MuiIconButton.Color.primary)(css.iconButton,
              aria.label := "Directions",
              MuiDirectionsIcon()
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
