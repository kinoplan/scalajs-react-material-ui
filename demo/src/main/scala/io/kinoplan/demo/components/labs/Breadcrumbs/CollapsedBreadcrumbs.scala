package io.kinoplan.demo.components.labs.Breadcrumbs

import japgolly.scalajs.react.{BackendScope, Callback, ScalaComponent}
import japgolly.scalajs.react.vdom.all.{VdomElement, _}
import scalacss.ScalaCssReactImplicits

import io.kinoplan.demo.components.ComponentContainer
import io.kinoplan.demo.styles.labs.Breadcrumbs.{BreadcrumbsStyle, DefaultBreadcrumbsStyle}
import io.kinoplan.scalajs.react.material.ui.core._
import io.kinoplan.scalajs.react.material.ui.lab.MuiBreadcrumbs

object CollapsedBreadcrumbs extends ScalaCssReactImplicits {
  case class Props(style: BreadcrumbsStyle)

  class Backend(t: BackendScope[Props, Unit]) {
    def handleClick: Callback = Callback.alert("You clicked a breadcrumb.")

    def render(props: Props): VdomElement = {
      val css = props.style

      div(
        ComponentContainer("Collapsed breadcrumbs")(
          div(css.root,
            MuiPaper()(css.paper,
              MuiBreadcrumbs(maxItems = 2)(aria.label := "Breadcrumb",
                MuiLink(color = MuiLink.Color.inherit)(href := "#", onClick --> handleClick, "Home"),
                MuiLink(color = MuiLink.Color.inherit)(href := "#", onClick --> handleClick, "Catalog"),
                MuiLink(color = MuiLink.Color.inherit)(href := "#", onClick --> handleClick, "Accessories"),
                MuiLink(color = MuiLink.Color.inherit)(href := "#", onClick --> handleClick, "New Collection"),
                MuiTypography(color = MuiTypography.Color.textPrimary)("Belts")
              )
            )
          )
        )
      )
    }
  }

  private val component = ScalaComponent.builder[Props]("CollapsedBreadcrumbs")
    .renderBackend[Backend]
    .build

  def apply(style: BreadcrumbsStyle = DefaultBreadcrumbsStyle) = component(Props(style))
}
