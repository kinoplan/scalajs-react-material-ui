package io.kinoplan.scalajs.react.material.ui.core

import com.payalabs.scalajs.react.bridge.{ReactBridgeComponent, WithProps}
import io.kinoplan.scalajs.react.material.ui.core.styles.transitions

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

object MuiCollapse extends ReactBridgeComponent with MuiCollapseExtensions {
  override protected lazy val componentValue: js.Function = RawComponent

  @JSImport("@material-ui/core", "Collapse")
  @js.native
  object RawComponent extends js.Function

  def apply(
    classes: Map[ClassKey.ClassKey, String] = Map.empty,
    collapsedHeight: String = "0px",
    component: Option[String | js.Function] = Some("div"),
    in: Option[Boolean] = None,
    timeout: Option[Int | Timeout.Value] = Some(transitions.duration.standard)
  ): WithProps = auto
}

trait MuiCollapseExtensions {
  object Timeout extends Enumeration {
    val auto = Value("auto")
  }

  object ClassKey extends Enumeration {
    type ClassKey = String

    val container = "container"
    val entered = "entered"
    val wrapper = "wrapper"
    val wrapperInner = "wrapperInner"
  }
}
