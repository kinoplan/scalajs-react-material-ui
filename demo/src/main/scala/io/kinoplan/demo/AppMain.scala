package io.kinoplan.demo

import org.scalajs.dom

import io.kinoplan.demo.router.AppRouter

import io.kinoplan.scalajs.react.libs.external.materialUiStyles.installMod

object AppMain {

  def main(args: Array[String]): Unit = {
    val root = dom.document.getElementById("root")

    AppRouter.router().renderIntoDOM(root)

    installMod.default()

    AppCSS.load()
  }

}
