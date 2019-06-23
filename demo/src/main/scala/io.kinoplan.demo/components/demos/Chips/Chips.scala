package io.kinoplan.demo.components.demos.Chips

import io.kinoplan.demo.components.ComponentContainer
import io.kinoplan.demo.styles.demos.Chips.{ChipsStyle, DefaultChipsStyle}
import io.kinoplan.scalajs.react.material.ui.core.{MuiAvatar, MuiChip}
import io.kinoplan.scalajs.react.material.ui.icons.{MuiDoneIcon, MuiFaceIcon}
import japgolly.scalajs.react.vdom.all.{VdomElement, _}
import japgolly.scalajs.react.{BackendScope, Callback, ReactEvent, ScalaComponent}
import scalacss.ScalaCssReact._

object Chips {
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
        ComponentContainer("Chip")(
          div(css.root,
            MuiChip(label = Some("Basic Chip"))(css.chip),
            MuiChip(label = Some("Clickable Chip"), avatar = Some(MuiAvatar()("MB").rawElement))(css.chip,
              onClick ==> handleClick
            ),
            MuiChip(
              label = Some("Deletable Chip"),
              avatar = Some(MuiAvatar()(
                alt := "Natacha",
                src := "/static/images/avatar/1.jpg"
              )().rawElement),
              onDelete = handleDelete
            )(css.chip),
            MuiChip(
              label = Some("Clickable Deletable Chip"),
              avatar = Some(MuiAvatar()(
                MuiFaceIcon()
              ).rawElement),
              onDelete = handleDelete
            )(css.chip,
              onClick ==> handleClick
            ),
            MuiChip(
              label = Some("Clickable Deletable Chip"),
              icon = Some(MuiFaceIcon()().rawElement),
              onDelete = handleDelete
            )(css.chip,
              onClick ==> handleClick
            ),
            MuiChip(
              label = Some("Custom delete icon Chip"),
              deleteIcon = Some(MuiDoneIcon()().rawElement),
              onDelete = handleDelete
            )(css.chip,
              onClick ==> handleClick
            ),
            MuiChip(
              label = Some("Clickable Link Chip"),
              component = "a",
              clickable = Some(true)
            )(css.chip,
              href := "/#demos/chips/",
            ),
            MuiChip(
              label = Some("Primary Clickable Chip"),
              avatar = Some(MuiAvatar()("MB").rawElement),
              deleteIcon = Some(MuiDoneIcon()().rawElement),
              onDelete = handleDelete,
              color = MuiChip.Color.primary,
              clickable = Some(true)
            )(css.chip),
            MuiChip(
              label = Some("Primary Clickable Chip"),
              icon = Some(MuiFaceIcon()().rawElement),
              deleteIcon = Some(MuiDoneIcon()().rawElement),
              onDelete = handleDelete,
              color = MuiChip.Color.primary,
              clickable = Some(true)
            )(css.chip),
            MuiChip(
              label = Some("Deletable Primary Chip"),
              onDelete = handleDelete,
              color = MuiChip.Color.primary
            )(css.chip),
            MuiChip(
              label = Some("Deletable Secondary Chip"),
              avatar = Some(MuiAvatar()(MuiFaceIcon()).rawElement),
              onDelete = handleDelete,
              color = MuiChip.Color.secondary
            )(css.chip),
            MuiChip(
              label = Some("Deletable Secondary Chip"),
              icon = Some(MuiFaceIcon()().rawElement),
              onDelete = handleDelete,
              color = MuiChip.Color.secondary
            )(css.chip)
          )
        )
      )
    }
  }

  private val component = ScalaComponent.builder[Props]("Chips")
    .renderBackend[Backend]
    .build

  def apply(style: ChipsStyle = DefaultChipsStyle) = component(Props(style))
}
