package io.kinoplan.scalajs.react.material.ui.core

import com.payalabs.scalajs.react.bridge.JsWriter
import japgolly.scalajs.react.raw.React
import japgolly.scalajs.react.vdom.VdomNode

import scala.scalajs.js

trait JsWriterImplicits {
  implicit def vdomNodeWriter: JsWriter[VdomNode] = JsWriter(_.rawNode.asInstanceOf[js.Dynamic])

  implicit def reactElementWriter: JsWriter[React.Element] = JsWriter(_.asInstanceOf[js.Dynamic])

  implicit def reactNodeWriter: JsWriter[React.Node] = JsWriter(_.asInstanceOf[js.Dynamic])
}
