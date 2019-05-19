package io.kinoplan.scalajs.react.material.ui.core

import com.payalabs.scalajs.react.bridge.{ReactBridgeComponent, WithPropsNoChildren}
import japgolly.scalajs.react.vdom.html_<^._

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

object MuiStepIcon extends ReactBridgeComponent with MuiStepIconExtensions with JsWriterImplicits {
  override protected lazy val componentValue: js.Function = RawComponent

  @JSImport("@material-ui/core", "StepIcon")
  @js.native
  object RawComponent extends js.Function

  def apply(
    active: Boolean = false,
    classes: Map[ClassKey.ClassKey, String] = Map.empty,
    completed: Boolean = false,
    error: Boolean = false,
    icon: VdomNode
  ): WithPropsNoChildren = autoNoChildren
}

trait MuiStepIconExtensions {
  object ClassKey extends Enumeration {
    type ClassKey = String

    val root = "root"
    val text = "text"
    val active = "active"
    val completed = "completed"
    val error = "error"
  }
}
