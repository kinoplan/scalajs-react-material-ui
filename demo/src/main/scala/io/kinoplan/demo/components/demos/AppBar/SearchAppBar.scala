package io.kinoplan.demo.components.demos.AppBar

import scala.scalajs.js.JSConverters._

import cats.syntax.option._
import japgolly.scalajs.react.{BackendScope, ScalaComponent}
import japgolly.scalajs.react.vdom.all.{VdomElement, _}
import scalacss.ScalaCssReactImplicits

import io.kinoplan.demo.components.ComponentContainer
import io.kinoplan.demo.styles.demos.AppBar.{DefaultSearchAppBarStyle, SearchAppBarStyle}
import io.kinoplan.demo.utils.Helpers._
import io.kinoplan.scalajs.react.material.ui.core._
import io.kinoplan.scalajs.react.material.ui.icons.{MuiIcons, MuiIconsModule}

object SearchAppBar extends ScalaCssReactImplicits {
  case class Props(style: SearchAppBarStyle)

  class Backend(t: BackendScope[Props, Unit]) {
    def render(props: Props): VdomElement = {
      val css = props.style

      val inputBaseClasses = Map(
        MuiInputBase.ClassKey.input -> styleAToClassName(css.inputInput),
        MuiInputBase.ClassKey.root -> styleAToClassName(css.inputRoot)
      ).some.orUndefined

      div(
        ComponentContainer("App Bar with search field")(
          div(css.root,
            MuiAppBar(position = MuiAppBar.Position.static)(
              MuiToolbar()(
                MuiIconButton(color = MuiIconButton.Color.inherit)(css.common.menuButton,
                  aria.label := "Open drawer",
                  MuiIcons(MuiIconsModule.Menu)()
                ),
                MuiTypography(variant = MuiTypography.Variant.h6, color = MuiTypography.Color.inherit, noWrap = true)(css.title,
                  "Material-UI"
                ),
                div(css.common.flexGrowOne),
                div(css.search,
                  div(css.searchIcon, MuiIcons(MuiIconsModule.Search)()),
                  MuiInputBase(classes = inputBaseClasses)(placeholder := "Search…")
                )
              )
            )
          )
        )
      )
    }
  }

  private val component = ScalaComponent.builder[Props]("SearchAppBar")
    .renderBackend[Backend]
    .build

  def apply(style: SearchAppBarStyle = DefaultSearchAppBarStyle) = component(Props(style))
}
