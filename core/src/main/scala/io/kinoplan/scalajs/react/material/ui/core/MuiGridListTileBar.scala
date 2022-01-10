package io.kinoplan.scalajs.react.material.ui.core

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

import japgolly.scalajs.react.vdom.html_<^._

import io.kinoplan.scalajs.react.bridge.{ReactBridgeComponent, WithProps}

object MuiGridListTileBar extends ReactBridgeComponent with MuiGridListTileBarExtensions {
  override protected lazy val componentValue: js.Function = RawComponent

  @JSImport("@mui/material", "GridListTileBar")
  @js.native
  object RawComponent extends js.Function

  def apply(
    actionIcon: js.UndefOr[VdomNode] = js.undefined,
    actionPosition: js.UndefOr[ActionPosition.Value] = js.undefined,
    classes: js.UndefOr[Map[ClassKey.Value, String]] = js.undefined,
    subtitle: js.UndefOr[VdomNode] = js.undefined,
    title: js.UndefOr[VdomNode] = js.undefined,
    titlePosition: js.UndefOr[TitlePosition.Value] = js.undefined
  ): WithProps = auto

}

trait MuiGridListTileBarExtensions {

  object ActionPosition extends Enumeration {
    type Value = String

    val left = "left"
    val right = "right"
  }

  object TitlePosition extends Enumeration {
    type Value = String

    val top = "top"
    val bottom = "bottom"
  }

  object ClassKey extends Enumeration {
    type Value = String

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
