package io.kinoplan.scalajs.react.material.ui.core

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

import japgolly.scalajs.react.vdom.html_<^._

import io.kinoplan.scalajs.react.bridge.{ReactBridgeComponent, WithProps}

object MuiNoSsr extends ReactBridgeComponent {
  override protected lazy val componentValue: js.Function = RawComponent

  @JSImport("@mui/material", "NoSsr")
  @js.native
  object RawComponent extends js.Function

  def apply(
    defer: js.UndefOr[Boolean] = js.undefined,
    fallback: js.UndefOr[VdomNode] = js.undefined
  ): WithProps = auto

}
