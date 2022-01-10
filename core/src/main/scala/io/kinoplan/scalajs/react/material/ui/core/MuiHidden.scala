package io.kinoplan.scalajs.react.material.ui.core

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

import io.kinoplan.scalajs.react.bridge.{ReactBridgeComponent, WithProps}

object MuiHidden extends ReactBridgeComponent with MuiHiddenExtensions {
  override protected lazy val componentValue: js.Function = RawComponent

  @JSImport("@mui/material", "Hidden")
  @js.native
  object RawComponent extends js.Function

  def apply(
    implementation: js.UndefOr[Implementation.Value] = js.undefined,
    initialWidth: js.UndefOr[Width.Value] = js.undefined,
    lgDown: js.UndefOr[Boolean] = js.undefined,
    lgUp: js.UndefOr[Boolean] = js.undefined,
    mdDown: js.UndefOr[Boolean] = js.undefined,
    mdUp: js.UndefOr[Boolean] = js.undefined,
    only: js.UndefOr[Width.Value | js.Array[Width.Value]] = js.undefined,
    smDown: js.UndefOr[Boolean] = js.undefined,
    smUp: js.UndefOr[Boolean] = js.undefined,
    xlDown: js.UndefOr[Boolean] = js.undefined,
    xlUp: js.UndefOr[Boolean] = js.undefined,
    xsDown: js.UndefOr[Boolean] = js.undefined,
    xsUp: js.UndefOr[Boolean] = js.undefined
  ): WithProps = auto

}

trait MuiHiddenExtensions {

  object Implementation extends Enumeration {
    type Value = String

    val js = "js"
    val css = "css"
  }

  object Width extends Enumeration {
    type Value = String

    val xs = "xs"
    val sm = "sm"
    val md = "md"
    val lg = "lg"
    val xl = "xl"
  }

}
