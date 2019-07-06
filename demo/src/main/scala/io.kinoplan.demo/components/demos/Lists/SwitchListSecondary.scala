package io.kinoplan.demo.components.demos.Lists

import io.kinoplan.demo.components.{ComponentContainer, Layout}
import io.kinoplan.demo.styles.demos.Lists.{DefaultListStyle, ListStyle}
import io.kinoplan.scalajs.react.material.ui.core.{MuiList, MuiListItem, MuiListItemIcon, MuiListItemSecondaryAction, MuiListItemText, MuiListSubheader, MuiSwitch}
import io.kinoplan.scalajs.react.material.ui.icons.{MuiBluetoothIcon, MuiWifiIcon}
import japgolly.scalajs.react.vdom.all._
import japgolly.scalajs.react.{BackendScope, ScalaComponent}
import scalacss.ScalaCssReactImplicits

object SwitchListSecondary extends ScalaCssReactImplicits {
  case class Props(style: ListStyle)

  case class State(checked: List[String] = List("wifi")) {
    def isChecked(value: String) = checked.contains(value)

    def handleToggle(value: String) = {
      if (checked.contains(value)) {
        copy(checked = checked.filterNot(_ == value))
      } else {
        copy(checked = checked :+ value)
      }
    }
  }

  class Backend(t: BackendScope[Props, State]) {
    def handleToggle(value: String) = t.modState(_.handleToggle(value))

    def render(props: Props, state: State): VdomElement = {
      val css = props.style

      div(
        ComponentContainer("List Controls Switch Secondary")(
          div(css.root, css.rootPaper(Layout.isPaletteLight),
            MuiList(subheader = Some(MuiListSubheader()("Settings")))(
              MuiListItem()(
                MuiListItemIcon()(
                  MuiWifiIcon()
                ),
                MuiListItemText(primary = Some("Wi-Fi")),
                MuiListItemSecondaryAction()(
                  MuiSwitch()(
                    checked := state.isChecked("wifi"),
                    onChange --> handleToggle("wifi")
                  )
                )
              ),
              MuiListItem()(
                MuiListItemIcon()(
                  MuiBluetoothIcon()
                ),
                MuiListItemText(primary = Some("Bluetooth")),
                MuiListItemSecondaryAction()(
                  MuiSwitch()(
                    checked := state.isChecked("bluetooth"),
                    onChange --> handleToggle("bluetooth")
                  )
                )
              )
            )
          )
        )
      )
    }
  }

  private val component = ScalaComponent.builder[Props]("SwitchListSecondary")
    .initialState(State())
    .renderBackend[Backend]
    .build

  def apply(style: ListStyle = DefaultListStyle) = component(Props(style))
}
