package io.kinoplan.scalajs.react.material.ui.core

import com.payalabs.scalajs.react.bridge.{ReactBridgeComponent, WithProps}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

object MuiAvatar extends ReactBridgeComponent with MuiAvatarExtensions {
  override protected lazy val componentValue: js.Function = RawComponent

  @JSImport("@material-ui/core", "Avatar")
  @js.native
  object RawComponent extends js.Function

  def apply(
    alt: Option[String] = None,
    classes: Map[ClassKey.ClassKey, String] = Map.empty,
    component: Option[String | js.Function] = Some("div"),
    imgProps: js.Object = js.Object(),
    sizes: Option[String] = None,
    src: Option[String] = None,
    srcSet: Option[String] = None
  ): WithProps = auto
}

trait MuiAvatarExtensions {
  object ClassKey extends Enumeration {
    type ClassKey = String

    val root = "root"
    val colorDefault = "colorDefault"
    val img = "img"
  }
}
