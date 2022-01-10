package io.kinoplan.scalajs.react.material.ui.core

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

import japgolly.scalajs.react.vdom.html_<^._

import io.kinoplan.scalajs.react.bridge.{ReactBridgeComponent, WithProps}

object MuiListItemText extends ReactBridgeComponent with MuiListItemTextExtensions {
  override protected lazy val componentValue: js.Function = RawComponent

  @JSImport("@mui/material", "ListItemText")
  @js.native
  object RawComponent extends js.Function

  def apply(
    classes: js.UndefOr[Map[ClassKey.Value, String]] = js.undefined,
    disableTypography: js.UndefOr[Boolean] = js.undefined,
    inset: js.UndefOr[Boolean] = js.undefined,
    primary: js.UndefOr[VdomNode] = js.undefined,
    primaryTypographyProps: js.UndefOr[js.Object] = js.undefined,
    secondary: js.UndefOr[VdomNode] = js.undefined,
    secondaryTypographyProps: js.UndefOr[js.Object] = js.undefined
  ): WithProps = auto

}

trait MuiListItemTextExtensions {

  object ClassKey extends Enumeration {
    type Value = String

    val root = "root"
    val inset = "inset"
    val dense = "dense"
    val primary = "primary"
    val secondary = "secondary"
    val textDense = "textDense"
  }

}
