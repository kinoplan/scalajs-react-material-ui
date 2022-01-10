package io.kinoplan.scalajs.react.material.ui.lab

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

import japgolly.scalajs.react.ReactEvent
import japgolly.scalajs.react.facade.React

import io.kinoplan.scalajs.react.bridge.{ReactBridgeComponent, WithProps}

object MuiSlider extends ReactBridgeComponent with MuiSliderExtensions {
  override protected lazy val componentValue: js.Function = RawComponent

  @JSImport("@mui/lab", "Slider")
  @js.native
  object RawComponent extends js.Function

  def apply(
    classes: js.UndefOr[Map[ClassKey.Value, String]] = js.undefined,
    component: js.UndefOr[ComponentPropType] = js.undefined,
    max: js.UndefOr[Int] = js.undefined,
    min: js.UndefOr[Int] = js.undefined,
    step: js.UndefOr[Int] = js.undefined,
    thumb: js.UndefOr[React.Element] = js.undefined,
    vertical: js.UndefOr[Boolean] = false,
    onChange: js.UndefOr[ReactHandler2[ReactEvent, Double]] = js.undefined
  ): WithProps = auto

}

trait MuiSliderExtensions {

  object ClassKey extends Enumeration {
    type Value = String

    val root = "root"
    val container = "container"
    val track = "track"
    val trackBefore = "trackBefore"
    val trackAfter = "trackAfter"
    val thumbWrapper = "thumbWrapper"
    val thumb = "thumb"
    val thumbIconWrapper = "thumbIconWrapper"
    val thumbIcon = "thumbIcon"
    val disabled = "disabled"
    val jumped = "jumped"
    val focused = "focused"
    val activated = "activated"
    val vertical = "vertical"
  }

}
