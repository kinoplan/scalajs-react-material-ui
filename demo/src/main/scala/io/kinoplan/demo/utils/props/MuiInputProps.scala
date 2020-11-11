package io.kinoplan.demo.utils.props

import scala.scalajs.js
import scala.scalajs.js.JSConverters._

import japgolly.scalajs.react.raw.React

@js.native
trait MuiInputProps extends js.Object {
  def readOnly: js.UndefOr[Boolean] = js.native
  def ariaLabel: js.UndefOr[String] = js.native
  def classes: js.UndefOr[js.Object] = js.native
  def startAdornment: js.UndefOr[React.Node] = js.native
  def endAdornment: js.UndefOr[React.Node] = js.native
}

object MuiInputProps {
  def apply(
    readOnly: js.UndefOr[Boolean] = js.undefined,
    ariaLabel: js.UndefOr[String] = js.undefined,
    classes: js.UndefOr[js.Object] = js.undefined,
    startAdornment: js.UndefOr[React.Node] = js.undefined,
    endAdornment: js.UndefOr[React.Node] = js.undefined
  ) = {
    val o: Map[String, Any] = Seq(
      readOnly.toOption.map("readOnly" -> _),
      ariaLabel.toOption.map("aria-label" -> _),
      classes.toOption.map("classes" -> _),
      startAdornment.toOption.map("startAdornment" -> _),
      endAdornment.toOption.map("endAdornment" -> _)
    ).flatten.toMap

    o.toJSDictionary.asInstanceOf[js.Object].asInstanceOf[MuiInputProps]
  }
}
