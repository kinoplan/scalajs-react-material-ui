package io.kinoplan.demo.components.demos.Snackbars

import japgolly.scalajs.react.{BackendScope, ScalaComponent}
import japgolly.scalajs.react.vdom.all._
import scalacss.ScalaCssReactImplicits

import io.kinoplan.demo.components.ComponentContainer
import io.kinoplan.demo.styles.demos.Snackbars.{CustomizedSnackbarsStyle, DefaultCustomizedSnackbarsStyle}
import io.kinoplan.scalajs.react.material.ui.core.{MuiButton, MuiSnackbarContent}

object LongTextSnackbar extends ScalaCssReactImplicits {
  case class Props(style: CustomizedSnackbarsStyle)

  class Backend(t: BackendScope[Props, Unit]) {
    def render(props: Props): VdomElement = {
      val css = props.style

      val action = MuiButton(color = MuiButton.Color.secondary, size = MuiButton.Size.small)("lorem ipsum dolorem")

      div(
        ComponentContainer("Message Length")(
          div(
            MuiSnackbarContent(
              action = action,
              message = VdomNode("This is an error message!")
            )(css.snackbar),
            MuiSnackbarContent(
              message = VdomNode("I love candy. I love cookies. I love cupcakes. I love cheesecake. I love chocolate.")
            )(css.snackbar),
            MuiSnackbarContent(
              action = action,
              message = VdomNode("I love candy. I love cookies. I love cupcakes.")
            )(css.snackbar),
            MuiSnackbarContent(
              action = action,
              message = VdomNode("I love candy. I love cookies. I love cupcakes. I love cheesecake. I love chocolate.")
            )(css.snackbar)
          )
        )
      )
    }
  }

  private val component = ScalaComponent.builder[Props]("LongTextSnackbar")
    .renderBackend[Backend]
    .build

  def apply(style: CustomizedSnackbarsStyle = DefaultCustomizedSnackbarsStyle) = component(Props(style))
}
