package io.kinoplan.scalajs.react.material.ui.core

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

import japgolly.scalajs.react.vdom.VdomNode

import io.kinoplan.scalajs.react.bridge.{ReactBridgeComponent, WithProps}
import io.kinoplan.scalajs.react.material.ui.core.internal.BadgeOrigin

object MuiBadge extends ReactBridgeComponent with MuiBadgeExtensions {
  override protected lazy val componentValue: js.Function = RawComponent

  @JSImport("@material-ui/core", "Badge")
  @js.native
  object RawComponent extends js.Function

  def apply(
    anchorOrigin: js.UndefOr[BadgeOrigin] = js.undefined,
    badgeContent: js.UndefOr[VdomNode] = js.undefined,
    classes: js.UndefOr[Map[ClassKey.Value, String]] =js.undefined,
    color: js.UndefOr[Color.Value] = js.undefined,
    component: js.UndefOr[ComponentPropType] = js.undefined,
    invisible: js.UndefOr[Boolean] = js.undefined,
    max: js.UndefOr[Int] = js.undefined,
    overlap: js.UndefOr[Overlap.Value] = js.undefined,
    showZero: js.UndefOr[Boolean] = js.undefined,
    variant: js.UndefOr[Variant.Value] = js.undefined
  ): WithProps = auto
}

trait MuiBadgeExtensions {
  object Color extends Enumeration {
    type Value = String

    val default = "default"
    val error = "error"
    val primary = "primary"
    val secondary = "secondary"
  }

  object Overlap extends Enumeration {
    type Value = String

    val circle = "circle"
    val rectangle = "rectangle"
  }

  object Variant extends Enumeration {
    type Value = String

    val dot = "dot"
    val standard = "standard"
  }

  object ClassKey extends Enumeration {
    type Value = String

    val root = "root"
    val badge = "badge"
    val colorPrimary = "colorPrimary"
    val colorSecondary = "colorSecondary"
    val colorError = "colorError"
    val dot = "dot"
    val anchorOriginTopRightRectangle = "anchorOriginTopRightRectangle"
    val anchorOriginBottomRightRectangle = "anchorOriginBottomRightRectangle"
    val anchorOriginTopLeftRectangle = "anchorOriginTopLeftRectangle"
    val anchorOriginBottomLeftRectangle = "anchorOriginBottomLeftRectangle"
    val anchorOriginTopRightCircle = "anchorOriginTopRightCircle"
    val anchorOriginBottomRightCircle = "anchorOriginBottomRightCircle"
    val anchorOriginTopLeftCircle = "anchorOriginTopLeftCircle"
    val anchorOriginBottomLeftCircle = "anchorOriginBottomLeftCircle"
    val invisible = "invisible"
  }
}
