package io.kinoplan.scalajs.react.material.ui.core

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

import japgolly.scalajs.react.vdom.html_<^._

import io.kinoplan.scalajs.react.bridge.{ReactBridgeComponent, WithPropsNoChildren}

object MuiCardHeader extends ReactBridgeComponent with MuiCardHeaderExtensions {
  override protected lazy val componentValue: js.Function = RawComponent

  @JSImport("@mui/material", "CardHeader")
  @js.native
  object RawComponent extends js.Function

  def apply(
    action: js.UndefOr[VdomNode] = js.undefined,
    avatar: js.UndefOr[VdomNode] = js.undefined,
    classes: js.UndefOr[Map[ClassKey.Value, String]] = js.undefined,
    component: js.UndefOr[ComponentPropType] = js.undefined,
    disableTypography: js.UndefOr[Boolean] = js.undefined,
    subheader: js.UndefOr[VdomNode] = js.undefined,
    subheaderTypographyProps: js.UndefOr[js.Object] = js.undefined,
    title: js.UndefOr[VdomNode] = js.undefined,
    titleTypographyProps: js.UndefOr[js.Object] = js.undefined
  ): WithPropsNoChildren = autoNoChildren

}

trait MuiCardHeaderExtensions {

  object ClassKey extends Enumeration {
    type Value = String

    val root = "root"
    val avatar = "avatar"
    val action = "action"
    val content = "content"
    val title = "title"
    val subheader = "subheader"
  }

}
