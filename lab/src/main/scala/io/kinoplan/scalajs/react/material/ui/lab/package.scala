package io.kinoplan.scalajs.react.material.ui

import scala.scalajs.js
import scala.scalajs.js.|

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.raw.SyntheticEvent

package object lab {
  type Handler1[A]                              = A => Callback
  type Handler2[A, B]                           = (A, B) => Callback
  type ReactHandler1[E <: SyntheticEvent[_]]    = Handler1[E]
  type ReactHandler2[E <: SyntheticEvent[_], A] = Handler2[E, A]
  type ComponentPropType                        = String | js.Function
  type ComponentRefType                         = js.Function | js.Object
}
