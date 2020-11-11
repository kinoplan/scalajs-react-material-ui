package io.kinoplan.demo.components.demos.Tables

import japgolly.scalajs.react._
import japgolly.scalajs.react.vdom.Attr
import japgolly.scalajs.react.vdom.all._
import scalacss.ScalaCssReactImplicits

import io.kinoplan.demo.components.ComponentContainer
import io.kinoplan.demo.models.Tables.TableItem
import io.kinoplan.demo.styles.demos.Tables.{DefaultSimpleTableStyle, SimpleTableStyle}
import io.kinoplan.scalajs.react.material.ui.core._

object SimpleTable extends ScalaCssReactImplicits {
  case class Props(style: SimpleTableStyle)

  class Backend(t: BackendScope[Props, Unit]) {
    def render(props: Props): VdomElement = {
      val css = props.style
      val tableItems = TableItem.simples

      div(
        ComponentContainer("Simple Table")(
          MuiPaper()(css.root,
            MuiTable()(css.table,
              MuiTableHead()(
                MuiTableRow()(
                  MuiTableCell()("Dessert (100g serving)"),
                  MuiTableCell(align = MuiTableCell.Alignment.right)("Calories"),
                  MuiTableCell(align = MuiTableCell.Alignment.right)("Fat (g)"),
                  MuiTableCell(align = MuiTableCell.Alignment.right)("Carbs (g)"),
                  MuiTableCell(align = MuiTableCell.Alignment.right)("Protein (g)")
                )
              ),
              MuiTableBody()(
                tableItems.zipWithIndex.toVdomArray { case (tableItem, index) =>
                  MuiTableRow()(Attr("key") := index,
                    MuiTableCell(component = "th", scope = "row")(tableItem.name),
                    MuiTableCell(align = MuiTableCell.Alignment.right)(tableItem.calories),
                    MuiTableCell(align = MuiTableCell.Alignment.right)(tableItem.fat),
                    MuiTableCell(align = MuiTableCell.Alignment.right)(tableItem.carbs),
                    MuiTableCell(align = MuiTableCell.Alignment.right)(tableItem.protein)
                  )
                }
              )
            )
          )
        )
      )
    }
  }

  private val component = ScalaComponent.builder[Props]("SimpleTable")
    .renderBackend[Backend]
    .build

  def apply(style: SimpleTableStyle = DefaultSimpleTableStyle) = component(Props(style))
}
