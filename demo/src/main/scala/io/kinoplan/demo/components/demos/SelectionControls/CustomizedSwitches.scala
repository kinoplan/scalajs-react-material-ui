package io.kinoplan.demo.components.demos.SelectionControls

import japgolly.scalajs.react.{BackendScope, ReactEventFromInput, ScalaComponent}
import japgolly.scalajs.react.vdom.all._
import scalacss.ScalaCssReactImplicits

import io.kinoplan.demo.components.ComponentContainer
import io.kinoplan.demo.styles.demos.SelectionControls.{CustomizedSwitchesStyle, DefaultCustomizedSwitchesStyle}
import io.kinoplan.demo.utils.Helpers.styleAToClassName
import io.kinoplan.scalajs.react.material.ui.core.{MuiFormControlLabel, MuiFormGroup, MuiSwitch}

object CustomizedSwitches extends ScalaCssReactImplicits {
  case class Props(style: CustomizedSwitchesStyle)

  case class State(checkedA: Boolean = true, checkedB: Boolean = true) {
    def handleChangeCheckedA(value: Boolean) = copy(checkedA = value)

    def handleChangeCheckedB(value: Boolean) = copy(checkedB = value)
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

    def render(props: Props, state: State): VdomElement = {
      val css = props.style

      val customClasses = Map(
        MuiSwitch.ClassKey.switchBase -> styleAToClassName(css.colorSwitchBase),
        MuiSwitch.ClassKey.checked -> styleAToClassName(css.colorChecked),
        MuiSwitch.ClassKey.bar -> styleAToClassName(css.colorBar)
      )

      val iOSClasses = Map(
        MuiSwitch.ClassKey.switchBase -> styleAToClassName(css.iOSSwitchBase),
        MuiSwitch.ClassKey.bar -> styleAToClassName(css.iOSBar),
        MuiSwitch.ClassKey.icon -> styleAToClassName(css.iOSIcon),
        MuiSwitch.ClassKey.iconChecked -> styleAToClassName(css.iOSIconChecked),
        MuiSwitch.ClassKey.checked -> styleAToClassName(css.iOSChecked)
      )

      div(
        ComponentContainer("Customized Switches")(
          MuiFormGroup(row = true)(
            MuiFormControlLabel(
              control = MuiSwitch(classes = customClasses)(
                checked := state.checkedA,
                value := "checkedA",
                onChange ==> handleChangeCheckedA
              ).rawElement,
              label = VdomNode("Custom color")
            ),
            MuiFormControlLabel(
              control = MuiSwitch(classes = iOSClasses, disableRipple = true)(
                checked := state.checkedB,
                value := "checkedB",
                onChange ==> handleChangeCheckedB
              ).rawElement,
              label = VdomNode("iOS style")
            )
          )
        )
      )
    }
  }

  private val component = ScalaComponent.builder[Props]("CustomizedSwitches")
    .initialState(State())
    .renderBackend[Backend]
    .build

  def apply(style: CustomizedSwitchesStyle = DefaultCustomizedSwitchesStyle) = component(Props(style))
}
