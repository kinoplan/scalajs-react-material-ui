package io.kinoplan.demo.components.labs.Breadcrumbs

import japgolly.scalajs.react.{BackendScope, Callback, ScalaComponent}
import japgolly.scalajs.react.vdom.all.{VdomElement, _}
import scalacss.ScalaCssReactImplicits

import io.kinoplan.demo.components.ComponentContainer
import io.kinoplan.demo.styles.labs.Breadcrumbs.{BreadcrumbsStyle, DefaultBreadcrumbsStyle}
import io.kinoplan.scalajs.react.material.ui.core._
import io.kinoplan.scalajs.react.material.ui.icons.{MuiIcons, MuiIconsModule}
import io.kinoplan.scalajs.react.material.ui.lab.MuiBreadcrumbs

object IconBreadcrumbs extends ScalaCssReactImplicits {
  case class Props(style: BreadcrumbsStyle)

  class Backend(t: BackendScope[Props, Unit]) {
    def handleClick: Callback = Callback.alert("You clicked a breadcrumb.")

    def render(props: Props): VdomElement = {
      val css = props.style

      div(
        ComponentContainer("Breadcrumbs with icons")(
          div(css.root,
            MuiPaper()(css.paper,
              MuiBreadcrumbs()(aria.label := "Breadcrumb",
                MuiLink(color = MuiLink.Color.inherit)(css.link,
                  href := "/",
                  onClick --> handleClick,
                  MuiIcons(MuiIconsModule.Home)()(css.icon),
                  "Material-UI"
                ),
                MuiLink(color = MuiLink.Color.inherit)(css.link,
                  href := "/#demos/app-bar/",
                  onClick --> handleClick,
                  MuiIcons(MuiIconsModule.Whatshot)()(css.icon),
                  "Lab"
                ),
                MuiTypography(color = MuiTypography.Color.textPrimary)(css.link,
                  MuiIcons(MuiIconsModule.Grain)()(css.icon),
                  "Breadcrumb"
                )
              )
            )
          )
        )
      )
    }
  }

  private val component = ScalaComponent.builder[Props]("IconBreadcrumbs")
    .renderBackend[Backend]
    .build

  def apply(style: BreadcrumbsStyle = DefaultBreadcrumbsStyle) = component(Props(style))
}
