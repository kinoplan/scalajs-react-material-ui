package io.kinoplan.scalajs.react.material.ui.core

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

import japgolly.scalajs.react.ReactEventFromHtml
import japgolly.scalajs.react.vdom.html_<^._

import io.kinoplan.scalajs.react.bridge.{ReactBridgeComponent, WithProps}

object MuiTooltip extends ReactBridgeComponent with MuiTooltipExtensions {
  override protected lazy val componentValue: js.Function = RawComponent

  @JSImport("@mui/material", "Tooltip")
  @js.native
  object RawComponent extends js.Function

  def apply(
    classes: js.UndefOr[Map[ClassKey.Value, String]] = js.undefined,
    disableFocusListener: js.UndefOr[Boolean] = js.undefined,
    disableHoverListener: js.UndefOr[Boolean] = js.undefined,
    disableTouchListener: js.UndefOr[Boolean] = js.undefined,
    enterDelay: js.UndefOr[Int] = js.undefined,
    enterTouchDelay: js.UndefOr[Int] = js.undefined,
    interactive: js.UndefOr[Boolean] = js.undefined,
    leaveDelay: js.UndefOr[Int] = js.undefined,
    leaveTouchDelay: js.UndefOr[Int] = js.undefined,
    onClose: js.UndefOr[ReactHandler1[ReactEventFromHtml]] = js.undefined,
    onOpen: js.UndefOr[ReactHandler1[ReactEventFromHtml]] = js.undefined,
    open: js.UndefOr[Boolean] = js.undefined,
    placement: js.UndefOr[Placement.Value] = js.undefined,
    PopperProps: js.UndefOr[js.Object] = js.undefined,
    title: VdomNode,
    TransitionComponent: js.UndefOr[ComponentPropType] = js.undefined,
    TransitionProps: js.UndefOr[js.Object] = js.undefined
  ): WithProps = auto

}

trait MuiTooltipExtensions {

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

  object ClassKey extends Enumeration {
    type Value = String

    val popper = "popper"
    val popperInteractive = "popperInteractive"
    val tooltip = "tooltip"
    val touch = "touch"
    val tooltipPlacementLeft = "tooltipPlacementLeft"
    val tooltipPlacementRight = "tooltipPlacementRight"
    val tooltipPlacementTop = "tooltipPlacementTop"
    val tooltipPlacementBottom = "tooltipPlacementBottom"
  }

}
