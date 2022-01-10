package io.kinoplan.scalajs.react.material.ui.core

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

import org.scalajs.dom.html

import io.kinoplan.scalajs.react.bridge.{ReactBridgeComponent, WithProps}

object MuiCollapse extends ReactBridgeComponent with MuiCollapseExtensions {
  override protected lazy val componentValue: js.Function = RawComponent

  @JSImport("@mui/material", "Collapse")
  @js.native
  object RawComponent extends js.Function

  def apply(
    classes: js.UndefOr[Map[ClassKey.Value, String]] = js.undefined,
    collapsedHeight: js.UndefOr[String] = js.undefined,
    component: js.UndefOr[ComponentPropType] = js.undefined,
    in: js.UndefOr[Boolean] = js.undefined,
    mountOnEnter: js.UndefOr[Boolean] = js.undefined,
    unmountOnExit: js.UndefOr[Boolean] = js.undefined,
    appear: js.UndefOr[Boolean] = js.undefined,
    enter: js.UndefOr[Boolean] = js.undefined,
    exit: js.UndefOr[Boolean] = js.undefined,
    timeout: js.UndefOr[Int | Timeout.Value] = js.undefined,
    onEnter: js.UndefOr[Handler1[html.Element]] = js.undefined,
    onEntering: js.UndefOr[Handler1[html.Element]] = js.undefined,
    onEntered: js.UndefOr[Handler1[html.Element]] = js.undefined,
    onExit: js.UndefOr[Handler1[html.Element]] = js.undefined,
    onExiting: js.UndefOr[Handler1[html.Element]] = js.undefined,
    onExited: js.UndefOr[Handler1[html.Element]] = js.undefined
  ): WithProps = auto

}

trait MuiCollapseExtensions {

  object Timeout extends Enumeration {
    type Value = String

    val auto = "auto"
  }

  object ClassKey extends Enumeration {
    type Value = String

    val container = "container"
    val entered = "entered"
    val wrapper = "wrapper"
    val wrapperInner = "wrapperInner"
  }

}
