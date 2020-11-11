package io.kinoplan.demo.components.demos.Selects

import japgolly.scalajs.react.{BackendScope, ReactEventFromInput, ScalaComponent}
import japgolly.scalajs.react.vdom.all._
import scalacss.ScalaCssReactImplicits

import io.kinoplan.demo.components.{ComponentContainer, Layout}
import io.kinoplan.demo.styles.demos.Selects.{CustomizedSelectsStyle, DefaultCustomizedSelectsStyle}
import io.kinoplan.demo.utils.Helpers._
import io.kinoplan.scalajs.react.material.ui.core.{MuiFormControl, MuiInputBase, MuiInputLabel, MuiMenuItem, MuiNativeSelect, MuiSelect}

object CustomizedSelects extends ScalaCssReactImplicits {
  case class Props(style: CustomizedSelectsStyle)

  case class State(age: String = "") {
    def handleChangeAge(value: String) = copy(age = value)
  }

  class Backend(t: BackendScope[Props, State]) {
    def handleChangeAge(e: ReactEventFromInput) = {
      val value = e.target.value

      t.modState(_.handleChangeAge(value))
    }

    def render(props: Props, state: State): VdomElement = {
      val css = props.style

      val inputBaseClasses = Map(
        MuiInputBase.ClassKey.root -> styleAToClassName(css.bootstrapRoot),
        MuiInputBase.ClassKey.input -> stylesToClassName(
          Seq(css.bootstrapInput, css.bootstrapInputPaper(Layout.isPaletteLight))
        )
      )

      div(
        ComponentContainer("Customized selects")(
          form(css.root, autoComplete := "off",
            MuiFormControl()(css.marginStyle,
              MuiInputLabel()(css.bootstrapFormLabel, htmlFor := "age-customized-select", "Age"),
              MuiInputBase(classes = inputBaseClasses)
            ),
            MuiFormControl()(css.marginStyle,
              MuiInputLabel()(css.bootstrapFormLabel, htmlFor := "age-customized-select", "Age"),
              MuiSelect(
                input = MuiInputBase(classes = inputBaseClasses)(
                  name := "age",
                  id := "age-customized-select"
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
            MuiFormControl()(css.marginStyle,
              MuiInputLabel()(css.bootstrapFormLabel, htmlFor := "age-customized-native-simple", "Age"),
              MuiNativeSelect(
                input = MuiInputBase(classes = inputBaseClasses)(
                  name := "age",
                  id := "age-customized-native-simple"
                ).rawElement
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

  private val component = ScalaComponent.builder[Props]("CustomizedSelects")
    .initialState(State())
    .renderBackend[Backend]
    .build

  def apply(style: CustomizedSelectsStyle = DefaultCustomizedSelectsStyle) = component(Props(style))
}
