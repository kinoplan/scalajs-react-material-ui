package io.kinoplan.demo.models.SpeedDial

import io.kinoplan.scalajs.react.material.ui.icons.{MuiIcons, MuiIconsModule}
import japgolly.scalajs.react.vdom.VdomNode

case class Action(
  icon: VdomNode,
  name: String
)

object Action {
  val commons = List(
    Action(MuiIcons(MuiIconsModule.FileCopy)(), "Copy"),
    Action(MuiIcons(MuiIconsModule.Save)(), "Save"),
    Action(MuiIcons(MuiIconsModule.Print)(), "Print"),
    Action(MuiIcons(MuiIconsModule.Share)(), "Share"),
    Action(MuiIcons(MuiIconsModule.Delete)(), "Delete")
  )
}
