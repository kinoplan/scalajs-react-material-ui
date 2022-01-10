package io.kinoplan.scalajs.react.material.ui.core

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

import io.kinoplan.scalajs.react.bridge.{ReactBridgeComponent, WithProps}

object MuiGrid extends ReactBridgeComponent with MuiGridExtensions {
  override protected lazy val componentValue: js.Function = RawComponent

  @JSImport("@mui/material", "Grid")
  @js.native
  object RawComponent extends js.Function

  def apply(
    alignContent: js.UndefOr[AlignContent.Value] = js.undefined,
    alignItems: js.UndefOr[AlignItems.Value] = js.undefined,
    classes: js.UndefOr[Map[ClassKey.Value, String]] = js.undefined,
    component: js.UndefOr[ComponentPropType] = js.undefined,
    container: js.UndefOr[Boolean] = js.undefined,
    direction: js.UndefOr[Direction.Value] = js.undefined,
    item: js.UndefOr[Boolean] = js.undefined,
    justify: js.UndefOr[Justify.Value] = js.undefined,
    lg: js.UndefOr[Boolean | Int] = js.undefined,
    md: js.UndefOr[Boolean | Int] = js.undefined,
    sm: js.UndefOr[Boolean | Int] = js.undefined,
    spacing: js.UndefOr[Spacing.Value] = js.undefined,
    wrap: js.UndefOr[Wrap.Value] = js.undefined,
    xl: js.UndefOr[Boolean | Int] = js.undefined,
    xs: js.UndefOr[Boolean | Int] = js.undefined,
    zeroMinWidth: js.UndefOr[Boolean] = js.undefined
  ): WithProps = auto

}

trait MuiGridExtensions {

  object AlignContent extends Enumeration {
    type Value = String

    val stretch = "stretch"
    val center = "center"
    val flexStart = "flex-start"
    val flexEnd = "flex-end"
    val spaceBetween = "space-between"
    val spaceAround = "space-around"
  }

  object AlignItems extends Enumeration {
    type Value = String

    val flexStart = "flex-start"
    val center = "center"
    val flexEnd = "flex-end"
    val stretch = "stretch"
    val baseline = "baseline"
  }

  object Direction extends Enumeration {
    type Value = String

    val row = "row"
    val rowReverse = "row-reverse"
    val column = "column"
    val columnReverse = "column-reverse"
  }

  object Justify extends Enumeration {
    type Value = String

    val flexStart = "flex-start"
    val center = "center"
    val flexEnd = "flex-end"
    val spaceBetween = "space-between"
    val spaceAround = "space-around"
    val spaceEvenly = "space-evenly"
  }

  object Spacing extends Enumeration {
    type Value = Int

    val `0` = 0
    val `8` = 8
    val `16` = 16
    val `24` = 24
    val `32` = 32
    val `40` = 40
  }

  object Wrap extends Enumeration {
    type Value = String

    val nowrap = "nowrap"
    val wrap = "wrap"
    val wrapReverse = "wrap-reverse"
  }

  object ClassKey extends Enumeration {
    type Value = String

    val container = "container"
    val item = "item"
    val zeroMinWidth = "zeroMinWidth"
    val directionXsColumn = "direction-xs-column"
    val directionXsColumnReverse = "direction-xs-column-reverse"
    val directionXsRowReverse = "direction-xs-row-reverse"
    val wrapXsNowrap = "wrap-xs-nowrap"
    val wrapXsWrapReverse = "wrap-xs-wrap-reverse"
    val alignItemsXsCenter = "align-items-xs-center"
    val alignItemsXsFlexStart = "align-items-xs-flex-start"
    val alignItemsXsFlexEnd = "align-items-xs-flex-end"
    val alignItemsXsBaseline = "align-items-xs-baseline"
    val alignContentXsFlexStart = "align-content-xs-flex-start"
    val alignContentXsFlexEnd = "align-content-xs-flex-end"
    val alignContentXsSpaceBetween = "align-content-xs-space-between"
    val alignContentXsSpaceAround = "align-content-xs-space-around"
    val justifyXsCenter = "justify-xs-center"
    val justifyXsFlexEnd = "justify-xs-flex-end"
    val justifyXsSpaceBetween = "justify-xs-space-between"
    val justifyXsSpaceAround = "justify-xs-space-around"
    val justifyXsSpaceEvenly = "justify-xs-space-evenly"
    val spacingXs8 = "spacing-xs-8"
    val spacingXs16 = "spacing-xs-16"
    val spacingXs24 = "spacing-xs-24"
    val spacingXs32 = "spacing-xs-32"
    val spacingXs40 = "spacing-xs-40"
    val gridXsAuto = "grid-xs-auto"
    val gridXsTrue = "grid-xs-true"
    val gridXs1 = "grid-xs-1"
    val gridXs2 = "grid-xs-2"
    val gridXs3 = "grid-xs-3"
    val gridXs4 = "grid-xs-4"
    val gridXs5 = "grid-xs-5"
    val gridXs6 = "grid-xs-6"
    val gridXs7 = "grid-xs-7"
    val gridXs8 = "grid-xs-8"
    val gridXs9 = "grid-xs-9"
    val gridXs10 = "grid-xs-10"
    val gridXs11 = "grid-xs-11"
    val gridXs12 = "grid-xs-12"
  }

}
