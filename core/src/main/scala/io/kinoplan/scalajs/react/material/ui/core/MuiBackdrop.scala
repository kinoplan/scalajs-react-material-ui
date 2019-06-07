package io.kinoplan.scalajs.react.material.ui.core

import com.payalabs.scalajs.react.bridge.{ReactBridgeComponent, WithPropsNoChildren}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

object MuiBackdrop extends ReactBridgeComponent with MuiBackdropExtensions {
  override protected lazy val componentValue: js.Function = RawComponent

  @JSImport("@material-ui/core", "Backdrop")
  @js.native
  object RawComponent extends js.Function

  def apply(
    classes: Map[ClassKey.ClassKey, String] = Map.empty,
    invisible: Boolean = false,
    open: Boolean,
    transitionDuration: Option[Int | js.Object] = None
  ): WithPropsNoChildren = autoNoChildren
}

trait MuiBackdropExtensions {
  object ClassKey extends Enumeration {
    type ClassKey = String

    val root = "root"
    val invisible = "invisible"
  }
}
