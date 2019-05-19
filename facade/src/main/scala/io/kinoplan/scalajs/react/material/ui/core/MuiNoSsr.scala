package io.kinoplan.scalajs.react.material.ui.core

import com.payalabs.scalajs.react.bridge.{ReactBridgeComponent, WithProps}
import japgolly.scalajs.react.vdom.html_<^._

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

object MuiNoSsr extends ReactBridgeComponent with JsWriterImplicits {
  override protected lazy val componentValue: js.Function = RawComponent

  @JSImport("@material-ui/core", "NoSsr")
  @js.native
  object RawComponent extends js.Function

  def apply(
    defer: Boolean = false,
    fallback: VdomNode = EmptyVdom
  ): WithProps = auto
}
