package io.kinoplan.scalajs.react.material.ui.core

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

import japgolly.scalajs.react.ReactEventFromHtml

import io.kinoplan.scalajs.react.bridge.{ReactBridgeComponent, WithProps}

object MuiDrawer extends ReactBridgeComponent with MuiDrawerExtensions {
  override protected lazy val componentValue: js.Function = RawComponent

  @JSImport("@mui/material", "Drawer")
  @js.native
  object RawComponent extends js.Function

  def apply(
    anchor: js.UndefOr[Anchor.Value] = js.undefined,
    classes: js.UndefOr[Map[ClassKey.Value, String]] = js.undefined,
    elevation: js.UndefOr[Int] = js.undefined,
    ModalProps: js.UndefOr[js.Object] = js.undefined,
    onClose: js.UndefOr[ReactHandler1[ReactEventFromHtml]] = js.undefined,
    open: js.UndefOr[Boolean] = js.undefined,
    PaperProps: js.UndefOr[js.Object] = js.undefined,
    SlideProps: js.UndefOr[js.Object] = js.undefined,
    transitionDuration: js.UndefOr[Int | js.Object] = js.undefined,
    variant: js.UndefOr[Variant.Value] = js.undefined
  ): WithProps = auto

}

trait MuiDrawerExtensions {

  object Anchor extends Enumeration {
    type Value = String

    val left = "left"
    val top = "top"
    val right = "right"
    val bottom = "bottom"
  }

  object Variant extends Enumeration {
    type Value = String

    val permanent = "permanent"
    val persistent = "persistent"
    val temporary = "temporary"
  }

  object ClassKey extends Enumeration {
    type Value = String

    val root = "root"
    val docked = "docked"
    val paper = "paper"
    val paperAnchorLeft = "paperAnchorLeft"
    val paperAnchorRight = "paperAnchorRight"
    val paperAnchorTop = "paperAnchorTop"
    val paperAnchorBottom = "paperAnchorBottom"
    val paperAnchorDockedLeft = "paperAnchorDockedLeft"
    val paperAnchorDockedTop = "paperAnchorDockedTop"
    val paperAnchorDockedRight = "paperAnchorDockedRight"
    val paperAnchorDockedBottom = "paperAnchorDockedBottom"
    val modal = "modal"
  }

}
