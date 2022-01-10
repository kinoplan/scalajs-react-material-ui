package io.kinoplan.scalajs.react.material.ui.core

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

import japgolly.scalajs.react.vdom.html_<^._

import io.kinoplan.scalajs.react.bridge.{ReactBridgeComponent, WithPropsNoChildren}

object MuiSnackbarContent extends ReactBridgeComponent with MuiSnackbarContentExtensions {
  override protected lazy val componentValue: js.Function = RawComponent

  @JSImport("@mui/material", "SnackbarContent")
  @js.native
  object RawComponent extends js.Function

  def apply(
    action: js.UndefOr[VdomNode] = js.undefined,
    classes: js.UndefOr[Map[ClassKey.Value, String]] = js.undefined,
    message: js.UndefOr[VdomNode] = js.undefined,
    component: js.UndefOr[ComponentPropType] = js.undefined,
    elevation: js.UndefOr[Int] = js.undefined,
    square: js.UndefOr[Boolean] = js.undefined
  ): WithPropsNoChildren = autoNoChildren

}

trait MuiSnackbarContentExtensions {

  object ClassKey extends Enumeration with MuiPaperExtensions {
    type Value = String

    val root = "root"
    val message = "message"
    val action = "action"
  }

}
