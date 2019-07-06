package io.kinoplan.scalajs.react.material.ui.core

import com.payalabs.scalajs.react.bridge.{ReactBridgeComponent, WithProps}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

object AutoPlay extends ReactBridgeComponent with AutoPlayExtensions {
  override protected lazy val componentValue: js.Function = RawComponent

  @JSImport("react-swipeable-views-utils/lib/autoPlay.js", JSImport.Default)
  @js.native
  object RawComponent extends js.Function

  def apply(
    autoplay: js.UndefOr[Boolean] = js.undefined,
    direction: js.UndefOr[Direction.Value] = js.undefined,
    interval: js.UndefOr[Int] = js.undefined
  ): WithProps = auto
}

trait AutoPlayExtensions {
  object Direction extends Enumeration {
    type Value = String

    val incremental = "incremental"
    val decremental = "decremental"
  }
}
