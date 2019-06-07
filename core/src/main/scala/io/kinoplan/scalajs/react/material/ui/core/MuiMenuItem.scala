package io.kinoplan.scalajs.react.material.ui.core

import com.payalabs.scalajs.react.bridge.{ReactBridgeComponent, WithProps}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

object MuiMenuItem extends ReactBridgeComponent with MuiMenuItemExtensions {
  override protected lazy val componentValue: js.Function = RawComponent

  @JSImport("@material-ui/core", "MenuItem")
  @js.native
  object RawComponent extends js.Function

  def apply(
    classes: Map[ClassKey.ClassKey, String] = Map.empty,
    component: Option[String | js.Function] = Some("li"),
    disableGutters: Boolean = false
  ): WithProps = auto
}

trait MuiMenuItemExtensions {
  object TransitionDuration extends Enumeration {
    val auto = Value("auto")
  }

  object ClassKey extends Enumeration {
    type ClassKey = String

    val paper = "paper"
    val gutters = "gutters"
    val selected = "selected"
  }
}
