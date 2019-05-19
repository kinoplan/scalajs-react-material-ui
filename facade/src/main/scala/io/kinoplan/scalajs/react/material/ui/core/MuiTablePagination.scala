package io.kinoplan.scalajs.react.material.ui.core

import com.payalabs.scalajs.react.bridge.{ReactBridgeComponent, WithPropsNoChildren}
import japgolly.scalajs.react.vdom.html_<^._

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

object MuiTablePagination extends ReactBridgeComponent with MuiTablePaginationExtensions with JsWriterImplicits {
  override protected lazy val componentValue: js.Function = RawComponent

  @JSImport("@material-ui/core", "TablePagination")
  @js.native
  object RawComponent extends js.Function

  def apply(
    ActionsComponent: Option[String | js.Object] = Some("TablePaginationActions"),
    backIconButtonProps: Option[js.Object] = None,
    classes: Map[ClassKey.ClassKey, String] = Map.empty,
    component: Option[String | js.Function] = Some("TableCell"),
    count: Int,
    labelDisplayedRows: Option[js.Function] = None,
    labelRowsPerPage: Option[VdomNode] = Some("Rows per page:"),
    nextIconButtonProps: js.Object = js.Object(),
    onChangePage: js.Function,
    onChangeRowsPerPage: Option[js.Function] = None,
    page: Int,
    rowsPerPage: Int,
    rowsPerPageOptions: js.Array[Int] = js.Array(10, 25, 50, 100),
    SelectProps: js.Object = js.Object()
  ): WithPropsNoChildren = autoNoChildren
}

trait MuiTablePaginationExtensions {
  object ClassKey extends Enumeration {
    type ClassKey = String

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
  }
}
