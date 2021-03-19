package io.kinoplan.demo.components.demos.AppBar

import japgolly.scalajs.react.{BackendScope, React, ScalaComponent}
import japgolly.scalajs.react.vdom.Attr
import japgolly.scalajs.react.vdom.all.{VdomElement, _}
import scalacss.ScalaCssReactImplicits

import io.kinoplan.demo.components.ComponentContainer
import io.kinoplan.scalajs.react.material.ui.core._

// TODO: Fix problems with useScrollTrigger
object HideAppBar extends ScalaCssReactImplicits {
//  val trigger = useScrollTrigger(options = UseScrollTriggerOptions(
//    disableHysteresis = true,
//    threshold = 0
//  ))

  class Backend(t: BackendScope[Unit, Unit]) {

    def render(): VdomElement = {
      div(
        ComponentContainer("Hide App Bar")(
          React.Fragment(
            MuiCssBaseline(),
            MuiSlide(appear = false, direction = MuiSlide.Direction.down)(
              MuiAppBar()(
                MuiToolbar()(
                  MuiTypography(variant = MuiTypography.Variant.h6)("Scroll to Hide App Bar")
                )
              )
            ),
            MuiToolbar()(),
            MuiContainer()(
              MuiBox()(Attr("my") := 2,
                0.to(12).map(_ =>
                  "Cras mattis consectetur purus sit amet fermentum. " +
                  "Cras justo odio, dapibus ac facilisis in, egestas eget quam. " +
                  "Morbi leo risus, porta ac consectetur ac, vestibulum at eros. " +
                  "Praesent commodo cursus magna, vel scelerisque nisl consectetur et."
                ).mkString
              )
            )
          )
        )
      )
    }
  }

  private val component = ScalaComponent.builder[Unit]
    .renderBackend[Backend]
    .build

  def apply() = component()
}
