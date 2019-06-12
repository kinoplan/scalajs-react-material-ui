package io.kinoplan.demo.styles.demos.Cards

import io.kinoplan.demo.CssSettings._

class MediaCardStyle extends StyleSheet.Inline {
  import dsl._

  val card = style(
    maxWidth(345.px)
  )

  val media = style(
    height(140.px)
  )

  val mediaFit = style(
    objectFit.cover
  )
}

object DefaultMediaCardStyle extends MediaCardStyle
