package io.kinoplan.demo.components.demos.GridList

import japgolly.scalajs.react.{BackendScope, ScalaComponent}
import japgolly.scalajs.react.vdom.Attr
import japgolly.scalajs.react.vdom.all._
import scalacss.ScalaCssReactImplicits

import io.kinoplan.demo.components.{ComponentContainer, Layout}
import io.kinoplan.demo.models.GridList.TileData
import io.kinoplan.demo.styles.demos.GridList.{DefaultSingleLineGridListStyle, SingleLineGridListStyle}
import io.kinoplan.demo.utils.Helpers.styleAToClassName
import io.kinoplan.scalajs.react.material.ui.core.{MuiGridList, MuiGridListTile, MuiGridListTileBar, MuiIconButton}
import io.kinoplan.scalajs.react.material.ui.icons.{MuiIcons, MuiIconsModule}

object SingleLineGridList extends ScalaCssReactImplicits {
  case class Props(style: SingleLineGridListStyle)

  class Backend(t: BackendScope[Props, Unit]) {
    def render(props: Props): VdomElement = {
      val css = props.style

      val barClasses = Map(
        MuiGridListTileBar.ClassKey.root -> styleAToClassName(css.titleBar),
        MuiGridListTileBar.ClassKey.title -> styleAToClassName(css.title)
      )

      div(
        ComponentContainer("Single line Grid list")(
          div(css.root, css.rootPaper(Layout.isPaletteLight),
            MuiGridList()(css.gridList,
              cols := 2.5,
              TileData.default.toVdomArray { tile =>
                MuiGridListTile()(Attr("key") := tile.image,
                  img(src := tile.image, alt := tile.title),
                  MuiGridListTileBar(
                    title = VdomNode(tile.title),
                    classes = barClasses,
                    actionIcon = VdomNode(MuiIconButton()(MuiIcons(MuiIconsModule.StarBorder)()(css.title)).rawNode)
                  )
                )
              }
            )
          )
        )
      )
    }
  }

  private val component = ScalaComponent.builder[Props]("SingleLineGridList")
    .renderBackend[Backend]
    .build

  def apply(style: SingleLineGridListStyle = DefaultSingleLineGridListStyle) = component(Props(style))
}
