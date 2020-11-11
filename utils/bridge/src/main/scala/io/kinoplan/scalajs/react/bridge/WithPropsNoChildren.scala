package io.kinoplan.scalajs.react.bridge

import scala.scalajs.js

import japgolly.scalajs.react.vdom.{TagMod, VdomElement}

class WithPropsNoChildren(jsComponent: JsComponentType, jsProps: js.Object) {
  def apply(attrAndChildren: TagMod*): VdomElement = {
    new WithProps(jsComponent, jsProps).apply(attrAndChildren: _*).apply()
  }
}

object WithPropsNoChildren {
  implicit def toVdomElement(wp: WithPropsNoChildren): VdomElement = wp.apply()
}
