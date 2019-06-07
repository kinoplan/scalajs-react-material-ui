package io.kinoplan.scalajs.react.material.ui.core

import com.payalabs.scalajs.react.bridge.{ReactBridgeComponent, WithProps}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

object MuiDrawer extends ReactBridgeComponent with MuiDrawerExtensions with JsWriterImplicits {
  override protected lazy val componentValue: js.Function = RawComponent

  @JSImport("@material-ui/core", "Drawer")
  @js.native
  object RawComponent extends js.Function

  def apply(
    anchor: Anchor.Value = Anchor.left,
    classes: Map[ClassKey.ClassKey, String] = Map.empty,
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

trait MuiDrawerExtensions extends JsWriterImplicits {

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

  object ClassKey extends Enumeration {
    type ClassKey = String

    val root = "root"
    val docked = "docked"
    val paper = "paper"
    val paperAnchorLeft = "paperAnchorLeft"
    val paperAnchorRight = "paperAnchorRight"
    val paperAnchorTop = "paperAnchorTop"
    val paperAnchorBottom = "paperAnchorBottom"
    val paperAnchorDockedLeft = "paperAnchorDockedLeft"
    val paperAnchorDockedTop = "paperAnchorDockedTop"
    val paperAnchorDockedRight = "paperAnchorDockedRight"
    val paperAnchorDockedBottom = "paperAnchorDockedBottom"
    val modal = "modal"
  }
}
