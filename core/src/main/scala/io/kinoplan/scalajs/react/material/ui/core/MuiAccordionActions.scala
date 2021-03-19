package io.kinoplan.scalajs.react.material.ui.core

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

import io.kinoplan.scalajs.react.bridge.{ReactBridgeComponent, WithProps}

object MuiAccordionActions extends ReactBridgeComponent with MuiAccordionActionsExtensions {
  override protected lazy val componentValue: js.Function = RawComponent

  @JSImport("@material-ui/core", "AccordionActions")
  @js.native
  object RawComponent extends js.Function

  def apply(
    classes: js.UndefOr[Map[ClassKey.Value, String]] = js.undefined,
    disableSpacing: js.UndefOr[Boolean] = js.undefined
  ): WithProps = auto
}

trait MuiAccordionActionsExtensions {
  object ClassKey extends Enumeration {
    type Value = String

    val root = "root"
    val spacing = "spacing"
  }
}
