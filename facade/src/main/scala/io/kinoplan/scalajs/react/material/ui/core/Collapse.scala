package io.kinoplan.scalajs.react.material.ui.core

import com.payalabs.scalajs.react.bridge.{ReactBridgeComponent, WithProps}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

object Collapse extends ReactBridgeComponent with CollapseExtensions {
  override protected lazy val componentValue: js.Function = RawComponent

  @JSImport("@material-ui/core", "Collapse")
  @js.native
  object RawComponent extends js.Function

  def apply(
    classes: js.Object = js.Object(),
    collapsedHeight: String = "0px",
    component: Option[String | js.Function] = Some("div"),
    in: Option[Boolean] = None,
    timeout: Option[Int | js.Object | Timeout.Value] = None
  ): WithProps = auto
}

trait CollapseExtensions {
  object Timeout extends Enumeration {
    val auto = Value("auto")
  }
}
