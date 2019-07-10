package io.kinoplan.scalajs.react.material.ui.core

import com.payalabs.scalajs.react.bridge.{ReactBridgeComponent, WithPropsNoChildren}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

object MuiCard extends ReactBridgeComponent with MuiCardExtensions {
  override protected lazy val componentValue: js.Function = RawComponent

  @JSImport("@material-ui/core", "Card")
  @js.native
  object RawComponent extends js.Function

  def apply(
    classes: js.UndefOr[Map[ClassKey.Value, String]] = js.undefined,
    raised: js.UndefOr[Boolean] = js.undefined
  ): WithPropsNoChildren = autoNoChildren
}

trait MuiCardExtensions {
  object ClassKey extends Enumeration {
    type Value = String

    val root = "root"
  }
}
