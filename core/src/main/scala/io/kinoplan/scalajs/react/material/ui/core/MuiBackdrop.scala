package io.kinoplan.scalajs.react.material.ui.core

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

import io.kinoplan.scalajs.react.bridge.{ReactBridgeComponent, WithPropsNoChildren}

object MuiBackdrop extends ReactBridgeComponent with MuiBackdropExtensions {
  override protected lazy val componentValue: js.Function = RawComponent

  @JSImport("@mui/material", "Backdrop")
  @js.native
  object RawComponent extends js.Function

  def apply(
    classes: js.UndefOr[Map[ClassKey.Value, String]] = js.undefined,
    invisible: js.UndefOr[Boolean] = js.undefined,
    open: Boolean,
    transitionDuration: js.UndefOr[Int | js.Object] = js.undefined
  ): WithPropsNoChildren = autoNoChildren

}

trait MuiBackdropExtensions {

  object ClassKey extends Enumeration {
    type Value = String

    val root = "root"
    val invisible = "invisible"
  }

}
