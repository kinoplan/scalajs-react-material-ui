package io.kinoplan.scalajs.react.material.ui.core

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

import japgolly.scalajs.react.ReactEvent
import japgolly.scalajs.react.facade.React
import japgolly.scalajs.react.vdom.html_<^._

import io.kinoplan.scalajs.react.bridge.{ReactBridgeComponent, WithPropsNoChildren}

object MuiFormControlLabel extends ReactBridgeComponent with MuiFormControlLabelExtensions {
  override protected lazy val componentValue: js.Function = RawComponent

  @JSImport("@mui/material", "FormControlLabel")
  @js.native
  object RawComponent extends js.Function

  def apply(
    checked: js.UndefOr[Boolean | String] = js.undefined,
    classes: js.UndefOr[Map[ClassKey.Value, String]] = js.undefined,
    control: js.UndefOr[React.Element] = js.undefined,
    inputRef: js.UndefOr[ComponentRefType] = js.undefined,
    label: js.UndefOr[VdomNode] = js.undefined,
    labelPlacement: js.UndefOr[LabelPlacement.Value] = js.undefined,
    onChange: js.UndefOr[ReactHandler2[ReactEvent, Boolean]] = js.undefined
  ): WithPropsNoChildren = autoNoChildren

}

trait MuiFormControlLabelExtensions {

  object LabelPlacement extends Enumeration {
    type Value = String

    val end = "end"
    val start = "start"
    val top = "top"
    val bottom = "bottom"
  }

  object ClassKey extends Enumeration {
    type Value = String

    val root = "root"
    val labelPlacementStart = "labelPlacementStart"
    val labelPlacementTop = "labelPlacementTop"
    val labelPlacementBottom = "labelPlacementBottom"
    val disabled = "disabled"
    val label = "label"
  }

}
