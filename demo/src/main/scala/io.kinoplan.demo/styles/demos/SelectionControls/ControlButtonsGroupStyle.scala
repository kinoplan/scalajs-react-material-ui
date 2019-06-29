package io.kinoplan.demo.styles.demos.SelectionControls

import io.kinoplan.demo.CssSettings._
import io.kinoplan.demo.styles.{CommonStyle, DefaultCommonStyle}

case class ControlButtonsGroupStyle(common: CommonStyle = DefaultCommonStyle) extends StyleSheet.Inline {
  import common.theme
  import dsl._

  val root = style(
    display.flex
  )

  val formControl = style(
    margin((theme.spacing.unit * 3).px)
  )

  val group = style(
    margin :=! s"${theme.spacing.unit}px 0"
  )
}

object DefaultControlButtonsGroupStyle extends ControlButtonsGroupStyle
