package io.kinoplan.scalajs.react.material.ui.core

import com.payalabs.scalajs.react.bridge.{ReactBridgeComponent, WithProps}
import japgolly.scalajs.react.ReactEventFromHtml
import japgolly.scalajs.react.vdom.html_<^._

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.{|, undefined, UndefOr}

object MuiTooltip extends ReactBridgeComponent with MuiTooltipExtensions with JsWriterImplicits {
  override protected lazy val componentValue: js.Function = RawComponent

  @JSImport("@material-ui/core", "Tooltip")
  @js.native
  object RawComponent extends js.Function

  def apply(
    classes: Map[ClassKey.Value, String] = Map.empty,
    disableFocusListener: Boolean = false,
    disableHoverListener: Boolean = false,
    disableTouchListener: Boolean = false,
    enterDelay: Int = 0,
    enterTouchDelay: Int = 1000,
    interactive: Boolean = false,
    leaveDelay: Int = 0,
    leaveTouchDelay: Int = 1500,
    onClose: OnJSEv1[ReactEventFromHtml] = undefined,
    onOpen: OnJSEv1[ReactEventFromHtml] = undefined,
    open: UndefOr[Boolean] = undefined,
    placement: Placement.Value = Placement.bottom,
    PopperProps: js.Object = js.Object(),
    title: VdomNode,
    TransitionComponent: Option[String | VdomNode] = None,
    TransitionProps: js.Object = js.Object()
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
