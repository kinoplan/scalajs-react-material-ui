package io.kinoplan.demo.components.demos.Tables

import scala.scalajs.js.JSNumberOps._

import japgolly.scalajs.react._
import japgolly.scalajs.react.vdom.Attr
import japgolly.scalajs.react.vdom.all._
import scalacss.ScalaCssReactImplicits

import io.kinoplan.demo.components.ComponentContainer
import io.kinoplan.demo.models.Tables.SpanningItem
import io.kinoplan.demo.styles.demos.Tables.{DefaultSimpleTableStyle, SimpleTableStyle}
import io.kinoplan.demo.utils.Helpers.DoubleExtended
import io.kinoplan.scalajs.react.material.ui.core._

object SpanningTable extends ScalaCssReactImplicits {
  val TAX_RATE = 0.07

  case class Props(style: SimpleTableStyle)

  class Backend(t: BackendScope[Props, Unit]) {
    def render(props: Props): VdomElement = {
      val css = props.style
      val tableItems = SpanningItem.rows

      val invoiceSubtotal = tableItems.map(_.price).sum
      val invoiceTaxes = TAX_RATE * invoiceSubtotal
      val invoiceTotal = invoiceTaxes + invoiceSubtotal

      div(
        ComponentContainer("Spanning Table")(
          MuiPaper()(css.root,
            MuiTable()(css.table,
              MuiTableHead()(
                MuiTableRow()(
                  MuiTableCell()("Desc"),
                  MuiTableCell(align = MuiTableCell.Alignment.right)("Qty."),
                  MuiTableCell(align = MuiTableCell.Alignment.right)("@"),
                  MuiTableCell(align = MuiTableCell.Alignment.right)("Price")
                )
              ),
              MuiTableBody()(
                tableItems.zipWithIndex.toVdomArray { case (tableItem, index) =>
                  MuiTableRow()(Attr("key") := index,
                    MuiTableCell()(tableItem.desc),
                    MuiTableCell(align = MuiTableCell.Alignment.right)(tableItem.qty),
                    MuiTableCell(align = MuiTableCell.Alignment.right)(tableItem.unit),
                    MuiTableCell(align = MuiTableCell.Alignment.right)(tableItem.price.toCcyFormat)
                  )
                },
                MuiTableRow()(
                  MuiTableCell()(rowSpan := 3),
                  MuiTableCell()(colSpan := 2, "Subtotal"),
                  MuiTableCell(align = MuiTableCell.Alignment.right)(invoiceSubtotal.toCcyFormat)
                ),
                MuiTableRow()(
                  MuiTableCell()("Tax"),
                  MuiTableCell()(s"${(TAX_RATE * 100).toFixed(0)} %"),
                  MuiTableCell(align = MuiTableCell.Alignment.right)(invoiceTaxes.toCcyFormat)
                ),
                MuiTableRow()(
                  MuiTableCell()(colSpan := 2, "Total"),
                  MuiTableCell(align = MuiTableCell.Alignment.right)(invoiceTotal.toCcyFormat)
                )
              )
            )
          )
        )
      )
    }
  }

  private val component = ScalaComponent.builder[Props]("SpanningTable")
    .renderBackend[Backend]
    .build

  def apply(style: SimpleTableStyle = DefaultSimpleTableStyle) = component(Props(style))
}
