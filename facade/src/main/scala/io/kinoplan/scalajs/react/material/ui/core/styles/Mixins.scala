package io.kinoplan.scalajs.react.material.ui.core.styles

import CssSettings._

case class Mixins(
  breakpoints: Breakpoints,
  spacing: Int => Int
) extends StyleSheet.Inline {
  import dsl._

  val toolbar: StyleA = style(
    minHeight(56.px),
    breakpoints.up(Breakpoints.xs).landscape(
      minHeight(48.px)
    ),
    breakpoints.up(Breakpoints.sm)(
      minHeight(64.px)
    )
  )
}
