package io.kinoplan.demo.styles.demos.Dialogs

import io.kinoplan.demo.CssSettings._
import io.kinoplan.demo.styles.{CommonStyle, DefaultCommonStyle}

case class ConfirmationDialogStyle(common: CommonStyle = DefaultCommonStyle) extends StyleSheet.Inline {
  import dsl._

  val root = style(
    width(100.%%),
    maxWidth(360.px)
  )

  val rootPaper = common.paper

  val paper = style(
    width(80.%%),
    maxWidth(435.px)
  )

}

object DefaultConfirmationDialogStyle extends ConfirmationDialogStyle
