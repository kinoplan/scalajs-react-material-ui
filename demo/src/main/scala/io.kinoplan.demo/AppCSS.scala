package io.kinoplan.demo

import io.kinoplan.demo.components.Layout.DefaultLayoutStyle
import io.kinoplan.demo.pages.SimpleTablePage.DefaultSimpleTableStyle
import scalacss.internal.mutable.GlobalRegistry
import io.kinoplan.demo.CssSettings._
import io.kinoplan.scalajs.react.material.ui.core.styles.Theme

object AppCSS {
  def load(): Unit = {
    GlobalRegistry.register(
      DefaultSimpleTableStyle,
      DefaultLayoutStyle,
      new Theme
    )

    GlobalRegistry.addToDocumentOnRegistration()
  }
}