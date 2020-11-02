package io.kinoplan.demo.components.demos.TextFields

import cats.syntax.option._
import io.kinoplan.demo.components.ComponentContainer
import io.kinoplan.demo.styles.demos.TextFields.{DefaultInputAdornmentsStyle, InputAdornmentsStyle}
import io.kinoplan.demo.utils.Helpers.StringExtended
import io.kinoplan.demo.utils.props.MuiInputProps
import io.kinoplan.scalajs.react.material.ui.core.{MuiFormControl, MuiGrid, MuiInput, MuiInputAdornment, MuiInputLabel, MuiTextField}
import io.kinoplan.scalajs.react.material.ui.icons.MuiAccountCircleIcon
import japgolly.scalajs.react.vdom.all._
import japgolly.scalajs.react.{BackendScope, ScalaComponent}
import scalacss.ScalaCssReactImplicits

import scala.scalajs.js.JSConverters._

object InputWithIcon extends ScalaCssReactImplicits {
  case class Props(style: InputAdornmentsStyle)

  class Backend(t: BackendScope[Props, Unit]) {
    def render(props: Props): VdomElement = {
      val css = props.style

      div(
        ComponentContainer("Input Adornments - With icon")(
          div(css.root,
            MuiFormControl()(css.cssMargin,
              MuiInputLabel()(htmlFor := "input-with-icon-adornment", "With a start adornment"),
              MuiInput(startAdornment = MuiInputAdornment(position = MuiInputAdornment.Position.start)(
                MuiAccountCircleIcon()
              ))(
                id := "adornment-amount"
              )
            ),
            MuiTextField(
              label = "TextField".toVdom,
              InputProps = MuiInputProps(
                startAdornment = MuiInputAdornment(position = MuiInputAdornment.Position.start)(
                  MuiAccountCircleIcon()
                ).rawNode.some.orUndefined
              )
            )(css.cssMargin,
              id := "input-with-icon-textfield"
            ),
            div(css.cssMargin,
              MuiGrid(container = true, spacing = 8, alignItems = MuiGrid.AlignItems.flexEnd)(
                MuiGrid(item = true)(
                  MuiAccountCircleIcon()
                ),
                MuiGrid(item = true)(
                  MuiTextField(label = "With a grid".toVdom)(id := "input-with-icon-grid")
                )
              )
            )
          )
        )
      )
    }
  }

  private val component = ScalaComponent.builder[Props]("InputWithIcon")
    .renderBackend[Backend]
    .build

  def apply(style: InputAdornmentsStyle = DefaultInputAdornmentsStyle) = component(Props(style))
}
