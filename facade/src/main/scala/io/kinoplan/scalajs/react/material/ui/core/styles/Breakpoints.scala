package io.kinoplan.scalajs.react.material.ui.core.styles

import io.kinoplan.scalajs.react.material.ui.CyclicEnumeration
import io.kinoplan.scalajs.react.material.ui.core.styles.CssSettings._
import scalacss.internal.Media

case class Breakpoints(
  unit: String = "px",
  step: Int = 5
) extends StyleSheet.Inline {
  import dsl._

  def up(key: Breakpoints.Value): Media.Query = {
    media.minWidth(key.id.px)
  }

  def down(key: Breakpoints.Value): Media.Query = {
    if (key == Breakpoints.xl) {
      up(Breakpoints.xs)
    } else {
      val value = Breakpoints.nextOf(key).get

      media.maxWidth((value.id - step / 100).px)
    }
  }

  def between(start: Breakpoints.Value, end: Breakpoints.Value): Media.Query = {
    if (end == Breakpoints.xl) {
      up(start)
    } else {
      val endValue = Breakpoints.nextOf(end).get
      media.minWidth(start.id.px).maxWidth((endValue.id - step / 100).px)
    }
  }

  def only(key: Breakpoints.Value): Media.Query = {
    between(key, key)
  }

  def width(key: Breakpoints.Value): Int = {
    key.id
  }
}

object Breakpoints extends CyclicEnumeration {
  val xs = Value(0)
  val sm = Value(600)
  val md = Value(960)
  val lg = Value(1280)
  val xl = Value(1920)
}
