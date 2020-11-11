package io.kinoplan.demo.components.demos.Buttons

import scala.scalajs.js

import japgolly.scalajs.react.{BackendScope, ScalaComponent}
import japgolly.scalajs.react.vdom.Attr
import japgolly.scalajs.react.vdom.all.{VdomElement, _}
import scalacss.ScalaCssReactImplicits

import io.kinoplan.demo.components.ComponentContainer
import io.kinoplan.demo.models.Buttons.Image
import io.kinoplan.demo.styles.demos.Buttons.{ButtonBasesStyle, DefaultButtonBasesStyle}
import io.kinoplan.scalajs.react.material.ui.core.{MuiButtonBase, MuiTypography}

object ButtonBases extends ScalaCssReactImplicits {
  case class Props(style: ButtonBasesStyle)

  class Backend(t: BackendScope[Props, Unit]) {
    def render(props: Props): VdomElement = {
      val css = props.style

      div(
        ComponentContainer("Complex Buttons")(
          div(css.root,
            Image.default.zipWithIndex.toVdomArray { case (image, index) =>
              MuiButtonBase(
                focusRipple = true,
                focusVisibleClassName = css.focusVisible.htmlClass
              )(css.image, style := js.Dictionary("width" -> image.width),
                Attr("key") := index,
                span(css.imageSrc, style := js.Dictionary("backgroundImage" -> s"url(${image.url})")),
                span(css.imageBackdrop),
                span(css.imageButton,
                  MuiTypography(
                    component = "span",
                    variant = MuiTypography.Variant.subtitle1,
                    color = MuiTypography.Color.inherit
                  )(css.imageTitle,
                    image.title,
                    span(css.imageMarked)
                  )
                )
              )
            }
          )
        )
      )
    }
  }

  private val component = ScalaComponent.builder[Props]("ButtonBases")
    .renderBackend[Backend]
    .build

  def apply(style: ButtonBasesStyle = DefaultButtonBasesStyle) = component(Props(style))
}
