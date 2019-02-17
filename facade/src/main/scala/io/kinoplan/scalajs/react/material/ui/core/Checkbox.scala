package io.kinoplan.scalajs.react.material.ui.core

import com.payalabs.scalajs.react.bridge.{ReactBridgeComponent, WithProps}
import japgolly.scalajs.react.raw.React

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

object Checkbox extends ReactBridgeComponent with CheckboxExtensions {
  override protected lazy val componentValue: js.Function = RawComponent

  @JSImport("@material-ui/core", "Checkbox")
  @js.native
  object RawComponent extends js.Function

  def apply(
    checked: Option[Boolean | String] = None,
    checkedIcon: js.UndefOr[React.Element] = js.undefined,
    classes: js.Object = js.Object(),
    color: Color.Value = Color.secondary,
    disabled: Option[Boolean] = None,
    disableRipple: Option[Boolean] = None,
    icon: js.UndefOr[React.Element] = js.undefined,
    id: Option[String] = None,
    indeterminate: Boolean = false,
    indeterminateIcon: js.UndefOr[React.Element] = js.undefined,
    inputProps: js.Object = js.Object(),
    inputRef: Option[js.Function | js.Object] = None
  ): WithProps = auto
}

trait CheckboxExtensions {
  object Color extends Enumeration {
    val primary = Value("primary")
    val secondary = Value("secondary")
    val default = Value("default")
  }
}
