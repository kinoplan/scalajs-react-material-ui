package io.kinoplan.scalajs.react.material.ui.core

import com.payalabs.scalajs.react.bridge.{ReactBridgeComponent, WithProps}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

object MuiPaper extends ReactBridgeComponent with MuiPaperExtensions {
  override protected lazy val componentValue: js.Function = RawComponent

  @JSImport("@material-ui/core", "Paper")
  @js.native
  object RawComponent extends js.Function

  def apply(
    classes: Map[ClassKey.ClassKey, String] = Map.empty,
    component: Option[String | js.Function] = Some("div"),
    elevation: Int = 2,
    square: Boolean = false
  ): WithProps = auto
}

trait MuiPaperExtensions {
  object ClassKey extends Enumeration {
    type ClassKey = String

    val root = "root"
    val rounded = "rounded"
    val elevation0 = "elevation0"
    val elevation1 = "elevation1"
    val elevation2 = "elevation2"
    val elevation3 = "elevation3"
    val elevation4 = "elevation4"
    val elevation5 = "elevation5"
    val elevation6 = "elevation6"
    val elevation7 = "elevation7"
    val elevation8 = "elevation8"
    val elevation9 = "elevation9"
    val elevation10 = "elevation10"
    val elevation11 = "elevation11"
    val elevation12 = "elevation12"
    val elevation13 = "elevation13"
    val elevation14 = "elevation14"
    val elevation15 = "elevation15"
    val elevation16 = "elevation16"
    val elevation17 = "elevation17"
    val elevation18 = "elevation18"
    val elevation19 = "elevation19"
    val elevation20 = "elevation20"
    val elevation21 = "elevation21"
    val elevation22 = "elevation22"
    val elevation23 = "elevation23"
    val elevation24 = "elevation24"
  }
}
