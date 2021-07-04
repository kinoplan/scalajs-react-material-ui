package io.kinoplan.scalajs.react.material.ui.core

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

import io.kinoplan.scalajs.react.bridge.{ReactBridgeComponent, WithProps}

object MuiAvatar extends ReactBridgeComponent with MuiAvatarExtensions {
  override protected lazy val componentValue: js.Function = RawComponent

  @JSImport("@material-ui/core", "Avatar")
  @js.native
  object RawComponent extends js.Function

  def apply(
    classes: js.UndefOr[Map[ClassKey.Value, String]] = js.undefined,
    component: js.UndefOr[ComponentPropType] = js.undefined,
    imgProps: js.UndefOr[js.Object] = js.undefined,
    variant: js.UndefOr[Variant.Value] = js.undefined
  ): WithProps = auto
}

trait MuiAvatarExtensions {
  object Variant extends Enumeration {
    type Value = String

    val circle = "circle"
    val circular = "circular"
    val rounded = "rounded"
    val square = "square"
  }

  object ClassKey extends Enumeration {
    type Value = String

    val root = "root"
    val colorDefault = "colorDefault"
    val circle = "circle"
    val circular = "circular"
    val rounded = "rounded"
    val square = "square"
    val img = "img"
    val fallback = "fallback"
  }
}
