package io.kinoplan.scalajs.react.material.ui.core

import com.payalabs.scalajs.react.bridge.{ReactBridgeComponent, WithProps}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

object MuiGrid extends ReactBridgeComponent with MuiGridExtensions {
  override protected lazy val componentValue: js.Function = RawComponent

  @JSImport("@material-ui/core", "Grid")
  @js.native
  object RawComponent extends js.Function

  def apply(
    alignContent: AlignContent.Value = AlignContent.stretch,
    alignItems: AlignItems.Value = AlignItems.stretch,
    classes: Map[ClassKey.ClassKey, String] = Map.empty,
    component: Option[String | js.Function] = Some("div"),
    container: Boolean = false,
    direction: Direction.Value = Direction.row,
    item: Boolean = false,
    justify: Justify.Value = Justify.flexStart,
    lg: Boolean | Breakpoint.Value | Int = false,
    md: Boolean | Breakpoint.Value | Int = false,
    sm: Boolean | Breakpoint.Value | Int = false,
    spacing: Spacing.Value = Spacing.zero,
    wrap: Wrap.Value = Wrap.wrap,
    xl: Boolean | Breakpoint.Value | Int = false,
    xs: Boolean | Breakpoint.Value | Int = false,
    zeroMinWidth: Boolean = false
  ): WithProps = auto
}

trait MuiGridExtensions {
  object AlignContent extends Enumeration {
    val stretch = Value("stretch")
    val center = Value("center")
    val flexStart = Value("flex-start")
    val flexEnd = Value("flex-end")
    val spaceBetween = Value("space-between")
    val spaceAround = Value("space-around")
  }

  object AlignItems extends Enumeration {
    val flexStart = Value("flex-start")
    val center = Value("center")
    val flexEnd = Value("flex-end")
    val stretch = Value("stretch")
    val baseline = Value("baseline")
  }

  object Direction extends Enumeration {
    val row = Value("row")
    val rowReverse = Value("row-reverse")
    val column = Value("column")
    val columnReverse = Value("column-reverse")
  }

  object Justify extends Enumeration {
    val flexStart = Value("flex-start")
    val center = Value("center")
    val flexEnd = Value("flex-end")
    val spaceBetween = Value("space-between")
    val spaceAround = Value("space-around")
    val spaceEvenly = Value("space-evenly")
  }

  object Breakpoint extends Enumeration {
    val auto = Value("auto")
  }

  object Spacing extends Enumeration {
    val zero = Value(0)
    val eight = Value(8)
    val sixteen = Value(16)
    val twentyFour = Value(24)
    val thirtyTwo = Value(32)
    val forty = Value(40)
  }

  object Wrap extends Enumeration {
    val nowrap = Value("nowrap")
    val wrap = Value("wrap")
    val wrapReverse = Value("wrap-reverse")
  }

  object ClassKey extends Enumeration {
    type ClassKey = String

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
