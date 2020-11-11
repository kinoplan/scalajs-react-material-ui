package io.kinoplan.demo.components.demos.Tooltips

import japgolly.scalajs.react.{BackendScope, ScalaComponent}
import japgolly.scalajs.react.vdom.all._
import scalacss.ScalaCssReactImplicits

import io.kinoplan.demo.components.ComponentContainer
import io.kinoplan.demo.styles.demos.Tooltips.{DefaultPositionedTooltipsStyle, PositionedTooltipsStyle}
import io.kinoplan.scalajs.react.material.ui.core.{MuiButton, MuiGrid, MuiTooltip}

object PositionedTooltips extends ScalaCssReactImplicits {
  case class Props(style: PositionedTooltipsStyle)

  class Backend(t: BackendScope[Props, Unit]) {
    def render(props: Props): VdomElement = {
      val css = props.style

      div(
        ComponentContainer("Positioned Tooltips")(
          div(css.root,
            MuiGrid(container = true, justify = MuiGrid.Justify.center)(
              MuiGrid(item = true)(
                MuiTooltip(title = "Add", placement = MuiTooltip.Placement.topStart)(
                  MuiButton()("top-start")
                ),
                MuiTooltip(title = "Add", placement = MuiTooltip.Placement.top)(
                  MuiButton()("top")
                ),
                MuiTooltip(title = "Add", placement = MuiTooltip.Placement.topEnd)(
                  MuiButton()("top-end")
                )
              )
            ),
            MuiGrid(container = true, justify = MuiGrid.Justify.center)(
              MuiGrid(item = true, xs = 6)(
                MuiTooltip(title = "Add", placement = MuiTooltip.Placement.leftStart)(
                  MuiButton()("left-start")
                ),
                br,
                MuiTooltip(title = "Add", placement = MuiTooltip.Placement.left)(
                  MuiButton()("left")
                ),
                br,
                MuiTooltip(title = "Add", placement = MuiTooltip.Placement.leftEnd)(
                  MuiButton()("left-end")
                )
              ),
              MuiGrid(
                item = true,
                container = true,
                xs = 6,
                alignItems = MuiGrid.AlignItems.flexEnd,
                direction = MuiGrid.Direction.column,
                spacing = 0
              )(
                MuiGrid(item = true)(
                  MuiTooltip(title = "Add", placement = MuiTooltip.Placement.rightStart)(
                    MuiButton()("right-start")
                  )
                ),
                MuiGrid(item = true)(
                  MuiTooltip(title = "Add", placement = MuiTooltip.Placement.right)(
                    MuiButton()("right")
                  )
                ),
                MuiGrid(item = true)(
                  MuiTooltip(title = "Add", placement = MuiTooltip.Placement.rightEnd)(
                    MuiButton()("right-end")
                  )
                )
              )
            ),
            MuiGrid(container = true, justify = MuiGrid.Justify.center)(
              MuiGrid(item = true)(
                MuiTooltip(title = "Add", placement = MuiTooltip.Placement.bottomStart)(
                  MuiButton()("bottom-start")
                ),
                MuiTooltip(title = "Add", placement = MuiTooltip.Placement.bottom)(
                  MuiButton()("bottom")
                ),
                MuiTooltip(title = "Add", placement = MuiTooltip.Placement.bottomEnd)(
                  MuiButton()("bottom-end")
                )
              )
            )
          )
        )
      )
    }
  }

  private val component = ScalaComponent.builder[Props]("PositionedTooltips")
    .renderBackend[Backend]
    .build

  def apply(style: PositionedTooltipsStyle = DefaultPositionedTooltipsStyle) = component(Props(style))
}
