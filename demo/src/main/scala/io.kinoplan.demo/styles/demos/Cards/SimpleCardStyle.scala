package io.kinoplan.demo.styles.demos.Cards

import io.kinoplan.demo.CssSettings._

class SimpleCardStyle extends StyleSheet.Inline {
  import dsl._

  val card = style(
    minWidth(275.px)
  )

  val bullet = style(
    display.inlineBlock,
    margin(0.px, 2.px),
    transform := "scale(0.8)"
  )

  val title = style(
    fontSize(14.px)
  )

  val pos = style(
    marginBottom(12.px)
  )
}

object DefaultSimpleCardStyle extends SimpleCardStyle

