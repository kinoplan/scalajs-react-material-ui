package io.kinoplan.scalajs.react.material.ui.core

import com.payalabs.scalajs.react.bridge.{ReactBridgeComponent, WithPropsNoChildren}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

object MuiCardContent extends ReactBridgeComponent with MuiCardContentExtensions {
  override protected lazy val componentValue: js.Function = RawComponent

  @JSImport("@material-ui/core", "CardContent")
  @js.native
  object RawComponent extends js.Function

  def apply(
    classes: Map[ClassKey.ClassKey, String] = Map.empty,
    component: Option[String | js.Function] = Some("div")
  ): WithPropsNoChildren = autoNoChildren
}

trait MuiCardContentExtensions {
  object ClassKey extends Enumeration {
    type ClassKey = String

    val root = "root"
  }
}
