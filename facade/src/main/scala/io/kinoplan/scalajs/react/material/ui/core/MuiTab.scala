package io.kinoplan.scalajs.react.material.ui.core

import com.payalabs.scalajs.react.bridge.{ReactBridgeComponent, WithPropsNoChildren}
import japgolly.scalajs.react.vdom.html_<^._

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

object MuiTab extends ReactBridgeComponent with MuiTabExtensions with JsWriterImplicits {
  override protected lazy val componentValue: js.Function = RawComponent

  @JSImport("@material-ui/core", "Tab")
  @js.native
  object RawComponent extends js.Function

  def apply(
    classes: Map[ClassKey.ClassKey, String] = Map.empty,
    disabled: Boolean = false,
    icon: Option[VdomNode] = None,
    label: Option[VdomNode] = None,
    value: Option[js.Any] = None
  ): WithPropsNoChildren = autoNoChildren
}

trait MuiTabExtensions {
  object ClassKey extends Enumeration {
    type ClassKey = String

    val root = "root"
    val labelIcon = "labelIcon"
    val textColorInherit = "textColorInherit"
    val textColorPrimary = "textColorPrimary"
    val textColorSecondary	= "textColorSecondary"
    val selected = "selected"
    val disabled = "disabled"
    val fullWidth = "fullWidth"
    val wrapper = "wrapper"
    val labelContainer = "labelContainer"
    val label = "label"
    val labelWrapped = "labelWrapped"
  }
}
