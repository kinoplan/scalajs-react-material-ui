package io.kinoplan.demo.components.demos.Snackbars

import scala.collection.mutable
import scala.scalajs.js

import japgolly.scalajs.react.{BackendScope, Callback, ReactEvent, ScalaComponent}
import japgolly.scalajs.react.vdom.Attr
import japgolly.scalajs.react.vdom.all._
import org.scalajs.dom.html
import scalacss.ScalaCssReactImplicits

import io.kinoplan.demo.components.ComponentContainer
import io.kinoplan.demo.models.Snackbars.MessageInfo
import io.kinoplan.demo.styles.demos.Snackbars.{DefaultSimpleSnackbarStyle, SimpleSnackbarStyle}
import io.kinoplan.demo.utils.props.MuiContentProps
import io.kinoplan.scalajs.react.material.ui.core.{MuiButton, MuiIconButton, MuiSnackbar}
import io.kinoplan.scalajs.react.material.ui.core.internal.Origin
import io.kinoplan.scalajs.react.material.ui.icons.{MuiIcons, MuiIconsModule}

object ConsecutiveSnackbars extends ScalaCssReactImplicits {
  var queues = mutable.Queue[MessageInfo]()

  case class Props(style: SimpleSnackbarStyle)

  case class State(open: Boolean = false, messageInfo: Option[MessageInfo] = None) {
    val key = messageInfo.map(_.key).getOrElse(0d)

    val message = messageInfo.map(_.message).getOrElse("")

    def handleClick = copy(open = true)

    def handleClose = copy(open = false)

    def processQueue(messageInfo: MessageInfo) = copy(open = true, messageInfo = Some(messageInfo))
  }

  class Backend(t: BackendScope[Props, State]) {
    def setQueue(message: String) = Callback {
      queues.enqueue(MessageInfo(message = message, key = new js.Date().getTime()))
    }

    def handleClick(message: String) = {
      val state = t.state.runNow()

      setQueue(message) >> t.modState(_.handleClose).when_(state.open) >> processQueue.when_(!state.open)
    }

    def processQueue = t.modState(_.processQueue(queues.dequeue())).when_(queues.nonEmpty)

    def handleCloseClick: Callback = t.modState(_.handleClose)

    def handleClose: (ReactEvent, String) => Callback = (_, reason) => {
      handleCloseClick.when_(reason != "clickaway")
    }

    def handleExited: html.Element => Callback = _ => processQueue

    def render(props: Props, state: State): VdomElement = {
      val css = props.style

      div(
        ComponentContainer("Consecutive Snackbars")(
          div(
            MuiButton()(onClick --> handleClick("message a"), "Show message A"),
            MuiButton()(onClick --> handleClick("message b"), "Show message B"),
            MuiSnackbar(
              open = state.open,
              autoHideDuration = 6000,
              onClose = handleClose,
              onExited = handleExited,
              anchorOrigin = Origin(vertical = "bottom", horizontal = "left"),
              ContentProps = MuiContentProps(ariaDescribedby = "message-id"),
              message = span(id := "message-id", state.message),
              action = VdomArray(
                MuiButton(color = MuiButton.Color.secondary, size = MuiButton.Size.small)(
                  Attr("key") := "undo",
                  onClick --> handleCloseClick,
                  "UNDO"
                ),
                MuiIconButton(color = MuiIconButton.Color.inherit)(css.close,
                  Attr("key") := "close",
                  aria.label := "Close",
                  onClick --> handleCloseClick,
                  MuiIcons(MuiIconsModule.Close)()
                )
              )
            )(Attr("key") := state.key)
          )
        )
      )
    }
  }

  private val component = ScalaComponent.builder[Props]("ConsecutiveSnackbars")
    .initialState(State())
    .renderBackend[Backend]
    .build

  def apply(style: SimpleSnackbarStyle = DefaultSimpleSnackbarStyle) = component(Props(style))
}
