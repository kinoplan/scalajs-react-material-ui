package io.kinoplan.demo.components.demos.Tables

import japgolly.scalajs.react._
import japgolly.scalajs.react.vdom.Attr
import japgolly.scalajs.react.vdom.all._
import scalacss.ScalaCssReactImplicits

import io.kinoplan.demo.components.ComponentContainer
import io.kinoplan.demo.models.Tables.TableItem
import io.kinoplan.demo.styles.demos.Tables.{CustomizedTableStyle, DefaultCustomizedTableStyle}
import io.kinoplan.demo.utils.Helpers.styleAToClassName
import io.kinoplan.scalajs.react.material.ui.core._

object CustomizedTable extends ScalaCssReactImplicits {
  case class Props(style: CustomizedTableStyle)

  class Backend(t: BackendScope[Props, Unit]) {
    def render(props: Props): VdomElement = {
      val css = props.style
      val tableItems = TableItem.simples

      val cellClasses = Map(
        MuiTableCell.ClassKey.head -> styleAToClassName(css.head),
        MuiTableCell.ClassKey.body -> styleAToClassName(css.body)
      )

      div(
        ComponentContainer("Customized Tables")(
          MuiPaper()(css.root,
            MuiTable()(css.table,
              MuiTableHead()(
                MuiTableRow()(
                  MuiTableCell(classes = cellClasses)("Dessert (100g serving)"),
                  MuiTableCell(classes = cellClasses, align = MuiTableCell.Alignment.right)("Calories"),
                  MuiTableCell(classes = cellClasses, align = MuiTableCell.Alignment.right)("Fat (g)"),
                  MuiTableCell(classes = cellClasses, align = MuiTableCell.Alignment.right)("Carbs (g)"),
                  MuiTableCell(classes = cellClasses, align = MuiTableCell.Alignment.right)("Protein (g)")
                )
              ),
              MuiTableBody()(
                tableItems.zipWithIndex.toVdomArray { case (tableItem, index) =>
                  MuiTableRow()(Attr("key") := index,
                    MuiTableCell(classes = cellClasses, component = "th", scope = "row")(tableItem.name),
                    MuiTableCell(classes = cellClasses, align = MuiTableCell.Alignment.right)(tableItem.calories),
                    MuiTableCell(classes = cellClasses, align = MuiTableCell.Alignment.right)(tableItem.fat),
                    MuiTableCell(classes = cellClasses, align = MuiTableCell.Alignment.right)(tableItem.carbs),
                    MuiTableCell(classes = cellClasses, align = MuiTableCell.Alignment.right)(tableItem.protein)
                  )
                }
              )
            )
          )
        )
      )
    }
  }

  private val component = ScalaComponent.builder[Props]("CustomizedTable")
    .renderBackend[Backend]
    .build

  def apply(style: CustomizedTableStyle = DefaultCustomizedTableStyle) = component(Props(style))
}
