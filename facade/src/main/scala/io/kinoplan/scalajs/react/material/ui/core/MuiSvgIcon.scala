package io.kinoplan.scalajs.react.material.ui.core

import com.payalabs.scalajs.react.bridge.{ReactBridgeComponent, WithProps}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

object MuiSvgIcon extends ReactBridgeComponent with MuiSvgIconExtensions {
  override protected lazy val componentValue: js.Function = RawComponent

  @JSImport("@material-ui/core", "SvgIcon")
  @js.native
  object RawComponent extends js.Function

  def apply(
    classes: Map[ClassKey.ClassKey, String] = Map.empty,
    color: Color.Value = Color.inherit,
    component: Option[String | js.Function] = Some("svg"),
    fontSize: FontSize.Value = FontSize.default,
    nativeColor: Option[String] = None,
    shapeRendering: Option[String] = None,
    titleAccess: Option[String] = None,
    viewBox: String = "0 0 24 24"
  ): WithProps = auto
}

trait MuiSvgIconExtensions {
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
