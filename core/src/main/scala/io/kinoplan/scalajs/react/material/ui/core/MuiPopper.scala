package io.kinoplan.scalajs.react.material.ui.core

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

import org.scalajs.dom.html

import io.kinoplan.scalajs.react.bridge.{ReactBridgeComponent, WithProps}

object MuiPopper extends ReactBridgeComponent with MuiPopperExtensions {
  override protected lazy val componentValue: js.Function = RawComponent

  @JSImport("@mui/material", "Popper")
  @js.native
  object RawComponent extends js.Function

  def apply(
    anchorEl: js.UndefOr[html.Element | js.Function1[html.Element, html.Element]] = js.undefined,
    container: js.UndefOr[ComponentRefType] = js.undefined,
    disablePortal: js.UndefOr[Boolean] = js.undefined,
    keepMounted: js.UndefOr[Boolean] = js.undefined,
    modifiers: js.UndefOr[js.Object] = js.undefined,
    open: Boolean,
    placement: js.UndefOr[Placement.Value] = js.undefined,
    popperOptions: js.UndefOr[js.Object] = js.undefined,
    transition: js.UndefOr[Boolean] = js.undefined
  ): WithProps = auto

}

trait MuiPopperExtensions {

  object Placement extends Enumeration {
    type Value = String

    val bottomEnd = "bottom-end"
    val bottomStart = "bottom-start"
    val bottom = "bottom"
    val leftEnd = "left-end"
    val leftStart = "left-start"
    val left = "left"
    val rightEnd = "right-end"
    val rightStart = "right-start"
    val right = "right"
    val topEnd = "top-end"
    val topStart = "top-start"
    val top = "top"
  }

}
