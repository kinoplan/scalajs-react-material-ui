package io.kinoplan.demo.styles.demos.SelectionControls

import io.kinoplan.demo.CssSettings._
import io.kinoplan.demo.styles.{CommonStyle, DefaultCommonStyle}
import io.kinoplan.scalajs.react.material.ui.core.colors

case class CustomControlStyle(common: CommonStyle = DefaultCommonStyle) extends StyleSheet.Inline {
  import dsl._

  private val preliminaryRoot = style(
    color :=! colors.green.`600`
  )

  val checked = style()

  private val preliminaryChecked = style(
    unsafeRoot(s".${preliminaryRoot.htmlClass}.${checked.htmlClass}")(
      color :=! colors.green.`500`
    )
  )

  val root = style(
    addClassNames(
      preliminaryRoot.htmlClass,
      preliminaryChecked.htmlClass
    )
  )

}

object DefaultCustomControlStyle extends CustomControlStyle
