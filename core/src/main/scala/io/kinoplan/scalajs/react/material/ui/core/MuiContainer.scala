package io.kinoplan.scalajs.react.material.ui.core

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

import io.kinoplan.scalajs.react.bridge.{ReactBridgeComponent, WithProps}

object MuiContainer extends ReactBridgeComponent with MuiContainerExtensions {
  override protected lazy val componentValue: js.Function = RawComponent

  @JSImport("@material-ui/core", "Container")
  @js.native
  object RawComponent extends js.Function

  def apply(
    classes: js.UndefOr[Map[ClassKey.Value, String]] =js.undefined,
    component: js.UndefOr[ComponentPropType] = js.undefined,
    disableGutters: js.UndefOr[Boolean] = js.undefined,
    fixed: js.UndefOr[Boolean] = js.undefined,
    maxWidth: js.UndefOr[MaxWidth.Value | Boolean] = js.undefined,
  ): WithProps = auto
}

trait MuiContainerExtensions {
  object MaxWidth extends Enumeration {
    type Value = String

    val lg = "lg"
    val md = "md"
    val sm = "sm"
    val xl = "xl"
    val xs = "xs"
  }

  object ClassKey extends Enumeration {
    type Value = String

    val root = "root"
    val disableGutters = "disableGutters"
    val fixed = "fixed"
    val maxWidthXs = "maxWidthXs"
    val maxWidthSm = "maxWidthSm"
    val maxWidthMd = "maxWidthMd"
    val maxWidthLg = "maxWidthLg"
    val maxWidthXl = "maxWidthXl"
  }
}
