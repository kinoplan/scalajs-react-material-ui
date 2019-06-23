package io.kinoplan.demo.components.demos.GridList

import io.kinoplan.demo.components.ComponentContainer
import io.kinoplan.demo.models.GridList.TileData
import io.kinoplan.demo.styles.demos.GridList.{AdvancedGridListStyle, DefaultAdvancedGridListStyle}
import io.kinoplan.scalajs.react.material.ui.core.{MuiGridList, MuiGridListTile, MuiGridListTileBar, MuiIconButton}
import io.kinoplan.scalajs.react.material.ui.icons.MuiStarBorderIcon
import japgolly.scalajs.react.vdom.Attr
import japgolly.scalajs.react.vdom.all._
import japgolly.scalajs.react.{BackendScope, ScalaComponent}
import scalacss.ScalaCssReactImplicits

object AdvancedGridList extends ScalaCssReactImplicits {
  case class Props(style: AdvancedGridListStyle)

  class Backend(t: BackendScope[Props, Unit]) {
    def render(props: Props): VdomElement = {
      val css = props.style

      div(
        ComponentContainer("Advanced Grid list")(
          div(css.root,
            MuiGridList(cellHeight = 200, spacing = 1)(css.gridList,
              TileData.default.toVdomArray { tile =>
                MuiGridListTile(cols = tile.featuredValue, rows = tile.featuredValue)(Attr("key") := tile.image,
                  img(src := tile.image, alt := tile.title),
                  MuiGridListTileBar(
                    title = Some(tile.title),
                    titlePosition = MuiGridListTileBar.TitlePosition.top,
                    actionIcon = Some(
                      MuiIconButton()(css.iconStyle,
                        MuiStarBorderIcon()
                      )
                    ),
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
