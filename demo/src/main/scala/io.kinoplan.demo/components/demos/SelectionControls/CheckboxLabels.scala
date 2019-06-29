package io.kinoplan.demo.components.demos.SelectionControls

import io.kinoplan.demo.components.ComponentContainer
import io.kinoplan.demo.styles.demos.SelectionControls.{CustomControlStyle, DefaultCustomControlStyle}
import io.kinoplan.demo.utils.Helpers.styleAToClassName
import io.kinoplan.scalajs.react.material.ui.core.{MuiCheckbox, MuiFormControlLabel, MuiFormGroup}
import io.kinoplan.scalajs.react.material.ui.icons.{MuiCheckBoxOutlineBlankIcon, MuiFavoriteBorderIcon, MuiFavoriteIcon}
import japgolly.scalajs.react.vdom.all._
import japgolly.scalajs.react.{BackendScope, ReactEventFromInput, ScalaComponent}
import scalacss.ScalaCssReactImplicits

object CheckboxLabels extends ScalaCssReactImplicits {
  case class Props(style: CustomControlStyle)

  case class State(
    checkedA: Boolean = true,
    checkedB: Boolean = true,
    checkedF: Boolean = true,
    checkedG: Boolean = true
  ) {
    def handleChangeCheckedA(value: Boolean) = copy(checkedA = value)

    def handleChangeCheckedB(value: Boolean) = copy(checkedB = value)

    def handleChangeCheckedF(value: Boolean) = copy(checkedF = value)

    def handleChangeCheckedG(value: Boolean) = copy(checkedG = value)
  }

  class Backend(t: BackendScope[Props, State]) {
    def handleChangeCheckedA(e: ReactEventFromInput) = {
      val value = e.target.checked

      t.modState(_.handleChangeCheckedA(value))
    }

    def handleChangeCheckedB(e: ReactEventFromInput) = {
      val value = e.target.checked

      t.modState(_.handleChangeCheckedB(value))
    }

    def handleChangeCheckedF(e: ReactEventFromInput) = {
      val value = e.target.checked

      t.modState(_.handleChangeCheckedF(value))
    }

    def handleChangeCheckedG(e: ReactEventFromInput) = {
      val value = e.target.checked

      t.modState(_.handleChangeCheckedG(value))
    }

    def render(props: Props, state: State): VdomElement = {
      val css = props.style

      val controlClasses = Map(
        MuiCheckbox.ClassKey.root -> styleAToClassName(css.root),
        MuiCheckbox.ClassKey.checked -> styleAToClassName(css.checked)
      )

      div(
        ComponentContainer("Checkbox Labels")(
          MuiFormGroup(row = true)(
            MuiFormControlLabel(
              control = Some(
                MuiCheckbox()(
                  checked := state.checkedA,
                  value := "checkedA",
                  onChange ==> handleChangeCheckedA
                ).rawElement
              ),
              label = Some("Secondary")
            ),
            MuiFormControlLabel(
              control = Some(
                MuiCheckbox(color = MuiCheckbox.Color.primary)(
                  checked := state.checkedB,
                  value := "checkedB",
                  onChange ==> handleChangeCheckedB
                ).rawElement
              ),
              label = Some("Primary")
            ),
            MuiFormControlLabel(
              control = Some(MuiCheckbox()(value := "checkedC").rawElement),
              label = Some("Uncontrolled")
            ),
            MuiFormControlLabel(
              control = Some(MuiCheckbox()(value := "checkedD").rawElement),
              label = Some("Disabled")
            )(disabled := true),
            MuiFormControlLabel(
              control = Some(MuiCheckbox()(checked := true, value := "checkedE").rawElement),
              label = Some("Disabled")
            )(disabled := true),
            MuiFormControlLabel(
              control = Some(
                MuiCheckbox(indeterminate = true)(
                  checked := state.checkedF,
                  value := "checkedF",
                  onChange ==> handleChangeCheckedF
                ).rawElement
              ),
              label = Some("Indeterminate")
            ),
            MuiFormControlLabel(
              control = Some(
                MuiCheckbox(classes = controlClasses)(
                  checked := state.checkedG,
                  value := "checkedG",
                  onChange ==> handleChangeCheckedG
                ).rawElement
              ),
              label = Some("Custom color")
            ),
            MuiFormControlLabel(
              control = Some(
                MuiCheckbox(
                  icon = Some(MuiFavoriteBorderIcon()),
                  checkedIcon = Some(MuiFavoriteIcon())
                )(value := "checkedH").rawElement
              ),
              label = Some("Custom icon")
            ),
            MuiFormControlLabel(
              control = Some(
                MuiCheckbox(
                  icon = Some(MuiCheckBoxOutlineBlankIcon(fontSize = MuiCheckBoxOutlineBlankIcon.FontSize.small)),
                  checkedIcon = Some(MuiFavoriteIcon(fontSize = MuiFavoriteIcon.FontSize.small))
                )(value := "checkedI").rawElement
              ),
              label = Some("Custom size")
            )
          )
        )
      )
    }
  }

  private val component = ScalaComponent.builder[Props]("CheckboxLabels")
    .initialState(State())
    .renderBackend[Backend]
    .build

  def apply(style: CustomControlStyle = DefaultCustomControlStyle) = component(Props(style))
}
