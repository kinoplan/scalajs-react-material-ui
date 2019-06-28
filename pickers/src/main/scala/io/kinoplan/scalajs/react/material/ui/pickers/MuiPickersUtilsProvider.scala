package io.kinoplan.scalajs.react.material.ui.pickers

import com.payalabs.scalajs.react.bridge.{ReactBridgeComponent, WithProps}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

object MuiPickersUtilsProvider extends ReactBridgeComponent {
  override protected lazy val componentValue: js.Object = RawComponent

  @JSImport("material-ui-pickers/MuiPickersUtilsProvider.js", JSImport.Default)
  @js.native
  object RawComponent extends js.Object

  def apply(
    utils: js.Function,
    locale: js.UndefOr[js.Object | String] = js.undefined,
    moment: js.UndefOr[js.Function] = js.undefined
  ): WithProps = auto
}
