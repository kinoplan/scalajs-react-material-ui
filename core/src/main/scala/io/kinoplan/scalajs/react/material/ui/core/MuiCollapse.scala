package io.kinoplan.scalajs.react.material.ui.core

import com.payalabs.scalajs.react.bridge.{ReactBridgeComponent, WithProps}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

object MuiCollapse extends ReactBridgeComponent with MuiCollapseExtensions {
  override protected lazy val componentValue: js.Function = RawComponent

  @JSImport("@material-ui/core", "Collapse")
  @js.native
  object RawComponent extends js.Function

  def apply(
    classes: js.UndefOr[Map[ClassKey.Value, String]] =js.undefined,
    collapsedHeight: js.UndefOr[String] = js.undefined,
    component: OptComponentPropType = js.undefined,
    in: js.UndefOr[Boolean] = js.undefined,
    timeout: js.UndefOr[Int | Timeout.Value] = js.undefined,
    mountOnEnter: js.UndefOr[Boolean] = js.undefined,
    unmountOnExit: js.UndefOr[Boolean] = js.undefined,
    addEndListener: js.UndefOr[Boolean] = js.undefined
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
