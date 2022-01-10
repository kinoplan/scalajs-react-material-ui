package io.kinoplan.scalajs.react.material.ui.core

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

import io.kinoplan.scalajs.react.bridge.{ReactBridgeComponent, WithProps}

object MuiDialogTitle extends ReactBridgeComponent with MuiDialogTitleExtensions {
  override protected lazy val componentValue: js.Function = RawComponent

  @JSImport("@mui/material", "DialogTitle")
  @js.native
  object RawComponent extends js.Function

  def apply(
    classes: js.UndefOr[Map[ClassKey.Value, String]] = js.undefined,
    disableTypography: js.UndefOr[Boolean] = js.undefined
  ): WithProps = auto

}

trait MuiDialogTitleExtensions {

  object ClassKey extends Enumeration {
    type Value = String

    val root = "root"
  }

}
