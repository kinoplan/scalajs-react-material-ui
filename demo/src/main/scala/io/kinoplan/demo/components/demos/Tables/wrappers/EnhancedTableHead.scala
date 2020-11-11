package io.kinoplan.demo.components.demos.Tables.wrappers

import japgolly.scalajs.react._
import japgolly.scalajs.react.vdom.Attr
import japgolly.scalajs.react.vdom.all._
import scalacss.ScalaCssReactImplicits

import io.kinoplan.demo.models.Tables.Row
import io.kinoplan.scalajs.react.material.ui.core._

object EnhancedTableHead extends ScalaCssReactImplicits {
  case class Props(
    selectedCount: Int,
    order: String,
    orderBy: String,
    onSelectAllClick: ReactEventFromInput => Callback,
    onRequestSort: String => Callback,
    rowCount: Int
  ) {
    val isIndeterminate = selectedCount > 0 && selectedCount < rowCount

    val isAllSelected = selectedCount == rowCount
  }

  class Backend(t: BackendScope[Props, Unit]) {
    def createSortHandler(property: String): Callback = {
      val props = t.props.runNow()

      props.onRequestSort(property)
    }

    def render(props: Props): VdomElement = {
      val rows = Row.commons

      MuiTableHead()(
        MuiTableRow()(
          MuiTableCell(padding = MuiTableCell.Padding.checkbox)(
            MuiCheckbox(indeterminate = props.isIndeterminate)(
              checked := props.isAllSelected,
              onChange ==> props.onSelectAllClick
            )
          ),
          rows.toVdomArray { row =>
            MuiTableCell(
              align = row.align,
              padding = row.padding,
              sortDirection = row.sortDirection(props.orderBy, props.order)
            )(Attr("key") := row.id,
              MuiTooltip(title = "Sort", placement = row.placement, enterDelay = 300)(
                MuiTableSortLabel(active = row.isActive(props.orderBy), direction = props.order)(
                  onClick --> createSortHandler(row.id),
                  row.label
                )
              )
            )
          }
        )
      )
    }
  }

  private val component = ScalaComponent.builder[Props]("EnhancedTableHead")
    .renderBackend[Backend]
    .build

  def apply(
    selectedCount: Int,
    order: String,
    orderBy: String,
    onSelectAllClick: ReactEventFromInput => Callback,
    onRequestSort: String => Callback,
    rowCount: Int
  ) = component(Props(selectedCount, order, orderBy, onSelectAllClick, onRequestSort, rowCount))
}
