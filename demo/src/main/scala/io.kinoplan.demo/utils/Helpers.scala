package io.kinoplan.demo.utils

import scalacss.internal.StyleA

import scala.language.implicitConversions
import scala.scalajs.js
import scala.scalajs.js.JSNumberOps._

object Helpers {
  implicit class DoubleExtended(value: Double) {
    val toCcyFormat = value.toFixed(2)
  }

  implicit class ExtendedStyle(css: StyleA) {
    def toDictionary: js.Dictionary[String] = {
      val result = js.Dictionary.empty[String]
      css.style.data.values.flatMap(_.avIterator).foreach { property =>
        // Map CSS property name to react style naming convention.
        // For example: padding-top => paddingTop
        val propertyName = property.attr.id.split("-") match {
          case Array(head, other@_*) => head + other.map(_.capitalize).mkString
        }
        result(propertyName) = property.value
      }
      result
    }

    def toAny: js.Any = {
      val result = js.Dictionary.empty[String]
      css.style.data.values.flatMap(_.avIterator).foreach { property =>
        // Map CSS property name to react style naming convention.
        // For example: padding-top => paddingTop
        val propertyName = property.attr.id.split("-") match {
          case Array(head, other@_*) => head + other.map(_.capitalize).mkString
        }
        result(propertyName) = property.value
      }
      result
    }
  }

  implicit def styleAToClassName(styleA: StyleA): String =
    styleA.className.value

  implicit def styleAToUndefOrClassName(styleA: StyleA): js.UndefOr[String] =
    js.UndefOr.any2undefOrA(styleA.className.value)

  implicit def stylesToClassName(styleAs: Seq[StyleA]): String =
    styleAs.map(styleAToClassName).mkString(" ")

  implicit def stylesToUndefOrClassName(styleAs: Seq[StyleA]): js.UndefOr[String] =
    stylesToClassName(styleAs)
}
