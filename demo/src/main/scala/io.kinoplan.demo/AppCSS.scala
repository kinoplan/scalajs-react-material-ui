package io.kinoplan.demo

import io.kinoplan.demo.styles.{DefaultCommonStyle, DefaultDemoMenuStyle, DefaultLayoutStyle, DefaultSimpleTableStyle}
import scalacss.internal.mutable.GlobalRegistry

object AppCSS {
  def load(): Unit = {
    GlobalRegistry.register(
      DefaultDemoMenuStyle,
      DefaultSimpleTableStyle,
      DefaultLayoutStyle,
      DefaultCommonStyle
    )
  }
}