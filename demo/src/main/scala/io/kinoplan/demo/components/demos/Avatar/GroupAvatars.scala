package io.kinoplan.demo.components.demos.Avatar

import japgolly.scalajs.react.ScalaComponent
import japgolly.scalajs.react.vdom.all._

import io.kinoplan.demo.components.ComponentContainer
import io.kinoplan.scalajs.react.material.ui.core.MuiAvatar
import io.kinoplan.scalajs.react.material.ui.lab.MuiAvatarGroup

object GroupAvatars {
  private val component = ScalaComponent.builder[Unit]
    .renderStatic(
      div(
        ComponentContainer("Grouped")(
          MuiAvatarGroup()(max := 4,
            MuiAvatar()(alt := "Remy Sharp", src := "/static/images/avatar/1.jpg"),
            MuiAvatar()(alt := "Travis Howard", src := "/static/images/avatar/2.jpg"),
            MuiAvatar()(alt := "Cindy Baker", src := "/static/images/avatar/3.jpg"),
            MuiAvatar()(alt := "Agnes Walker", src := "/static/images/avatar/4.jpg"),
            MuiAvatar()(alt := "Trevor Henderson", src := "/static/images/avatar/5.jpg"),
          )
        )
      )
    )
    .build

  def apply() = component()
}
