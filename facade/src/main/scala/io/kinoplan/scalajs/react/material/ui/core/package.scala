package io.kinoplan.scalajs.react.material.ui

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.raw.SyntheticEvent

import scala.scalajs.js

package object core {
  type Handler1[A]                              = js.UndefOr[A => Callback]
  type Handler2[A, B]                           = js.UndefOr[(A, B) => Callback]
  type ReactHandler1[E <: SyntheticEvent[_]]    = Handler1[E]
  type ReactHandler2[E <: SyntheticEvent[_], A] = Handler2[E, A]
}
