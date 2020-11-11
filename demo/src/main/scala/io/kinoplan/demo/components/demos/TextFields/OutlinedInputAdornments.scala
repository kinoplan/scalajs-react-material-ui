package io.kinoplan.demo.components.demos.TextFields

import scala.scalajs.js.JSConverters._

import cats.syntax.option._
import japgolly.scalajs.react.{BackendScope, ReactEventFromTextArea, ScalaComponent}
import japgolly.scalajs.react.vdom.Attr
import japgolly.scalajs.react.vdom.all._
import scalacss.ScalaCssReactImplicits

import io.kinoplan.demo.components.ComponentContainer
import io.kinoplan.demo.models.TextFields.FieldRange
import io.kinoplan.demo.styles.demos.TextFields.{DefaultInputAdornmentsStyle, InputAdornmentsStyle}
import io.kinoplan.demo.utils.Helpers.StringExtended
import io.kinoplan.demo.utils.props.MuiInputProps
import io.kinoplan.scalajs.react.material.ui.core.{MuiIconButton, MuiInputAdornment, MuiMenuItem, MuiTextField}
import io.kinoplan.scalajs.react.material.ui.icons.{MuiIcons, MuiIconsModule}

object OutlinedInputAdornments extends ScalaCssReactImplicits {
  case class Props(style: InputAdornmentsStyle)

  case class State(
    amount: String = "",
    password: String = "",
    weight: String = "",
    weightRange: String = "",
    showPassword: Boolean = false
  ) {
    val showPasswordType = if (showPassword) "text" else "password"

    def handleChangeAmount(value: String) = copy(amount = value)

    def handleChangePassword(value: String) = copy(password = value)

    def handleChangeWeight(value: String) = copy(weight = value)

    def handleChangeWeightRange(value: String) = copy(weightRange = value)

    def handleClickShowPassword = copy(showPassword = !showPassword)
  }

  class Backend(t: BackendScope[Props, State]) {
    def handleChangeAmount(e: ReactEventFromTextArea) = {
      val value = e.target.value

      t.modState(_.handleChangeAmount(value))
    }

    def handleChangePassword(e: ReactEventFromTextArea) = {
      val value = e.target.value

      t.modState(_.handleChangePassword(value))
    }

    def handleChangeWeight(e: ReactEventFromTextArea) = {
      val value = e.target.value

      t.modState(_.handleChangeWeight(value))
    }

    def handleChangeWeightRange(e: ReactEventFromTextArea) = {
      val value = e.target.value

      t.modState(_.handleChangeWeightRange(value))
    }

    def handleClickShowPassword = t.modState(_.handleClickShowPassword)

    def render(props: Props, state: State): VdomElement = {
      val css = props.style

      val passwordEndAdormnent = {
        MuiInputAdornment(position = MuiInputAdornment.Position.end)(
          MuiIconButton()(
            aria.label := "Toggle password visibility",
            onClick --> handleClickShowPassword,
            if (state.showPassword) MuiIcons(MuiIconsModule.Visibility)() else MuiIcons(MuiIconsModule.VisibilityOff)()
          )
        )
      }

      div(
        ComponentContainer("Input Adornments - Outlined Input Adornments")(
          div(css.root,
            MuiTextField(
              label = "With outlined TextField".toVdom,
              variant = MuiTextField.Variant.outlined,
              InputProps = MuiInputProps(
                startAdornment = MuiInputAdornment(
                  position = MuiInputAdornment.Position.start
                )("Kg").rawNode.some.orUndefined
              )
            )(css.cssMargin, css.textField,
              id := "outlined-simple-start-adornment"
            ),
            MuiTextField(
              select = true,
              label = "With Select".toVdom,
              variant = MuiTextField.Variant.outlined,
              InputProps = MuiInputProps(
                startAdornment = MuiInputAdornment(
                  position = MuiInputAdornment.Position.start
                )("Kg").rawNode.some.orUndefined
              )
            )(css.cssMargin, css.textField,
              value := state.weightRange,
              onChange ==> handleChangeWeightRange,
              FieldRange.commons.toVdomArray { range =>
                MuiMenuItem()(Attr("key") := range.value, value := range.value, range.label)
              }
            ),
            MuiTextField(
              label = "Amount".toVdom,
              variant = MuiTextField.Variant.outlined,
              InputProps = MuiInputProps(
                startAdornment = MuiInputAdornment(
                  position = MuiInputAdornment.Position.start
                )("$").rawNode.some.orUndefined
              )
            )(css.cssMargin, css.textField,
              id := "outlined-adornment-amount",
              value := state.amount,
              onChange ==> handleChangeAmount
            ),
            MuiTextField(
              label = "Weight".toVdom,
              variant = MuiTextField.Variant.outlined,
              InputProps = MuiInputProps(
                startAdornment = MuiInputAdornment(
                  position = MuiInputAdornment.Position.start
                )("$").rawNode.some.orUndefined
              ),
              helperText = "Weight".toVdom
            )(css.cssMargin, css.textField,
              id := "outlined-adornment-weight",
              value := state.weight,
              onChange ==> handleChangeWeight
            ),
            MuiTextField(
              label = "Password".toVdom,
              variant = MuiTextField.Variant.outlined,
              InputProps = MuiInputProps(endAdornment = passwordEndAdormnent.rawNode.some.orUndefined)
            )(css.cssMargin, css.textField,
              id := "outlined-adornment-password",
              `type` := state.showPasswordType,
              value := state.password,
              onChange ==> handleChangePassword
            )
          )
        )
      )
    }
  }

  private val component = ScalaComponent.builder[Props]("OutlinedInputAdornments")
    .initialState(State())
    .renderBackend[Backend]
    .build

  def apply(style: InputAdornmentsStyle = DefaultInputAdornmentsStyle) = component(Props(style))
}
