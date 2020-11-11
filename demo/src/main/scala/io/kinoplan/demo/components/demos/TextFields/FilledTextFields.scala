package io.kinoplan.demo.components.demos.TextFields

import scala.scalajs.js

import japgolly.scalajs.react.{BackendScope, ReactEventFromTextArea, ScalaComponent}
import japgolly.scalajs.react.vdom.Attr
import japgolly.scalajs.react.vdom.all._
import scalacss.ScalaCssReactImplicits

import io.kinoplan.demo.components.ComponentContainer
import io.kinoplan.demo.models.TextFields.Currency
import io.kinoplan.demo.styles.demos.TextFields.{DefaultVariantTextFieldsStyle, VariantTextFieldsStyle}
import io.kinoplan.demo.utils.Helpers.StringExtended
import io.kinoplan.demo.utils.props.{MuiInputLabelProps, MuiInputProps, MuiMenuProps, MuiSelectProps}
import io.kinoplan.scalajs.react.material.ui.core.{MuiMenuItem, MuiTextField}

object FilledTextFields extends ScalaCssReactImplicits {
  case class Props(style: VariantTextFieldsStyle)

  case class State(
    name: String = "Cat in the Hat",
    age: String = "",
    multiline: String = "Controlled",
    currency: String = "EUR"
  ) {
    def handleChangeName(value: String) = copy(name = value)

    def handleChangeAge(value: String) = copy(age = value)

    def handleChangeMultiline(value: String) = copy(multiline = value)

    def handleChangeCurrency(value: String) = copy(currency = value)
  }

  class Backend(t: BackendScope[Props, State]) {
    def handleChangeName(e: ReactEventFromTextArea) = {
      val value = e.target.value

      t.modState(_.handleChangeName(value))
    }

    def handleChangeAge(e: ReactEventFromTextArea) = {
      val value = e.target.value

      t.modState(_.handleChangeAge(value))
    }

    def handleChangeMultiline(e: ReactEventFromTextArea) = {
      val value = e.target.value

      t.modState(_.handleChangeMultiline(value))
    }

    def handleChangeCurrency(e: ReactEventFromTextArea) = {
      val value = e.target.value

      t.modState(_.handleChangeCurrency(value))
    }

