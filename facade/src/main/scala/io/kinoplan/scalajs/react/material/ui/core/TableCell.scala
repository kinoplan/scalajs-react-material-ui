package io.kinoplan.scalajs.react.material.ui.core

import com.payalabs.scalajs.react.bridge.{ReactBridgeComponent, WithProps}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

object TableCell extends ReactBridgeComponent with TableCellExtensions {
  override protected lazy val componentValue: js.Function = RawComponent

  @JSImport("@material-ui/core", "TableCell")
  @js.native
  object RawComponent extends js.Function

  def apply(
    align: Alignment.Value = Alignment.inherit,
    classes: js.Object = js.Object(),
    component: Option[String | js.Function] = None,
    padding: Option[Padding.Value] = None,
    scope: Option[String] = None,
    sortDirection: Option[Boolean | SortDirection.Value] = None,
    variant: Option[Variant.Value] = None
  ): WithProps = auto
}

trait TableCellExtensions {
  object Alignment extends Enumeration {
    val inherit = Value("inherit")
    val left = Value("left")
    val center = Value("center")
    val right = Value("right")
    val justify = Value("justify")
  }

  object Padding extends Enumeration {
    val default = Value("default")
    val checkbox = Value("checkbox")
    val dense = Value("dense")
    val none = Value("none")
  }

  object SortDirection extends Enumeration {
    val asc = Value("asc")
    val desc = Value("desc")
  }

  object Variant extends Enumeration {
    val head = Value("head")
    val body = Value("body")
    val footer = Value("footer")
  }
}
