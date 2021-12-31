package io.kinoplan.demo.styles.demos.Drawers

import io.kinoplan.demo.CssSettings._

class DrawersStyle extends StyleSheet.Inline {
  import dsl._

  val list = style(
    width(250.px)
  )

  val fullList = style(
    width.auto
  )

}

object DefaultDrawersStyle extends DrawersStyle
