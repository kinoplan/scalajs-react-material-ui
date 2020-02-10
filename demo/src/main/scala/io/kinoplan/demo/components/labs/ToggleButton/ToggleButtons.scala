package io.kinoplan.demo.components.labs.ToggleButton

import io.kinoplan.demo.components.ComponentContainer
import io.kinoplan.demo.styles.labs.ToggleButton.{DefaultToggleButtonStyle, ToggleButtonStyle}
import io.kinoplan.scalajs.react.material.ui.core._
import io.kinoplan.scalajs.react.material.ui.icons._
import io.kinoplan.scalajs.react.material.ui.lab.{MuiToggleButton, MuiToggleButtonGroup}
import japgolly.scalajs.react.vdom.all.{VdomElement, _}
import japgolly.scalajs.react.{BackendScope, Callback, ScalaComponent}
import scalacss.ScalaCssReactImplicits

import scala.scalajs.js
import scala.scalajs.js.JSConverters._

object ToggleButtons extends ScalaCssReactImplicits {
  case class Props(style: ToggleButtonStyle)

  case class State(alignment: String = "left", formats: Array[String] = Array("bold", "italic")) {
    def handleAlignment(value: String) = if (value == alignment) copy(alignment = "") else copy(alignment = value)

    def handleFormat(value: String) = if (formats.contains(value)) {
      copy(formats = formats.filterNot(_ == value))
    } else copy(formats = formats :+ value)
  }

  class Backend(t: BackendScope[Props, State]) {
    def handleAlignment: (js.Object, String) => Callback = (_, value) => {
      t.modState(_.handleAlignment(value.toString))
    }

    def handleFormat: (js.Object, String) => Callback = (_, value) => {
      t.modState(_.handleFormat(value))
    }

    def render(props: Props, state: State): VdomElement = {
      val css = props.style

      div(
        ComponentContainer("Toggle Buttons")(
          MuiGrid(container = true, spacing = 16)(
            MuiGrid(item = true, xs = 12, sm = 6)(
              div(css.toggleContainer,
                MuiToggleButtonGroup(exclusive = true, onChange = handleAlignment)(
                  value := state.alignment,
                  MuiToggleButton()(value := "left", MuiFormatAlignLeftIcon()),
                  MuiToggleButton()(value := "center", MuiFormatAlignCenterIcon()),
                  MuiToggleButton()(value := "right", MuiFormatAlignRightIcon()),
                  MuiToggleButton()(value := "justify", disabled := true, MuiFormatAlignJustifyIcon())
                )
              ),
              MuiTypography(variant = MuiTypography.Variant.caption, gutterBottom = true)("Exclusive Selection"),
              MuiTypography(variant = MuiTypography.Variant.caption)(
                "Text justification toggle buttons present options for left, right, center, full, and\n " +
                "justified text with only one item available for selection at a time. Selecting one\n " +
                "option deselects any other."
              )
            ),
            MuiGrid(item = true, xs = 12, sm = 6)(
              div(css.toggleContainer,
                MuiToggleButtonGroup(exclusive = true, onChange = handleFormat)(
                  value := state.formats.toJSArray,
                  MuiToggleButton()(value := "bold", MuiFormatBoldIcon()),
                  MuiToggleButton()(value := "italic", MuiFormatItalicIcon()),
                  MuiToggleButton()(value := "underlined", MuiFormatUnderlinedIcon()),
                  MuiToggleButton()(value := "color", disabled := true,
                    MuiFormatColorFillIcon(),
                    MuiArrowDropDownIcon()
                  )
                )
              ),
              MuiTypography(variant = MuiTypography.Variant.caption, gutterBottom = true)("Multiple Selection"),
              MuiTypography(variant = MuiTypography.Variant.caption)(
                "Logically-grouped options, like Bold, Italic, and Underline, allow multiple options to\n " +
                "be selected."
              )
            )
          )
        )
      )
    }
  }

  private val component = ScalaComponent.builder[Props]("ToggleButtons")
    .initialState(State())
    .renderBackend[Backend]
    .build

  def apply(style: ToggleButtonStyle = DefaultToggleButtonStyle) = component(Props(style))
}
