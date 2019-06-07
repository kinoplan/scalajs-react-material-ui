package io.kinoplan.scalajs.react.material.ui.core

import com.payalabs.scalajs.react.bridge.{ReactBridgeComponent, WithProps}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

object MuiListSubheader extends ReactBridgeComponent with MuiListSubheaderExtensions {
  override protected lazy val componentValue: js.Function = RawComponent

  @JSImport("@material-ui/core", "ListSubheader")
  @js.native
  object RawComponent extends js.Function

  def apply(
    classes: Map[ClassKey.ClassKey, String] = Map.empty,
    color: Color.Value = Color.default,
    component: Option[String | js.Function] = Some("li"),
    disableGutters: Boolean = false,
    disableSticky: Boolean = false,
    inset: Boolean = false
  ): WithProps = auto
}

trait MuiListSubheaderExtensions {
  object Color extends Enumeration {
    val default = Value("default")
    val primary = Value("primary")
    val inherit = Value("inherit")
  }

  object ClassKey extends Enumeration {
    type ClassKey = String

    val root = "root"
    val colorPrimary = "colorPrimary"
    val colorInherit = "colorInherit"
    val gutters = "gutters"
    val inset = "inset"
    val sticky = "sticky"
  }
}
