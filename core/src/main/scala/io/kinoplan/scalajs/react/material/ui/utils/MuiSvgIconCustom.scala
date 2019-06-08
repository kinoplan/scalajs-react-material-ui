package io.kinoplan.scalajs.react.material.ui.utils

import io.kinoplan.scalajs.react.material.ui.core.{MuiSvgIcon, MuiSvgIconExtensions}
import japgolly.scalajs.react.vdom.all._

import scala.scalajs.js
import scala.scalajs.js.|

case class MuiSvgIconCustom(svgTitle: String) extends MuiSvgIconExtensions {
  def apply(
    classes: Map[ClassKey.ClassKey, String] = Map.empty,
    color: Color.Value = Color.inherit,
    component: Option[String | js.Function] = Some("svg"),
    fontSize: FontSize.Value = FontSize.default,
    nativeColor: Option[String] = None,
    shapeRendering: Option[String] = None,
    titleAccess: Option[String] = None,
    viewBox: String = "0 0 24 24"
  )(implicit children: VdomNode = EmptyVdom): VdomElement = MuiSvgIcon(
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
    svg.path(svg.d := svgTitle)
  )
}
