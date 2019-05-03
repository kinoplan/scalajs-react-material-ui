package io.kinoplan.scalajs.react.material.ui.core

import com.payalabs.scalajs.react.bridge.{ReactBridgeComponent, WithProps}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

object Hidden extends ReactBridgeComponent with HiddenExtensions {
  override protected lazy val componentValue: js.Function = RawComponent

  @JSImport("@material-ui/core", "Hidden")
  @js.native
  object RawComponent extends js.Function

  def apply(
    implementation: Implementation.Value = Implementation.js,
    initialWidth: Option[Width.Value] = None,
    lgDown: Boolean = false,
    lgUp: Boolean = false,
    mdDown: Boolean = false,
    mdUp: Boolean = false,
    only: Option[Width.Value | js.Array[Width.Value]] = None,
    smDown: Boolean = false,
    smUp: Boolean = false,
    xlDown: Boolean = false,
    xlUp: Boolean = false,
    xsDown: Boolean = false,
    xsUp: Boolean = false
  ): WithProps = auto
}

trait HiddenExtensions {
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
