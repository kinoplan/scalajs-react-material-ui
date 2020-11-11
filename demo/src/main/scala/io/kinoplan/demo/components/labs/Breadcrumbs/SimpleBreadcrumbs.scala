package io.kinoplan.demo.components.labs.Breadcrumbs

import japgolly.scalajs.react.{BackendScope, Callback, ScalaComponent}
import japgolly.scalajs.react.vdom.all.{VdomElement, _}
import scalacss.ScalaCssReactImplicits

import io.kinoplan.demo.components.ComponentContainer
import io.kinoplan.demo.styles.labs.Breadcrumbs.{BreadcrumbsStyle, DefaultBreadcrumbsStyle}
import io.kinoplan.scalajs.react.material.ui.core._
import io.kinoplan.scalajs.react.material.ui.lab.MuiBreadcrumbs

object SimpleBreadcrumbs extends ScalaCssReactImplicits {
  case class Props(style: BreadcrumbsStyle)

  class Backend(t: BackendScope[Props, Unit]) {
    def handleClick: Callback = Callback.alert("You clicked a breadcrumb.")

    def render(props: Props): VdomElement = {
      val css = props.style

      div(
        ComponentContainer("Simple breadcrumbs")(
          div(css.root,
            MuiPaper()(css.paper,
              MuiBreadcrumbs()(aria.label := "Breadcrumb",
                MuiLink(color = MuiLink.Color.inherit)(href := "/", onClick --> handleClick, "Material-UI"),
                MuiLink(color = MuiLink.Color.inherit)(href := "/#demos/app-bar/", onClick --> handleClick, "Lab"),
                MuiTypography(color = MuiTypography.Color.textPrimary)("Breadcrumb")
              )
            ),
            br(),
            MuiPaper()(css.paper,
              MuiBreadcrumbs()(aria.label := "Breadcrumb",
                MuiLink(color = MuiLink.Color.inherit)(href := "/", onClick --> handleClick, "Material-UI"),
                MuiLink(color = MuiLink.Color.inherit)(href := "/#demos/app-bar/", onClick --> handleClick, "Lab"),
                MuiLink(color = MuiLink.Color.textPrimary)(
                  href := "/#lab/breadcrumbs/",
                  aria.current := "page",
                  onClick --> handleClick,
                  "Breadcrumb"
                )
              )
            )
          )
        )
      )
    }
  }

  private val component = ScalaComponent.builder[Props]("SimpleBreadcrumbs")
    .renderBackend[Backend]
    .build

  def apply(style: BreadcrumbsStyle = DefaultBreadcrumbsStyle) = component(Props(style))
}
