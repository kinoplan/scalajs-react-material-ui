package io.kinoplan.demo.components.demos.SelectionControls

import scala.scalajs.js.JSConverters._

import cats.syntax.option._
import japgolly.scalajs.react.{BackendScope, ReactEventFromInput, ScalaComponent}
import japgolly.scalajs.react.vdom.all._
import scalacss.ScalaCssReactImplicits

import io.kinoplan.demo.components.ComponentContainer
import io.kinoplan.demo.styles.demos.SelectionControls.{CustomControlStyle, DefaultCustomControlStyle}
import io.kinoplan.demo.utils.Helpers.{StringExtended, styleAToClassName}
import io.kinoplan.scalajs.react.material.ui.core.{MuiCheckbox, MuiFormControlLabel, MuiFormGroup}
import io.kinoplan.scalajs.react.material.ui.icons.{MuiIcons, MuiIconsModule}

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
      ).some.orUndefined

      div(
        ComponentContainer("Checkbox Labels")(
          MuiFormGroup(row = true)(
            MuiFormControlLabel(
              control = MuiCheckbox()(
                checked := state.checkedA,
                value := "checkedA",
                onChange ==> handleChangeCheckedA
              ).rawElement,
              label = "Secondary".toVdom
            ),
            MuiFormControlLabel(
              control = MuiCheckbox(color = MuiCheckbox.Color.primary)(
                checked := state.checkedB,
                value := "checkedB",
                onChange ==> handleChangeCheckedB
              ).rawElement,
              label = "Primary".toVdom
            ),
            MuiFormControlLabel(
              control = MuiCheckbox()(value := "checkedC").rawElement,
              label = "Uncontrolled".toVdom
            ),
            MuiFormControlLabel(
              control = MuiCheckbox()(value := "checkedD").rawElement,
              label = "Disabled".toVdom
            )(disabled := true),
            MuiFormControlLabel(
              control = MuiCheckbox()(checked := true, value := "checkedE").rawElement,
              label = "Disabled".toVdom
            )(disabled := true),
            MuiFormControlLabel(
              control = MuiCheckbox(indeterminate = true)(
                checked := state.checkedF,
                value := "checkedF",
                onChange ==> handleChangeCheckedF
              ).rawElement,
              label = "Indeterminate".toVdom
            ),
            MuiFormControlLabel(
              control = MuiCheckbox(classes = controlClasses)(
                checked := state.checkedG,
                value := "checkedG",
                onChange ==> handleChangeCheckedG
              ).rawElement,
              label = "Custom color".toVdom
            ),
            MuiFormControlLabel(
              control = MuiCheckbox(
                icon = MuiIcons(MuiIconsModule.FavoriteBorder)()(),
                checkedIcon = MuiIcons(MuiIconsModule.Favorite)()()
              )(value := "checkedH").rawElement,
              label = "Custom icon".toVdom
            ),
            MuiFormControlLabel(
              control = MuiCheckbox(
                icon = MuiIcons(MuiIconsModule.CheckBoxOutlineBlank)(fontSize = MuiIcons.FontSize.small)(),
                checkedIcon = MuiIcons(MuiIconsModule.Favorite)(fontSize = MuiIcons.FontSize.small)()
              )(value := "checkedI").rawElement,
              label = "Custom size".toVdom
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
