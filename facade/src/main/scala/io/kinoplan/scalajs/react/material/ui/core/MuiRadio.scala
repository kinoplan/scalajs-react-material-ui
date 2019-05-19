package io.kinoplan.scalajs.react.material.ui.core

import com.payalabs.scalajs.react.bridge.{ReactBridgeComponent, WithProps}
import japgolly.scalajs.react.vdom.html_<^._

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

object MuiRadio extends ReactBridgeComponent with MuiRadioExtensions with JsWriterImplicits {
  override protected lazy val componentValue: js.Function = RawComponent

  @JSImport("@material-ui/core", "Radio")
  @js.native
  object RawComponent extends js.Function

  def apply(
    checked: Option[Boolean | String] = None,
    checkedIcon: Option[VdomNode] = None,
    classes: Map[ClassKey.ClassKey, String] = Map.empty,
    color: Color.Value = Color.secondary,
    disabled: Option[Boolean] = None,
    disableRipple: Option[Boolean] = None,
    icon: Option[VdomNode] = None,
    id: Option[String] = None,
    inputProps: js.Object = js.Object(),
    inputRef: Option[js.Function | js.Object] = None,
    onChange: Option[js.Function] = None,
    `type`: Option[String] = None,
    value: Option[String | Int | Boolean] = None
  ): WithProps = auto
}

trait MuiRadioExtensions {
  object Color extends Enumeration {
    val primary = Value("primary")
    val secondary = Value("secondary")
    val default = Value("default")
  }

  object ClassKey extends Enumeration {
    type ClassKey = String

    val paper = "paper"
    val checked = "checked"
    val disabled = "disabled"
    val colorPrimary = "colorPrimary"
    val colorSecondary = "colorSecondary"
  }
}
