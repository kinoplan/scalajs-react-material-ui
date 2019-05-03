package io.kinoplan.scalajs.react.material.ui.core

import com.payalabs.scalajs.react.bridge.{ReactBridgeComponent, WithPropsNoChildren}
import japgolly.scalajs.react.raw.React
import japgolly.scalajs.react.vdom.html_<^._

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

object Chip extends ReactBridgeComponent with ChipExtensions with JsWriterImplicits {
  override protected lazy val componentValue: js.Function = RawComponent

  @JSImport("@material-ui/core", "Chip")
  @js.native
  object RawComponent extends js.Function

  def apply(
    avatar: Option[React.Element] = None,
    classes: js.Object = js.Object(),
    clickable: Option[Boolean] = None,
    color: Color.Value = Color.default,
    component: Option[String | js.Function] = Some("div"),
    deleteIcon: Option[React.Element] = None,
    icon: Option[React.Element] = None,
    label: Option[VdomNode] = None,
    onDelete: Option[js.Function] = None,
    variant: Variant.Value = Variant.default
  ): WithPropsNoChildren = autoNoChildren
}

trait ChipExtensions {
  object Color extends Enumeration {
    val default = Value("default")
    val primary = Value("primary")
    val secondary = Value("secondary")
  }

  object Variant extends Enumeration {
    val default = Value("default")
    val outlined = Value("outlined")
  }
}
