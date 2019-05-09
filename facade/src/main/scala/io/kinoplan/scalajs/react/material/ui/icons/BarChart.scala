package io.kinoplan.scalajs.react.material.ui.icons

import com.payalabs.scalajs.react.bridge.{ReactBridgeComponent, WithProps}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

object BarChart extends ReactBridgeComponent {

  override protected lazy val componentValue: js.Object = RawComponent

  @JSImport("@material-ui/icons/BarChart", JSImport.Default)
  @js.native
  object RawComponent extends js.Object

  def apply(
    classes: js.Object = js.Object(),
    className: Option[String] = None
  ): WithProps = auto
}
