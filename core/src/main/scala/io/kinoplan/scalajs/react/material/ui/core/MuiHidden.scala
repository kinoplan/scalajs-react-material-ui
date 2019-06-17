package io.kinoplan.scalajs.react.material.ui.core

import com.payalabs.scalajs.react.bridge.{ReactBridgeComponent, WithProps}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

object MuiHidden extends ReactBridgeComponent with MuiHiddenExtensions {
  override protected lazy val componentValue: js.Function = RawComponent

  @JSImport("@material-ui/core", "Hidden")
  @js.native
  object RawComponent extends js.Function

  def apply(
    implementation: Implementation.Value = Implementation.js,
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
    xsUp: js.UndefOr[Boolean] = js.undefined,
  ): WithProps = auto
}

trait MuiHiddenExtensions {
  object Implementation extends Enumeration {
    val js = Value("js")
    val css = Value("css")
  }

  object Width extends Enumeration {
    val xs = Value("xs")
    val sm = Value("sm")
    val md = Value("md")
    val lg = Value("lg")
    val xl = Value("xl")
  }
}
