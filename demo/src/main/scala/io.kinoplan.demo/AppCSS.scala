package io.kinoplan.demo

import io.kinoplan.demo.components.Layout.DefaultStyle
import scalacss.internal.mutable.GlobalRegistry
import io.kinoplan.demo.CssSettings._

object AppCSS {
  def load(): Unit = {
    GlobalRegistry.register(
      DefaultStyle
    )

    GlobalRegistry.addToDocumentOnRegistration()
  }
}