package io.kinoplan.demo.components

import japgolly.scalajs.react.{BackendScope, PropsChildren, ScalaComponent}
import japgolly.scalajs.react.vdom.all._
import scalacss.ScalaCssReactImplicits

import io.kinoplan.demo.styles.{DefaultTabContainerStyle, TabContainerStyle}
import io.kinoplan.scalajs.react.material.ui.core.MuiTypography

object TabContainer extends ScalaCssReactImplicits {
  case class Props(style: TabContainerStyle)

  class Backend(t: BackendScope[Props, Unit]) {
    def render(props: Props, children: PropsChildren): VdomNode = {
      val css = props.style

      MuiTypography(component = "div")(css.root,
        children
      )
    }
  }

  private val component = ScalaComponent.builder[Props]("TabContainer")
    .renderBackendWithChildren[Backend]
    .build

  def apply(
    style: TabContainerStyle = DefaultTabContainerStyle
  )(children: VdomNode*): VdomNode = component(Props(style))(children:_*)
}
