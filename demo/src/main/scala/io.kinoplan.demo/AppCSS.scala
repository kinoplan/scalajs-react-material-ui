package io.kinoplan.demo

import io.kinoplan.demo.components.Layout.LayoutStyle
import io.kinoplan.demo.pages.SimpleTablePage.SimpleTableStyle
import scalacss.internal.mutable.GlobalRegistry
import io.kinoplan.demo.CssSettings._
import io.kinoplan.scalajs.react.material.ui.core.styles.Theme

object AppCSS {
  def load(): Unit = {
    GlobalRegistry.register(
      new SimpleTableStyle,
      new LayoutStyle,
      new Theme
    )

    GlobalRegistry.addToDocumentOnRegistration()
  }
}