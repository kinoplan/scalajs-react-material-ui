package io.kinoplan.scalajs.react.material.ui.core

import com.payalabs.scalajs.react.bridge.{ReactBridgeComponent, WithPropsNoChildren}
import japgolly.scalajs.react.raw.React
import japgolly.scalajs.react.vdom.html_<^._

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

object MuiChip extends ReactBridgeComponent with MuiChipExtensions with JsWriterImplicits {
  override protected lazy val componentValue: js.Function = RawComponent

  @JSImport("@material-ui/core", "Chip")
  @js.native
  object RawComponent extends js.Function

  def apply(
    avatar: Option[React.Element] = None,
    classes: Map[ClassKey.ClassKey, String] = Map.empty,
    clickable: Option[Boolean] = None,
    color: Color.Value = Color.default,
    component: Option[String | js.Function] = Some("div"),
    deleteIcon: Option[React.Element] = None,
    icon: Option[React.Element] = None,
    label: Option[VdomNode] = None,
    onDelete: Option[js.Function] = None,
    variant: Variant.Value = Variant.default
  ): WithPropsNoChildren = autoNoChildren
}

trait MuiChipExtensions {
  object Color extends Enumeration {
    val default = Value("default")
    val primary = Value("primary")
    val secondary = Value("secondary")
  }

  object Variant extends Enumeration {
    val default = Value("default")
    val outlined = Value("outlined")
  }

  object ClassKey extends Enumeration {
    type ClassKey = String

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
