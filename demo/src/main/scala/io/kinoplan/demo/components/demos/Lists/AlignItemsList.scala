package io.kinoplan.demo.components.demos.Lists

import japgolly.scalajs.react.{BackendScope, React, ScalaComponent}
import japgolly.scalajs.react.vdom.all._
import scalacss.ScalaCssReactImplicits

import io.kinoplan.demo.components.{ComponentContainer, Layout}
import io.kinoplan.demo.styles.demos.Lists.{DefaultListStyle, ListStyle}
import io.kinoplan.scalajs.react.material.ui.core.{MuiAvatar, MuiList, MuiListItem, MuiListItemAvatar, MuiListItemText, MuiTypography}

object AlignItemsList extends ScalaCssReactImplicits {
  case class Props(style: ListStyle)

  class Backend(t: BackendScope[Props, Unit]) {
    def render(props: Props): VdomElement = {
      val css = props.style

      div(
        ComponentContainer("Align list items")(
          div(css.root, css.rootPaper(Layout.isPaletteLight),
            MuiList()(
              MuiListItem(alignItems = MuiListItem.AlignItems.flexStart)(
                MuiListItemAvatar()(
                  MuiAvatar()(alt := "Remy Sharp", src := "/static/images/avatar/1.jpg")
                ),
                MuiListItemText(
                  primary = VdomNode("Brunch this weekend?"),
                  secondary = React.Fragment(
                    MuiTypography(component = "span", color = MuiTypography.Color.textPrimary)(css.inline,
                      "Ali Connors"
                    ),
                    " — I'll be in your neighborhood doing errands this…"
                  )
                )
              ),
              MuiListItem(alignItems = MuiListItem.AlignItems.flexStart)(
                MuiListItemAvatar()(
                  MuiAvatar()(alt := "Remy Sharp", src := "/static/images/avatar/2.jpg")
                ),
                MuiListItemText(
                  primary = VdomNode("Summer BBQ"),
                  secondary = React.Fragment(
                    MuiTypography(component = "span", color = MuiTypography.Color.textPrimary)(css.inline,
                      "to Scott, Alex, Jennifer"
                    ),
                    " — Wish I could come, but I'm out of town this…"
                  )
                )
              ),
              MuiListItem(alignItems = MuiListItem.AlignItems.flexStart)(
                MuiListItemAvatar()(
                  MuiAvatar()(alt := "Remy Sharp", src := "/static/images/avatar/3.jpg")
                ),
                MuiListItemText(
                  primary = VdomNode("Oui Oui"),
                  secondary = React.Fragment(
                    MuiTypography(component = "span", color = MuiTypography.Color.textPrimary)(css.inline,
                      "Sandra Adams"
                    ),
                    " — Do you have Paris recommendations? Have you ever…"
                  )
                )
              )
            )
          )
        )
      )
    }
  }

  private val component = ScalaComponent.builder[Props]("AlignItemsList")
    .renderBackend[Backend]
    .build

  def apply(style: ListStyle = DefaultListStyle) = component(Props(style))
}
