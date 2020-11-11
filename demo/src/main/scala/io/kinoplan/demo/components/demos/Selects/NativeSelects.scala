package io.kinoplan.demo.components.demos.Selects

import japgolly.scalajs.react.{BackendScope, ReactDOM, ReactEventFromInput, ScalaComponent}
import japgolly.scalajs.react.vdom.Attr
import japgolly.scalajs.react.vdom.all._
import org.scalajs.dom.{Element, document}
import scalacss.ScalaCssReactImplicits

import io.kinoplan.demo.components.ComponentContainer
import io.kinoplan.demo.styles.demos.Selects.{DefaultSelectStyle, SelectStyle}
import io.kinoplan.demo.utils.props.MuiNativeInputProps
import io.kinoplan.scalajs.react.material.ui.core.{MuiFilledInput, MuiFormControl, MuiFormHelperText, MuiInput, MuiInputLabel, MuiNativeSelect, MuiOutlinedInput, MuiSelect}

object NativeSelects extends ScalaCssReactImplicits {
  case class Props(style: SelectStyle)

  case class State(
    age: String = "",
    name: String = "hai",
    labelWidth: Int = 0
  ) {
    def handleChangeAge(value: String) = copy(age = value)

    def handleChangeName(value: String) = copy(name = value)

    def setLabelWidth(element: Element) = {
      val offsetWidthO = ReactDOM.findDOMNode(element).map(_.asHtml().offsetWidth.toInt)

      offsetWidthO.map(offsetWidth =>
        copy(labelWidth = offsetWidth)
      ).getOrElse(this)
    }
  }

  class Backend(t: BackendScope[Props, State]) {
    val inputRefId = "outlined-age-native-simple-ref"

    def inputRef = document.getElementById(inputRefId)

    def mount = {
      t.modState(_.setLabelWidth(inputRef))
    }

    def handleChangeAge(e: ReactEventFromInput) = {
      val value = e.target.value

      t.modState(_.handleChangeAge(value))
    }

    def handleChangeName(e: ReactEventFromInput) = {
      val value = e.target.value

      t.modState(_.handleChangeName(value))
    }

