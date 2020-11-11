package io.kinoplan.demo.styles.demos.Buttons

import scala.scalajs.js

import io.kinoplan.demo.CssSettings._

case class ButtonBasesStyle(common: CommonButtonStyle = DefaultCommonButtonStyle) extends StyleSheet.Inline {
  import common.theme
  import dsl._

  private val opacityTransition: String = theme.transitions.create(js.Array("opacity"), js.undefined)

  val root = style(
    display.flex,
    flexWrap.wrap,
    minWidth(300.px),
    width(100.%%)
  )

  val focusVisible = style()

  val imageButton = style(
    position.absolute,
    left(0.px),
    right(0.px),
    top(0.px),
    bottom(0.px),
    display.flex,
    alignItems.center,
    justifyContent.center,
    color :=! theme.palette.common.white
  )

  val imageSrc = style(
    position.absolute,
    left(0.px),
    right(0.px),
    top(0.px),
    bottom(0.px),
    backgroundSize := "cover",
    backgroundPosition := "center 40%"
  )

  val imageBackdrop = style(
    position.absolute,
    left(0.px),
    right(0.px),
    top(0.px),
    bottom(0.px),
    backgroundColor :=! theme.palette.common.black,
    opacity(0.4),
    transition := opacityTransition
  )

  val imageTitle = style(
    position.relative,
    padding((theme.spacing.unit * 2).px, (theme.spacing.unit * 4).px, (theme.spacing.unit + 6).px)
  )

  val imageMarked = style(
    height(3.px),
    width(18.px),
    backgroundColor :=! theme.palette.common.white,
    position.absolute,
    bottom((-2).px),
    left :=! "calc(50% - 9px)",
    transition := opacityTransition
  )

  private val imagePreliminary = style(
    position.relative,
    height(200.px),
    media.maxWidth((600 - 5 / 100).px)(
      width(100.%%).important,
      height(100.px)
    )
  )

  private val focusVisibleImagePreliminary = style(
    unsafeRoot(s".${imagePreliminary.htmlClass}:hover, .${imagePreliminary.htmlClass}.${focusVisible.htmlClass}")(
      zIndex :=! 1.toString
    )
  )

  private val backdropImagePreliminary = style(
    unsafeRoot(s".${imagePreliminary.htmlClass}:hover .${imageBackdrop.htmlClass}, .${imagePreliminary.htmlClass}.${focusVisible.htmlClass} .${imageBackdrop.htmlClass}")(
      opacity(0.15)
    )
  )

  private val markedImagePreliminary = style(
    unsafeRoot(s".${imagePreliminary.htmlClass}:hover .${imageMarked.htmlClass}, .${imagePreliminary.htmlClass}.${focusVisible.htmlClass} .${imageMarked.htmlClass}")(
      opacity(0)
    )
  )

  private val titleImagePreliminary = style(
    unsafeRoot(s".${imagePreliminary.htmlClass}:hover .${imageTitle.htmlClass}, .${imagePreliminary.htmlClass}.${focusVisible.htmlClass} .${imageTitle.htmlClass}")(
      border :=! "4px solid currentColor"
    )
  )

  val image = style(addClassNames(
    imagePreliminary.htmlClass,
    focusVisibleImagePreliminary.htmlClass,
    backdropImagePreliminary.htmlClass,
    markedImagePreliminary.htmlClass,
    titleImagePreliminary.htmlClass
  ))
}

object DefaultButtonBasesStyle extends ButtonBasesStyle
