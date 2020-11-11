package io.kinoplan.scalajs.react.bridge

import scala.scalajs.js

import japgolly.scalajs.react.vdom.{VdomElement, VdomNode}

class WithPropsAndTagModsAndChildren(jsComponent: JsComponentType, jsProps: js.Object, children: List[VdomNode]) {
  def apply: VdomElement = jsComponent(jsProps)(children: _*)
}
