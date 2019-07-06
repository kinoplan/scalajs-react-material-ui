package io.kinoplan.demo.utils.element

import japgolly.scalajs.react.ReactEventTypes
import org.scalajs.dom.raw.HTMLElement

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal

@js.native
@JSGlobal
abstract class HTMLMultipleSelectElement extends HTMLElement {
  var value: js.Array[String] = js.native
}

object html extends ReactEventTypes {
  type MultipleSelect = HTMLMultipleSelectElement

  final type ReactEventFromMultipleSelect = ReactEventFrom[MultipleSelect]
}
