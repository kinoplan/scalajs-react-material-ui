package io.kinoplan.demo.components.demos.Dialogs

import japgolly.scalajs.react.{BackendScope, Callback, ScalaComponent}
import japgolly.scalajs.react.vdom.all._
import scalacss.ScalaCssReactImplicits

import io.kinoplan.demo.styles.demos.Dialogs.{DefaultDialogsStyle, DialogsStyle}
import io.kinoplan.scalajs.react.material.ui.core.{MuiDialogTitle, MuiIconButton, MuiTypography}
import io.kinoplan.scalajs.react.material.ui.icons.{MuiIcons, MuiIconsModule}

object CustomizedDialogTitleWrapped extends ScalaCssReactImplicits {
  case class Props(onClose: Callback, style: DialogsStyle)

  class Backend(t: BackendScope[Props, Unit]) {
    def render(props: Props): VdomElement = {
      val css = props.style

      div(
        MuiDialogTitle(disableTypography = true)(css.root,
          id := "customized-dialog-title",
          MuiTypography(variant = MuiTypography.Variant.h6)("Modal title"),
          MuiIconButton()(css.closeButton,
            aria.label := "Close",
            onClick --> props.onClose,
            MuiIcons(MuiIconsModule.Close)()
          )
        )
      )
    }
  }

  val component = ScalaComponent.builder[Props]("CustomizedDialogTitleWrapped")
    .renderBackend[Backend]
    .build

  def apply(
    onClose: Callback,
    style: DialogsStyle = DefaultDialogsStyle
  ): VdomElement = component(Props(onClose, style))
}
