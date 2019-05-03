package io.kinoplan.scalajs.react.material.ui.core

import com.payalabs.scalajs.react.bridge.{ReactBridgeComponent, WithProps}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

object Slide extends ReactBridgeComponent with SlideExtensions {
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

trait SlideExtensions {
  object Direction extends Enumeration {
    val left = Value("left")
    val right = Value("right")
    val up = Value("up")
    val down = Value("down")
  }
}
