package io.kinoplan.demo.components.demos.Chips

import japgolly.scalajs.react.{BackendScope, Callback, ReactEvent, ScalaComponent}
import japgolly.scalajs.react.vdom.all.{VdomElement, _}
import scalacss.ScalaCssReactImplicits

import io.kinoplan.demo.components.ComponentContainer
import io.kinoplan.demo.styles.demos.Chips.{ChipsStyle, DefaultChipsStyle}
import io.kinoplan.demo.utils.Helpers.StringExtended
import io.kinoplan.scalajs.react.material.ui.core.{MuiAvatar, MuiChip}
import io.kinoplan.scalajs.react.material.ui.icons.{MuiIcons, MuiIconsModule}

object OutlinedChips extends ScalaCssReactImplicits {
  case class Props(style: ChipsStyle)

  class Backend(t: BackendScope[Props, Unit]) {
    def handleDelete: ReactEvent => Callback = e => {
      Callback.alert("You clicked the delete icon.")
    }

    def handleClick: ReactEvent => Callback = e => {
      Callback.alert("You clicked the Chip.")
    }

    def render(props: Props): VdomElement = {
      val css = props.style

      div(
        ComponentContainer("Outlined Chips")(
          div(css.root,
            MuiChip(label = "Basic Chip".toVdom, variant = MuiChip.Variant.outlined)(css.chip),
            MuiChip(
              label = "Clickable Chip".toVdom,
              avatar = MuiAvatar()("MB").rawElement,
              variant = MuiChip.Variant.outlined
            )(css.chip,
              onClick ==> handleClick
            ),
            MuiChip(
              label = "Deletable Chip".toVdom,
              avatar = MuiAvatar()(
                alt := "Natacha",
                src := "/static/images/avatar/1.jpg"
              )().rawElement,
              onDelete = handleDelete,
              variant = MuiChip.Variant.outlined
            )(css.chip),
            MuiChip(
              label = "Clickable Deletable Chip".toVdom,
              avatar = MuiAvatar()(MuiIcons(MuiIconsModule.Face)()).rawElement,
              onDelete = handleDelete,
              variant = MuiChip.Variant.outlined
            )(css.chip,
              onClick ==> handleClick
            ),
            MuiChip(
              label = "Clickable Deletable Chip".toVdom,
              icon = MuiIcons(MuiIconsModule.Face)()().rawElement,
              onDelete = handleDelete,
              variant = MuiChip.Variant.outlined
            )(css.chip,
              onClick ==> handleClick
            ),
            MuiChip(
              label = "Custom delete icon Chip".toVdom,
              deleteIcon = MuiIcons(MuiIconsModule.Done)()().rawElement,
              onDelete = handleDelete,
              variant = MuiChip.Variant.outlined
            )(css.chip,
              onClick ==> handleClick
            ),
            MuiChip(
              label = "Clickable Link Chip".toVdom,
              component = "a",
              clickable = true,
              variant = MuiChip.Variant.outlined
            )(css.chip,
              href := "/#demos/chips/",
            ),
            MuiChip(
              label = "Primary Clickable Chip".toVdom,
              avatar = MuiAvatar()("MB").rawElement,
              deleteIcon = MuiIcons(MuiIconsModule.Done)()().rawElement,
              onDelete = handleDelete,
              color = MuiChip.Color.primary,
              clickable = true,
              variant = MuiChip.Variant.outlined
            )(css.chip),
            MuiChip(
              label = "Primary Clickable Chip".toVdom,
              icon = MuiIcons(MuiIconsModule.Face)()().rawElement,
              deleteIcon = MuiIcons(MuiIconsModule.Done)()().rawElement,
              onDelete = handleDelete,
              color = MuiChip.Color.primary,
              clickable = true,
              variant = MuiChip.Variant.outlined
            )(css.chip),
            MuiChip(
              label = "Deletable Primary Chip".toVdom,
              onDelete = handleDelete,
              color = MuiChip.Color.primary,
              variant = MuiChip.Variant.outlined
            )(css.chip),
            MuiChip(
              label = "Deletable Secondary Chip".toVdom,
              avatar = MuiAvatar()(MuiIcons(MuiIconsModule.Face)()).rawElement,
              onDelete = handleDelete,
              color = MuiChip.Color.secondary,
              variant = MuiChip.Variant.outlined
            )(css.chip),
            MuiChip(
              label = "Deletable Secondary Chip".toVdom,
              icon = MuiIcons(MuiIconsModule.Face)()().rawElement,
              onDelete = handleDelete,
              color = MuiChip.Color.secondary,
              variant = MuiChip.Variant.outlined
            )(css.chip)
          )
        )
      )
    }
  }

  private val component = ScalaComponent.builder[Props]("OutlinedChips")
    .renderBackend[Backend]
    .build

  def apply(style: ChipsStyle = DefaultChipsStyle) = component(Props(style))
}
