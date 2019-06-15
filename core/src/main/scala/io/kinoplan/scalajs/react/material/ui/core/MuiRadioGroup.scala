package io.kinoplan.scalajs.react.material.ui.core

import com.payalabs.scalajs.react.bridge.{ReactBridgeComponent, WithProps}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

object MuiRadioGroup extends ReactBridgeComponent with MuiRadioGroupExtensions {
  override protected lazy val componentValue: js.Function = RawComponent

  @JSImport("@material-ui/core", "RadioGroup")
  @js.native
  object RawComponent extends js.Function

  def apply(
    classes: Map[ClassKey.Value, String] = Map.empty,
    //defaultValue: Option[String] = None,
    //name: Option[String] = None,
    //onChange: ReactHandler2[ReactEvent, String] = js.undefined,
    row: Boolean = false
  ): WithProps = auto
}

trait MuiRadioGroupExtensions {
  object ClassKey extends Enumeration {
    type Value = String

    val root = "root"
    val row = "row"
  }
}
