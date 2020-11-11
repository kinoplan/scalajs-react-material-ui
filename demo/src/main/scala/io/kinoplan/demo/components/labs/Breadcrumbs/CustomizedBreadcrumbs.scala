package io.kinoplan.demo.components.labs.Breadcrumbs

import japgolly.scalajs.react.{BackendScope, Callback, ReactEvent, ScalaComponent}
import japgolly.scalajs.react.vdom.all.{VdomElement, _}
import scalacss.ScalaCssReactImplicits

import io.kinoplan.demo.components.ComponentContainer
import io.kinoplan.demo.styles.labs.Breadcrumbs.{CustomizedBreadcrumbsStyle, DefaultCustomizedBreadcrumbsStyle}
import io.kinoplan.scalajs.react.material.ui.core._
import io.kinoplan.scalajs.react.material.ui.icons.{MuiIcons, MuiIconsModule}
import io.kinoplan.scalajs.react.material.ui.lab.MuiBreadcrumbs

object CustomizedBreadcrumbs extends ScalaCssReactImplicits {
  case class Props(style: CustomizedBreadcrumbsStyle)

  class Backend(t: BackendScope[Props, Unit]) {
    def handleClick: Callback = Callback.alert("You clicked a breadcrumb.")

    def handleChangeOnDelete: ReactEvent => Callback = _ => handleClick

    def render(props: Props): VdomElement = {
      val css = props.style

      div(
        ComponentContainer("Customized breadcrumbs")(
          MuiPaper()(css.root,
            MuiBreadcrumbs()(aria.label := "Breadcrumb",
              MuiChip(
                component = "a",
                label = VdomNode("Home"),
                avatar = MuiAvatar()(css.avatar,
                  MuiIcons(MuiIconsModule.Home)()
                )().rawElement
              )(css.chip, href := "#", onClick --> handleClick),
              MuiChip(component = "a", label = VdomNode("Catalog"))(css.chip, href := "#", onClick --> handleClick),
              MuiChip(
                label = VdomNode("Accessories"),
                onDelete = handleChangeOnDelete,
                deleteIcon = MuiIcons(MuiIconsModule.ExpandMore)()().rawElement
              )(css.chip, onClick --> handleClick)
            )
          )
        )
      )
    }
  }

  private val component = ScalaComponent.builder[Props]("CustomizedBreadcrumbs")
    .renderBackend[Backend]
    .build

  def apply(style: CustomizedBreadcrumbsStyle = DefaultCustomizedBreadcrumbsStyle) = component(Props(style))
}
