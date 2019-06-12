package io.kinoplan.demo.components.demos.Chips

import io.kinoplan.demo.components.ComponentContainer
import io.kinoplan.demo.styles.demos.Chips.{ChipsStyle, DefaultChipsStyle}
import io.kinoplan.demo.utils.Constants.HOST
import io.kinoplan.scalajs.react.material.ui.core.{MuiAvatar, MuiChip}
import io.kinoplan.scalajs.react.material.ui.icons.{MuiDoneIcon, MuiFaceIcon}
import japgolly.scalajs.react.vdom.all.{VdomElement, _}
import japgolly.scalajs.react.{BackendScope, Callback, ReactEvent, ScalaComponent}
import scalacss.ScalaCssReact._

object OutlinedChips {
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
            MuiChip(label = Some("Basic Chip"), variant = MuiChip.Variant.outlined)(css.chip),
            MuiChip(
              label = Some("Clickable Chip"),
              avatar = Some(MuiAvatar()("MB").rawElement),
              variant = MuiChip.Variant.outlined
            )(css.chip,
              onClick ==> handleClick
            ),
            MuiChip(
              label = Some("Deletable Chip"),
              avatar = Some(MuiAvatar(
                alt = Some("Natacha"),
                src = Some(s"$HOST/static/images/avatar/1.jpg")
              )().rawElement),
              onDelete = handleDelete,
              variant = MuiChip.Variant.outlined
            )(css.chip),
            MuiChip(
              label = Some("Clickable Deletable Chip"),
              avatar = Some(MuiAvatar()(
                MuiFaceIcon()
              ).rawElement),
              onDelete = handleDelete,
              variant = MuiChip.Variant.outlined
            )(css.chip,
              onClick ==> handleClick
            ),
            MuiChip(
              label = Some("Clickable Deletable Chip"),
              icon = Some(MuiFaceIcon()().rawElement),
              onDelete = handleDelete,
              variant = MuiChip.Variant.outlined
            )(css.chip,
              onClick ==> handleClick
            ),
            MuiChip(
              label = Some("Custom delete icon Chip"),
              deleteIcon = Some(MuiDoneIcon()().rawElement),
              onDelete = handleDelete,
              variant = MuiChip.Variant.outlined
            )(css.chip,
              onClick ==> handleClick
            ),
            MuiChip(
              label = Some("Clickable Link Chip"),
              component = "a",
              clickable = Some(true),
              variant = MuiChip.Variant.outlined
            )(css.chip,
              href := "/#demos/chips/",
            ),
            MuiChip(
              label = Some("Primary Clickable Chip"),
              avatar = Some(MuiAvatar()("MB").rawElement),
              deleteIcon = Some(MuiDoneIcon()().rawElement),
              onDelete = handleDelete,
              color = MuiChip.Color.primary,
              clickable = Some(true),
              variant = MuiChip.Variant.outlined
            )(css.chip),
            MuiChip(
              label = Some("Primary Clickable Chip"),
              icon = Some(MuiFaceIcon()().rawElement),
              deleteIcon = Some(MuiDoneIcon()().rawElement),
              onDelete = handleDelete,
              color = MuiChip.Color.primary,
              clickable = Some(true),
              variant = MuiChip.Variant.outlined
            )(css.chip),
            MuiChip(
              label = Some("Deletable Primary Chip"),
              onDelete = handleDelete,
              color = MuiChip.Color.primary,
              variant = MuiChip.Variant.outlined
            )(css.chip),
            MuiChip(
              label = Some("Deletable Secondary Chip"),
              avatar = Some(MuiAvatar()(MuiFaceIcon()).rawElement),
              onDelete = handleDelete,
              color = MuiChip.Color.secondary,
              variant = MuiChip.Variant.outlined
            )(css.chip),
            MuiChip(
              label = Some("Deletable Secondary Chip"),
              icon = Some(MuiFaceIcon()().rawElement),
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
