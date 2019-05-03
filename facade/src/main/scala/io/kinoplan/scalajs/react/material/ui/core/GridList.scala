package io.kinoplan.scalajs.react.material.ui.core

import com.payalabs.scalajs.react.bridge.{ReactBridgeComponent, WithProps}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

object GridList extends ReactBridgeComponent with GridListExtensions {
  override protected lazy val componentValue: js.Function = RawComponent

  @JSImport("@material-ui/core", "GridList")
  @js.native
  object RawComponent extends js.Function

  def apply(
    cellHeight: Int | CellHeight.Value = 180,
    classes: js.Object = js.Object(),
    cols: Int = 2,
    component: Option[String | js.Function] = Some("ul"),
    spacing: Int = 4
  ): WithProps = auto
}

trait GridListExtensions {
  object CellHeight extends Enumeration {
    val auto = Value("auto")
  }
}
