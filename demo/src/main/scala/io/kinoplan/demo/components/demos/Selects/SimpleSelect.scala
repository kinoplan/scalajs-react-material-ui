package io.kinoplan.demo.components.demos.Selects

import scala.scalajs.js

import japgolly.scalajs.react.{BackendScope, ReactDOM, ReactEventFromInput, ScalaComponent}
import japgolly.scalajs.react.raw.React
import japgolly.scalajs.react.vdom.all._
import org.scalajs.dom.{Element, document}
import scalacss.ScalaCssReactImplicits

import io.kinoplan.demo.components.ComponentContainer
import io.kinoplan.demo.styles.demos.Selects.{DefaultSelectStyle, SelectStyle}
import io.kinoplan.demo.utils.props.MuiNativeInputProps
import io.kinoplan.scalajs.react.material.ui.core.{MuiFilledInput, MuiFormControl, MuiFormHelperText, MuiInput, MuiInputLabel, MuiMenuItem, MuiOutlinedInput, MuiSelect}

object SimpleSelect extends ScalaCssReactImplicits {
  case class Props(style: SelectStyle)

  case class State(
    age: String = "",
    name: String = "hai",
    labelWidth: Int = 0
  ) {
    def handleChangeAge(value: String) = copy(age = value)

    def handleChangeName(value: String) = copy(name = value)

    def setLabelWidth(element: Element) = {
      val offsetWidth = ReactDOM.findDOMNode(element).map(_.asHtml().offsetWidth.toInt).getOrElse(0)

      copy(labelWidth = offsetWidth)
    }
  }

  class Backend(t: BackendScope[Props, State]) {
    val inputRefId = "outlined-age-simple-ref"

    def inputRef = document.getElementById(inputRefId)

    def mount = t.modState(_.setLabelWidth(inputRef))

    def handleChangeAge(e: ReactEventFromInput) = {
      val value = e.target.value

      t.modState(_.handleChangeAge(value))
    }

    def handleChangeName(e: ReactEventFromInput) = {
      val value = e.target.value

      t.modState(_.handleChangeName(value))
    }

    def selectRenderValue: js.Any => React.Node = value => {
      VdomNode(s"⚠️  - $value").rawNode
    }

