package io.kinoplan.scalajs.react.material.ui.core

import com.payalabs.scalajs.react.bridge.{ReactBridgeComponent, WithProps}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

object ClickAwayListener extends ReactBridgeComponent with ClickAwayListenerExtensions {
  override protected lazy val componentValue: js.Function = RawComponent

  @JSImport("@material-ui/core", "ClickAwayListener")
  @js.native
  object RawComponent extends js.Function

  def apply(
    mouseEvent: Option[Boolean | MouseEvent.Value] = Some(MouseEvent.onMouseUp),
    onClickAway: js.Function,
    touchEvent: Option[Boolean | TouchEvent.Value] = Some(TouchEvent.onTouchEnd)
  ): WithProps = auto
}

trait ClickAwayListenerExtensions {
  object MouseEvent extends Enumeration {
    val onClick = Value("onClick")
    val onMouseDown = Value("onMouseDown")
    val onMouseUp = Value("onMouseUp")
  }

  object TouchEvent extends Enumeration {
    val onTouchStart = Value("onTouchStart")
    val onTouchEnd = Value("onTouchEnd")
  }
}
