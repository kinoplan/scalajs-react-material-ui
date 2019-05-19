package io.kinoplan.scalajs.react.material.ui.core

import com.payalabs.scalajs.react.bridge.{ReactBridgeComponent, WithProps}
import japgolly.scalajs.react.vdom.html_<^._

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

object MuiGridListTitleBar extends ReactBridgeComponent with MuiGridListTitleBarExtensions with JsWriterImplicits {
  override protected lazy val componentValue: js.Function = RawComponent

  @JSImport("@material-ui/core", "GridListTitleBar")
  @js.native
  object RawComponent extends js.Function

  def apply(
    actionIcon: Option[VdomNode] = None,
    actionPosition: ActionPosition.Value = ActionPosition.right,
    classes: Map[ClassKey.ClassKey, String] = Map.empty,
    subtitle: Option[VdomNode] = None,
    title: Option[VdomNode] = None,
    titlePosition: TitlePosition.Value = TitlePosition.bottom
  ): WithProps = auto
}

trait MuiGridListTitleBarExtensions {
  object ActionPosition extends Enumeration {
    val left = Value("left")
    val right = Value("right")
  }

  object TitlePosition extends Enumeration {
    val top = Value("top")
    val bottom = Value("bottom")
  }

  object ClassKey extends Enumeration {
    type ClassKey = String

    val root = "root"
    val titlePositionBottom = "titlePositionBottom"
    val titlePositionTop = "titlePositionTop"
    val rootSubtitle = "rootSubtitle"
    val titleWrap = "titleWrap"
    val titleWrapActionPosLeft = "titleWrapActionPosLeft"
    val titleWrapActionPosRight = "titleWrapActionPosRight"
    val title = "title"
    val subtitle = "subtitle"
    val actionIcon = "actionIcon"
    val actionIconActionPosLeft = "actionIconActionPosLeft"
  }
}
