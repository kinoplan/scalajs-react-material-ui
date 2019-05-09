package io.kinoplan.scalajs.react.material.ui.core.styles

case class Theme(
  spacingInput: Int = 8,
  transitions: Transition = Transition(),
  zIndex: ZIndex = ZIndex(),
  breakpoints: Breakpoints = Breakpoints()
) {
  def spacing(factor: Int) = spacingInput * factor

  val mixins = Mixins(breakpoints, spacing)
}

object Theme {
  def defaultTheme: Theme = Theme()
}