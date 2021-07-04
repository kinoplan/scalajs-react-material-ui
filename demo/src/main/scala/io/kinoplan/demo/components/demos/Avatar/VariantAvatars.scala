package io.kinoplan.demo.components.demos.Avatar

import japgolly.scalajs.react.ScalaComponent
import japgolly.scalajs.react.vdom.all._
import scalacss.ScalaCssReactImplicits

import io.kinoplan.demo.components.ComponentContainer
import io.kinoplan.demo.styles.demos.Avatars.{DefaultVariantAvatarsStyle, VariantAvatarsStyle}
import io.kinoplan.scalajs.react.material.ui.core.MuiAvatar
import io.kinoplan.scalajs.react.material.ui.icons.{MuiIcons, MuiIconsModule}

object VariantAvatars extends ScalaCssReactImplicits {
  case class Props(style: VariantAvatarsStyle)

  private val component = ScalaComponent.builder[Props]
    .render_P { props =>
      val css = props.style

      div(
        ComponentContainer("Variants")(
          div(css.root,
            MuiAvatar(variant = MuiAvatar.Variant.square)(css.avatar, css.square, "N"),
            MuiAvatar(variant = MuiAvatar.Variant.rounded)(css.avatar, css.rounded,
              MuiIcons(MuiIconsModule.Assignment)()
            )
          )
        )
      )
    }
    .build

  def apply(style: VariantAvatarsStyle = DefaultVariantAvatarsStyle) = component(Props(style))
}
