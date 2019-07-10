package io.kinoplan.scalajs.react.material.ui.core

import com.payalabs.scalajs.react.bridge.{ReactBridgeComponent, WithProps}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

object MuiAvatar extends ReactBridgeComponent with MuiAvatarExtensions {
  override protected lazy val componentValue: js.Function = RawComponent

  @JSImport("@material-ui/core", "Avatar")
  @js.native
  object RawComponent extends js.Function

  def apply(
    classes: js.UndefOr[Map[ClassKey.Value, String]] = js.undefined,
    component: OptComponentPropType = js.undefined,
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
