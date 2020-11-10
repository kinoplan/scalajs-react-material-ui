package io.kinoplan.scalajs.react.material.ui.icons

import scala.scalajs.js
import scala.scalajs.js.|

import io.kinoplan.scalajs.react.bridge.{ReactBridgeComponent, WithProps}

class MuiIcons(value: js.Any) extends ReactBridgeComponent with SvgIconExtensions {
  override lazy val componentValue = value

  def apply(
    classes: js.UndefOr[Map[ClassKey.Value, String]] = js.undefined,
    color: js.UndefOr[Color.Value] = js.undefined,
    component: js.UndefOr[String | js.Function] = js.undefined,
    fontSize: js.UndefOr[FontSize.Value] = js.undefined,
    nativeColor: js.UndefOr[String] = js.undefined,
    shapeRendering: js.UndefOr[String] = js.undefined,
    titleAccess: js.UndefOr[String] = js.undefined,
    viewBox: js.UndefOr[String] = js.undefined
  ): WithProps = auto
}

object MuiIcons extends SvgIconExtensions {
  def apply(value: MuiIconsModule.Value)(
    classes: js.UndefOr[Map[ClassKey.Value, String]] = js.undefined,
    color: js.UndefOr[Color.Value] = js.undefined,
    component: js.UndefOr[String | js.Function] = js.undefined,
    fontSize: js.UndefOr[FontSize.Value] = js.undefined,
    nativeColor: js.UndefOr[String] = js.undefined,
    shapeRendering: js.UndefOr[String] = js.undefined,
    titleAccess: js.UndefOr[String] = js.undefined,
    viewBox: js.UndefOr[String] = js.undefined
  ): WithProps = new MuiIcons(value).apply(
    classes = classes,
    color = color,
    component = component,
    fontSize = fontSize,
    nativeColor = nativeColor,
    shapeRendering = shapeRendering,
    titleAccess = titleAccess,
    viewBox = viewBox
  )
}
