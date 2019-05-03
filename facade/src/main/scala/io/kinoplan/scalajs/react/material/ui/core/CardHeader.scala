package io.kinoplan.scalajs.react.material.ui.core

import com.payalabs.scalajs.react.bridge.{ReactBridgeComponent, WithProps}
import japgolly.scalajs.react.vdom.html_<^._

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

object CardHeader extends ReactBridgeComponent with JsWriterImplicits {
  override protected lazy val componentValue: js.Function = RawComponent

  @JSImport("@material-ui/core", "CardHeader")
  @js.native
  object RawComponent extends js.Function

  def apply(
    action: Option[VdomNode] = None,
    avatar: Option[VdomNode] = None,
    classes: js.Object = js.Object(),
    component: Option[String | js.Function] = Some("div"),
    disableTypography: Boolean = false,
    subheader: Option[VdomNode] = None,
    subheaderTypographyProps: js.Object = js.Object(),
    title: Option[VdomNode] = None,
    titleTypographyProps: js.Object = js.Object()
  ): WithProps = auto
}
