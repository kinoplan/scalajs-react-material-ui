package io.kinoplan.demo

import org.scalajs.dom

import io.kinoplan.demo.router.AppRouter

object AppMain {
  def main(args: Array[String]): Unit = {
    val root = dom.document.getElementById("root")

    AppRouter.router().renderIntoDOM(root)

    AppCSS.load()
  }
}
