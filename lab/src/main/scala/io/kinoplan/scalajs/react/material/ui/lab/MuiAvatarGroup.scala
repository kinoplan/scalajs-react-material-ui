package io.kinoplan.scalajs.react.material.ui.lab

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

import io.kinoplan.scalajs.react.bridge.{ReactBridgeComponent, WithProps}

object MuiAvatarGroup extends ReactBridgeComponent with MuiAvatarGroupExtensions {
  override protected lazy val componentValue: js.Function = RawComponent

  @JSImport("@material-ui/lab", "AvatarGroup")
  @js.native
  object RawComponent extends js.Function

  def apply(
    classes: js.UndefOr[Map[ClassKey.Value, String]] = js.undefined,
    spacing: js.UndefOr[Spacing.Value] = js.undefined
  ): WithProps = auto
}

trait MuiAvatarGroupExtensions {
  object Spacing extends Enumeration {
    type Value = String

    val medium = "medium"
    val small = "small"
    val number = "number"
  }

  object ClassKey extends Enumeration {
    type Value = String

    val root = "root"
    val avatar = "avatar"
  }
}
