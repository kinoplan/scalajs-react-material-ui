package io.kinoplan.scalajs.react.material.ui

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal
import scala.scalajs.js.|

import japgolly.scalajs.react.{Callback, ReactEventTypes}
import japgolly.scalajs.react.raw.SyntheticEvent
import org.scalajs.dom.raw.HTMLElement

package object core {
  type JsFun0                                   = js.Function0[Callback]
  type OptJsFun1[A]                             = js.Function1[A, Unit]
  type OptJsFun2[A, B]                          = js.Function2[A, B, Unit]
  type OnJSEv1[E <: SyntheticEvent[_]]          = OptJsFun1[E]
  type OnJSEv2[E <: SyntheticEvent[_], A]       = OptJsFun2[E, A]
  type Handler1[A]                              = A => Callback
  type Handler2[A, B]                           = (A, B) => Callback
  type Handler3[A, B, C]                        = (A, B, C) => Callback
  type ReactHandler1[E <: SyntheticEvent[_]]    = Handler1[E]
  type ReactHandler2[E <: SyntheticEvent[_], A] = Handler2[E, A]
  type CssProperties                            = js.Any
  type ComponentPropType                        = String | js.Function
  type ComponentRefType                         = js.Function | js.Object
  type ComponentContainerType                   = js.Function | js.Object
}

@js.native
@JSGlobal
abstract class HTMLMultipleSelectElement extends HTMLElement {
  var value: js.Array[String] = js.native
}

@js.native
@JSGlobal
abstract class HTMLNumberInputElement extends HTMLElement {
  var value: Int = js.native
}

object html extends ReactEventTypes {
  type MultipleSelect = HTMLMultipleSelectElement
  type NumberInput = HTMLNumberInputElement

  final type ReactEventFromMultipleSelect = ReactEventFrom[MultipleSelect]
  final type ReactEventFromNumberInput = ReactEventFrom[NumberInput]
}
