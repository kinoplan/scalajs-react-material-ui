package io.kinoplan.scalajs.react.material.ui.core

import com.payalabs.scalajs.react.bridge.JsWriter
import japgolly.scalajs.react.vdom.VdomNode

import scala.scalajs.js

trait JsWriterImplicits {
  implicit def vdomNodeWriter: JsWriter[VdomNode] = JsWriter(_.rawNode.asInstanceOf[js.Dynamic])
}

