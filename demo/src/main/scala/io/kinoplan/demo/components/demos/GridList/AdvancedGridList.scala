package io.kinoplan.demo.components.demos.GridList

import japgolly.scalajs.react.{BackendScope, ScalaComponent}
import japgolly.scalajs.react.vdom.Attr
import japgolly.scalajs.react.vdom.all._
import scalacss.ScalaCssReactImplicits

import io.kinoplan.demo.components.{ComponentContainer, Layout}
import io.kinoplan.demo.models.GridList.TileData
import io.kinoplan.demo.styles.demos.GridList.{AdvancedGridListStyle, DefaultAdvancedGridListStyle}
import io.kinoplan.scalajs.react.material.ui.core.{MuiGridList, MuiGridListTile, MuiGridListTileBar, MuiIconButton}
import io.kinoplan.scalajs.react.material.ui.icons.{MuiIcons, MuiIconsModule}

object AdvancedGridList extends ScalaCssReactImplicits {
  case class Props(style: AdvancedGridListStyle)

  class Backend(t: BackendScope[Props, Unit]) {
    def render(props: Props): VdomElement = {
      val css = props.style

      div(
        ComponentContainer("Advanced Grid list")(
          div(css.root, css.rootPaper(Layout.isPaletteLight),
            MuiGridList(cellHeight = 200, spacing = 1)(css.gridList,
              TileData.default.toVdomArray { tile =>
                MuiGridListTile()(Attr("key") := tile.image,
                  cols := tile.featuredValue,
                  rows := tile.featuredValue,
                  img(src := tile.image, alt := tile.title),
                  MuiGridListTileBar(
                    title = VdomNode(tile.title),
                    titlePosition = MuiGridListTileBar.TitlePosition.top,
                    actionIcon = VdomNode(MuiIconButton()(css.iconStyle, MuiIcons(MuiIconsModule.StarBorder)()).rawNode),
                    actionPosition = MuiGridListTileBar.ActionPosition.left
                  )(css.titleBar)
                )
              }
            )
          )
        )
      )
    }
  }

  private val component = ScalaComponent.builder[Props]("AdvancedGridList")
    .renderBackend[Backend]
    .build

  def apply(style: AdvancedGridListStyle = DefaultAdvancedGridListStyle) = component(Props(style))
}
