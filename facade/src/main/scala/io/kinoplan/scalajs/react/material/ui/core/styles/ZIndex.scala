package io.kinoplan.scalajs.react.material.ui.core.styles

// We need to centralize the zIndex definitions as they work
// like global values in the browser.
case class ZIndex(
  mobileStepper: Int = 1000,
  appBar: Int = 1100,
  drawer: Int = 1200,
  modal: Int = 1300,
  snackbar: Int = 1400,
  tooltip: Int = 1500
)
