package io.kinoplan.scalajs.react.material.ui.lab.internal

import scala.scalajs.js
import scala.scalajs.js.JSConverters._

import japgolly.scalajs.react.raw.React

@js.native
trait IconMapping extends js.Object {
  var error: js.UndefOr[React.Node] = js.native
  var info: js.UndefOr[React.Node] = js.native
  var success: js.UndefOr[React.Node] = js.native
  var warning: js.UndefOr[React.Node] = js.native
}

object IconMapping {
  def apply(
    error: js.UndefOr[React.Node] = js.undefined,
    info: js.UndefOr[React.Node] = js.undefined,
    success: js.UndefOr[React.Node] = js.undefined,
    warning: js.UndefOr[React.Node] = js.undefined
  ) = {
    val o: Map[String, Any] = Map(
      "error" -> error,
      "info" -> info,
      "success" -> success,
      "warning" -> warning
    )

    o.toJSDictionary.asInstanceOf[js.Object].asInstanceOf[IconMapping]
  }
}
