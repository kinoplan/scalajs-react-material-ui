package io.kinoplan.scalajs.react.material.ui.core

import com.payalabs.scalajs.react.bridge.{ReactBridgeComponent, WithProps}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

object Drawer extends ReactBridgeComponent with DrawerExtensions {
  override protected lazy val componentValue: js.Function = RawComponent

  @JSImport("@material-ui/core", "Drawer")
  @js.native
  object RawComponent extends js.Function

  def apply(
    anchor: Anchor.Value = Anchor.left,
    classes: Map[String, String] = Map.empty,
    elevation: Int = 16,
    ModalProps: js.Object = js.Object(),
    onClose: Option[js.Function] = None,
    open: Boolean = false,
    PaperProps: js.Object = js.Object(),
    SlideProps: js.Object = js.Object(),
    transitionDuration: Option[Int | js.Object] = None,
    variant: Variant.Value = Variant.temporary
  ): WithProps = auto
}

trait DrawerExtensions {
  object Anchor extends Enumeration {
    val left = Value("left")
    val top = Value("top")
    val right = Value("right")
    val bottom = Value("bottom")
  }

  object Variant extends Enumeration {
    val permanent = Value("permanent")
    val persistent = Value("persistent")
    val temporary = Value("temporary")
  }
}
