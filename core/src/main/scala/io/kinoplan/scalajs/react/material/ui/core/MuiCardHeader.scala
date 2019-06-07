package io.kinoplan.scalajs.react.material.ui.core

import com.payalabs.scalajs.react.bridge.{ReactBridgeComponent, WithProps}
import japgolly.scalajs.react.vdom.html_<^._

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

object MuiCardHeader extends ReactBridgeComponent with MuiCardHeaderExtensions with JsWriterImplicits {
  override protected lazy val componentValue: js.Function = RawComponent

  @JSImport("@material-ui/core", "CardHeader")
  @js.native
  object RawComponent extends js.Function

  def apply(
    action: Option[VdomNode] = None,
    avatar: Option[VdomNode] = None,
    classes: Map[ClassKey.ClassKey, String] = Map.empty,
    component: Option[String | js.Function] = Some("div"),
    disableTypography: Boolean = false,
    subheader: Option[VdomNode] = None,
    subheaderTypographyProps: js.Object = js.Object(),
    title: Option[VdomNode] = None,
    titleTypographyProps: js.Object = js.Object()
  ): WithProps = auto
}

trait MuiCardHeaderExtensions {
  object ClassKey extends Enumeration {
    type ClassKey = String

    val root = "root"
    val avatar = "avatar"
    val action = "action"
    val content = "content"
    val title = "title"
    val subheader = "subheader"
  }
}
