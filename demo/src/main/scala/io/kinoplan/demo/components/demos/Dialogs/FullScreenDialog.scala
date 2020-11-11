package io.kinoplan.demo.components.demos.Dialogs

import japgolly.scalajs.react.{BackendScope, Callback, ReactEvent, ScalaComponent}
import japgolly.scalajs.react.vdom.all._
import scalacss.ScalaCssReactImplicits

import io.kinoplan.demo.components.ComponentContainer
import io.kinoplan.demo.styles.demos.Dialogs.{DefaultDialogsStyle, DialogsStyle}
import io.kinoplan.scalajs.react.material.ui.core._
import io.kinoplan.scalajs.react.material.ui.icons.{MuiIcons, MuiIconsModule}

object FullScreenDialog extends ScalaCssReactImplicits {
  case class Props(style: DialogsStyle)

  case class State(open: Boolean = false) {
    def handleClickOpen = copy(open = true)

    def handleClickClose = copy(open = false)
  }

  class Backend(t: BackendScope[Props, State]) {
    def handleClickOpen = t.modState(_.handleClickOpen)

    def handleClickClose: Callback = t.modState(_.handleClickClose)

    def onClose: (ReactEvent, String) => Callback = (_, _) => {
      handleClickClose
    }

    def render(props: Props, state: State): VdomElement = {
      val css = props.style

      div(
        ComponentContainer("Full-screen dialogs")(
          div(
            MuiButton(variant = MuiButton.Variant.outlined, color = MuiButton.Color.primary)(
              onClick --> handleClickOpen,
              "Open full-screen dialog"
            ),
            MuiDialog(open = state.open, onClose = onClose, fullScreen = true)(
              MuiAppBar()(css.appBar,
                MuiToolbar()(
                  MuiIconButton(color = MuiIconButton.Color.inherit)(
                    aria.label := "Close",
                    onClick --> handleClickClose,
                    MuiIcons(MuiIconsModule.Close)()
                  ),
                  MuiTypography(variant = MuiTypography.Variant.h6, color = MuiTypography.Color.inherit)(css.flexStyle,
                    "Sound"
                  ),
                  MuiButton(color = MuiButton.Color.inherit)(
                    onClick --> handleClickClose,
                    "save"
                  )
                )
              ),
              MuiList()(
                MuiListItem(button = true)(
                  MuiListItemText(primary = VdomNode("Phone ringtone"), secondary = VdomNode("Titania"))
                ),
                MuiDivider(),
                MuiListItem(button = true)(
                  MuiListItemText(primary = VdomNode("Default notification ringtone"), secondary = VdomNode("Tethys"))
                )
              )
            ).when(state.open)
          )
        )
      )
    }
  }

  private val component = ScalaComponent.builder[Props]("FullScreenDialog")
    .initialState(State())
    .renderBackend[Backend]
    .build

  def apply(style: DialogsStyle = DefaultDialogsStyle) = component(Props(style))
}
