package io.kinoplan.scalajs.react.bridge

import scala.scalajs.js

trait JsWriter[T]:
  def toJs(value: T): js.Any

object JsWriter:

  def apply[T](f: T => js.Any): JsWriter[T] = new JsWriter[T] {
    override def toJs(value: T) = f(value)
  }

//R
//object JsWriter {
//
//  def apply[A](f: A => js.Any): JsWriter[A] = new JsWriter[A] {
//    override def toJs(value: A) = f(value)
//  }
//
//}
