package io.kinoplan.demo.components.demos.AppBar

import io.kinoplan.demo.components.ComponentContainer
import io.kinoplan.demo.models.Message
import io.kinoplan.demo.styles.demos.AppBar.{BottomAppBarStyle, DefaultBottomAppBarStyle}
import io.kinoplan.scalajs.react.material.ui.core.{MuiAppBar, MuiAvatar, MuiCssBaseline, MuiFab, MuiIconButton, MuiList, MuiListItem, MuiListItemText, MuiListSubheader, MuiPaper, MuiToolbar, MuiTypography}
import io.kinoplan.scalajs.react.material.ui.icons.{MuiAddIcon, MuiMenuIcon, MuiMoreVertIcon, MuiSearchIcon}
import japgolly.scalajs.react.vdom.all.{VdomElement, _}
import japgolly.scalajs.react.{BackendScope, React, ScalaComponent}
import scalacss.ScalaCssReact._

object BottomAppBar {
  case class Props(style: BottomAppBarStyle)

  class Backend(t: BackendScope[Props, Unit]) {
    def render(props: Props): VdomElement = {
      val css = props.style

      div(
        ComponentContainer("Bottom App Bar")(
          div(css.root,
            React.Fragment(
              MuiCssBaseline(),
              MuiPaper(square = true)(css.paper,
                MuiTypography(variant = MuiTypography.Variant.h5, gutterBottom = true)(css.text,
                  "Inbox"
                ),
                MuiList()(css.list,
                  Message.default.toVdomArray { message =>
                    React.Fragment.withKey(message.id)(
                      if (message.id == 1) MuiListSubheader()(css.subHeader, "Today") else EmptyVdom,
                      if (message.id == 3) MuiListSubheader()(css.subHeader, "Yesterday") else EmptyVdom,
                      MuiListItem(button = true)(
                        MuiAvatar(alt = Some("Profile Picture"), src = Some(message.person)),
                        MuiListItemText(primary = Some(VdomNode(message.primary)), secondary = Some(VdomNode(message.secondary)))
                      )
                    )
                  }
                )
              ),
              MuiAppBar(position = MuiAppBar.Position.relative, color = MuiAppBar.Color.primary)(css.appBar,
                MuiToolbar()(css.toolbar,
                  MuiIconButton(color = MuiIconButton.Color.inherit)(
                    aria.label := "Open drawer",
                    MuiMenuIcon()
                  ),
                  MuiFab(color = MuiFab.Color.secondary)(css.fabButton,
                    aria.label := "Add",
                    MuiAddIcon()
                  ),
                  div(
                    MuiIconButton(color = MuiIconButton.Color.inherit)(
                      MuiSearchIcon()
                    ),
                    MuiIconButton(color = MuiIconButton.Color.inherit)(
                      MuiMoreVertIcon()
                    )
                  )
                )
              )
            )
          )
        )
      )
    }
  }

  private val component = ScalaComponent.builder[Props]("BottomAppBar")
    .renderBackend[Backend]
    .build

  def apply(style: BottomAppBarStyle = DefaultBottomAppBarStyle) = component(Props(style))
}
