package io.kinoplan.demo.styles.demos.Menus

import io.kinoplan.demo.CssSettings._
import io.kinoplan.demo.styles.{CommonStyle, DefaultCommonStyle}

case class ListItemCompositionStyle(common: CommonStyle = DefaultCommonStyle) extends StyleSheet.Inline {

  import common.theme
  import dsl._

  private val item = style(
    &.focus(
      backgroundColor :=! theme.palette.primary.main
    )
  )

  val primary = style()

  val icon = style()

  private val preliminaryFocus = style(
    unsafeRoot(
      s".${item.htmlClass}:focus .${primary.htmlClass}, .${item.htmlClass}:focus .${icon.htmlClass}"
    )(
      color :=! theme.palette.common.white
    )
  )

  val menuItem = style(addClassNames(
    item.htmlClass,
    preliminaryFocus.htmlClass
  ))

}

object DefaultListItemCompositionStyle extends ListItemCompositionStyle
