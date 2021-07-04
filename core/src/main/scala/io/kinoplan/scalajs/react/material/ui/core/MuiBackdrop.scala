package io.kinoplan.scalajs.react.material.ui.core

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

import io.kinoplan.scalajs.react.bridge.{ReactBridgeComponent, WithPropsNoChildren}
import io.kinoplan.scalajs.react.material.ui.core.internal.TransitionTimeout

object MuiBackdrop extends ReactBridgeComponent with MuiBackdropExtensions {
  override protected lazy val componentValue: js.Function = RawComponent

  @JSImport("@material-ui/core", "Backdrop")
  @js.native
  object RawComponent extends js.Function

  def apply(
    classes:js.UndefOr[Map[ClassKey.Value, String]] = js.undefined,
    invisible: js.UndefOr[Boolean] = js.undefined,
    open: Boolean,
    transitionDuration: js.UndefOr[Int | TransitionTimeout] = js.undefined,
    disableStrictModeCompat: js.UndefOr[Boolean] = js.undefined,
    in: js.UndefOr[Boolean] = js.undefined,
    timeout: js.UndefOr[Int | TransitionTimeout] = js.undefined,
  ): WithPropsNoChildren = autoNoChildren
}

trait MuiBackdropExtensions {
  object ClassKey extends Enumeration {
    type Value = String

    val root = "root"
    val invisible = "invisible"
  }
}
