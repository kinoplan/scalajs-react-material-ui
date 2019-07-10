package io.kinoplan.scalajs.react.material.ui.utils

import io.kinoplan.scalajs.react.material.ui.core.{MuiSvgIcon, MuiSvgIconExtensions, OptComponentPropType}
import japgolly.scalajs.react.vdom.all._

import scala.scalajs.js

case class MuiSvgIconCustom(customValue: VdomNode) extends MuiSvgIconExtensions {
  def apply(
    classes: js.UndefOr[Map[ClassKey.Value, String]] = js.undefined,
    color: js.UndefOr[Color.Value] = js.undefined,
    component: OptComponentPropType = js.undefined,
    fontSize: js.UndefOr[FontSize.Value] = js.undefined,
    nativeColor: js.UndefOr[String] = js.undefined,
    shapeRendering: js.UndefOr[String] = js.undefined,
    titleAccess: js.UndefOr[String] = js.undefined,
    viewBox: js.UndefOr[String] = js.undefined
  )(implicit children: VdomNode = EmptyVdom): VdomElement = {
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
      children,
      customValue
    )
  }
}
