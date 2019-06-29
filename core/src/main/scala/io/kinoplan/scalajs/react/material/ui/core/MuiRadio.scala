package io.kinoplan.scalajs.react.material.ui.core

import com.payalabs.scalajs.react.bridge.{ReactBridgeComponent, WithPropsNoChildren}
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
    classes: Map[ClassKey.Value, String] = Map.empty,
    color: Color.Value = Color.secondary,
    disableRipple: Option[Boolean] = None,
    icon: Option[VdomNode] = None,
    inputProps: js.Object = js.Object(),
    inputRef: Option[js.Function | js.Object] = None
  ): WithPropsNoChildren = autoNoChildren
}

trait MuiRadioExtensions {
  object Color extends Enumeration {
    val primary = Value("primary")
    val secondary = Value("secondary")
    val default = Value("default")
  }

  object ClassKey extends Enumeration {
    type Value = String

    val root = "root"
    val checked = "checked"
    val disabled = "disabled"
    val colorPrimary = "colorPrimary"
    val colorSecondary = "colorSecondary"
  }
}
