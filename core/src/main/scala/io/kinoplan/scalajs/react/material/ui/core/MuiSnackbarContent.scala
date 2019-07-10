package io.kinoplan.scalajs.react.material.ui.core

import com.payalabs.scalajs.react.bridge.{ReactBridgeComponent, WithPropsNoChildren}
import japgolly.scalajs.react.vdom.html_<^._

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

object MuiSnackbarContent extends ReactBridgeComponent with MuiSnackbarContentExtensions with JsWriterImplicits {
  override protected lazy val componentValue: js.Function = RawComponent

  @JSImport("@material-ui/core", "SnackbarContent")
  @js.native
  object RawComponent extends js.Function

  def apply(
    action: js.UndefOr[VdomNode] = js.undefined,
    classes: js.UndefOr[Map[ClassKey.Value, String]] = js.undefined,
    message: js.UndefOr[VdomNode] = js.undefined
  ): WithPropsNoChildren = autoNoChildren
}

trait MuiSnackbarContentExtensions {
  object ClassKey extends Enumeration {
    type Value = String

    val root = "root"
    val message = "message"
    val action = "action"
  }
}
