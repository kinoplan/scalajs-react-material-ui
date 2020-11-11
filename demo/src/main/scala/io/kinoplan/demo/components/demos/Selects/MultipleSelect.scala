package io.kinoplan.demo.components.demos.Selects

import scala.scalajs.js
import scala.scalajs.js.JSConverters._

import japgolly.scalajs.react.{BackendScope, ReactEventFromInput, ScalaComponent}
import japgolly.scalajs.react.raw.React
import japgolly.scalajs.react.vdom.Attr
import japgolly.scalajs.react.vdom.all._
import org.scalajs.dom.raw.HTMLSelectElement
import scalacss.ScalaCssReactImplicits

import io.kinoplan.demo.components.ComponentContainer
import io.kinoplan.demo.styles.demos.Selects.{DefaultMultipleSelectStyle, MultipleSelectStyle}
import io.kinoplan.demo.utils.props.{MuiMenuProps, MuiNativeInputProps, MuiPaperProps}
import io.kinoplan.scalajs.react.material.ui.core.{MuiCheckbox, MuiChip, MuiFormControl, MuiInput, MuiInputLabel, MuiListItemText, MuiMenuItem, MuiSelect}
import io.kinoplan.scalajs.react.material.ui.html.ReactEventFromMultipleSelect

object MultipleSelect extends ScalaCssReactImplicits {
  case class Props(style: MultipleSelectStyle)

  case class State(names: js.Array[String] = js.Array()) {
    def handleChange(value: js.Array[String]) = copy(names = value)
  }

  class Backend(t: BackendScope[Props, State]) {
    val ITEM_HEIGHT = 48

    val ITEM_PADDING_TOP = 8

    val MenuProps = MuiMenuProps(PaperProps = MuiPaperProps(
      style = js.Dictionary("maxHeight" -> s"${ITEM_HEIGHT * 4.5 + ITEM_PADDING_TOP}px", "width" -> "250px")
    ))

    val names = List(
      "Oliver Hansen",
      "Van Henry",
      "April Tucker",
      "Ralph Hubbard",
      "Omar Alexander",
      "Carlos Abbott",
      "Miriam Wagner",
      "Bradley Wilkerson",
      "Virginia Andrews",
      "Kelly Snyder"
    )

    def handleChange(e: ReactEventFromMultipleSelect) = {
      val value = e.target.value

      t.modState(_.handleChange(value))
    }

    def handleChangeMultiple(e: ReactEventFromInput) = {
      val select = e.target.asInstanceOf[HTMLSelectElement]

      val values = select.options.filter(_.selected).map(_.value).toJSArray

      t.modState(_.handleChange(values))
    }

    def checkboxRenderValue: js.Any => React.Node = values => {
      VdomNode(values.asInstanceOf[js.Array[String]].mkString(", ")).rawNode
    }

    def chipRenderValue: js.Any => React.Node = values => {
      val css = t.props.runNow().style

      div(css.chips,
        values.asInstanceOf[js.Array[String]].toVdomArray { value =>
          MuiChip(label = VdomNode(value))(css.chip, Attr("key") := value)
        }
      ).rawNode
    }

    def placeholderRenderValue: js.Any => React.Node = values => {
      val currentValues = values.asInstanceOf[js.Array[String]]

      if (currentValues.isEmpty) em("Placeholder").rawNode else VdomNode(currentValues.mkString(", ")).rawNode
    }

    def render(props: Props, state: State): VdomElement = {
      val css = props.style

      def getStyles(name: String) = {
        val fontWeight = if (state.names.contains(name)) {
          css.theme.typography.fontWeightMedium
        } else {
          css.theme.typography.fontWeightRegular
        }

        js.Dictionary("fontWeight" -> fontWeight)
      }

      div(
        ComponentContainer("Multiple Select")(
          div(css.root,
            MuiFormControl()(css.formControl,
              MuiInputLabel()(htmlFor := "select-multiple", "Name"),
              MuiSelect(multiple = true, input = MuiInput()(id := "select-multiple").rawElement, MenuProps = MenuProps)(
                value := state.names,
                onChange ==> handleChange,
                names.toVdomArray(name =>
                  MuiMenuItem()(style := getStyles(name), Attr("key") := name, value := name, name)
                )
              )
            ),
            MuiFormControl()(css.formControl,
              MuiInputLabel()(htmlFor := "select-multiple-checkbox", "Tag"),
              MuiSelect(
                multiple = true,
                input = MuiInput()(id := "select-multiple-checkbox").rawElement,
                MenuProps = MenuProps,
                renderValue = checkboxRenderValue
              )(
                value := state.names,
                onChange ==> handleChange,
                names.toVdomArray(name =>
                  MuiMenuItem()(
                    Attr("key") := name,
                    value := name,
                    MuiCheckbox()(checked := state.names.contains(name)),
                    MuiListItemText(primary = VdomNode(name))
                  )
                )
              )
            ),
            MuiFormControl()(css.formControl,
              MuiInputLabel()(htmlFor := "select-multiple-chip", "Chip"),
              MuiSelect(
                multiple = true,
                input = MuiInput()(id := "select-multiple-chip").rawElement,
                MenuProps = MenuProps,
                renderValue = chipRenderValue
              )(
                value := state.names,
                onChange ==> handleChange,
                names.toVdomArray(name =>
                  MuiMenuItem()(style := getStyles(name), Attr("key") := name, value := name, name)
                )
              )
            ),
            MuiFormControl()(css.formControl, css.noLabel,
              MuiSelect(
                multiple = true,
                displayEmpty = true,
                input = MuiInput()(id := "sselect-multiple-placeholder").rawElement,
                MenuProps = MenuProps,
                renderValue = placeholderRenderValue
              )(
                value := state.names,
                onChange ==> handleChange,
                MuiMenuItem()(disabled := true, value := "", em("Placeholder")),
                names.toVdomArray(name =>
                  MuiMenuItem()(style := getStyles(name), Attr("key") := name, value := name, name)
                )
              )
            ),
            MuiFormControl()(css.formControl,
              MuiInputLabel(shrink = true)(htmlFor := "select-multiple-native", "Native"),
              MuiSelect(
                multiple = true,
                native = true,
                inputProps = MuiNativeInputProps(id = Some("select-multiple-native"))
              )(
                value := state.names,
                onChange ==> handleChangeMultiple,
                names.toVdomArray(name =>
                  option(Attr("key") := name, value := name, name)
                )
              )
            )
          )
        )
      )
    }
  }

  private val component = ScalaComponent.builder[Props]("MultipleSelect")
    .initialState(State())
    .renderBackend[Backend]
    .build

  def apply(style: MultipleSelectStyle = DefaultMultipleSelectStyle) = component(Props(style))
}
