package io.kinoplan.scalajs.react.material.ui.core

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

import japgolly.scalajs.react.ReactEvent
import japgolly.scalajs.react.facade.React
import japgolly.scalajs.react.vdom.html_<^._

import io.kinoplan.scalajs.react.bridge.{ReactBridgeComponent, WithPropsNoChildren}

object MuiChip extends ReactBridgeComponent with MuiChipExtensions {
  override protected lazy val componentValue: js.Function = RawComponent

  @JSImport("@mui/material", "Chip")
  @js.native
  object RawComponent extends js.Function

  def apply(
    avatar: js.UndefOr[React.Element] = js.undefined,
    classes: js.UndefOr[Map[ClassKey.Value, String]] = js.undefined,
    clickable: js.UndefOr[Boolean] = js.undefined,
    color: js.UndefOr[Color.Value] = js.undefined,
    component: js.UndefOr[ComponentPropType] = js.undefined,
    deleteIcon: js.UndefOr[React.Element] = js.undefined,
    icon: js.UndefOr[React.Element] = js.undefined,
    label: js.UndefOr[VdomNode] = js.undefined,
    onDelete: js.UndefOr[ReactHandler1[ReactEvent]] = js.undefined,
    variant: js.UndefOr[Variant.Value] = js.undefined
  ): WithPropsNoChildren = autoNoChildren

}

trait MuiChipExtensions {

  object Color extends Enumeration {
    type Value = String

    val default = "default"
    val primary = "primary"
    val secondary = "secondary"
  }

  object Variant extends Enumeration {
    type Value = String

    val default = "default"
    val outlined = "outlined"
  }

  object ClassKey extends Enumeration {
    type Value = String

    val root = "root"
    val colorPrimary = "colorPrimary"
    val colorSecondary = "colorSecondary"
    val clickable = "clickable"
    val clickableColorPrimary = "clickableColorPrimary"
    val clickableColorSecondary = "clickableColorSecondary"
    val deletable = "deletable"
    val deletableColorPrimary = "deletableColorPrimary"
    val deletableColorSecondary = "deletableColorSecondary"
    val outlined = "outlined"
    val outlinedPrimary = "outlinedPrimary"
    val outlinedSecondary = "outlinedSecondary"
    val avatar = "avatar"
    val avatarColorPrimary = "avatarColorPrimary"
    val avatarColorSecondary = "avatarColorSecondary"
    val avatarChildren = "avatarChildren"
    val icon = "icon"
    val iconColorPrimary = "iconColorPrimary"
    val iconColorSecondary = "iconColorSecondary"
    val label = "label"
    val deleteIcon = "deleteIcon"
    val deleteIconColorPrimary = "deleteIconColorPrimary"
    val deleteIconColorSecondary = "deleteIconColorSecondary"
    val deleteIconOutlinedColorPrimary = "deleteIconOutlinedColorPrimary"
    val deleteIconOutlinedColorSecondary = "deleteIconOutlinedColorSecondary"
  }

}
