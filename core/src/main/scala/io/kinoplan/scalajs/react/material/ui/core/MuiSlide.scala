package io.kinoplan.scalajs.react.material.ui.core

import com.payalabs.scalajs.react.bridge.{ReactBridgeComponent, WithProps}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

object MuiSlide extends ReactBridgeComponent with MuiSlideExtensions {
  override protected lazy val componentValue: js.Function = RawComponent

  @JSImport("@material-ui/core", "Slide")
  @js.native
  object RawComponent extends js.Function

  def apply(
    direction: Direction.Value = Direction.down,
    in: Option[Boolean] = None,
    timeout: Option[Int | js.Object] = None
  ): WithProps = auto
}

trait MuiSlideExtensions {
  object Direction extends Enumeration {
    type Value = String

    val left = "left"
    val right = "right"
    val up = "up"
    val down = "down"
  }
}
