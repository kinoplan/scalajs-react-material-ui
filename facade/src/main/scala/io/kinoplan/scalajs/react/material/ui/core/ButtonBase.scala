package io.kinoplan.scalajs.react.material.ui.core

import com.payalabs.scalajs.react.bridge.{ReactBridgeComponent, WithProps}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

object ButtonBase extends ReactBridgeComponent {
  override protected lazy val componentValue: js.Function = RawComponent

  @JSImport("@material-ui/core", "ButtonBase")
  @js.native
  object RawComponent extends js.Function

  def apply(
    action: Option[js.Function] = None,
    buttonRef: Option[js.Function | js.Object] = None,
    centerRipple: Boolean = false,
    classes: js.Object = js.Object(),
    component: Option[String | js.Function] = Some("button"),
    disabled: Option[Boolean] = None,
    disableRipple: Boolean = false,
    disableTouchRipple: Boolean = false,
    focusRipple: Boolean = false,
    focusVisibleClassName: Option[String] = None,
    onFocusVisible: Option[js.Function] = None,
    TouchRippleProps: Option[js.Object] = None,
    `type`: String = "button"
  ): WithProps = auto
}
