package io.kinoplan.demo.utils

import org.scalajs.dom.document
import org.scalajs.dom.raw.HTMLStyleElement

object CSSUtils {
  def createStyleElement(styleStr: String): HTMLStyleElement = {
    val e = document.createElement("style").asInstanceOf[HTMLStyleElement]
    e.`type` = "text/css"
    e appendChild document.createTextNode(styleStr)
    e
  }

  def installStyle(style: HTMLStyleElement): Unit = {
    document.head appendChild style
    ()
  }
}
