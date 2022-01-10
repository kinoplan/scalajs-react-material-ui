package io.kinoplan.scalajs.react.material.ui.core

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

import org.scalajs.dom.html

import io.kinoplan.scalajs.react.bridge.{ReactBridgeComponent, WithProps}

object MuiGrow extends ReactBridgeComponent with MuiGrowExtensions {
  override protected lazy val componentValue: js.Function = RawComponent

  @JSImport("@mui/material", "Grow")
  @js.native
  object RawComponent extends js.Function

  def apply(
    in: js.UndefOr[Boolean] = js.undefined,
    mountOnEnter: js.UndefOr[Boolean] = js.undefined,
    unmountOnExit: js.UndefOr[Boolean] = js.undefined,
    appear: js.UndefOr[Boolean] = js.undefined,
    enter: js.UndefOr[Boolean] = js.undefined,
    exit: js.UndefOr[Boolean] = js.undefined,
    timeout: js.UndefOr[Int | Timeout.Value] = js.undefined,
    onEnter: js.UndefOr[Handler1[html.Element]] = js.undefined,
    onEntering: js.UndefOr[Handler1[html.Element]] = js.undefined,
    onEntered: js.UndefOr[Handler1[html.Element]] = js.undefined,
    onExit: js.UndefOr[Handler1[html.Element]] = js.undefined,
    onExiting: js.UndefOr[Handler1[html.Element]] = js.undefined,
    onExited: js.UndefOr[Handler1[html.Element]] = js.undefined
  ): WithProps = auto

}

trait MuiGrowExtensions {

  object Timeout extends Enumeration {
    type Value = String

    val auto = "auto"
  }

}
