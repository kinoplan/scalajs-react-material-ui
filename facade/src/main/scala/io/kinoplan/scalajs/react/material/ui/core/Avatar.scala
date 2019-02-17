package io.kinoplan.scalajs.react.material.ui.core

import com.payalabs.scalajs.react.bridge.{ReactBridgeComponent, WithProps}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

object Avatar extends ReactBridgeComponent {
  override protected lazy val componentValue: js.Function = RawComponent

  @JSImport("@material-ui/core", "Avatar")
  @js.native
  object RawComponent extends js.Function

  def apply(
    alt: Option[String] = None,
    classes: js.Object = js.Object(),
    component: Option[String | js.Function] = Some("div"),
    imgProps: Option[js.Object] = None,
    sizes: Option[String] = None,
    src: Option[String] = None,
    srcSet: Option[String] = None
  ): WithProps = auto
}
