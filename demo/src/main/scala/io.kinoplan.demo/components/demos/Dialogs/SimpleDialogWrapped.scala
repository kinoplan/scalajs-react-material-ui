package io.kinoplan.demo.components.demos.Dialogs

import io.kinoplan.demo.models.Dialogs.Emails
import io.kinoplan.demo.styles.demos.Dialogs.{DefaultDialogsStyle, DialogsStyle}
import io.kinoplan.scalajs.react.material.ui.core.{MuiAvatar, MuiDialog, MuiDialogTitle, MuiList, MuiListItem, MuiListItemAvatar, MuiListItemText}
import io.kinoplan.scalajs.react.material.ui.icons.{MuiAddIcon, MuiPersonIcon}
import japgolly.scalajs.react.vdom.Attr
import japgolly.scalajs.react.vdom.all._
import japgolly.scalajs.react.{BackendScope, Callback, ReactEvent, ScalaComponent}
import scalacss.ScalaCssReact._

import scala.scalajs.js

object SimpleDialogWrapped {
  case class Props(open: Boolean, onClose: js.Function1[String, Callback], selectedValue: String, style: DialogsStyle)

  class Backend(t: BackendScope[Props, Unit]) {
    def handleClose(props: Props): ReactEvent => Callback = _ => {
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
                      MuiPersonIcon()
                    )
                  ),
                  MuiListItemText(primary = Some(VdomNode(email)))
                )
              },
              MuiListItem(button = true)(
                onClick --> handleListItemClick(props, "addAccount"),
                MuiListItemAvatar()(
                  MuiAvatar()(
                    MuiAddIcon()
                  )
                ),
                MuiListItemText(primary = Some(VdomNode("add account")))
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
