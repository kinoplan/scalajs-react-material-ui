package io.kinoplan.demo.components.demos.Box

import io.kinoplan.demo.components.ComponentContainer
import io.kinoplan.scalajs.react.material.ui.core._
import japgolly.scalajs.react.ScalaComponent
import japgolly.scalajs.react.vdom.Attr
import japgolly.scalajs.react.vdom.all._

object FontWeight {

  private val component = ScalaComponent.builder[Unit]
    .renderStatic(
      div(
        ComponentContainer("Font weight")(
          MuiTypography(component = "div")(
            MuiBox()(
              Attr("fontWeight") := VdomNode("fontWeightLight").rawNode,
              VdomAttr("m") := VdomNode(1).rawNode,
              "Light"
            ),
            MuiBox()(
              Attr("fontWeight") := VdomNode("fontWeightRegular").rawNode,
              VdomAttr("m") := VdomNode(1).rawNode,
              "Regular"
            ),
            MuiBox()(
              Attr("fontWeight") := VdomNode("fontWeightMedium").rawNode,
              VdomAttr("m") := VdomNode(1).rawNode,
              "Medium"
            ),
            MuiBox()(
              Attr("fontWeight") := VdomNode(600).rawNode,
              VdomAttr("m") := VdomNode(1).rawNode,
              "600"
            )
          )
        )
      )
    )
    .build

  def apply() = component()
}
