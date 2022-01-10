package io.kinoplan.scalajs.react.material.ui.lab

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

import japgolly.scalajs.react.ReactEventFromHtml
import japgolly.scalajs.react.vdom.html_<^.VdomNode

import io.kinoplan.scalajs.react.bridge.{ReactBridgeComponent, WithProps}

object MuiSpeedDialAction extends ReactBridgeComponent with MuiSpeedDialActionExtensions {
  override protected lazy val componentValue: js.Function = RawComponent

  @JSImport("@mui/lab", "SpeedDialAction")
  @js.native
  object RawComponent extends js.Function

  def apply(
    ButtonProps: js.UndefOr[js.Object] = js.undefined,
    classes: js.UndefOr[Map[ClassKey.Value, String]] = js.undefined,
    delay: js.UndefOr[Int] = js.undefined,
    icon: VdomNode,
    TooltipClasses: js.UndefOr[js.Object] = js.undefined,
    tooltipOpen: js.UndefOr[Boolean] = js.undefined,
    tooltipPlacement: js.UndefOr[TooltipPlacement.Value] = js.undefined,
    tooltipTitle: VdomNode,
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
    title: js.UndefOr[VdomNode] = js.undefined,
    TransitionComponent: js.UndefOr[ComponentPropType] = js.undefined,
    TransitionProps: js.UndefOr[js.Object] = js.undefined
  ): WithProps = auto

}

trait MuiSpeedDialActionExtensions {

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

  object TooltipPlacement extends Enumeration {
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

    val button = "button"
    val buttonClosed = "buttonClosed"
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
