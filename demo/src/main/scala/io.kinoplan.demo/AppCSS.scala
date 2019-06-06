package io.kinoplan.demo

import io.kinoplan.demo.styles.demos.{DefaultBottomAppBarStyle, DefaultPrimarySearchAppBarStyle, DefaultSearchAppBarStyle}
import io.kinoplan.demo.styles.{DefaultCommonStyle, DefaultDemoMenuStyle, DefaultLayoutStyle, DefaultSimpleTableStyle}
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
      DefaultBottomAppBarStyle
    )
  }
}