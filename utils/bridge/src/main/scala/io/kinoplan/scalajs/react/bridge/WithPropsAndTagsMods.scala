package io.kinoplan.scalajs.react.bridge

import scala.scalajs.js

import japgolly.scalajs.react.vdom.{VdomElement, VdomNode}

class WithPropsAndTagsMods(jsComponent: JsComponentType, jsProps: js.Object, tagModChildren: List[VdomNode]) {
  def apply(children: VdomNode*): VdomElement = {
    new WithPropsAndTagModsAndChildren(jsComponent, jsProps, tagModChildren ++ children).apply
  }
}

object WithPropsAndTagsMods {
  implicit def toVdomNode(wp: WithPropsAndTagsMods): VdomNode = wp.apply()
}
