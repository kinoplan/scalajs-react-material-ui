package io.kinoplan.scalajs.react.material.ui.core

import com.payalabs.scalajs.react.bridge.{ReactBridgeComponent, WithProps}
import japgolly.scalajs.react.raw.React

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

object MuiNativeSelect extends ReactBridgeComponent with MuiNativeSelectExtensions {
  override protected lazy val componentValue: js.Function = RawComponent

  @JSImport("@material-ui/core", "NativeSelect")
  @js.native
  object RawComponent extends js.Function

  def apply(
    classes: js.UndefOr[Map[ClassKey.Value, String]] = js.undefined,
    IconComponent: OptComponentPropType = js.undefined,
    input: js.UndefOr[React.Element] = js.undefined,
    inputProps: js.UndefOr[js.Object] = js.undefined,
    variant: js.UndefOr[Variant.Value] = js.undefined
  ): WithProps = auto
}

trait MuiNativeSelectExtensions {
  object Variant extends Enumeration {
    type Value = String

    val standard = "standard"
    val outlined = "outlined"
    val filled = "filled"
  }

  object ClassKey extends Enumeration {
    type Value = String

    val root = "root"
    val select = "select"
    val filled = "filled"
    val outlined = "outlined"
    val selectMenu = "selectMenu"
    val disabled = "disabled"
    val icon = "icon"
  }
}
