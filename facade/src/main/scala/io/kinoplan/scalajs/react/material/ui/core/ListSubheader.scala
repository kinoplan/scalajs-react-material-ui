package io.kinoplan.scalajs.react.material.ui.core

import com.payalabs.scalajs.react.bridge.{ReactBridgeComponent, WithProps}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

object ListSubheader extends ReactBridgeComponent with ListSubheaderExtensions {
  override protected lazy val componentValue: js.Function = RawComponent

  @JSImport("@material-ui/core", "ListSubheader")
  @js.native
  object RawComponent extends js.Function

  def apply(
    classes: js.Object = js.Object(),
    color: Color.Value = Color.default,
    component: Option[String | js.Function] = Some("li"),
    disableGutters: Boolean = false,
    disableSticky: Boolean = false,
    inset: Boolean = false
  ): WithProps = auto
}

trait ListSubheaderExtensions {
  object Color extends Enumeration {
    val default = Value("default")
    val primary = Value("primary")
    val inherit = Value("inherit")
  }
}
