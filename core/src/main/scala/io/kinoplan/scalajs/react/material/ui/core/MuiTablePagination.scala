package io.kinoplan.scalajs.react.material.ui.core

import com.payalabs.scalajs.react.bridge.{ReactBridgeComponent, WithPropsNoChildren}
import io.kinoplan.scalajs.react.material.ui.html.ReactEventFromNumberInput
import japgolly.scalajs.react.ReactEvent
import japgolly.scalajs.react.vdom.html_<^._

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.{Array, Function, Object, UndefOr, undefined, |}

object MuiTablePagination extends ReactBridgeComponent with MuiTablePaginationExtensions with JsWriterImplicits {
  override protected lazy val componentValue: js.Function = RawComponent

  @JSImport("@material-ui/core", "TablePagination")
  @js.native
  object RawComponent extends js.Function

  def apply(
    ActionsComponent: OptComponentPropType = undefined,
    backIconButtonProps: UndefOr[Object] = undefined,
    classes: Map[ClassKey.Value, String] = Map.empty,
    component: OptComponentPropType = undefined,
    count: Int,
    labelDisplayedRows: UndefOr[Function] = undefined,
    labelRowsPerPage: UndefOr[VdomNode] = undefined,
    nextIconButtonProps: UndefOr[Object] = undefined,
    onChangePage: ReactHandler2[ReactEvent, Int] = undefined,
    onChangeRowsPerPage: ReactHandler1[ReactEventFromNumberInput] = undefined,
    page: Int,
    rowsPerPage: Int,
    rowsPerPageOptions: UndefOr[Array[Int]] = undefined,
    SelectProps: UndefOr[Object] = undefined,
    align: UndefOr[Alignment.Value] = undefined,
    padding: UndefOr[Padding.Value] = undefined,
    scope: UndefOr[String] = undefined,
    sortDirection: UndefOr[Boolean | SortDirection.Value] = undefined,
    variant: UndefOr[Variant.Value] = undefined
  ): WithPropsNoChildren = autoNoChildren
}

trait MuiTablePaginationExtensions {
  object ClassKey extends Enumeration {
    type Value = String

    val root = "root"
    val toolbar = "toolbar"
    val spacer = "spacer"
    val caption = "caption"
    val selectRoot = "selectRoot"
    val select = "select"
    val selectIcon = "selectIcon"
    val input = "input"
    val menuItem = "menuItem"
    val actions = "actions"
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
}
