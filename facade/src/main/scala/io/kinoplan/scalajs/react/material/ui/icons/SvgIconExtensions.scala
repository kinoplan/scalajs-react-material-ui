package io.kinoplan.scalajs.react.material.ui.icons

trait SvgIconExtensions {
  object Color extends Enumeration {
    val inherit = Value("inherit")
    val primary = Value("primary")
    val secondary = Value("secondary")
    val action = Value("action")
    val error = Value("error")
    val disabled = Value("disabled")
  }

  object FontSize extends Enumeration {
    val inherit = Value("inherit")
    val default = Value("default")
    val small = Value("small")
    val large = Value("large")
  }

  object ClassKey extends Enumeration {
    type ClassKey = String

    val root = "root"
    val colorPrimary = "colorPrimary"
    val colorSecondary = "colorSecondary"
    val colorAction = "colorAction"
    val colorError = "colorError"
    val colorDisabled = "colorDisabled"
    val fontSizeInherit = "fontSizeInherit"
    val fontSizeSmall = "fontSizeSmall"
    val fontSizeLarge = "fontSizeLarge"
  }
}