package io.kinoplan.scalajs.react.material.ui.core

import com.payalabs.scalajs.react.bridge.{ReactBridgeComponent, WithProps}
import japgolly.scalajs.react.raw.React
import japgolly.scalajs.react.vdom.html_<^._

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

object FormControlLabel extends ReactBridgeComponent with FormControlLabelExtensions with JsWriterImplicits {
  override protected lazy val componentValue: js.Function = RawComponent

  @JSImport("@material-ui/core", "FormControlLabel")
  @js.native
  object RawComponent extends js.Function

  def apply(
    checked: Option[Boolean | String] = None,
    classes: js.Object = js.Object(),
    control: Option[React.Element] = None,
    disabled: Option[Boolean] = None,
    inputRef: Option[js.Function | js.Object] = None,
    label: Option[VdomNode] = None,
    labelPlacement: LabelPlacement.Value = LabelPlacement.end,
    name: Option[String] = None,
    onChange: Option[js.Function] = None,
    value: Option[String] = None
  ): WithProps = auto
}

trait FormControlLabelExtensions {
  object LabelPlacement extends Enumeration {
    val end = Value("end")
    val start = Value("start")
    val top = Value("top")
    val bottom = Value("bottom")
  }
}
