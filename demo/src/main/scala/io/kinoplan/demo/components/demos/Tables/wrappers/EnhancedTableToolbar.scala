package io.kinoplan.demo.components.demos.Tables.wrappers

import japgolly.scalajs.react._
import japgolly.scalajs.react.raw.React
import japgolly.scalajs.react.vdom.all._
import scalacss.ScalaCssReactImplicits

import io.kinoplan.demo.components.Layout
import io.kinoplan.demo.styles.demos.Tables.{DefaultEnhancedTableToolbarStyle, EnhancedTableToolbarStyle}
import io.kinoplan.scalajs.react.material.ui.core._
import io.kinoplan.scalajs.react.material.ui.icons.{MuiIcons, MuiIconsModule}

object EnhancedTableToolbar extends ScalaCssReactImplicits {
  case class Props(selectedCount: Int, style: EnhancedTableToolbarStyle) {
    val selectedNonEmpty = selectedCount > 0

    val selectedIsEmpty = !selectedNonEmpty

    val selectedTitle = s"$selectedCount selected"
  }

  class Backend(t: BackendScope[Props, Unit]) {
    def render(props: Props): React.Node = {
      val css = props.style

      val cssHighlight = if (props.selectedNonEmpty) css.highlight(Layout.isPaletteLight) else css.common.emptyStyle

      MuiToolbar()(css.root, cssHighlight,
        div(css.title,
          MuiTypography(
            color = MuiTypography.Color.inherit,
            variant = MuiTypography.Variant.subtitle1
          )(props.selectedTitle).when(props.selectedNonEmpty),
          MuiTypography(variant = MuiTypography.Variant.h6)(
            id := "tableTitle",
            "Nutrition"
          ).when(props.selectedIsEmpty)
        ),
        div(css.spacer),
        div(css.actions,
          MuiTooltip(title = "Delete")(
            MuiIconButton()(aria.label := "Delete", MuiIcons(MuiIconsModule.Delete)())
          ).when(props.selectedNonEmpty),
          MuiTooltip(title = "Filter list")(
            MuiIconButton()(aria.label := "Filter list", MuiIcons(MuiIconsModule.FilterList)())
          ).when(props.selectedIsEmpty)
        )
      ).rawNode
    }
  }

  private val component = ScalaComponent.builder[Props]("EnhancedTableToolbar")
    .renderBackend[Backend]
    .build

  def apply(
    selectedCount: Int,
    style: EnhancedTableToolbarStyle = DefaultEnhancedTableToolbarStyle
  ) = component(Props(selectedCount, style))
}