    def render(props: Props, state: State): VdomElement = {
      val css = props.style

      div(
        ComponentContainer("Simple Select")(
          form(css.root, autoComplete := "off",
            MuiFormControl()(css.formControl,
              MuiInputLabel()(htmlFor := "age-simple", "Age"),
              MuiSelect(inputProps = MuiNativeInputProps(
                name = Some("age"),
                id = Some("age-simple")
              ))(
                value := state.age,
                onChange ==> handleChangeAge,
                MuiMenuItem()(value := "", em("None")),
                MuiMenuItem()(value := "10", "Ten"),
                MuiMenuItem()(value := "20", "Twenty"),
                MuiMenuItem()(value := "30", "Thirty")
              )
            ),
            MuiFormControl()(css.formControl,
              MuiInputLabel()(htmlFor := "age-helper", "Age"),
              MuiSelect(input = MuiInput()(name := "age", id := "age-helper").rawElement)(
                value := state.age,
                onChange ==> handleChangeAge,
                MuiMenuItem()(value := "", em("None")),
                MuiMenuItem()(value := "10", "Ten"),
                MuiMenuItem()(value := "20", "Twenty"),
                MuiMenuItem()(value := "30", "Thirty")
              ),
              MuiFormHelperText()("Some important helper text")
            ),
            MuiFormControl()(css.formControl,
              MuiSelect(displayEmpty = true)(css.selectEmpty,
                value := state.age,
                onChange ==> handleChangeAge,
                name := "age",
                MuiMenuItem()(value := "", em("None")),
                MuiMenuItem()(value := "10", "Ten"),
                MuiMenuItem()(value := "20", "Twenty"),
                MuiMenuItem()(value := "30", "Thirty")
              ),
              MuiFormHelperText()("Without label")
            ),
            MuiFormControl()(css.formControl,
              MuiInputLabel(shrink = true)(htmlFor := "age-label-placeholder", "Age"),
              MuiSelect(
                displayEmpty = true,
                input = MuiInput()(name := "age", id := "age-label-placeholder").rawElement
              )(css.selectEmpty,
                value := state.age,
                onChange ==> handleChangeAge,
                name := "age",
                MuiMenuItem()(value := "", em("None")),
                MuiMenuItem()(value := "10", "Ten"),
                MuiMenuItem()(value := "20", "Twenty"),
                MuiMenuItem()(value := "30", "Thirty")
              ),
              MuiFormHelperText()("Label + placeholder")
            ),
            MuiFormControl()(css.formControl,
              disabled := true,
              MuiInputLabel()(htmlFor := "name-disabled", "Name"),
              MuiSelect(input = MuiInput()(name := "name", id := "name-disabled").rawElement)(
                value := state.name,
                onChange ==> handleChangeName,
                MuiMenuItem()(value := "", em("None")),
                MuiMenuItem()(value := "hai", "Hai"),
                MuiMenuItem()(value := "olivier", "Olivier"),
                MuiMenuItem()(value := "kevin", "Kevin")
              ),
              MuiFormHelperText()("Disabled")
            ),
            MuiFormControl(error = true)(css.formControl,
              MuiInputLabel()(htmlFor := "name-error", "Name"),
              MuiSelect(
                input = MuiInput()(id := "name-error").rawElement,
                renderValue = selectRenderValue
              )(
                value := state.name,
                onChange ==> handleChangeName,
                name := "name",
                MuiMenuItem()(value := "", em("None")),
                MuiMenuItem()(value := "hai", "Hai"),
                MuiMenuItem()(value := "olivier", "Olivier"),
                MuiMenuItem()(value := "kevin", "Kevin")
              ),
              MuiFormHelperText()("Error")
            ),
            MuiFormControl()(css.formControl,
              MuiInputLabel()(htmlFor := "name-readonly", "Name"),
              MuiSelect(input = MuiInput()(id := "name-readonly", name := "name", readOnly := true).rawElement)(
                value := state.name,
                onChange ==> handleChangeName,
                MuiMenuItem()(value := "", em("None")),
                MuiMenuItem()(value := "hai", "Hai"),
                MuiMenuItem()(value := "olivier", "Olivier"),
                MuiMenuItem()(value := "kevin", "Kevin")
              ),
              MuiFormHelperText()("Read only")
            ),
            MuiFormControl()(css.formControl,
              MuiInputLabel()(htmlFor := "age-auto-width", "Age"),
              MuiSelect(
                input = MuiInput()(id := "age-auto-width", name := "age").rawElement,
                autoWidth = true
              )(
                value := state.age,
                onChange ==> handleChangeAge,
                MuiMenuItem()(value := "", em("None")),
                MuiMenuItem()(value := "10", "Ten"),
                MuiMenuItem()(value := "20", "Twenty"),
                MuiMenuItem()(value := "30", "Thirty")
              ),
              MuiFormHelperText()("Auto width")
            ),
            MuiFormControl()(css.formControl,
              MuiSelect(displayEmpty = true)(css.selectEmpty,
                value := state.age,
                onChange ==> handleChangeAge,
                name := "age",
                MuiMenuItem()(value := "", disabled := true, "Placeholder"),
                MuiMenuItem()(value := "10", "Ten"),
                MuiMenuItem()(value := "20", "Twenty"),
                MuiMenuItem()(value := "30", "Thirty")
              ),
              MuiFormHelperText()("Placeholder")
            ),
            MuiFormControl()(css.formControl,
              required := true,
              MuiInputLabel()(htmlFor := "age-required", "Age"),
              MuiSelect(inputProps = MuiNativeInputProps(id = Some("age-required")))(css.selectEmpty,
                value := state.age,
                onChange ==> handleChangeAge,
                name := "age",
                MuiMenuItem()(value := "", em("None")),
                MuiMenuItem()(value := "10", "Ten"),
                MuiMenuItem()(value := "20", "Twenty"),
                MuiMenuItem()(value := "30", "Thirty")
              ),
              MuiFormHelperText()("Required")
            ),
            MuiFormControl(variant = MuiFormControl.Variant.outlined)(css.formControl,
              MuiInputLabel()(id := inputRefId, htmlFor := "outlined-age-simple", "Age"),
              MuiSelect(
                input = MuiOutlinedInput(labelWidth = state.labelWidth)(
                  name := "age",
                  id := "outlined-age-simple"
                ).rawElement
              )(
                value := state.age,
                onChange ==> handleChangeAge,
                MuiMenuItem()(value := "", em("None")),
                MuiMenuItem()(value := "10", "Ten"),
                MuiMenuItem()(value := "20", "Twenty"),
                MuiMenuItem()(value := "30", "Thirty")
              )
            ),
            MuiFormControl(variant = MuiFormControl.Variant.filled)(css.formControl,
              MuiInputLabel()(htmlFor := "filled-age-simple", "Age"),
              MuiSelect(input = MuiFilledInput()(name := "age", id := "filled-age-simple").rawElement)(
                value := state.age,
                onChange ==> handleChangeAge,
                MuiMenuItem()(value := "", em("None")),
                MuiMenuItem()(value := "10", "Ten"),
                MuiMenuItem()(value := "20", "Twenty"),
                MuiMenuItem()(value := "30", "Thirty")
              )
            )
          )
        )
      )
    }
  }

  private val component = ScalaComponent.builder[Props]("SimpleSelect")
    .initialState(State())
    .renderBackend[Backend]
    .componentDidMount(_.backend.mount)
    .build

  def apply(style: SelectStyle = DefaultSelectStyle) = component(Props(style))
}
