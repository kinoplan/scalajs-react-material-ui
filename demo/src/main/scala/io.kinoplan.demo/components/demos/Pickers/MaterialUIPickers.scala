package io.kinoplan.demo.components.demos.Pickers

import io.kinoplan.demo.components.ComponentContainer
import io.kinoplan.demo.styles.demos.Pickers.{DefaultPickersStyle, PickersStyle}
import io.kinoplan.scalajs.react.material.ui.core.MuiGrid
import io.kinoplan.scalajs.react.material.ui.pickers.{DateFnsUtils, MuiDateTimePicker, MuiPickersUtilsProvider}
import japgolly.scalajs.react.vdom.all._
import japgolly.scalajs.react.{BackendScope, Callback, ScalaComponent}
import scalacss.ScalaCssReactImplicits

import scala.scalajs.js

object MaterialUIPickers extends ScalaCssReactImplicits {
  case class Props(style: PickersStyle)

  case class State(selectedDate: js.Date = new js.Date("2018-01-01T00:00:00.000Z")) {
    def handleDateChange(value: js.Date) = copy(selectedDate = value)
  }

  class Backend(t: BackendScope[Props, State]) {
    def handleDateChange: js.Date => Callback = date => {
      t.modState(_.handleDateChange(date))
    }

    def render(props: Props, state: State): VdomElement = {
      val css = props.style

      div(
        ComponentContainer("Material Ui Date & Time pickers")(
          MuiPickersUtilsProvider(utils = DateFnsUtils)(
            MuiGrid(container = true, justify = MuiGrid.Justify.spaceAround)(css.grid,
              MuiDateTimePicker(
                autoOk = true,
                ampm = false,
                disableFuture = true,
                onChange = handleDateChange,
                label = Some("24h clock")
              )(
                value := state.selectedDate
              )
//              MuiDatePicker(
//                onChange = handleDateChange,
//                //label = Some("Date picker"),
//                //value = state.selectedDate
//              )(
//                Attr("value") := state.selectedDate,
////                defaultValue := "2017-05-24",
//                margin := "normal"
//              )
            )
          )
        )
      )
    }
  }

  private val component = ScalaComponent.builder[Props]("MaterialUIPickers")
    .initialState(State())
    .renderBackend[Backend]
    .build

  def apply(style: PickersStyle = DefaultPickersStyle) = component(Props(style))
}
