package io.kinoplan.demo

import io.kinoplan.demo.styles._
import io.kinoplan.demo.styles.demos.AppBar._
import io.kinoplan.demo.styles.demos.Avatars.DefaultAvatarsStyle
import io.kinoplan.demo.styles.demos.Badges._
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
      DefaultCustomizedBadgeStyle
    )
  }
}