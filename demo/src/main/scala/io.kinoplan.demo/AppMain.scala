package io.kinoplan.demo

import io.kinoplan.demo.router.AppRouter
import org.scalajs.dom

object AppMain {
  def main(args: Array[String]): Unit = {
    val root = dom.document.getElementById("root")

    AppRouter.router().renderIntoDOM(root)

    ()
  }
}
