package io.kinoplan.scalajs.react.material.ui.lab

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

import io.kinoplan.scalajs.react.bridge.{ReactBridgeComponent, WithProps}

object MuiToggleButtonGroup extends ReactBridgeComponent with MuiToggleButtonGroupExtensions {
  override protected lazy val componentValue: js.Function = RawComponent

  @JSImport("@mui/lab", "ToggleButtonGroup")
  @js.native
  object RawComponent extends js.Function

  def apply(
    classes: js.UndefOr[Map[ClassKey.Value, String]] = js.undefined,
    exclusive: js.UndefOr[Boolean] = js.undefined,
    onChange: js.UndefOr[Handler2[js.Object, String]] = js.undefined,
    selected: js.UndefOr[Boolean | Selected.Value] = js.undefined
  ): WithProps = auto

}

trait MuiToggleButtonGroupExtensions {

  object Selected extends Enumeration {
    type Value = String

    val auto = "auto"
  }

  object ClassKey extends Enumeration {
    type Value = String

    val root = "root"
    val selected = "selected"
  }

}
