package io.kinoplan.demo.components.demos.Box

import io.kinoplan.demo.components.ComponentContainer
import io.kinoplan.scalajs.react.material.ui.core._
import japgolly.scalajs.react.ScalaComponent
import japgolly.scalajs.react.vdom.Attr
import japgolly.scalajs.react.vdom.all._

object TextAlignment {

  private val component = ScalaComponent.builder[Unit]
    .renderStatic(
      div(
        ComponentContainer("Text alignment")(
          MuiTypography(component = "div")(
            MuiBox()(
              Attr("textAlign") := "justify",
              VdomAttr("m") := VdomNode(1).rawNode,
              "Ambitioni dedisse scripsisse iudicaretur. Cras mattis iudicium purus sit amet fermentum. Donec sed odio operae, eu vulputate felis rhoncus."
            ),
            MuiBox()(
              Attr("textAlign") := "left",
              VdomAttr("m") := VdomNode(1).rawNode,
              "Left aligned text."
            ),
            MuiBox()(
              Attr("textAlign") := "center",
              VdomAttr("m") := VdomNode(1).rawNode,
              "Center aligned text."
            ),
            MuiBox()(
              Attr("textAlign") := "right",
              VdomAttr("m") := VdomNode(1).rawNode,
              "Right aligned text."
            )
          )
        )
      )
    )
    .build

  def apply() = component()
}
