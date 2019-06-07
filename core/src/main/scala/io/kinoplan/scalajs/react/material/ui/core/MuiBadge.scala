package io.kinoplan.scalajs.react.material.ui.core

import com.payalabs.scalajs.react.bridge.{ReactBridgeComponent, WithProps}
import japgolly.scalajs.react.vdom.VdomNode

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

object MuiBadge extends ReactBridgeComponent with MuiBadgeExtensions with JsWriterImplicits {
  override protected lazy val componentValue: js.Function = RawComponent

  @JSImport("@material-ui/core", "Badge")
  @js.native
  object RawComponent extends js.Function

  def apply(
    badgeContent: Option[VdomNode] = None,
    classes: Map[ClassKey.ClassKey, String] = Map.empty,
    color: Color.Value = Color.default,
    component: Option[String | js.Function] = Some("span"),
    invisible: Option[Boolean] = None,
    max: Int = 99,
    showZero: Boolean = false,
    variant: Variant.Value = Variant.standard
  ): WithProps = auto
}

trait MuiBadgeExtensions {
  object Color extends Enumeration {
    val default = Value("default")
    val primary = Value("primary")
    val secondary = Value("secondary")
    val error = Value("error")
  }

  object Variant extends Enumeration {
    val standard = Value("standard")
    val dot = Value("dot")
  }

  object ClassKey extends Enumeration {
    type ClassKey = String

    val root = "root"
    val badge = "badge"
    val colorPrimary = "colorPrimary"
    val colorSecondary = "colorSecondary"
    val colorError = "colorError"
    val invisible = "invisible"
    val dot = "dot"
  }
}
