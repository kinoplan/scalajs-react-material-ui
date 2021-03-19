package io.kinoplan.demo.styles.demos.Accordion

import io.kinoplan.demo.CssSettings._

class AdditionalAccordionStyle extends StyleSheet.Inline {
  import dsl._

  val root = style(
    width(100.%%)
  )
}

object DefaultAdditionalAccordionStyle extends AdditionalAccordionStyle
