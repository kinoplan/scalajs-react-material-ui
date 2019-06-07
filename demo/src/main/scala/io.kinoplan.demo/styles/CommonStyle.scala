package io.kinoplan.demo.styles

import io.kinoplan.demo.CssSettings._
import io.kinoplan.scalajs.react.material.ui.core.styles.createMuiTheme

class CommonStyle extends StyleSheet.Inline {
  import dsl._

  val theme = createMuiTheme()

  val emptyStyle = style()

  val flexGrowOne = style(
    flexGrow(1)
  )

  val menuButton = style(
    marginRight((theme.spacing.unit * 2).px)
  )

  val menuButtonDesktop = style(
    marginLeft(-18.px),
    marginRight(10.px)
  )

  val title = style(
    flexGrow(1)
  )

  val componentContainer = style(
    //unsafeChild(theme.breakpoints.up("sm"))(
    media.minWidth(600.px)(
      padding(24.px)
    ),
    margin.auto,
    outline.none,
    display.flex,
    padding(20.px),
    borderRadius(4.px),
    justifyContent.center,
    backgroundColor :=! "#DCDCDC"
  )

  val componentTitleFont = style(
    color.rgba(0, 0, 0, 0.87),
    fontSize(16.px),
    fontFamily :=! "\"Roboto\", \"Helvetica\", \"Arial\", sans-serif;"
  )

  val componentTitlePadding = style(
    padding(0.px, 8.px),
    marginTop(16.px),
    marginBottom(16.px)
  )

  val avatar = style(
    margin(10.px)
  )
}

object DefaultCommonStyle extends CommonStyle
