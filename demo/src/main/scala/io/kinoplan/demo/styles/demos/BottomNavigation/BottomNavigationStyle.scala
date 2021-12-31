package io.kinoplan.demo.styles.demos.BottomNavigation

import io.kinoplan.demo.CssSettings._

class BottomNavigationStyle extends StyleSheet.Inline {
  import dsl._

  val root = style(
    width(500.px)
  )

}

object DefaultBottomNavigationStyle extends BottomNavigationStyle
