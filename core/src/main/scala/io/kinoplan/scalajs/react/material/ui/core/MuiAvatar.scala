package io.kinoplan.scalajs.react.material.ui.core

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

import io.kinoplan.scalajs.react.bridge.{ReactBridgeComponent, WithProps}

object MuiAvatar extends ReactBridgeComponent with MuiAvatarExtensions {
  override protected lazy val componentValue: js.Function = RawComponent

  @JSImport("@mui/material", "Avatar")
  @js.native
  object RawComponent extends js.Function

  def apply(
    classes: js.UndefOr[Map[ClassKey.Value, String]] = js.undefined,
    component: js.UndefOr[ComponentPropType] = js.undefined,
    imgProps: js.UndefOr[js.Object] = js.undefined
  ): WithProps = auto

}

trait MuiAvatarExtensions {

  object ClassKey extends Enumeration {
    type Value = String

    val root = "root"
    val colorDefault = "colorDefault"
    val img = "img"
  }

}