    def render(props: Props, state: State): VdomElement = {
      val css = props.style

      div(
        ComponentContainer("Filled")(
          form(css.container, noValidate := true, autoComplete := "off",
            MuiTextField(
              label = "Name".toVdom,
              margin = MuiTextField.Margin.normal,
              variant = MuiTextField.Variant.filled
            )(css.textField,
              id := "filled-name",
              value := state.name,
              onChange ==> handleChangeName
            ),
            MuiTextField(
              label = "Uncontrolled".toVdom,
              margin = MuiTextField.Margin.normal,
              variant = MuiTextField.Variant.filled
            )(css.textField,
              id := "filled-uncontrolled",
              defaultValue := "foo"
            ),
            MuiTextField(
              label = "Required".toVdom,
              margin = MuiTextField.Margin.normal,
              variant = MuiTextField.Variant.filled
            )(css.textField,
              required := true,
              id := "filled-required",
              defaultValue := "Hello World"
            ),
            MuiTextField(
              error = true,
              label = "Error".toVdom,
              margin = MuiTextField.Margin.normal,
              variant = MuiTextField.Variant.filled
            )(css.textField,
              id := "filled-error",
              defaultValue := "Hello World"
            ),
            MuiTextField(
              label = "Disabled".toVdom,
              margin = MuiTextField.Margin.normal,
              variant = MuiTextField.Variant.filled
            )(css.textField,
              disabled := true,
              id := "filled-disabled",
              defaultValue := "Hello World"
            ),
            MuiTextField(
              label = "Email".toVdom,
              margin = MuiTextField.Margin.normal,
              variant = MuiTextField.Variant.filled
            )(css.textField,
              autoComplete := "email",
              id := "filled-email-input",
              `type` := "email",
              name := "email"
            ),
            MuiTextField(
              label = "Password".toVdom,
              margin = MuiTextField.Margin.normal,
              variant = MuiTextField.Variant.filled
            )(css.textField,
              autoComplete := "current-password",
              id := "filled-password-input",
              `type` := "password"
            ),
            MuiTextField(
              label = "Read Only".toVdom,
              margin = MuiTextField.Margin.normal,
              InputProps = MuiInputProps(readOnly = true),
              variant = MuiTextField.Variant.filled
            )(css.textField,
              id := "filled-read-only-input",
              defaultValue := "Hello World"
            ),
            MuiTextField(
              label = "Dense".toVdom,
              margin = MuiTextField.Margin.dense,
              variant = MuiTextField.Variant.filled
            )(css.textField, css.dense,
              id := "filled-dense"
            ),
            MuiTextField(
              label = "Multiline".toVdom,
              multiline = true,
              rowsMax = 4,
              margin = MuiTextField.Margin.normal,
              helperText = "hello".toVdom,
              variant = MuiTextField.Variant.filled
            )(css.textField,
              id := "filled-multiline-flexible",
              value := state.multiline,
              onChange ==> handleChangeMultiline
            ),
            MuiTextField(
              label = "Multiline".toVdom,
              multiline = true,
              rows = 4,
              margin = MuiTextField.Margin.normal,
              variant = MuiTextField.Variant.filled
            )(css.textField,
              id := "filled-multiline-static",
              defaultValue := "Default Value"
            ),
            MuiTextField(
              label = "Helper text".toVdom,
              helperText = "Some important text".toVdom,
              margin = MuiTextField.Margin.normal,
              variant = MuiTextField.Variant.filled
            )(css.textField,
              id := "filled-helperText",
              defaultValue := "Default Value"
            ),
            MuiTextField(
              label = "With placeholder".toVdom,
              margin = MuiTextField.Margin.normal,
              variant = MuiTextField.Variant.filled
            )(css.textField,
              id := "filled-with-placeholder",
              placeholder := "Placeholder"
            ),
            MuiTextField(
              label = "With placeholder multiline".toVdom,
              multiline = true,
              margin = MuiTextField.Margin.normal,
              variant = MuiTextField.Variant.filled
            )(css.textField,
              id := "filled-textarea",
              placeholder := "Placeholder"
            ),
            MuiTextField(
              label = "Number".toVdom,
              InputLabelProps = MuiInputLabelProps(shrink = true),
              margin = MuiTextField.Margin.normal,
              variant = MuiTextField.Variant.filled
            )(css.textField,
              id := "filled-number",
              value := state.age,
              `type` := "number",
              onChange ==> handleChangeAge
            ),
            MuiTextField(
              label = "Search field".toVdom,
              margin = MuiTextField.Margin.normal,
              variant = MuiTextField.Variant.filled
            )(css.textField,
              id := "filled-search",
              `type` := "search"
            ),
            MuiTextField(
              select = true,
              label = "Select".toVdom,
              InputLabelProps = MuiInputLabelProps(shrink = true),
              SelectProps = MuiSelectProps(MenuProps = MuiMenuProps(className = css.menu.htmlClass)),
              helperText = "Please select your currency".toVdom,
              margin = MuiTextField.Margin.normal,
              variant = MuiTextField.Variant.filled
            )(css.textField,
              id := "filled-select-currency",
              value := state.currency,
              onChange ==> handleChangeCurrency,
              Currency.commons.toVdomArray { option =>
                MuiMenuItem()(Attr("key") := option.value, value := option.value, option.label)
              }
            ),
            MuiTextField(
              select = true,
              label = "Native select".toVdom,
              SelectProps = MuiSelectProps(native = true, MenuProps = MuiMenuProps(className = css.menu.htmlClass)),
              helperText = "Please select your currency".toVdom,
              margin = MuiTextField.Margin.normal,
              variant = MuiTextField.Variant.filled
            )(css.textField,
              id := "filled-select-currency-native",
              value := state.currency,
              onChange ==> handleChangeCurrency,
              Currency.commons.toVdomArray { currency =>
                option(key := currency.value, value := currency.value, currency.label)
              }
            ),
            MuiTextField(
              label = "Label".toVdom,
              InputLabelProps = MuiInputLabelProps(shrink = true),
              helperText = "Full width!".toVdom,
              fullWidth = true,
              margin = MuiTextField.Margin.normal,
              variant = MuiTextField.Variant.filled
            )(
              id := "filled-full-width",
              style := js.Dictionary("margin" -> "8px"),
              placeholder := "Placeholder"
            ),
            MuiTextField(
              margin = MuiTextField.Margin.normal,
              variant = MuiTextField.Variant.filled
            )(css.textField,
              id := "filled-bare",
              defaultValue := "Bare"
            )
          )
        )
      )
    }
  }

  private val component = ScalaComponent.builder[Props]("FilledTextFields")
    .initialState(State())
    .renderBackend[Backend]
    .build

  def apply(style: VariantTextFieldsStyle = DefaultVariantTextFieldsStyle) = component(Props(style))
}
