package io.kinoplan.demo.styles.demos.Tabs

import io.kinoplan.demo.CssSettings._
import io.kinoplan.demo.styles.{CommonStyle, DefaultCommonStyle}

case class CustomizedTabsStyle(common: CommonStyle = DefaultCommonStyle) extends StyleSheet.Inline {
  import dsl._

  val theme = common.theme

  val root = style(
    flexGrow(1)
  )

  val rootPaper = common.paper

  val tabsRoot = style(
    borderBottom :=! "1px solid #e8e8e8"
  )

  val tabsIndicator = style(
    backgroundColor :=! "#1890ff"
  )

  val tabSelected = style()

  private val fontFamilyValue = List(
    "-apple-system",
    "BlinkMacSystemFont",
    "\"Segoe UI\"",
    "Roboto",
    "\"Helvetica Neue\"",
    "Arial",
    "sans-serif",
    "\"Apple Color Emoji\"",
    "\"Segoe UI Emoji\"",
    "\"Segoe UI Symbol\""
  ).mkString(",")

  private val tabRootPreliminary = style(
    textTransform.initial,
    minWidth(72.px),
    fontWeight :=! theme.typography.fontWeightRegular.px,
    marginRight :=! theme.spacing(4),
    fontFamily :=! fontFamilyValue,
    &.hover(
      color :=! "#40a9ff",
      opacity(1)
    ),
    &.focus(
      color :=! "#40a9ff"
    )
  )

  private val tabSelectedPreliminary = style(
    unsafeRoot(
      s".${tabRootPreliminary.htmlClass}.${tabSelected.htmlClass}"
    )(
      color :=! "#1890ff",
      fontWeight :=! theme.typography.fontWeightMedium.px
    )
  )

  val tabRoot = style(
    addClassNames(
      tabRootPreliminary.htmlClass,
      tabSelectedPreliminary.htmlClass
    )
  )

  val typography = style(
    padding :=! theme.spacing(3)
  )

}

object DefaultCustomizedTabsStyle extends CustomizedTabsStyle
