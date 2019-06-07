package io.kinoplan.scalajs.react.material.ui.core

import com.payalabs.scalajs.react.bridge.{ReactBridgeComponent, WithPropsNoChildren}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

object MuiDivider extends ReactBridgeComponent with MuiDividerExtensions {
  override protected lazy val componentValue: js.Function = RawComponent

  @JSImport("@material-ui/core", "Divider")
  @js.native
  object RawComponent extends js.Function

  def apply(
    absolute: Boolean = false,
    classes: Map[ClassKey.ClassKey, String] = Map.empty,
    component: Option[String | js.Function] = Some("hr"),
    inset: Option[Boolean] = None,
    light: Boolean = false,
    variant: Variant.Value = Variant.fullWidth
  ): WithPropsNoChildren = autoNoChildren
}

trait MuiDividerExtensions {
  object Variant extends Enumeration {
    val fullWidth = Value("fullWidth")
    val inset = Value("inset")
    val middle = Value("middle")
  }

  object ClassKey extends Enumeration {
    type ClassKey = String

    val root = "root"
    val absolute = "absolute"
    val inset = "inset"
    val light = "light"
    val middle = "middle"
  }
}
