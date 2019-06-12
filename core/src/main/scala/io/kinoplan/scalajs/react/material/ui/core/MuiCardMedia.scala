package io.kinoplan.scalajs.react.material.ui.core

import com.payalabs.scalajs.react.bridge.{ReactBridgeComponent, WithPropsNoChildren}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

object MuiCardMedia extends ReactBridgeComponent with MuiCardMediaExtensions {
  override protected lazy val componentValue: js.Function = RawComponent

  @JSImport("@material-ui/core", "CardMedia")
  @js.native
  object RawComponent extends js.Function

  def apply(
    classes: Map[ClassKey.ClassKey, String] = Map.empty,
    component: OptComponentPropType = "div",
    image: Option[String] = None,
    src: Option[String] = None
  ): WithPropsNoChildren = autoNoChildren
}

trait MuiCardMediaExtensions {
  object ClassKey extends Enumeration {
    type ClassKey = String

    val root = "root"
    val media = "media"
  }
}
