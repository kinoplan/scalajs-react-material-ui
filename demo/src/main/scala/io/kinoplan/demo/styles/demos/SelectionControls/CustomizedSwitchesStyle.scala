package io.kinoplan.demo.styles.demos.SelectionControls

import scala.scalajs.js

import io.kinoplan.demo.CssSettings._
import io.kinoplan.demo.styles.{CommonStyle, DefaultCommonStyle}
import io.kinoplan.scalajs.react.material.ui.core.colors
import io.kinoplan.scalajs.react.material.ui.core.styles.CreateTransitionsOptions

case class CustomizedSwitchesStyle(common: CommonStyle = DefaultCommonStyle) extends StyleSheet.Inline {
  import common.theme
  import dsl._

  private val propIOSBar = js.Array("background-color", "border")

  private val iOSBarTransition: String = theme.transitions.create(propIOSBar, js.undefined)

  private val propIOSSwitch = js.Array("transform")

  private val iOSSwitchBaseTransition: String = theme.transitions.create(
    propIOSSwitch,
    CreateTransitionsOptions(
      duration = theme.transitions.duration.shortest,
      easing = theme.transitions.easing.sharp
    )
  )

  val colorBar = style()

  val colorChecked = style()

  val iOSBar = style(
    borderRadius(13.px),
    width(42.px),
    height(26.px),
    marginTop(-13.px),
    marginLeft(-21.px),
    border :=! "solid 1px",
    borderColor :=! theme.palette.grey.`400`,
    backgroundColor :=! theme.palette.grey.`50`,
    opacity(1),
    transition := iOSBarTransition
  )

  val iOSIcon = style(
    width(24.px),
    height(24.px)
  )

  val iOSIconChecked = style(
    boxShadow := theme.shadows(1)
  )

  private val iOSCheckedTransform = style(
    transform := "translateX(15px)"
  )

  private val iOSCheckedCond = style(
    unsafeRoot(s".${iOSCheckedTransform.htmlClass} + .${iOSBar.htmlClass}")(
      opacity(1),
      border.none
    )
  )

  val iOSChecked = style(addClassNames(
    iOSCheckedTransform.htmlClass,
    iOSCheckedCond.htmlClass
  ))

  private val iOSSwitchTransition = style(
    transition := iOSSwitchBaseTransition
  )

  private val iOSSwitchBaseBar = style(
    unsafeRoot(s".${iOSSwitchTransition.htmlClass}.${iOSCheckedTransform.htmlClass} + .${iOSBar.htmlClass}")(
      backgroundColor :=! "#52d869"
    )
  )

  private val iOSSwitchBaseChecked = style(
    unsafeRoot(s".${iOSSwitchTransition.htmlClass}.${iOSCheckedTransform.htmlClass}")(
      color :=! theme.palette.common.white
    )
  )

  val iOSSwitchBase = style(addClassNames(
    iOSSwitchTransition.htmlClass,
    iOSSwitchBaseChecked.htmlClass,
    iOSSwitchBaseBar.htmlClass
  ))

  private val colorSwitchBaseColor = style(
    color :=! colors.purple.`300`
  )

  private val colorSwitchBaseBar = style(
    unsafeRoot(s".${colorSwitchBaseColor.htmlClass}.${colorChecked.htmlClass} + .${colorBar.htmlClass}")(
      backgroundColor :=! colors.purple.`500`
    )
  )

  private val colorSwitchBaseChecked = style(
    unsafeRoot(s".${colorSwitchBaseColor.htmlClass}.${colorChecked.htmlClass}")(
      color :=! colors.purple.`500`
    )
  )

  val colorSwitchBase = style(addClassNames(
    colorSwitchBaseColor.htmlClass,
    colorSwitchBaseChecked.htmlClass,
    colorSwitchBaseBar.htmlClass
  ))
}

object DefaultCustomizedSwitchesStyle extends CustomizedSwitchesStyle
