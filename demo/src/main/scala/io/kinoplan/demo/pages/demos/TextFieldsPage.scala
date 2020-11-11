package io.kinoplan.demo.pages.demos

import japgolly.scalajs.react._
import japgolly.scalajs.react.extra.router.RouterCtl
import japgolly.scalajs.react.vdom.all._

import io.kinoplan.demo.components.demos.TextFields._
import io.kinoplan.demo.router.AppRouter.Page

object TextFieldsPage {
  case class Props(router: RouterCtl[Page])

  class Backend(t: BackendScope[Props, Unit]) {
    def render(props: Props): VdomElement = {
      div(
        TextFields(),
        OutlinedTextFields(),
        FilledTextFields(),
        ComposedTextField(),
        Inputs(),
        CustomizedInputs(),
        CustomizedInputBase(),
        InputAdornments(),
        InputWithIcon(),
        FilledInputAdornments(),
        OutlinedInputAdornments(),
        TextFieldMargins()
      )
    }
  }

  private val component = ScalaComponent.builder[Props]("TextFieldsPage")
    .renderBackend[Backend]
    .build

  def apply(router: RouterCtl[Page]) = component(Props(router))
}
