package io.kinoplan.scalajs.react.material.ui.core

import com.payalabs.scalajs.react.bridge.{ReactBridgeComponent, WithProps}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

object MuiCardActions extends ReactBridgeComponent with MuiCardActionsExtensions {
  override protected lazy val componentValue: js.Function = RawComponent

  @JSImport("@material-ui/core", "CardActions")
  @js.native
  object RawComponent extends js.Function

  def apply(
    classes: Map[ClassKey.ClassKey, String] = Map.empty,
    disableActionSpacing: Boolean = false
  ): WithProps = auto
}

trait MuiCardActionsExtensions {
  object ClassKey extends Enumeration {
    type ClassKey = String

    val root = "root"
    val disableActionSpacing = "disableActionSpacing"
    val action = "action"
  }
}
