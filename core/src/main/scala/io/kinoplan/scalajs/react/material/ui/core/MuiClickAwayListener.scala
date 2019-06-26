package io.kinoplan.scalajs.react.material.ui.core

import com.payalabs.scalajs.react.bridge.{ReactBridgeComponent, WithProps}
import japgolly.scalajs.react.ReactEventFromHtml

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

object MuiClickAwayListener extends ReactBridgeComponent with MuiClickAwayListenerExtensions {
  override protected lazy val componentValue: js.Function = RawComponent

  @JSImport("@material-ui/core", "ClickAwayListener")
  @js.native
  object RawComponent extends js.Function

  def apply(
    mouseEvent: js.UndefOr[Boolean | MouseEvent.Value] = MouseEvent.onMouseUp,
    onClickAway: ReactHandler1[ReactEventFromHtml],
    touchEvent: js.UndefOr[Boolean | TouchEvent.Value] = TouchEvent.onTouchEnd
  ): WithProps = auto
}

trait MuiClickAwayListenerExtensions {
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
