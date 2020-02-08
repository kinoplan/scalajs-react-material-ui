package io.kinoplan.scalajs.react.material.ui

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.raw.SyntheticEvent

import scala.scalajs.js
import scala.scalajs.js.|

package object lab {
  type OptJsFun2[A, B]                          = js.UndefOr[js.Function2[A, B, Unit]]
  type OptJsFun3[A, B, C]                       = js.UndefOr[js.Function3[A, B, C, Unit]]
  type Handler1[A]                              = js.UndefOr[A => Callback]
  type Handler2[A, B]                           = js.UndefOr[(A, B) => Callback]
  type Handler3[A, B, C]                        = js.UndefOr[(A, B, C) => Callback]
  type ReactHandler1[E <: SyntheticEvent[_]]    = Handler1[E]
  type ReactHandler2[E <: SyntheticEvent[_], A] = Handler2[E, A]
  type ComponentPropType                        = String | js.Function
  type OptComponentPropType                     = js.UndefOr[ComponentPropType]
  type ComponentRefType                         = js.Function | js.Object
  type OptComponentRefType                      = js.UndefOr[ComponentRefType]
}
