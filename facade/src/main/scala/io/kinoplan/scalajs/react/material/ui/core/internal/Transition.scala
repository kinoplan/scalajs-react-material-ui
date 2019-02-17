package io.kinoplan.scalajs.react.material.ui.core.internal

import io.kinoplan.scalajs.react.material.ui.core._
import org.scalajs.dom.html

import scala.scalajs.js
import scala.scalajs.js.|

@js.native
trait Transition extends js.Object {
  var enter: Int = js.native
  var exit: Int  = js.native
}

object Transition {
  type Duration = Double | Transition
  type Callback = js.Function1[html.Element, Unit]

  @js.native
  trait Classes extends js.Object {
    var appear: js.UndefOr[String]       = js.native
    var appearActive: js.UndefOr[String] = js.native
    var enter: js.UndefOr[String]        = js.native
    var enterActive: js.UndefOr[String]  = js.native
    var exit: js.UndefOr[String]         = js.native
    var exitActive: js.UndefOr[String]   = js.native
  }

  @js.native
  trait Handlers extends js.Object {
    var onEnter: Callback    = js.native
    var onEntering: Callback = js.native
    var onEntered: Callback  = js.native
    var onExit: Callback     = js.native
    var onExiting: Callback  = js.native
    var onExited: Callback   = js.native
  }

  @js.native
  trait HandlerOpts extends js.Object {
    var onEnter: OptJsFun1[html.Element]    = js.native
    var onEntering: OptJsFun1[html.Element] = js.native
    var onEntered: OptJsFun1[html.Element]  = js.native
    var onExit: OptJsFun1[html.Element]     = js.native
    var onExiting: OptJsFun1[html.Element]  = js.native
    var onExited: OptJsFun1[html.Element]   = js.native
  }

  @js.native
  trait Props extends js.Object {
    var onEnter: OptJsFun1[html.Element]    = js.native
    var onEntering: OptJsFun1[html.Element] = js.native
    var onEntered: OptJsFun1[html.Element]  = js.native
    var onExit: OptJsFun1[html.Element]     = js.native
    var onExiting: OptJsFun1[html.Element]  = js.native
    var onExited: OptJsFun1[html.Element]   = js.native
    var style: js.UndefOr[js.Object]        = js.native
    var className: js.UndefOr[String]       = js.native
    var in: js.UndefOr[Boolean]             = js.native
    var appear: js.UndefOr[Boolean]         = js.native
    var unmountOnExit: js.UndefOr[Boolean]  = js.native
  }
}
