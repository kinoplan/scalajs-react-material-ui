package io.kinoplan.demo.components.demos.GridList

import japgolly.scalajs.react.{BackendScope, ScalaComponent}
import japgolly.scalajs.react.vdom.Attr
import japgolly.scalajs.react.vdom.all._
import scalacss.ScalaCssReactImplicits

import io.kinoplan.demo.components.{ComponentContainer, Layout}
import io.kinoplan.demo.models.GridList.TileData
import io.kinoplan.demo.styles.demos.GridList.{DefaultImageGridListStyle, ImageGridListStyle}
import io.kinoplan.scalajs.react.material.ui.core.{MuiGridList, MuiGridListTile}

object ImageGridList extends ScalaCssReactImplicits {
  case class Props(style: ImageGridListStyle)

  class Backend(t: BackendScope[Props, Unit]) {
    def render(props: Props): VdomElement = {
      val css = props.style

      div(
        ComponentContainer("Image-only Grid list")(
          div(css.root, css.rootPaper(Layout.isPaletteLight),
            MuiGridList(cellHeight = 160)(css.gridList,
              cols := 3,
              TileData.default.toVdomArray { tile =>
                MuiGridListTile()(Attr("key") := tile.image,
                  cols := tile.defaultCols,
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
