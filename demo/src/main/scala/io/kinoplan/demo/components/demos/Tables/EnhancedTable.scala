package io.kinoplan.demo.components.demos.Tables

import scala.scalajs.js
import scala.scalajs.js.Math

import japgolly.scalajs.react._
import japgolly.scalajs.react.vdom.Attr
import japgolly.scalajs.react.vdom.all._
import scalacss.ScalaCssReactImplicits

import io.kinoplan.demo.components.ComponentContainer
import io.kinoplan.demo.components.demos.Tables.wrappers.{EnhancedTableHead, EnhancedTableToolbar}
import io.kinoplan.demo.models.Tables.TableItem
import io.kinoplan.demo.styles.demos.Tables.{DefaultEnhancedTableStyle, EnhancedTableStyle}
import io.kinoplan.demo.utils.props.{MuiBackIconButtonProps, MuiNextIconButtonProps}
import io.kinoplan.scalajs.react.material.ui.core._
import io.kinoplan.scalajs.react.material.ui.html.ReactEventFromNumberInput

object EnhancedTable extends ScalaCssReactImplicits {
  case class Props(style: EnhancedTableStyle)

  case class State(
    order: String = "asc",
    orderBy: String = "calories",
    selected: Set[Int] = Set.empty,
    data: List[TableItem] = TableItem.paginations.sortBy(_.calories),
    page: Int = 0,
    rowsPerPage: Int = 5
  ) {
    val selectedCount = selected.size

    val dataCount = data.length

    val emptyRows = rowsPerPage - Math.min(rowsPerPage, data.length - page * rowsPerPage)

    val hasEmptyRows = emptyRows > 0

    val ids = data.map(_.id).toSet

    val sliceFrom = page * rowsPerPage

    val sliceUntil = page * rowsPerPage + rowsPerPage

    val sortedData = {
      orderBy match {
        case "name" => if (order == "asc") data.sortBy(_.name) else data.sortBy(_.name)(Ordering[String].reverse)
        case "calories" => if (order == "asc") data.sortBy(_.calories) else data.sortBy(_.calories)(Ordering[Int].reverse)
        case "fat" => if (order == "asc") data.sortBy(_.fat) else data.sortBy(_.fat)(Ordering[Double].reverse)
        case "carbs" => if (order == "asc") data.sortBy(_.carbs) else data.sortBy(_.carbs)(Ordering[Int].reverse)
        case "protein" => if (order == "asc") data.sortBy(_.protein) else data.sortBy(_.protein)(Ordering[Double].reverse)
      }
    }

    def isSelected(index: Int) = selected.contains(index)

    def handleSelectAllClick(checked: Boolean) = {
      if (checked) copy(selected = ids) else copy(selected = Set.empty[Int])
    }

    def handleRequestSort(property: String) = {
      val updatedOrder = if (orderBy == property && order == "desc") "asc" else "desc"

      copy(order = updatedOrder, orderBy = property)
    }

    def handleClick(id: Int) = {
      if (isSelected(id)) copy(selected = selected - id) else copy(selected = selected + id)
    }

    def handleChangePage(page: Int) = copy(page = page)

    def handleChangeRowsPerPage(value: Int) = copy(rowsPerPage = value)
  }

  class Backend(t: BackendScope[Props, State]) {
    def handleSelectAllClick(e: ReactEventFromInput): Callback = {
      val checked = e.target.checked

      t.modState(_.handleSelectAllClick(checked))
    }

    def handleRequestSort(property: String): Callback = t.modState(_.handleRequestSort(property))

    def handleClick(id: Int) = t.modState(_.handleClick(id))

    def handleChangePage: (ReactEvent, Int) => Callback = (_, page) => {
      t.modState(_.handleChangePage(page))
    }

    def handleChangeRowsPerPage: ReactEventFromNumberInput => Callback = e => {
      val value = e.target.value

      t.modState(_.handleChangeRowsPerPage(value))
    }

    def render(props: Props, state: State): VdomElement = {
      val css = props.style

      div(
        ComponentContainer("Sorting & Selecting")(
          MuiPaper()(css.root,
            EnhancedTableToolbar(selectedCount = state.selectedCount),
            div(css.tableWrapper,
              MuiTable()(css.table,
                aria.labelledBy := "tableTitle",
                EnhancedTableHead(
                  selectedCount = state.selectedCount,
                  order = state.order,
                  orderBy = state.orderBy,
                  onSelectAllClick = handleSelectAllClick,
                  onRequestSort = handleRequestSort,
                  rowCount = state.dataCount
                ),
                MuiTableBody()(
                  state.sortedData.slice(state.sliceFrom, state.sliceUntil).toVdomArray { tableItem =>
                    val isSelected = state.isSelected(tableItem.id)

                    MuiTableRow(hover = true)(
                      onClick --> handleClick(tableItem.id),
                      role := "checkbox",
                      aria.checked := isSelected,
                      tabIndex := -1,
                      Attr("key") := tableItem.id,
                      selected := isSelected,
                      MuiTableCell(padding = MuiTableCell.Padding.checkbox)(
                        MuiCheckbox()(checked := isSelected)
                      ),
                      MuiTableCell(component = "th", scope = "row", padding = MuiTableCell.Padding.none)(tableItem.name),
                      MuiTableCell(align = MuiTableCell.Alignment.right)(tableItem.calories),
                      MuiTableCell(align = MuiTableCell.Alignment.right)(tableItem.fat),
                      MuiTableCell(align = MuiTableCell.Alignment.right)(tableItem.carbs),
                      MuiTableCell(align = MuiTableCell.Alignment.right)(tableItem.protein)
                    )
                  },
                  MuiTableRow()(
                    style := js.Dictionary("height" -> s"${49 * state.emptyRows}px"),
                    MuiTableCell()(colSpan := 6)
                  ).when(state.hasEmptyRows)
                )
              ).rawNode
            ),
            MuiTablePagination(
              rowsPerPageOptions = js.Array(5, 10, 25),
              component = "div",
              count = state.dataCount,
              rowsPerPage = state.rowsPerPage,
              page = state.page,
              backIconButtonProps = MuiBackIconButtonProps(ariaLabel = "Previous Page"),
              nextIconButtonProps = MuiNextIconButtonProps(ariaLabel = "Next Page"),
              onChangePage = handleChangePage,
              onChangeRowsPerPage = handleChangeRowsPerPage
            )
          )
        )
      )
    }
  }

  private val component = ScalaComponent.builder[Props]("EnhancedTable")
    .initialState(State())
    .renderBackend[Backend]
    .build

  def apply(style: EnhancedTableStyle = DefaultEnhancedTableStyle) = component(Props(style))
}
