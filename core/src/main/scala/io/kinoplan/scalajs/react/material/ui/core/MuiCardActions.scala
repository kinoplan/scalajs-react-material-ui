package io.kinoplan.scalajs.react.material.ui.core

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

import io.kinoplan.scalajs.react.bridge.{ReactBridgeComponent, WithProps}

object MuiCardActions extends ReactBridgeComponent with MuiCardActionsExtensions {
  override protected lazy val componentValue: js.Function = RawComponent

  @JSImport("@mui/material", "CardActions")
  @js.native
  object RawComponent extends js.Function

  def apply(
    classes: js.UndefOr[Map[ClassKey.Value, String]] = js.undefined,
    disableActionSpacing: js.UndefOr[Boolean] = js.undefined
  ): WithProps = auto

}

trait MuiCardActionsExtensions {

  object ClassKey extends Enumeration {
    type Value = String

    val root = "root"
    val disableActionSpacing = "disableActionSpacing"
    val action = "action"
  }

}
