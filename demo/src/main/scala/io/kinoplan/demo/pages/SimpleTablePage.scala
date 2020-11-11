package io.kinoplan.demo.pages

import japgolly.scalajs.react._
import japgolly.scalajs.react.extra.router.RouterCtl
import japgolly.scalajs.react.vdom.Attr
import japgolly.scalajs.react.vdom.all._
import scalacss.ScalaCssReactImplicits

import io.kinoplan.demo.models.Tables.TableItem
import io.kinoplan.demo.router.AppRouter.Page
import io.kinoplan.demo.styles.demos.Tables.{DefaultSimpleTableStyle, SimpleTableStyle}
import io.kinoplan.scalajs.react.material.ui.core._

object SimpleTablePage extends ScalaCssReactImplicits {
  case class Props(router: RouterCtl[Page], style: SimpleTableStyle)

  class Backend(t: BackendScope[Props, Unit]) {
    def render(props: Props): VdomElement = {
      val css = props.style
      val tableItems = TableItem.simples

      div(
        div(
          MuiTypography(variant = MuiTypography.Variant.h4, gutterBottom = true, component = "h2")(
            "Products"
          ),
          div(css.tableContainer,
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
      )
    }
  }

  private val component = ScalaComponent.builder[Props]("SimpleTablePage")
    .renderBackend[Backend]
    .build

  def apply(
    router: RouterCtl[Page],
    style: SimpleTableStyle = DefaultSimpleTableStyle
  ) = component(Props(router, style))
}
