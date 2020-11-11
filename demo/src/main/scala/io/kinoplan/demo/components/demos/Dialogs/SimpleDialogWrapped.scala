package io.kinoplan.demo.components.demos.Dialogs

import scala.scalajs.js

import japgolly.scalajs.react.{BackendScope, Callback, ReactEvent, ScalaComponent}
import japgolly.scalajs.react.vdom.Attr
import japgolly.scalajs.react.vdom.all._
import scalacss.ScalaCssReactImplicits

import io.kinoplan.demo.models.Dialogs.Emails
import io.kinoplan.demo.styles.demos.Dialogs.{DefaultDialogsStyle, DialogsStyle}
import io.kinoplan.scalajs.react.material.ui.core._
import io.kinoplan.scalajs.react.material.ui.icons.{MuiIcons, MuiIconsModule}

object SimpleDialogWrapped extends ScalaCssReactImplicits {
  case class Props(open: Boolean, onClose: js.Function1[String, Callback], selectedValue: String, style: DialogsStyle)

  class Backend(t: BackendScope[Props, Unit]) {
    def handleClose(props: Props): (ReactEvent, String) => Callback = (_, _) => {
      props.onClose(props.selectedValue)
    }

    def handleListItemClick(props: Props, value: String) = {
      props.onClose(value)
    }

    def render(props: Props): VdomElement = {
      val css = props.style

      div(
        MuiDialog(open = props.open, onClose = handleClose(props))(
          aria.labelledBy := "simple-dialog-title",
          MuiDialogTitle()(id := "simple-dialog-title", "Set backup account"),
          div(
            MuiList()(
              Emails.default.toVdomArray { email =>
                MuiListItem(button = true)(
                  onClick --> handleListItemClick(props, email),
                  Attr("key") := email,
                  MuiListItemAvatar()(
                    MuiAvatar()(css.avatar,
                      MuiIcons(MuiIconsModule.Person)()
                    )
                  ),
                  MuiListItemText(primary = VdomNode(email))
                )
              },
              MuiListItem(button = true)(
                onClick --> handleListItemClick(props, "addAccount"),
                MuiListItemAvatar()(
                  MuiAvatar()(
                    MuiIcons(MuiIconsModule.Add)()
                  )
                ),
                MuiListItemText(primary = VdomNode("add account"))
              )
            )
          )
        ).when(props.open)
      )
    }
  }

  private val component = ScalaComponent.builder[Props]("SimpleDialogWrapped")
    .renderBackend[Backend]
    .build

  def apply(
    open: Boolean,
    onClose: js.Function1[String, Callback],
    selectedValue: String,
    style: DialogsStyle = DefaultDialogsStyle
  ) = component(Props(open, onClose, selectedValue, style))
}
