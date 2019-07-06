package io.kinoplan.scalajs.react.material.ui.core

import com.payalabs.scalajs.react.bridge.{ReactBridgeComponent, WithProps}
import japgolly.scalajs.react.vdom.html_<^._

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

object MuiStepButton extends ReactBridgeComponent with MuiStepButtonExtensions with JsWriterImplicits {
  override protected lazy val componentValue: js.Function = RawComponent

  @JSImport("@material-ui/core", "StepButton")
  @js.native
  object RawComponent extends js.Function

  def apply(
    active: js.UndefOr[Boolean] = js.undefined,
    classes: Map[ClassKey.ClassKey, String] = Map.empty,
    completed: js.UndefOr[Boolean] = js.undefined,
    disabled: js.UndefOr[Boolean] = js.undefined,
    icon: Option[VdomNode] = None,
    optional: Option[VdomNode] = None
  ): WithProps = auto
}

trait MuiStepButtonExtensions {
  object ClassKey extends Enumeration {
    type ClassKey = String

    val root = "root"
    val horizontal = "horizontal"
    val vertical = "vertical"
    val touchRipple = "touchRipple"
  }
}
