package io.kinoplan.demo.components.demos.Lists

import io.kinoplan.demo.components.ComponentContainer
import io.kinoplan.demo.styles.demos.Lists.{DefaultPinnedSubheaderListStyle, PinnedSubheaderListStyle}
import io.kinoplan.scalajs.react.material.ui.core.{MuiList, MuiListItem, MuiListItemText, MuiListSubheader}
import japgolly.scalajs.react.vdom.Attr
import japgolly.scalajs.react.vdom.all._
import japgolly.scalajs.react.{BackendScope, ScalaComponent}
import scalacss.ScalaCssReactImplicits

object PinnedSubheaderList extends ScalaCssReactImplicits {
  case class Props(style: PinnedSubheaderListStyle)

  class Backend(t: BackendScope[Props, Unit]) {
    def render(props: Props): VdomElement = {
      val css = props.style

      div(
        ComponentContainer("Pinned Subheader List")(
          div(css.root,
            MuiList(subheader = Some(li()))(css.root,
              List(0, 1, 2, 3, 4).toVdomArray { sectionId =>
                li(css.listSection, key := s"section-$sectionId",
                  ul(css.ul,
                    MuiListSubheader()(s"I'm sticky $sectionId"),
                    List(0, 1, 2).toVdomArray { item =>
                      MuiListItem()(Attr("key") := s"item-$sectionId-$item",
                        MuiListItemText(primary = Some(s"Item $item"))
                      )
                    }
                  )
                )
              }
            )
          )
        )
      )
    }
  }

  private val component = ScalaComponent.builder[Props]("PinnedSubheaderList")
    .renderBackend[Backend]
    .build

  def apply(style: PinnedSubheaderListStyle = DefaultPinnedSubheaderListStyle) = component(Props(style))
}
