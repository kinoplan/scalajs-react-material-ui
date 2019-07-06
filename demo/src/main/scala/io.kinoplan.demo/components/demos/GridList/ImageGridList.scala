package io.kinoplan.demo.components.demos.GridList

import io.kinoplan.demo.components.{ComponentContainer, Layout}
import io.kinoplan.demo.models.GridList.TileData
import io.kinoplan.demo.styles.demos.GridList.{DefaultImageGridListStyle, ImageGridListStyle}
import io.kinoplan.scalajs.react.material.ui.core.{MuiGridList, MuiGridListTile}
import japgolly.scalajs.react.vdom.Attr
import japgolly.scalajs.react.vdom.all._
import japgolly.scalajs.react.{BackendScope, ScalaComponent}
import scalacss.ScalaCssReactImplicits

object ImageGridList extends ScalaCssReactImplicits {
  case class Props(style: ImageGridListStyle)

  class Backend(t: BackendScope[Props, Unit]) {
    def render(props: Props): VdomElement = {
      val css = props.style

      div(
        ComponentContainer("Image-only Grid list")(
          div(css.root, css.rootPaper(Layout.isPaletteLight),
            MuiGridList(cellHeight = 160, cols = 3)(css.gridList,
              TileData.default.toVdomArray { tile =>
                MuiGridListTile(cols = tile.defaultCols)(Attr("key") := tile.image,
                  img(src := tile.image, alt := tile.title)
                )
              }
            )
          )
        )
      )
    }
  }

  private val component = ScalaComponent.builder[Props]("ImageGridList")
    .renderBackend[Backend]
    .build

  def apply(style: ImageGridListStyle = DefaultImageGridListStyle) = component(Props(style))
}
