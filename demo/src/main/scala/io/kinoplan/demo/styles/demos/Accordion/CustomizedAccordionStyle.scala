package io.kinoplan.demo.styles.demos.Accordion

import io.kinoplan.demo.CssSettings._
import io.kinoplan.demo.styles.{CommonStyle, DefaultCommonStyle}

case class CustomizedAccordionStyle(common: CommonStyle = DefaultCommonStyle) extends StyleSheet.Inline {
  import common.theme
  import dsl._

  val accordionExpanded = style()

  val accordionRoot = style(
    border :=! "1px solid rgba(0,0,0,.125)",
    boxShadow := "none",
    &.not(_.lastChild)(
      borderBottom(0.px)
    ),
    &.before(
      display.none
    ),
    unsafeRoot(s".${accordionExpanded.htmlClass}")(
      margin.auto
    )
  )

  val summaryExpanded = style()

  val summaryRoot = style(
    backgroundColor :=! "rgba(0,0,0,.03)",
    borderBottom :=! "1px solid rgba(0,0,0,.125)",
    marginBottom(-1.px),
    minHeight(56.px),
    unsafeRoot(s".${summaryExpanded.htmlClass}")(
      minHeight(56.px)
    )
  )

  val summaryContent = style(
    unsafeRoot(s".${summaryExpanded.htmlClass}")(
      margin :=! "12px 0"
    )
  )

  val detailsRoot = style(
    padding((theme.spacing.unit * 1).px)
  )
}

object DefaultCustomizedAccordionStyle extends CustomizedAccordionStyle
