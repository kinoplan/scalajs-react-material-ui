package io.kinoplan.scalajs.react.material.ui.core.internal

import scala.scalajs.js
import scala.scalajs.js.|

@js.native
trait Transition extends js.Object {
  var enter: Int = js.native
  var exit: Int  = js.native
}

object Transition {
  type Duration = Double | Transition
}
