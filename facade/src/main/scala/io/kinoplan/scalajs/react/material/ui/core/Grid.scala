package io.kinoplan.scalajs.react.material.ui.core

import com.payalabs.scalajs.react.bridge.{ReactBridgeComponent, WithProps}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

object Grid extends ReactBridgeComponent with GridExtensions {
  override protected lazy val componentValue: js.Function = RawComponent

  @JSImport("@material-ui/core", "Grid")
  @js.native
  object RawComponent extends js.Function

  def apply(
    alignContent: AlignContent.Value = AlignContent.stretch,
    alignItems: AlignItems.Value = AlignItems.stretch,
    classes: js.Object = js.Object(),
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

trait GridExtensions {
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
}
