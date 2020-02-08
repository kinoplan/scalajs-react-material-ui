package io.kinoplan.demo.models.SpeedDial

import io.kinoplan.scalajs.react.material.ui.icons._
import japgolly.scalajs.react.vdom.VdomNode

case class Action(
  icon: VdomNode,
  name: String
)

object Action {
  val commons = List(
    Action(MuiFileCopyIcon(), "Copy"),
    Action(MuiSaveIcon(), "Save"),
    Action(MuiPrintIcon(), "Print"),
    Action(MuiShareIcon(), "Share"),
    Action(MuiDeleteIcon(), "Delete")
  )
}
