package io.kinoplan.demo.components.demos.Cards

import japgolly.scalajs.react.{BackendScope, ScalaComponent}
import japgolly.scalajs.react.vdom.all.{VdomElement, _}
import scalacss.ScalaCssReactImplicits

import io.kinoplan.demo.components.ComponentContainer
import io.kinoplan.demo.styles.demos.Cards.{DefaultMediaControlCardStyle, MediaControlCardStyle}
import io.kinoplan.scalajs.react.material.ui.core._
import io.kinoplan.scalajs.react.material.ui.core.styles.Direction
import io.kinoplan.scalajs.react.material.ui.icons.{MuiIcons, MuiIconsModule}

object MediaControlCard extends ScalaCssReactImplicits {
  case class Props(style: MediaControlCardStyle)

  class Backend(t: BackendScope[Props, Unit]) {
    def render(props: Props): VdomElement = {
      val css = props.style

      div(
        ComponentContainer("UI Controls")(
          MuiCard()(css.card,
            div(css.details,
              MuiCardContent()(css.content,
                MuiTypography(component = "h5", variant = MuiTypography.Variant.h5)(
                  "Live From Space"
                ),
                MuiTypography(variant = MuiTypography.Variant.subtitle1, color = MuiTypography.Color.textSecondary)(
                  "Mac Miller"
                )
              ),
              div(css.controls,
                MuiIconButton()(
                  aria.label := "Previous",
                  if (css.theme.direction == Direction.rtl) {
                    MuiIcons(MuiIconsModule.SkipNext)()
                  } else {
                    MuiIcons(MuiIconsModule.SkipPrevious)()
                  }
                ),
                MuiIconButton()(
                  aria.label := "Play/pause",
                  MuiIcons(MuiIconsModule.PlayArrow)()(css.playIcon)
                ),
                MuiIconButton()(
                  aria.label := "Next",
                  if (css.theme.direction == Direction.rtl) {
                    MuiIcons(MuiIconsModule.SkipPrevious)()
                  } else {
                    MuiIcons(MuiIconsModule.SkipNext)()
                  }
                )
              )
            ),
            MuiCardMedia(image = "/static/images/cards/live-from-space.jpg")(css.cover,
              title := "Live from space album cover"
            )
          )
        )
      )
    }
  }

  private val component = ScalaComponent.builder[Props]("MediaControlCard")
    .renderBackend[Backend]
    .build

  def apply(style: MediaControlCardStyle = DefaultMediaControlCardStyle) = component(Props(style))
}
