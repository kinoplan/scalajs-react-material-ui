package io.kinoplan.demo.components.demos.Buttons

import io.kinoplan.demo.components.ComponentContainer
import io.kinoplan.demo.styles.demos.Buttons.{DefaultIconLabelButtonsStyle, IconLabelButtonsStyle}
import io.kinoplan.scalajs.react.material.ui.core.{MuiButton, MuiIcon}
import io.kinoplan.scalajs.react.material.ui.icons.{MuiCloudUploadIcon, MuiDeleteIcon, MuiKeyboardVoiceIcon, MuiSaveIcon}
import japgolly.scalajs.react.vdom.all.{VdomElement, _}
import japgolly.scalajs.react.{BackendScope, ScalaComponent}
import scalacss.ScalaCssReactImplicits

object IconLabelButtons extends ScalaCssReactImplicits {
  case class Props(style: IconLabelButtonsStyle)

  class Backend(t: BackendScope[Props, Unit]) {
    def render(props: Props): VdomElement = {
      val css = props.style

      div(
        ComponentContainer("Buttons with icons and label")(
          div(
            MuiButton(variant = MuiButton.Variant.contained, color = MuiButton.Color.secondary)(css.common.marginButton,
              "Delete",
              MuiDeleteIcon()(css.rightIcon)
            ),
            MuiButton(variant = MuiButton.Variant.contained, color = MuiButton.Color.primary)(css.common.marginButton,
              "Send",
              MuiIcon()(css.rightIcon, "send")
            ),
            MuiButton(variant = MuiButton.Variant.contained, color = MuiButton.Color.default)(css.common.marginButton,
              "Upload",
              MuiCloudUploadIcon()(css.rightIcon)
            ),
            MuiButton(variant = MuiButton.Variant.contained, color = MuiButton.Color.secondary)(css.common.marginButton,
              disabled := true,
              MuiKeyboardVoiceIcon()(css.leftIcon),
              "Talk"
            ),
            MuiButton(variant = MuiButton.Variant.contained, size = MuiButton.Size.small)(css.common.marginButton,
              MuiSaveIcon()(css.leftIcon, css.iconSmall),
              "Save"
            )
          )
        )
      )
    }
  }

  private val component = ScalaComponent.builder[Props]("IconLabelButtons")
    .renderBackend[Backend]
    .build

  def apply(style: IconLabelButtonsStyle = DefaultIconLabelButtonsStyle) = component(Props(style))
}

