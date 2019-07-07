package io.kinoplan.scalajs.react.material.ui.core

import com.payalabs.scalajs.react.bridge.{ReactBridgeComponent, WithProps}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.{UndefOr, undefined, |}

object MuiTableCell extends ReactBridgeComponent with MuiTableCellExtensions {
  override protected lazy val componentValue: js.Function = RawComponent

  @JSImport("@material-ui/core", "TableCell")
  @js.native
  object RawComponent extends js.Function

  def apply(
    align: UndefOr[Alignment.Value] = undefined,
    classes: Map[ClassKey.Value, String] = Map.empty,
    component: OptComponentPropType = undefined,
    padding: UndefOr[Padding.Value] = undefined,
    scope: UndefOr[String] = undefined,
    sortDirection: UndefOr[Boolean | SortDirection.Value] = undefined,
    variant: UndefOr[Variant.Value] = undefined
  ): WithProps = auto
}

trait MuiTableCellExtensions {
  object Alignment extends Enumeration {
    type Value = String

    val inherit = "inherit"
    val left = "left"
    val center = "center"
    val right = "right"
    val justify = "justify"
  }

  object Padding extends Enumeration {
    type Value = String

    val default = "default"
    val checkbox = "checkbox"
    val dense = "dense"
    val none = "none"
  }

  object SortDirection extends Enumeration {
    type Value = String

    val asc = "asc"
    val desc = "desc"
  }

  object Variant extends Enumeration {
    type Value = String

    val head = "head"
    val body = "body"
    val footer = "footer"
  }

  object ClassKey extends Enumeration {
    type Value = String

    val root = "root"
    val head = "head"
    val body = "body"
    val footer = "footer"
    val numeric	= "numeric"
    val paddingDense = "paddingDense"
    val paddingCheckbox = "paddingCheckbox"
    val paddingNone = "paddingNone"
    val alignLeft = "alignLeft"
    val alignCenter = "alignCenter"
    val alignRight = "alignRight"
    val alignJustify = "alignJustify"
  }
}
