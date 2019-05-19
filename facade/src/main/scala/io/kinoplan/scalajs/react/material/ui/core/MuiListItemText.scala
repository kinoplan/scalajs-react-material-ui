package io.kinoplan.scalajs.react.material.ui.core

import com.payalabs.scalajs.react.bridge.{ReactBridgeComponent, WithProps}
import japgolly.scalajs.react.vdom.html_<^._

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

object MuiListItemText extends ReactBridgeComponent with MuiListItemTextExtensions with JsWriterImplicits {
  override protected lazy val componentValue: js.Function = RawComponent

  @JSImport("@material-ui/core", "ListItemText")
  @js.native
  object RawComponent extends js.Function

  def apply(
    classes: Map[ClassKey.ClassKey, String] = Map.empty,
    disableTypography: Boolean = false,
    inset: Boolean = false,
    primary: Option[VdomNode] = None,
    primaryTypographyProps: js.Object = js.Object(),
    secondary: Option[VdomNode] = None,
    secondaryTypographyProps: js.Object = js.Object()
  ): WithProps = auto
}

trait MuiListItemTextExtensions {
  object ClassKey extends Enumeration {
    type ClassKey = String

    val root = "root"
    val inset = "inset"
    val dense = "dense"
    val primary = "primary"
    val secondary = "secondary"
    val textDense = "textDense"
  }
}
