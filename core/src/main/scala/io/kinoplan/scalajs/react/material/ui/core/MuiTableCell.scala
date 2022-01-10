package io.kinoplan.scalajs.react.material.ui.core

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

import io.kinoplan.scalajs.react.bridge.{ReactBridgeComponent, WithProps}

object MuiTableCell extends ReactBridgeComponent with MuiTableCellExtensions {
  override protected lazy val componentValue: js.Function = RawComponent

  @JSImport("@mui/material", "TableCell")
  @js.native
  object RawComponent extends js.Function

  def apply(
    align: js.UndefOr[Alignment.Value] = js.undefined,
    classes: js.UndefOr[Map[ClassKey.Value, String]] = js.undefined,
    component: js.UndefOr[ComponentPropType] = js.undefined,
    padding: js.UndefOr[Padding.Value] = js.undefined,
    scope: js.UndefOr[String] = js.undefined,
    sortDirection: js.UndefOr[Boolean | SortDirection.Value] = js.undefined,
    variant: js.UndefOr[Variant.Value] = js.undefined
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
    val numeric = "numeric"
    val paddingDense = "paddingDense"
    val paddingCheckbox = "paddingCheckbox"
    val paddingNone = "paddingNone"
    val alignLeft = "alignLeft"
    val alignCenter = "alignCenter"
    val alignRight = "alignRight"
    val alignJustify = "alignJustify"
  }

}
