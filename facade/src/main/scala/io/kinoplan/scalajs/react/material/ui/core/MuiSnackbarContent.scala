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
    action: Option[VdomNode] = None,
    classes: Map[ClassKey.ClassKey, String] = Map.empty,
    message: Option[VdomNode] = None
  ): WithPropsNoChildren = autoNoChildren
}

trait MuiSnackbarContentExtensions {
  object ClassKey extends Enumeration {
    type ClassKey = String

    val root = "root"
    val message = "message"
    val action = "action"
  }
}
