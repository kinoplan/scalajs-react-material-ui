package io.kinoplan.scalajs.react.material.ui.core

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

import japgolly.scalajs.react.ReactEvent
import japgolly.scalajs.react.vdom.html_<^._
import org.scalajs.dom.html

import io.kinoplan.scalajs.react.bridge.{ReactBridgeComponent, WithProps}
import io.kinoplan.scalajs.react.material.ui.core.internal.Origin

object MuiSnackbar extends ReactBridgeComponent with MuiSnackbarExtensions {
  override protected lazy val componentValue: js.Function = RawComponent

  @JSImport("@mui/material", "Snackbar")
  @js.native
  object RawComponent extends js.Function

  def apply(
    action: js.UndefOr[VdomNode] = js.undefined,
    anchorOrigin: js.UndefOr[Origin] = js.undefined,
    autoHideDuration: js.UndefOr[Int] = js.undefined,
    classes: js.UndefOr[Map[ClassKey.Value, String]] = js.undefined,
    ClickAwayListenerProps: js.UndefOr[js.Object] = js.undefined,
    ContentProps: js.UndefOr[js.Object] = js.undefined,
    disableWindowBlurListener: js.UndefOr[Boolean] = js.undefined,
    message: js.UndefOr[VdomNode] = js.undefined,
    onClose: js.UndefOr[ReactHandler2[ReactEvent, String]] = js.undefined,
    onEnter: js.UndefOr[Handler1[html.Element]] = js.undefined,
    onEntered: js.UndefOr[Handler1[html.Element]] = js.undefined,
    onEntering: js.UndefOr[Handler1[html.Element]] = js.undefined,
    onExit: js.UndefOr[Handler1[html.Element]] = js.undefined,
    onExited: js.UndefOr[Handler1[html.Element]] = js.undefined,
    onExiting: js.UndefOr[Handler1[html.Element]] = js.undefined,
    open: js.UndefOr[Boolean] = js.undefined,
    resumeHideDuration: js.UndefOr[Int] = js.undefined,
    TransitionComponent: js.UndefOr[ComponentPropType] = js.undefined,
    transitionDuration: js.UndefOr[Int | js.Object] = js.undefined,
    TransitionProps: js.UndefOr[js.Object] = js.undefined
  ): WithProps = auto

}

trait MuiSnackbarExtensions {

  object Direction extends Enumeration {
    type Value = String

    val left = "left"
    val right = "right"
    val up = "up"
    val down = "down"
  }

  object ClassKey extends Enumeration {
    type Value = String

    val root = "root"
    val anchorOriginTopCenter = "anchorOriginTopCenter"
    val anchorOriginBottomCenter = "anchorOriginBottomCenter"
    val anchorOriginTopRight = "anchorOriginTopRight"
    val anchorOriginBottomRight = "anchorOriginBottomRight"
    val anchorOriginTopLeft = "anchorOriginTopLeft"
    val anchorOriginBottomLeft = "anchorOriginBottomLeft"
  }

}
