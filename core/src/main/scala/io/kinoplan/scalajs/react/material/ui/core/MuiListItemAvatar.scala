package io.kinoplan.scalajs.react.material.ui.core

import com.payalabs.scalajs.react.bridge.{ReactBridgeComponent, WithProps}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

object MuiListItemAvatar extends ReactBridgeComponent with MuiListItemAvatarExtensions {
  override protected lazy val componentValue: js.Function = RawComponent

  @JSImport("@material-ui/core", "ListItemAvatar")
  @js.native
  object RawComponent extends js.Function

  def apply(
    classes: js.UndefOr[Map[ClassKey.Value, String]] = js.undefined
  ): WithProps = auto
}

trait MuiListItemAvatarExtensions {
  object ClassKey extends Enumeration {
    type Value = String

    val root = "root"
    val alignItemsFlexStart = "alignItemsFlexStart"
    val icon = "icon"
  }
}
