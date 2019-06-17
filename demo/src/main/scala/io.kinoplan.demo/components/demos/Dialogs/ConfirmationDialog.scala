package io.kinoplan.demo.components.demos.Dialogs

import io.kinoplan.demo.components.ComponentContainer
import io.kinoplan.demo.styles.demos.Dialogs.{ConfirmationDialogStyle, DefaultConfirmationDialogStyle}
import io.kinoplan.demo.utils.Helpers.styleAToClassName
import io.kinoplan.scalajs.react.material.ui.core.{MuiDialog, MuiList, MuiListItem, MuiListItemText}
import japgolly.scalajs.react.vdom.all._
import japgolly.scalajs.react.{BackendScope, Callback, ScalaComponent}
import scalacss.ScalaCssReact._

object ConfirmationDialog {
  case class Props(style: ConfirmationDialogStyle)

  case class State(open: Boolean = false, value: String = "Dione") {
    def handleClickListItem = copy(open = true)

    def handleClose(value: String) = copy(value = value, open = false)
  }

  class Backend(t: BackendScope[Props, State]) {
    def handleClickListItem = t.modState(_.handleClickListItem)

    def handleClose: String => Callback = value => {
      t.modState(_.handleClose(value))
    }

    def render(props: Props, state: State): VdomElement = {
      val css = props.style

      val dialogClassess = Map(
        MuiDialog.ClassKey.paper -> styleAToClassName(css.paper)
      )

      div(
        ComponentContainer("Confirmation dialogs")(
          div(css.root,
            MuiList()(
              MuiListItem(button = true, divider = true, disabled = true)(
                MuiListItemText(primary = Some("Interruptions"))
              ),
              MuiListItem(button = true, divider = true)(
                aria.hasPopup := "true",
                aria.controls := "ringtone-menu",
                aria.label := "Phone ringtone",
                onClick --> handleClickListItem
              )(
                MuiListItemText(primary = Some("Interruptions"), secondary = Some(state.value))
              ),
              MuiListItem(button = true, divider = true, disabled = true)(
                MuiListItemText(primary = Some("Default notification ringtone"), secondary = Some("Tethys"))
              ),
              ConfirmationDialogRaw(
                state.open,
                onClose = handleClose,
                value = state.value,
                dialogClassess = dialogClassess
              )
            )
          )
        )
      )
    }
  }

  private val component = ScalaComponent.builder[Props]("ConfirmationDialog")
    .initialState(State())
    .renderBackend[Backend]
    .build

  def apply(style: ConfirmationDialogStyle = DefaultConfirmationDialogStyle) = component(Props(style))
}
