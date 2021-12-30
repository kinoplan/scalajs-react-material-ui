package io.kinoplan.scalajs.react.material.ui.lab

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

import japgolly.scalajs.react.facade.React
import japgolly.scalajs.react.vdom.VdomNode

import io.kinoplan.scalajs.react.bridge.{ReactBridgeComponent, WithProps}

object MuiSpeedDial extends ReactBridgeComponent with MuiSpeedDialExtensions {
  override protected lazy val componentValue: js.Function = RawComponent

  @JSImport("@material-ui/lab", "SpeedDial")
  @js.native
  object RawComponent extends js.Function

  def apply(
    ariaLabel: String,
    ButtonProps: js.UndefOr[js.Object] = js.undefined,
    classes: js.UndefOr[Map[ClassKey.Value, String]] = js.undefined,
    direction: js.UndefOr[Direction.Value] = js.undefined,
    icon: React.Element,
    onClose: js.UndefOr[Handler2[js.Object, String]] = js.undefined,
    open: Boolean,
    openIcon: js.UndefOr[VdomNode] = js.undefined,
    TransitionComponent: js.UndefOr[ComponentPropType] = js.undefined,
    transitionDuration: js.UndefOr[Int | js.Object] = js.undefined,
    TransitionProps: js.UndefOr[js.Object] = js.undefined
  ): WithProps = auto
}

trait MuiSpeedDialExtensions {
  object Direction extends Enumeration {
    type Value = String

    val up = "up"
    val down = "down"
    val left = "left"
    val right = "right"
  }

  object ClassKey extends Enumeration {
    type Value = String

    val root = "root"
    val fab = "fab"
    val directionUp = "directionUp"
    val directionDown = "directionDown"
    val directionLeft	= "directionLeft"
    val directionRight = "directionRight"
    val actions = "actions"
    val actionsClosed = "actionsClosed"
  }
}
