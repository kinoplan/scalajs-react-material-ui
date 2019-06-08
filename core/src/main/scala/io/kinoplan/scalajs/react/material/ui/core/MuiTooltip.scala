package io.kinoplan.scalajs.react.material.ui.core

import com.payalabs.scalajs.react.bridge.{ReactBridgeComponent, WithProps}
import japgolly.scalajs.react.ReactEventFromHtml
import japgolly.scalajs.react.vdom.html_<^._

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

object MuiTooltip extends ReactBridgeComponent with MuiTooltipExtensions with JsWriterImplicits {
  override protected lazy val componentValue: js.Function = RawComponent

  @JSImport("@material-ui/core", "Tooltip")
  @js.native
  object RawComponent extends js.Function

  def apply(
    classes: Map[ClassKey.ClassKey, String] = Map.empty,
    disableFocusListener: Boolean = false,
    disableHoverListener: Boolean = false,
    disableTouchListener: Boolean = false,
    enterDelay: Int = 0,
    enterTouchDelay: Int = 1000,
    id: Option[String] = None,
    interactive: Boolean = false,
    leaveDelay: Int = 0,
    leaveTouchDelay: Int = 1500,
    onClose: Option[OnJSEv1[ReactEventFromHtml]] = None,
    onOpen: Option[OnJSEv1[ReactEventFromHtml]] = None,
    open: Option[Boolean] = None,
    placement: Placement.Value = Placement.bottom,
    PopperProps: js.Object = js.Object(),
    title: VdomNode,
    TransitionComponent: Option[String | VdomNode] = None,
    TransitionProps: js.Object = js.Object()
  ): WithProps = auto
}

trait MuiTooltipExtensions {
  object Placement extends Enumeration {
    val bottomEnd = Value("bottom-end")
    val bottomStart = Value("bottom-start")
    val bottom = Value("bottom")
    val leftEnd = Value("left-end")
    val leftStart = Value("left-start")
    val left = Value("left")
    val rightEnd = Value("right-end")
    val rightStart = Value("right-start")
    val right = Value("right")
    val topEnd = Value("top-end")
    val topStart = Value("top-start")
    val top = Value("top")
  }

  object ClassKey extends Enumeration {
    type ClassKey = String

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
