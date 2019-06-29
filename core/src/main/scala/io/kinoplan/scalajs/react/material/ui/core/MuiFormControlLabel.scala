package io.kinoplan.scalajs.react.material.ui.core

import com.payalabs.scalajs.react.bridge.{ReactBridgeComponent, WithPropsNoChildren}
import japgolly.scalajs.react.raw.React
import japgolly.scalajs.react.vdom.html_<^._

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

object MuiFormControlLabel extends ReactBridgeComponent with MuiFormControlLabelExtensions with JsWriterImplicits {
  override protected lazy val componentValue: js.Function = RawComponent

  @JSImport("@material-ui/core", "FormControlLabel")
  @js.native
  object RawComponent extends js.Function

  def apply(
    checked: Option[Boolean | String] = None,
    classes: Map[ClassKey.ClassKey, String] = Map.empty,
    control: Option[React.Element] = None,
    inputRef: Option[js.Function | js.Object] = None,
    label: Option[VdomNode] = None,
    labelPlacement: LabelPlacement.Value = LabelPlacement.end,
    name: Option[String] = None,
    onChange: Option[js.Function] = None
  ): WithPropsNoChildren = autoNoChildren
}

trait MuiFormControlLabelExtensions {
  object LabelPlacement extends Enumeration {
    val end = Value("end")
    val start = Value("start")
    val top = Value("top")
    val bottom = Value("bottom")
  }

  object ClassKey extends Enumeration {
    type ClassKey = String

    val root = "root"
    val labelPlacementStart = "labelPlacementStart"
    val labelPlacementTop = "labelPlacementTop"
    val labelPlacementBottom = "labelPlacementBottom"
    val disabled = "disabled"
    val label = "label"
  }
}
