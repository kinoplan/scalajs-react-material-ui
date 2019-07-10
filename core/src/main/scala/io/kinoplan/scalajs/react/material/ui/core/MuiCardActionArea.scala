package io.kinoplan.scalajs.react.material.ui.core

import com.payalabs.scalajs.react.bridge.{ReactBridgeComponent, WithProps}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

object MuiCardActionArea extends ReactBridgeComponent with MuiCardActionAreaExtensions {
  override protected lazy val componentValue: js.Function = RawComponent

  @JSImport("@material-ui/core", "CardActionArea")
  @js.native
  object RawComponent extends js.Function

  def apply(
    classes: js.UndefOr[Map[ClassKey.Value, String]] = js.undefined
  ): WithProps = auto
}

trait MuiCardActionAreaExtensions {
  object ClassKey extends Enumeration {
    type Value = String

    val root = "root"
    val focusVisible = "focusVisible"
    val focusHighlight = "focusHighlight"
  }
}
