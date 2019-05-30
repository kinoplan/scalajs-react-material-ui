package io.kinoplan.demo.pages

import io.kinoplan.demo.CssSettings._
import io.kinoplan.demo.models.TableItem
import io.kinoplan.demo.router.AppRouter.Page
import io.kinoplan.scalajs.react.material.ui.core._
import io.kinoplan.scalajs.react.material.ui.core.styles.Theme
import io.kinoplan.scalajs.react.material.ui.icons.{MuiMenu => MuiMenuIcon}
import japgolly.scalajs.react._
import japgolly.scalajs.react.extra.router.RouterCtl
import japgolly.scalajs.react.vdom.Attr
import japgolly.scalajs.react.vdom.all._
import scalacss.ScalaCssReact._

object SimpleTablePage {
  class SimpleTableStyle(theme: Theme = Theme.defaultTheme) extends StyleSheet.Inline {
    import dsl._

    val tableContainer = style(
      height(320.px)
    )

    val root = style(
      width(100.%%),
      overflowX.auto
    )

    val table = style(
      minWidth(700.px)
    )

    val root1 = style(
      flexGrow(1)
    )

    val menuButton = style(
      marginRight(theme.spacing(2).px)
    )

    val title = style(
      flexGrow(1)
    )
  }

  object DefaultSimpleTableStyle extends SimpleTableStyle

  case class Props(router: RouterCtl[Page], style: SimpleTableStyle)

  class Backend(t: BackendScope[Props, Unit]) {
    def render(props: Props): VdomElement = {
      val css = props.style
      val tableItems = TableItem.default

      div(
        div(
          MuiTypography(variant = MuiTypography.Variant.h4, gutterBottom = true, component = Some("h2"))(
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
                  tableItems.toVdomArray(tableItem => {
                    MuiTableRow()(Attr("key") := tableItem.idx.toString,
                      MuiTableCell(component = Some("th"), scope = Some("row"))(tableItem.name),
                      MuiTableCell(align = MuiTableCell.Alignment.right)(tableItem.calories),
                      MuiTableCell(align = MuiTableCell.Alignment.right)(tableItem.fat),
                      MuiTableCell(align = MuiTableCell.Alignment.right)(tableItem.carbs),
                      MuiTableCell(align = MuiTableCell.Alignment.right)(tableItem.protein)
                    )
                  })
                )
              )
            )
          )
        ),
        div(
          MuiTypography(variant = MuiTypography.Variant.h4, gutterBottom = true, component = Some("h2"))(
            "App Bar with buttons"
          ),
          div(css.root1,
            MuiAppBar(position = MuiAppBar.Position.static)(
              MuiToolbar()(
                MuiIconButton(color = MuiIconButton.Color.inherit)(css.menuButton, aria.label := "Menu",
                  MuiMenuIcon()
                ),
                MuiTypography(variant = MuiTypography.Variant.h6, color = MuiTypography.Color.inherit)(css.title,
                  "News"
                ),
                MuiButton(color = MuiButton.Color.inherit)("Login")
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