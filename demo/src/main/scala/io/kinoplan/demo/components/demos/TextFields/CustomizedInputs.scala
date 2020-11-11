package io.kinoplan.demo.components.demos.TextFields

import scala.scalajs.js

import japgolly.scalajs.react.{BackendScope, ScalaComponent}
import japgolly.scalajs.react.vdom.all._
import scalacss.ScalaCssReactImplicits

import io.kinoplan.demo.components.{ComponentContainer, Layout}
import io.kinoplan.demo.styles.demos.TextFields.{CustomizedInputsStyle, DefaultCustomizedInputsStyle}
import io.kinoplan.demo.utils.Helpers._
import io.kinoplan.demo.utils.props.{MuiInputLabelProps, MuiInputProps}
import io.kinoplan.scalajs.react.material.ui.core.{MuiFormControl, MuiInput, MuiInputBase, MuiInputLabel, MuiTextField, colors}
import io.kinoplan.scalajs.react.material.ui.core.styles._

object CustomizedInputs extends ScalaCssReactImplicits {
  case class Props(style: CustomizedInputsStyle)

  class Backend(t: BackendScope[Props, Unit]) {
    def render(props: Props): VdomElement = {
      val css = props.style

      val standardLabelClasses = Map(
        MuiInputLabel.ClassKey.root -> styleAToClassName(css.cssLabel),
        MuiInputLabel.ClassKey.focused -> styleAToClassName(css.cssFocused),
      )

      val standardInputClasses = Map(
        MuiInput.ClassKey.underline -> styleAToClassName(css.cssUnderline)
      )

      val inputLabelProps = MuiInputLabelProps(classes = js.Dynamic.literal(
        root = styleAToClassName(css.cssLabel),
        focused = styleAToClassName(css.cssFocused)
      ))

      val inputProps = MuiInputProps(classes = js.Dynamic.literal(
        root = styleAToClassName(css.cssOutlinedInput),
        focused = styleAToClassName(css.cssFocused),
        notchedOutline = styleAToClassName(css.notchedOutline)
      ))

      val theme = createMuiTheme(ThemeOptions(
        palette = PaletteOptions(
          primary = colors.green
        ),
        typography = TypographyOptions(
          useNextVariants = true
        )
      ))

      val inputBaseClasses = Map(
        MuiInputBase.ClassKey.root -> styleAToClassName(css.bootstrapRoot),
        MuiInputBase.ClassKey.input -> stylesToClassName(
          Seq(css.bootstrapInput, css.bootstrapInputPaper(Layout.isPaletteLight))
        )
      )

      div(
        ComponentContainer("Customized inputs")(
          div(css.root,
            MuiFormControl()(css.cssMargin,
              MuiInputLabel(classes = standardLabelClasses)(htmlFor := "custom-css-standard-input", "Custom CSS"),
              MuiInput(classes = standardInputClasses)(id := "custom-css-standard-input")
            ),
            MuiTextField(
              InputLabelProps = inputLabelProps,
              InputProps = inputProps,
              label = "Custom CSS".toVdom,
              variant = MuiTextField.Variant.outlined
            )(css.cssMargin,
              id := "custom-css-outlined-input"
            ),
            MuiThemeProvider(theme = theme)(
              MuiTextField(label = "MuiThemeProvider".toVdom)(css.cssMargin,
                id := "mui-theme-provider-standard-input"
              ),
              MuiTextField(label = "MuiThemeProvider".toVdom, variant = MuiTextField.Variant.outlined)(css.cssMargin,
                id := "mui-theme-provider-outlined-input"
              )
            ),
            MuiFormControl()(css.cssMargin,
              MuiInputLabel(shrink = true)(css.bootstrapFormLabel, htmlFor := "bootstrap-input", "Bootstrap"),
              MuiInputBase(classes = inputBaseClasses)(
                id := "bootstrap-input",
                defaultValue := "react-bootstrap"
              )
            ),
            MuiInputBase()(css.cssMargin, defaultValue := "Naked input")
          )
        )
      )
    }
  }

  private val component = ScalaComponent.builder[Props]("CustomizedInputs")
    .renderBackend[Backend]
    .build

  def apply(style: CustomizedInputsStyle = DefaultCustomizedInputsStyle) = component(Props(style))
}
