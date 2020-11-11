package io.kinoplan.demo.components.demos.GridList

import scala.scalajs.js

import japgolly.scalajs.react.{BackendScope, ScalaComponent}
import japgolly.scalajs.react.vdom.Attr
import japgolly.scalajs.react.vdom.all._
import scalacss.ScalaCssReactImplicits

import io.kinoplan.demo.components.{ComponentContainer, Layout}
import io.kinoplan.demo.models.GridList.TileData
import io.kinoplan.demo.styles.demos.GridList.{DefaultTitlebarGridListStyle, TitlebarGridListStyle}
import io.kinoplan.scalajs.react.material.ui.core.{MuiGridList, MuiGridListTile, MuiGridListTileBar, MuiIconButton, MuiListSubheader}
import io.kinoplan.scalajs.react.material.ui.icons.{MuiIcons, MuiIconsModule}

object TitlebarGridList extends ScalaCssReactImplicits {
  case class Props(style: TitlebarGridListStyle)

  class Backend(t: BackendScope[Props, Unit]) {
    def render(props: Props): VdomElement = {
      val css = props.style

      div(
        ComponentContainer("Grid list with titlebars")(
          div(css.root, css.rootPaper(Layout.isPaletteLight),
            MuiGridList()(css.gridList,
              MuiGridListTile()(Attr("key") := "Subheader", style := js.Dictionary("height" -> "auto"),
                cols := 2,
                MuiListSubheader(component = "div")("December")
              ),
              TileData.default.toVdomArray { tile =>
                MuiGridListTile()(Attr("key") := tile.image,
                  img(src := tile.image, alt := tile.title),
                  MuiGridListTileBar(
                    title = VdomNode(tile.title),
                    subtitle = VdomNode(span(s"by: ${tile.author}").rawNode),
                    actionIcon = VdomNode(MuiIconButton()(css.iconStyle, MuiIcons(MuiIconsModule.Info)()).rawNode)
                  )
                )
              }
            )
          )
        )
      )
    }
  }

  private val component = ScalaComponent.builder[Props]("TitlebarGridList")
    .renderBackend[Backend]
    .build

  def apply(style: TitlebarGridListStyle = DefaultTitlebarGridListStyle) = component(Props(style))
}
