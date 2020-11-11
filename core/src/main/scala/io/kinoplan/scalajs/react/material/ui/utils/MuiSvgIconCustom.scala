package io.kinoplan.scalajs.react.material.ui.utils

import scala.scalajs.js

import japgolly.scalajs.react.vdom.TagMod
import japgolly.scalajs.react.vdom.all._

import io.kinoplan.scalajs.react.bridge.WithPropsAndTagsMods
import io.kinoplan.scalajs.react.material.ui.core.{ComponentPropType, MuiSvgIcon, MuiSvgIconExtensions}

case class MuiSvgIconCustom(attrs: TagMod*) extends MuiSvgIconExtensions {
  def apply(
    classes: js.UndefOr[Map[ClassKey.Value, String]] = js.undefined,
    color: js.UndefOr[Color.Value] = js.undefined,
    component: js.UndefOr[ComponentPropType] = js.undefined,
    fontSize: js.UndefOr[FontSize.Value] = js.undefined,
    nativeColor: js.UndefOr[String] = js.undefined,
    shapeRendering: js.UndefOr[String] = js.undefined,
    titleAccess: js.UndefOr[String] = js.undefined,
    viewBox: js.UndefOr[String] = js.undefined
  )(implicit attrAndChildren: TagMod*): WithPropsAndTagsMods = {
    MuiSvgIcon(
      classes,
      color,
      component,
      fontSize,
      nativeColor,
      shapeRendering,
      titleAccess,
      viewBox
    )(
      attrs.toTagMod(identity),
      attrAndChildren.toTagMod(identity)
    )
  }
}
