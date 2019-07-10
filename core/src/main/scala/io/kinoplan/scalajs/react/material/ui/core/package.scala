package io.kinoplan.scalajs.react.material.ui

import japgolly.scalajs.react.raw.{SyntheticEvent, _}
import japgolly.scalajs.react.{Callback, ReactEventTypes}
import org.scalajs.dom.raw.HTMLElement

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal
import scala.scalajs.js.|

package object core {
  type OptRenderValueType                       = js.UndefOr[js.Any => React.Node]
  type JsFun0                                   = js.Function0[Callback]
  type OptJsFun0                                = js.UndefOr[js.Function0[Callback]]
  type OptJsFun1[A]                             = js.UndefOr[js.Function1[A, Unit]]
  type OptJsFun2[A, B]                          = js.UndefOr[js.Function2[A, B, Unit]]
  type OnJSEv1[E <: SyntheticEvent[_]]          = OptJsFun1[E]
  type OnJSEv2[E <: SyntheticEvent[_], A]       = OptJsFun2[E, A]
  type Handler1[A]                              = js.UndefOr[A => Callback]
  type Handler2[A, B]                           = js.UndefOr[(A, B) => Callback]
  type Handler3[A, B, C]                        = js.UndefOr[(A, B, C) => Callback]
  type ReactHandler1[E <: SyntheticEvent[_]]    = Handler1[E]
  type ReactHandler2[E <: SyntheticEvent[_], A] = Handler2[E, A]
  type CssProperties                            = js.Any
  type ComponentPropType                        = String | js.Function
  type OptComponentPropType                     = js.UndefOr[ComponentPropType]
  type ComponentRefType                         = js.Function | js.Object
  type OptComponentRefType                      = js.UndefOr[ComponentRefType]
  type ComponentContainerType                   = js.Function | js.Object
  type OptComponentContainerType                = js.UndefOr[ComponentRefType]
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
