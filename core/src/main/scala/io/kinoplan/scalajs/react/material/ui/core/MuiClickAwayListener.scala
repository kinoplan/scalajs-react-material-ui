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
    mouseEvent: js.UndefOr[Boolean | MouseEvent.Value] = js.undefined,
    onClickAway: ReactHandler1[ReactEventFromHtml],
    touchEvent: js.UndefOr[Boolean | TouchEvent.Value] = js.undefined
  ): WithProps = auto
}

trait MuiClickAwayListenerExtensions {
  object MouseEvent extends Enumeration {
    type Value = String

    val onClick = "onClick"
    val onMouseDown = "onMouseDown"
    val onMouseUp = "onMouseUp"
  }

  object TouchEvent extends Enumeration {
    type Value = String

    val onTouchStart = "onTouchStart"
    val onTouchEnd = "onTouchEnd"
  }
}
