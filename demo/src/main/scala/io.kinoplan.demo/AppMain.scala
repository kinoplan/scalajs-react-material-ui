package io.kinoplan.demo

import io.kinoplan.demo.router.AppRouter
import org.scalajs.dom
import io.kinoplan.demo.CssSettings._
import scalacss.internal.mutable.GlobalRegistry

object AppMain {
  def main(args: Array[String]): Unit = {
    val root = dom.document.getElementById("root")

    AppRouter.router().renderIntoDOM(root)

    AppCSS.load()

    GlobalRegistry.addToDocumentOnRegistration()
  }
}
