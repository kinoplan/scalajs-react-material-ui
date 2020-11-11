package io.kinoplan.demo.utils

import scala.scalajs.js
import scala.scalajs.js.JSConverters._
import scala.scalajs.js.JSNumberOps._

import cats.syntax.option._
import japgolly.scalajs.react.vdom.VdomNode
import scalacss.internal.StyleA

object Helpers {
  implicit class StringExtended(value: String) {
    val toVdom = VdomNode(value)
  }

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
    styleA.className.value.some.orUndefined

  implicit def stylesToClassName(styleAs: Seq[StyleA]): String =
    styleAs.map(styleAToClassName).mkString(" ")

  implicit def stylesToUndefOrClassName(styleAs: Seq[StyleA]): js.UndefOr[String] =
    stylesToClassName(styleAs)
}
