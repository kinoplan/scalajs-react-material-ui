package io.kinoplan.scalajs.react.material.ui.core

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

import japgolly.scalajs.react.vdom.html_<^._

import io.kinoplan.scalajs.react.bridge.{ReactBridgeComponent, WithPropsNoChildren}

object MuiStepIcon extends ReactBridgeComponent with MuiStepIconExtensions {
  override protected lazy val componentValue: js.Function = RawComponent

  @JSImport("@mui/material", "StepIcon")
  @js.native
  object RawComponent extends js.Function

  def apply(
    active: js.UndefOr[Boolean] = js.undefined,
    classes: js.UndefOr[Map[ClassKey.Value, String]] = js.undefined,
    completed: js.UndefOr[Boolean] = js.undefined,
    error: js.UndefOr[Boolean] = js.undefined,
    icon: VdomNode
  ): WithPropsNoChildren = autoNoChildren

}

trait MuiStepIconExtensions {

  object ClassKey extends Enumeration {
    type Value = String

    val root = "root"
    val text = "text"
    val active = "active"
    val completed = "completed"
    val error = "error"
  }

}
