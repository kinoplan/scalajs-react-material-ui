package io.kinoplan.demo.components.demos.Chips

import scala.scalajs.js.JSConverters._

import japgolly.scalajs.react.{BackendScope, Callback, ReactEvent, ScalaComponent}
import japgolly.scalajs.react.vdom.Attr
import japgolly.scalajs.react.vdom.all.{VdomElement, _}
import scalacss.ScalaCssReactImplicits

import io.kinoplan.demo.components.ComponentContainer
import io.kinoplan.demo.models.Chips.Chip
import io.kinoplan.demo.styles.demos.Chips.{ChipsArrayStyle, DefaultChipsArrayStyle}
import io.kinoplan.scalajs.react.material.ui.core.{MuiChip, MuiPaper}
import io.kinoplan.scalajs.react.material.ui.icons.{MuiIcons, MuiIconsModule}

object ChipsArray extends ScalaCssReactImplicits {
  case class Props(style: ChipsArrayStyle)

  case class State(chips: List[Chip] = Chip.default) {
    def handleDelete(chip: Chip) = copy(chips = chips.filterNot(_.key == chip.key))
  }

  class Backend(t: BackendScope[Props, State]) {
    def handleDelete(chip: Chip): ReactEvent => Callback = e => {
      Callback.alert("Why would you want to delete React?! :)").when(chip.isReact) >> t.modState(_.handleDelete(chip))
    }

    def render(props: Props, state: State): VdomElement = {
      val css = props.style

      div(
        ComponentContainer("Chip array")(
          MuiPaper()(css.root,
            state.chips.toVdomArray { chip =>
              val iconO = if (chip.isReact) Some(MuiIcons(MuiIconsModule.TagFaces)()().rawElement) else None

              MuiChip(
                label = VdomNode(chip.label),
                icon = iconO.orUndefined,
                onDelete = handleDelete(chip)
              )(css.chip,
                Attr("key") := chip.key
              )
            }
          )
        )
      )
    }
  }

  private val component = ScalaComponent.builder[Props]("ChipsArray")
    .initialState(State())
    .renderBackend[Backend]
    .build

  def apply(style: ChipsArrayStyle = DefaultChipsArrayStyle) = component(Props(style))
}
