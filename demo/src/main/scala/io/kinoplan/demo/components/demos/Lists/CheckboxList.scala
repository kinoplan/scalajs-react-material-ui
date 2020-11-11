package io.kinoplan.demo.components.demos.Lists

import japgolly.scalajs.react.{BackendScope, ScalaComponent}
import japgolly.scalajs.react.vdom.Attr
import japgolly.scalajs.react.vdom.all._
import scalacss.ScalaCssReactImplicits

import io.kinoplan.demo.components.{ComponentContainer, Layout}
import io.kinoplan.demo.styles.demos.Lists.{DefaultListStyle, ListStyle}
import io.kinoplan.scalajs.react.material.ui.core.{MuiCheckbox, MuiIconButton, MuiList, MuiListItem, MuiListItemSecondaryAction, MuiListItemText}
import io.kinoplan.scalajs.react.material.ui.icons.{MuiIcons, MuiIconsModule}

object CheckboxList extends ScalaCssReactImplicits {
  case class Props(style: ListStyle)

  case class State(checked: List[Int] = List(0)) {
    def isChecked(value: Int) = checked.contains(value)

    def handleToggle(value: Int) = {
      if (checked.contains(value)) {
        copy(checked = checked.filterNot(_ == value))
      } else {
        copy(checked = checked :+ value)
      }
    }
  }

  class Backend(t: BackendScope[Props, State]) {
    def handleToggle(value: Int) = t.modState(_.handleToggle(value))

    def render(props: Props, state: State): VdomElement = {
      val css = props.style

      div(
        ComponentContainer("List Controls Checkbox")(
          div(css.root, css.rootPaper(Layout.isPaletteLight),
            MuiList()(
              List(0, 1, 2, 3).toVdomArray { value =>
                MuiListItem(dense = true, button = true)(Attr("key") := value,
                  onClick --> handleToggle(value),
                  MuiCheckbox(disableRipple = true)(
                    checked := state.isChecked(value),
                    tabIndex := -1
                  ),
                  MuiListItemText(primary = VdomNode(s"Line item ${value + 1}")),
                  MuiListItemSecondaryAction()(
                    MuiIconButton()(
                      aria.label := "Comments",
                      MuiIcons(MuiIconsModule.Comment)()
                    )
                  )
                )
              }
            )
          )
        )
      )
    }
  }

  private val component = ScalaComponent.builder[Props]("CheckboxList")
    .initialState(State())
    .renderBackend[Backend]
    .build

  def apply(style: ListStyle = DefaultListStyle) = component(Props(style))
}
