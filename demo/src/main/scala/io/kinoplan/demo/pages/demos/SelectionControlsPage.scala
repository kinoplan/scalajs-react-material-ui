package io.kinoplan.demo.pages.demos

import japgolly.scalajs.react._
import japgolly.scalajs.react.extra.router.RouterCtl
import japgolly.scalajs.react.vdom.all._

import io.kinoplan.demo.components.demos.SelectionControls._
import io.kinoplan.demo.router.AppRouter.Page

object SelectionControlsPage {
  case class Props(router: RouterCtl[Page])

  class Backend(t: BackendScope[Props, Unit]) {
    def render(props: Props): VdomElement = {
      div(
        RadioButtonsGroup(),
        RadioButtons(),
        Checkboxes(),
        CheckboxLabels(),
        CheckboxesGroup(),
        Switches(),
        SwitchLabels(),
        SwitchesGroup(),
        CustomizedSwitches(),
        FormControlLabelPosition()
      )
    }
  }

  private val component = ScalaComponent.builder[Props]("SelectionControlsPage")
    .renderBackend[Backend]
    .build

  def apply(router: RouterCtl[Page]) = component(Props(router))
}
