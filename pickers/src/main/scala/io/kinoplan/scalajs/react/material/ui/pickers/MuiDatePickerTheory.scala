package io.kinoplan.scalajs.react.material.ui.pickers

import japgolly.scalajs.react.raw.React
import japgolly.scalajs.react.vdom.VdomNode
import japgolly.scalajs.react.{Children, JsComponent}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

object MuiDatePickerTheory {

  private val component = JsComponent[Props, Children.None, Null](RawComponent)

  def apply(
    value: ParsableDate,
    onChange: Handler1[js.Date],
    label: js.UndefOr[React.Node] = js.undefined
  )(otherProps: (String, js.Any)*)(children: VdomNode*) = {
    val p = props(
      value,
      onChange,
      label,
      otherProps: _*
    )
    component(p)//(children: _*)
  }

  private def props(
    value: ParsableDate,
    onChange: Handler1[js.Date],
    label: js.UndefOr[React.Node],
    otherProps: (String, js.Any)*
  ): Props = {
    val p = js.Dynamic.literal(
      value = value
    )
    onChange.foreach(p.updateDynamic("onChange")(_))
    label.foreach(p.updateDynamic("label")(_))
    addOtherProps(p, otherProps: _*)
    p.asInstanceOf[Props]
  }

  @js.native
  trait Props extends js.Object {
    var value: ParsableDate                      = js.native
    var onChange: Handler1[js.Date]              = js.native
    var label: js.UndefOr[React.Node]            = js.native
  }

  @JSImport("material-ui-pickers/DatePicker/DatePicker.js", JSImport.Default)
  @js.native
  private object RawComponent extends js.Object
}
