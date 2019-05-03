package io.kinoplan.scalajs.react.material.ui.core

import com.payalabs.scalajs.react.bridge.{ReactBridgeComponent, WithProps}
import japgolly.scalajs.react.vdom.html_<^._

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

object GridListTitleBar extends ReactBridgeComponent with GridListTitleBarExtensions with JsWriterImplicits {
  override protected lazy val componentValue: js.Function = RawComponent

  @JSImport("@material-ui/core", "GridListTitleBar")
  @js.native
  object RawComponent extends js.Function

  def apply(
    actionIcon: Option[VdomNode] = None,
    actionPosition: ActionPosition.Value = ActionPosition.right,
    classes: js.Object = js.Object(),
    subtitle: Option[VdomNode] = None,
    title: Option[VdomNode] = None,
    titlePosition: TitlePosition.Value = TitlePosition.bottom
  ): WithProps = auto
}

trait GridListTitleBarExtensions {
  object ActionPosition extends Enumeration {
    val left = Value("left")
    val right = Value("right")
  }

  object TitlePosition extends Enumeration {
    val top = Value("top")
    val bottom = Value("bottom")
  }
}
