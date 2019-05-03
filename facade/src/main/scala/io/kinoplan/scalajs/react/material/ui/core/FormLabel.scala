package io.kinoplan.scalajs.react.material.ui.core

import com.payalabs.scalajs.react.bridge.{ReactBridgeComponent, WithProps}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

object FormLabel extends ReactBridgeComponent {
  override protected lazy val componentValue: js.Function = RawComponent

  @JSImport("@material-ui/core", "FormLabel")
  @js.native
  object RawComponent extends js.Function

  def apply(
    classes: js.Object = js.Object(),
    component: Option[String | js.Function] = Some("label"),
    disabled: Option[Boolean] = None,
    error: Option[Boolean] = None,
    filled: Option[Boolean] = None,
    focused: Option[Boolean] = None,
    required: Option[Boolean] = None
  ): WithProps = auto
}
