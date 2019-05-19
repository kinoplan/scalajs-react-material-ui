package io.kinoplan.scalajs.react.material.ui.core.styles

import io.kinoplan.scalajs.react.material.ui.core.styles.CssSettings._
import scalacss.internal.mutable.StyleSheet

case class Theme(
  spacingInput: Int = 8,
  transitions: Transition = Transition(),
  zIndex: ZIndex = ZIndex(),
  breakpoints: Breakpoints = Breakpoints()
) extends StyleSheet.Inline {
  def spacing(factor: Int) = spacingInput * factor

  val mixins = Mixins(breakpoints, spacing)
}

object Theme {
  def defaultTheme: Theme = Theme()
}