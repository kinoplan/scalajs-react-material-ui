package io.kinoplan.scalajs.react.material.ui.core

import com.payalabs.scalajs.react.bridge.{ReactBridgeComponent, WithPropsNoChildren}
import japgolly.scalajs.react.vdom.html_<^._

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

object SnackbarContent extends ReactBridgeComponent with JsWriterImplicits {
  override protected lazy val componentValue: js.Function = RawComponent

  @JSImport("@material-ui/core", "SnackbarContent")
  @js.native
  object RawComponent extends js.Function

  def apply(
    action: Option[VdomNode] = None,
    classes: js.Object = js.Object(),
    message: Option[VdomNode] = None
  ): WithPropsNoChildren = autoNoChildren
}