    def render(props: Props, state: State): VdomElement = {
      val css = props.style

      div(
        ComponentContainer("Native Select")(
          form(css.root, autoComplete := "off",
            MuiFormControl()(css.formControl,
              MuiInputLabel()(htmlFor := "age-native-simple", "Age"),
              MuiSelect(native = true, inputProps = MuiNativeInputProps(
                name = Some("age"),
                id = Some("age-native-simple")
              ))(
                value := state.age,
                onChange ==> handleChangeAge,
                option(value := ""),
                option(value := "10", "Ten"),
                option(value := "20", "Twenty"),
                option(value := "30", "Thirty")
              )
            ),
            MuiFormControl()(css.formControl,
              MuiInputLabel()(htmlFor := "age-native-helper", "Age"),
              MuiNativeSelect(input = MuiInput()(name := "age", id := "age-native-helper").rawElement)(
                value := state.age,
                onChange ==> handleChangeAge,
                option(value := ""),
                option(value := "10", "Ten"),
                option(value := "20", "Twenty"),
                option(value := "30", "Thirty")
              ),
              MuiFormHelperText()("Some important helper text")
            ),
            MuiFormControl()(css.formControl,
              MuiNativeSelect()(css.selectEmpty,
                value := state.age,
                onChange ==> handleChangeAge,
                name := "age",
                option(value := "", "None"),
                option(value := "10", "Ten"),
                option(value := "20", "Twenty"),
                option(value := "30", "Thirty")
              ),
              MuiFormHelperText()("Without label")
            ),
            MuiFormControl()(css.formControl,
              MuiInputLabel(shrink = true)(htmlFor := "age-native-label-placeholder", "Age"),
              MuiNativeSelect(input = MuiInput()(
                  name := "age",
                  id := "age-native-label-placeholder"
                ).rawElement
              )(css.selectEmpty,
                value := state.age,
                onChange ==> handleChangeAge,
                name := "age",
                option(value := "", "None"),
                option(value := "10", "Ten"),
                option(value := "20", "Twenty"),
                option(value := "30", "Thirty")
              ),
              MuiFormHelperText()("Label + placeholder")
            ),
            MuiFormControl()(css.formControl,
              disabled := true,
              MuiInputLabel()(htmlFor := "name-disabled", "Name"),
              MuiNativeSelect(input = MuiInput()(name := "name", id := "name-native-disabled").rawElement)(
                value := state.name,
                onChange ==> handleChangeName,
                option(value := ""),
                optgroup(Attr("label") := "Author",
                  option(value := "hai", "Hai"),
                ),
                optgroup(Attr("label") := "Contributors",
                  option(value := "olivier", "Olivier"),
                  option(value := "kevin", "Kevin")
                )
              ),
              MuiFormHelperText()("Disabled")
            ),
            MuiFormControl(error = true)(css.formControl,
              MuiInputLabel()(htmlFor := "name-native-error", "Name"),
              MuiNativeSelect(input = MuiInput()(id := "name-native-error").rawElement)(
                value := state.name,
                onChange ==> handleChangeName,
                name := "name",
                option(value := ""),
                optgroup(Attr("label") := "Author",
                  option(value := "hai", "Hai"),
                ),
                optgroup(Attr("label") := "Contributors",
                  option(value := "olivier", "Olivier"),
                  option(value := "kevin", "Kevin")
                )
              ),
              MuiFormHelperText()("Error")
            ),
            MuiFormControl()(css.formControl,
              MuiInputLabel()(htmlFor := "uncontrolled-native", "Name"),
              MuiNativeSelect(input = MuiInput()(id := "uncontrolled-native", name := "name").rawElement)(
                defaultValue := "30",
                option(value := ""),
                option(value := "10", "Ten"),
                option(value := "20", "Twenty"),
                option(value := "30", "Thirty")
              ),
              MuiFormHelperText()("Uncontrolled")
            ),
            MuiFormControl()(css.formControl,
              MuiNativeSelect()(css.selectEmpty,
                value := state.age,
                onChange ==> handleChangeAge,
                name := "age",
                option(value := "", disabled := true, "Placeholder"),
                option(value := "10", "Ten"),
                option(value := "20", "Twenty"),
                option(value := "30", "Thirty")
              ),
              MuiFormHelperText()("Placeholder")
            ),
            MuiFormControl()(css.formControl,
              required := true,
              MuiInputLabel()(htmlFor := "age-native-required", "Age"),
              MuiSelect(
                native = true,
                inputProps = MuiNativeInputProps(id = Some("age-native-required"))
              )(css.selectEmpty,
                value := state.age,
                onChange ==> handleChangeAge,
                name := "age",
                option(value := ""),
                option(value := "10", "Ten"),
                option(value := "20", "Twenty"),
                option(value := "30", "Thirty")
              ),
              MuiFormHelperText()("Required")
            ),
            MuiFormControl(variant = MuiFormControl.Variant.outlined)(css.formControl,
              MuiInputLabel()(id := inputRefId, htmlFor := "outlined-age-native-simple", "Age"),
              MuiSelect(
                native = true,
                input = MuiOutlinedInput(labelWidth = state.labelWidth)(
                  name := "age",
                  id := "outlined-age-native-simple"
                ).rawElement
              )(
                value := state.age,
                onChange ==> handleChangeAge,
                option(value := ""),
                option(value := "10", "Ten"),
                option(value := "20", "Twenty"),
                option(value := "30", "Thirty")
              )
            ),
            MuiFormControl(variant = MuiFormControl.Variant.filled)(css.formControl,
              MuiInputLabel()(htmlFor := "filled-age-native-simple", "Age"),
              MuiSelect(
                native = true,
                input = MuiFilledInput()(name := "age", id := "filled-age-native-simple").rawElement
              )(
                value := state.age,
                onChange ==> handleChangeAge,
                option(value := ""),
                option(value := "10", "Ten"),
                option(value := "20", "Twenty"),
                option(value := "30", "Thirty")
              )
            )
          )
        )
      )
    }
  }

  private val component = ScalaComponent.builder[Props]("NativeSelects")
    .initialState(State())
    .renderBackend[Backend]
    .componentDidMount(_.backend.mount)
    .build

  def apply(style: SelectStyle = DefaultSelectStyle) = component(Props(style))
}
