package io.kinoplan.scalajs.react.material.ui.core

import com.payalabs.scalajs.react.bridge.{ReactBridgeComponent, WithProps}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

object Menu extends ReactBridgeComponent with MenuExtensions {
  override protected lazy val componentValue: js.Function = RawComponent

  @JSImport("@material-ui/core", "Menu")
  @js.native
  object RawComponent extends js.Function

  def apply(
    anchorEl: Option[js.Object | js.Function] = None,
    classes: js.Object = js.Object(),
    disableAutoFocusItem: Boolean = false,
    MenuListProps: js.Object = js.Object(),
    onClose: Option[js.Function] = None,
    onEnter: Option[js.Function] = None,
    onEntered: Option[js.Function] = None,
    onEntering: Option[js.Function] = None,
    onExit: Option[js.Function] = None,
    onExited: Option[js.Function] = None,
    onExiting: Option[js.Function] = None,
    open: Boolean,
    PopoverClasses: js.Object = js.Object(),
    transitionDuration: Int | js.Object | TransitionDuration.Value = TransitionDuration.auto
  ): WithProps = auto
}

trait MenuExtensions {
  object TransitionDuration extends Enumeration {
    val auto = Value("auto")
  }
}
