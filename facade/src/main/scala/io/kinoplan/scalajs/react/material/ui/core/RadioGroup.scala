package io.kinoplan.scalajs.react.material.ui.core

import com.payalabs.scalajs.react.bridge.{ReactBridgeComponent, WithProps}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

object RadioGroup extends ReactBridgeComponent {
  override protected lazy val componentValue: js.Function = RawComponent

  @JSImport("@material-ui/core", "RadioGroup")
  @js.native
  object RawComponent extends js.Function

  def apply(
    defaultValue: Option[String | Int | Boolean] = None,
    name: Option[String] = None,
    onChange: Option[js.Function] = None,
    value: Option[String | Int | Boolean] = None
  ): WithProps = auto
}
