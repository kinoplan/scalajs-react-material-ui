package io.kinoplan.demo.components.demos.Avatar

import scala.scalajs.js.JSConverters.JSRichOption

import cats.implicits.catsSyntaxOptionId
import japgolly.scalajs.react.ScalaComponent
import japgolly.scalajs.react.vdom.all._
import scalacss.ScalaCssReactImplicits

import io.kinoplan.demo.components.ComponentContainer
import io.kinoplan.demo.styles.demos.Avatars.{BadgeAvatarsStyle, DefaultBadgeAvatarsStyle}
import io.kinoplan.demo.utils.Helpers.styleAToClassName
import io.kinoplan.scalajs.react.material.ui.core.{MuiAvatar, MuiBadge}
import io.kinoplan.scalajs.react.material.ui.core.internal.BadgeOrigin

object BadgeAvatars extends ScalaCssReactImplicits {
  case class Props(style: BadgeAvatarsStyle)

  private val component = ScalaComponent.builder[Props]
    .render_P { props =>
      val css = props.style
      val badgeOrigin = BadgeOrigin(vertical = "bottom", horizontal = "right")

      val dotBadgeClasses = Map(
        MuiBadge.ClassKey.badge -> styleAToClassName(css.badge)
      ).some.orUndefined

      val avatarBadgeClasses = Map(
        MuiAvatar.ClassKey.root -> styleAToClassName(css.avatarBadge)
      ).some.orUndefined

      div(
        ComponentContainer("With badge")(
          div(css.root,
            MuiBadge(
              overlap = MuiBadge.Overlap.circle,
              variant = MuiBadge.Variant.dot,
              anchorOrigin = badgeOrigin,
              classes = dotBadgeClasses
            )(css.avatar,
              MuiAvatar()(alt := "Remy Sharp", src := "/static/images/avatar/1.jpg")
            ),
            MuiBadge(
              overlap = MuiBadge.Overlap.circle,
              anchorOrigin = badgeOrigin,
              badgeContent = VdomNode(
                MuiAvatar(classes = avatarBadgeClasses)(
                  alt := "Remy Sharp",
                  src := "/static/images/avatar/1.jpg"
                ).rawNode
              )
            )(css.avatar,
              MuiAvatar()(alt := "Travis Howard", src := "/static/images/avatar/2.jpg")
            )
          )
        )
      )
    }
    .build

  def apply(style: BadgeAvatarsStyle = DefaultBadgeAvatarsStyle) = component(Props(style))
}
