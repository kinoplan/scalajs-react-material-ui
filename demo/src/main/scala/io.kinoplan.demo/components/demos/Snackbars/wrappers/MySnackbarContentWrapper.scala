package io.kinoplan.demo.components.demos.Snackbars.wrappers

import io.kinoplan.demo.styles.demos.Snackbars.{DefaultMySnackbarContentWrapperStyle, MySnackbarContentWrapperStyle}
import io.kinoplan.scalajs.react.material.ui.core.{MuiIconButton, MuiSnackbarContent}
import io.kinoplan.scalajs.react.material.ui.icons._
import japgolly.scalajs.react.vdom.Attr
import japgolly.scalajs.react.vdom.all._
import japgolly.scalajs.react.{BackendScope, Callback, ScalaComponent}
import scalacss.ScalaCssReactImplicits
import scalacss.internal.StyleA

import scala.scalajs.js

object MySnackbarContentWrapper extends ScalaCssReactImplicits {
  case class Props(
    className: js.UndefOr[StyleA],
    message: String,
    onCloseClick: js.UndefOr[Callback],
    variant: String,
    style: MySnackbarContentWrapperStyle
  )

  class Backend(t: BackendScope[Props, Unit]) {
    def variantIcon(variant: String) = {
      variant match {
        case "success" => MuiCheckCircleIcon()
        case "warning" => MuiWarningIcon()
        case "error" => MuiErrorIcon()
        case "info" => MuiInfoIcon()
        case _ => MuiInfoIcon()
      }
    }

    def render(props: Props): VdomElement = {
      val css = props.style

      val Icon = variantIcon(props.variant)

      val message = span(css.message, id := "client-snackbar",
        Icon(css.icon, css.iconVariant),
        props.message
      )

      val action = VdomNode(
        MuiIconButton(color = MuiIconButton.Color.inherit)(
          Attr("key") := "close",
          aria.label := "Close",
          onClick -->? props.onCloseClick,
          MuiCloseIcon()(css.icon)
        ).rawNode
      )

      val cssClassName = props.className.getOrElse(css.common.emptyStyle)

      MuiSnackbarContent(
        message = message,
        action = action
      )(css.get(props.variant), cssClassName,
        aria.describedBy := "client-snackbar"
      )
    }
  }

  private val component = ScalaComponent.builder[Props]("MySnackbarContentWrapper")
    .renderBackend[Backend]
    .build

  def apply(
    className: js.UndefOr[StyleA] = js.undefined,
    message: String,
    onCloseClick: js.UndefOr[Callback] = js.undefined,
    variant: String,
    style: MySnackbarContentWrapperStyle = DefaultMySnackbarContentWrapperStyle
  ) = component(Props(className, message, onCloseClick, variant, style))
}
