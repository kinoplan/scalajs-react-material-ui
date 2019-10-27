package io.kinoplan.demo

import io.kinoplan.demo.styles._
import io.kinoplan.demo.styles.demos.AppBar._
import io.kinoplan.demo.styles.demos.Avatars.DefaultAvatarsStyle
import io.kinoplan.demo.styles.demos.Badges._
import io.kinoplan.demo.styles.demos.BottomNavigation.DefaultBottomNavigationStyle
import io.kinoplan.demo.styles.demos.Buttons._
import io.kinoplan.demo.styles.demos.Cards._
import io.kinoplan.demo.styles.demos.Chips._
import io.kinoplan.demo.styles.demos.Dialogs.{DefaultConfirmationDialogStyle, DefaultDialogsStyle}
import io.kinoplan.demo.styles.demos.Dividers.DefaultDividersStyle
import io.kinoplan.demo.styles.demos.Drawers._
import io.kinoplan.demo.styles.demos.ExpansionPanels._
import io.kinoplan.demo.styles.demos.GridList._
import io.kinoplan.demo.styles.demos.Lists.{DefaultInteractiveListStyle, DefaultListStyle, DefaultPinnedSubheaderListStyle}
import io.kinoplan.demo.styles.demos.Menus.{DefaultListItemCompositionStyle, DefaultMenuStyle, DefaultTypographyMenuStyle}
import io.kinoplan.demo.styles.demos.Paper.DefaultPaperStyle
import io.kinoplan.demo.styles.demos.Pickers.DefaultPickersStyle
import io.kinoplan.demo.styles.demos.Progress._
import io.kinoplan.demo.styles.demos.SelectionControls._
import io.kinoplan.demo.styles.demos.Selects._
import io.kinoplan.demo.styles.demos.Snackbars._
import io.kinoplan.demo.styles.demos.Steppers._
import io.kinoplan.demo.styles.demos.Tables._
import io.kinoplan.demo.styles.demos.Tabs._
import io.kinoplan.demo.styles.demos.TextFields._
import io.kinoplan.demo.styles.demos.Tooltips._
import scalacss.internal.mutable.GlobalRegistry

object AppCSS {
  def load(): Unit = {
    GlobalRegistry.register(
      DefaultCommonStyle,
      DefaultLayoutStyle,
      DefaultSimpleTableStyle,
      DefaultDemoMenuStyle,
      DefaultPrimarySearchAppBarStyle,
      DefaultSearchAppBarStyle,
      DefaultBottomAppBarStyle,
      DefaultAvatarsStyle,
      DefaultSimpleBadgeStyle,
      DefaultBadgeMaxStyle,
      DefaultDotBadgeStyle,
      DefaultBadgeVisibilityStyle,
      DefaultCustomizedBadgeStyle,
      DefaultBottomNavigationStyle,
      DefaultCommonButtonStyle,
      DefaultFloatingActionButtonsZoomStyle,
      DefaultIconLabelButtonsStyle,
      DefaultCustomizedButtonsStyle,
      DefaultButtonBasesStyle,
      DefaultTabContainerStyle,
      DefaultSimpleCardStyle,
      DefaultRecipeReviewCardStyle,
      DefaultMediaCardStyle,
      DefaultMediaControlCardStyle,
      DefaultChipsStyle,
      DefaultChipsArrayStyle,
      DefaultChipsPlaygroundStyle,
      DefaultDialogsStyle,
      DefaultConfirmationDialogStyle,
      DefaultDividersStyle,
      DefaultDrawersStyle,
      DefaultResponsiveDrawerStyle,
      DefaultPersistentDrawerStyle,
      DefaultMiniDrawerStyle,
      DefaultSimpleExpansionPanelStyle,
      DefaultControlledExpansionPanelsStyle,
      DefaultDetailedExpansionPanelStyle,
      DefaultCustomizedExpansionPanelStyle,
      DefaultImageGridListStyle,
      DefaultTitlebarGridListStyle,
      DefaultSingleLineGridListStyle,
      DefaultAdvancedGridListStyle,
      DefaultListStyle,
      DefaultInteractiveListStyle,
      DefaultPinnedSubheaderListStyle,
      DefaultMenuStyle,
      DefaultListItemCompositionStyle,
      DefaultTypographyMenuStyle,
      DefaultPaperStyle,
      DefaultPickersStyle,
      DefaultCircularProgressStyle,
      DefaultCircularIntegrationStyle,
      DefaultCustomizedProgressStyle,
      DefaultDelayingAppearanceStyle,
      DefaultControlButtonsGroupStyle,
      DefaultCustomControlStyle,
      DefaultCustomizedSwitchesStyle,
      DefaultSelectStyle,
      DefaultCustomizedSelectsStyle,
      DefaultMultipleSelectStyle,
      DefaultControlledOpenSelectStyle,
      DefaultMySnackbarContentWrapperStyle,
      DefaultCustomizedSnackbarsStyle,
      DefaultSimpleSnackbarStyle,
      DefaultFabIntegrationSnackbarStyle,
      DefaultStepperStyle,
      DefaultVerticalLinearStepperStyle,
      DefaultCustomizedStepperStyle,
      DefaultTextMobileStepperStyle,
      DefaultMobileStepperStyle,
      DefaultEnhancedTableStyle,
      DefaultEnhancedTableToolbarStyle,
      DefaultCustomizedTableStyle,
      DefaultFullWidthTabsStyle,
      DefaultScrollableTabsStyle,
      DefaultCustomizedTabsStyle,
      DefaultIconTabsStyle,
      DefaultTextFieldsStyle,
      DefaultVariantTextFieldsStyle,
      DefaultComponentTextFieldStyle,
      DefaultCustomizedInputsStyle,
      DefaultInputAdornmentsStyle,
      DefaultCustomizedInputBaseStyle,
      DefaultSimpleTooltipsStyle,
      DefaultPositionedTooltipsStyle,
      DefaultVariableWidthStyle,
      DefaultInteractiveTooltipsStyle
    )
  }
}