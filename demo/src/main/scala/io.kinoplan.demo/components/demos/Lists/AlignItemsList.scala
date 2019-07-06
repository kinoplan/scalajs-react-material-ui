package io.kinoplan.demo.components.demos.Lists

import io.kinoplan.demo.components.{ComponentContainer, Layout}
import io.kinoplan.demo.styles.demos.Lists.{DefaultListStyle, ListStyle}
import io.kinoplan.scalajs.react.material.ui.core.{MuiAvatar, MuiList, MuiListItem, MuiListItemAvatar, MuiListItemText, MuiTypography}
import japgolly.scalajs.react.vdom.all._
import japgolly.scalajs.react.{BackendScope, React, ScalaComponent}
import scalacss.ScalaCssReactImplicits

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
                  primary = Some("Brunch this weekend?"),
                  secondary = Some(React.Fragment(
                    MuiTypography(component = "span", color = MuiTypography.Color.textPrimary)(css.inline,
                      "Ali Connors"
                    ),
                    " — I'll be in your neighborhood doing errands this…"
                  ))
                )
              ),
              MuiListItem(alignItems = MuiListItem.AlignItems.flexStart)(
                MuiListItemAvatar()(
                  MuiAvatar()(alt := "Remy Sharp", src := "/static/images/avatar/2.jpg")
                ),
                MuiListItemText(
                  primary = Some("Summer BBQ"),
                  secondary = Some(React.Fragment(
                    MuiTypography(component = "span", color = MuiTypography.Color.textPrimary)(css.inline,
                      "to Scott, Alex, Jennifer"
                    ),
                    " — Wish I could come, but I'm out of town this…"
                  ))
                )
              ),
              MuiListItem(alignItems = MuiListItem.AlignItems.flexStart)(
                MuiListItemAvatar()(
                  MuiAvatar()(alt := "Remy Sharp", src := "/static/images/avatar/3.jpg")
                ),
                MuiListItemText(
                  primary = Some("Oui Oui"),
                  secondary = Some(React.Fragment(
                    MuiTypography(component = "span", color = MuiTypography.Color.textPrimary)(css.inline,
                      "Sandra Adams"
                    ),
                    " — Do you have Paris recommendations? Have you ever…"
                  ))
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
