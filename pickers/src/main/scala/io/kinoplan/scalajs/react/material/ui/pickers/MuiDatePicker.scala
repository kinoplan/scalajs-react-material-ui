package io.kinoplan.scalajs.react.material.ui.pickers

import com.payalabs.scalajs.react.bridge.{ReactBridgeComponent, _}
import japgolly.scalajs.react.vdom.VdomNode

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

object MuiDatePicker extends ReactBridgeComponent with JsWriterImplicits with MuiDatePickerExtensions {
  override protected lazy val componentValue: js.Object = RawComponent

  @JSImport("material-ui-pickers/DatePicker/DatePicker.js", JSImport.Default)
  @js.native
  object RawComponent extends js.Function

  def apply(
//    adornmentPosition: js.UndefOr[AdornmentPosition.Value] = js.undefined,
//    allowKeyboardControl: js.UndefOr[Boolean] = js.undefined,
//    ampm: js.UndefOr[Boolean] = js.undefined,
//    animateYearScrolling: js.UndefOr[Boolean] = js.undefined,
//    autoOk: js.UndefOr[Boolean] = js.undefined,
//    cancelLabel: Option[VdomNode] = None,
//    clearable: js.UndefOr[Boolean] = js.undefined,
//    clearLabel: Option[VdomNode] = None,
//    disableFuture: js.UndefOr[Boolean] = js.undefined,
//    disableOpenOnEnter: js.UndefOr[Boolean] = js.undefined,
//    disablePast: js.UndefOr[Boolean] = js.undefined,
//    emptyLabel: js.UndefOr[String] = js.undefined,
//    format: js.UndefOr[String] = js.undefined,
//    initialFocusedDate: OptParsableDate = js.undefined,
//    InputAdornmentProps: js.Object = js.Object(),
//    invalidDateMessage: Option[VdomNode] = None,
//    invalidLabel: js.UndefOr[String] = js.undefined,
//    keepCharPositions: js.UndefOr[Boolean] = js.undefined,
//    keyboard: js.UndefOr[Boolean] = js.undefined,
//    KeyboardButtonProps: js.Object = js.Object(),
//    keyboardIcon: Option[VdomNode] = None,
//    labelFunc: js.UndefOr[js.Function2[js.Any, String, String]] = js.undefined,
//    leftArrowIcon: Option[VdomNode] = None,
//    mask: js.UndefOr[String] = js.undefined,
    maxDate: OptParsableDate = js.undefined,
    maxDateMessage: Option[VdomNode] = None,
    minDate: OptParsableDate = js.undefined,
    minDateMessage: Option[VdomNode] = None,
    okLabel: Option[VdomNode] = None,
    onChange: Handler1[js.Date] = js.undefined,
    //onClose: OptJsFun0 = js.undefined,
    onMonthChange: Handler1[js.Any] = js.undefined,
   // onOpen: OptJsFun0 = js.undefined,
    onYearChange: Handler1[js.Any] = js.undefined,
    openTo: js.UndefOr[OpenTo.Value] = js.undefined,
    openToYearSelection: js.UndefOr[Boolean] = js.undefined,
    renderDay: js.UndefOr[js.Function] = js.undefined,
    rightArrowIcon: Option[VdomNode] = None,
    shouldDisableDate: js.UndefOr[js.Function1[js.Any, Boolean]] = js.undefined,
    showTodayButton: js.UndefOr[Boolean] = js.undefined,
    todayLabel: Option[VdomNode] = None,
    label: Option[VdomNode] = None,
    //defaultValue: OptParsableDate,
    //value: ParsableDate,
    views: js.UndefOr[Views.Value] = js.undefined
  ): WithProps = auto
}

trait MuiDatePickerExtensions {
  object AdornmentPosition extends Enumeration {
    type Value = String

    val start = "start"
    val end = "end"
  }

  object OpenTo extends Enumeration {
    type Value = String

    val year = "year"
    val month = "month"
    val day = "day"
  }

  object Views extends Enumeration {
    type Value = String

    val year = "year"
    val month = "month"
    val day = "day"
  }
}
