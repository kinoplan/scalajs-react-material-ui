package io.kinoplan.demo.components.demos.AppBar

import japgolly.scalajs.react.{BackendScope, React, ScalaComponent}
import japgolly.scalajs.react.vdom.all.{VdomElement, _}
import scalacss.ScalaCssReactImplicits

import io.kinoplan.demo.components.{ComponentContainer, Layout}
import io.kinoplan.demo.models.Message
import io.kinoplan.demo.styles.demos.AppBar.{BottomAppBarStyle, DefaultBottomAppBarStyle}
import io.kinoplan.scalajs.react.material.ui.core._
import io.kinoplan.scalajs.react.material.ui.icons.{MuiIcons, MuiIconsModule}

object BottomAppBar extends ScalaCssReactImplicits {
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
                      if (message.id == 1) MuiListSubheader()(css.subHeader(Layout.isPaletteLight), "Today") else EmptyVdom,
                      if (message.id == 3) MuiListSubheader()(css.subHeader(Layout.isPaletteLight), "Yesterday") else EmptyVdom,
                      MuiListItem(button = true)(
                        MuiAvatar()(alt := "Profile Picture", src := message.person),
                        MuiListItemText(primary = VdomNode(message.primary), secondary = VdomNode(message.secondary))
                      )
                    )
                  }
                )
              ),
              MuiAppBar(position = MuiAppBar.Position.relative, color = MuiAppBar.Color.primary)(css.appBar,
                MuiToolbar()(css.toolbar,
                  MuiIconButton(color = MuiIconButton.Color.inherit)(
                    aria.label := "Open drawer",
                    MuiIcons(MuiIconsModule.Menu)()
                  ),
                  div(
                    MuiIconButton(color = MuiIconButton.Color.inherit)(
                      MuiIcons(MuiIconsModule.Search)()
                    ),
                    MuiIconButton(color = MuiIconButton.Color.inherit)(
                      MuiIcons(MuiIconsModule.MoreVert)()
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
