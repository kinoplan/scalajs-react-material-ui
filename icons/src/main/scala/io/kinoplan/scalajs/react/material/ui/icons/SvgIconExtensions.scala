package io.kinoplan.scalajs.react.material.ui.icons

trait SvgIconExtensions {
  object Color extends Enumeration {
    type Value = String

    val inherit = "inherit"
    val primary = "primary"
    val secondary = "secondary"
    val action = "action"
    val error = "error"
    val disabled = "disabled"
  }

  object FontSize extends Enumeration {
    type Value = String

    val inherit = "inherit"
    val default = "default"
    val small = "small"
    val large = "large"
  }

  object ClassKey extends Enumeration {
    type Value = String

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
