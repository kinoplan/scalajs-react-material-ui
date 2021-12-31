package io.kinoplan.demo.utils

import org.scalajs.dom.{HTMLStyleElement, document}

object CSSUtils {

  def createStyleElement(styleStr: String): HTMLStyleElement = {
    val e = document.createElement("style").asInstanceOf[HTMLStyleElement]
    e.`type` = "text/css"
    e.appendChild(document.createTextNode(styleStr))
    e
  }

  def installStyle(style: HTMLStyleElement): Unit = {
    document.head.appendChild(style)
    ()
  }

}
