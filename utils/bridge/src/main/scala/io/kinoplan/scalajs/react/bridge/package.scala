package io.kinoplan.scalajs.react

import scala.concurrent.{ExecutionContext, Future}
import scala.reflect.ClassTag
import scala.scalajs.js
import scala.scalajs.js.{Object, |}
import scala.scalajs.js.JSConverters._

import japgolly.scalajs.react.{CallbackTo, Children, CtorType}
import japgolly.scalajs.react.component.Js
import japgolly.scalajs.react.facade.React
import japgolly.scalajs.react.vdom.{TagMod, VdomBuilder, VdomElement, VdomNode}
import japgolly.scalajs.react.vdom.Implicits._

package object bridge extends GeneratedImplicits {

  def writerFromConversion[A](implicit
    conv: A => js.Any
  ): JsWriter[A] = JsWriter(x => x)

  implicit def stringWriter: JsWriter[String] = writerFromConversion[String]

  implicit def boolWriter: JsWriter[Boolean] = writerFromConversion[Boolean]

  // Note: Char and Long not supported here, since in Scala.js they map to opaque types, which
  // may not map well to the underlying components expectations.
  implicit def byteWriter: JsWriter[Byte] = writerFromConversion[Byte]
  implicit def shortWriter: JsWriter[Short] = writerFromConversion[Short]
  implicit def intWriter: JsWriter[Int] = writerFromConversion[Int]

  implicit def floatWriter: JsWriter[Float] = writerFromConversion[Float]
  implicit def doubleWriter: JsWriter[Double] = writerFromConversion[Double]

  implicit def unitWriter: JsWriter[Unit] = writerFromConversion[Unit]
  implicit def jsAnyWriter[A <: js.Any]: JsWriter[A] = JsWriter(identity)

  implicit def callbackToWriter[T](implicit
    writerT: JsWriter[T]
  ): JsWriter[CallbackTo[T]] = JsWriter(value => value.map(writerT.toJs).runNow())

  implicit def undefOrWriter[A](implicit
    writerA: JsWriter[A]
  ): JsWriter[js.UndefOr[A]] = JsWriter(_.map(writerA.toJs))

  implicit def optionWriter[A](implicit
    writerA: JsWriter[A]
  ): JsWriter[Option[A]] = JsWriter(_.map(writerA.toJs).orUndefined)

  implicit def unionWriter[A, B](implicit
    A: ClassTag[A],
    writerA: JsWriter[A],
    B: ClassTag[B],
    writerB: JsWriter[B]
  ): JsWriter[A | B] = JsWriter { value =>
    A.unapply(value).map(writerA.toJs)
      .orElse(B.unapply(value).map(writerB.toJs))
      .getOrElse(
        throw new RuntimeException(s"Value $value of type ($A | $B) matched neither}")
      )
  }

  implicit def enumerationWriter[T <: Enumeration#Value]: JsWriter[T] = JsWriter(_.toString)

  implicit def baseSeqWriter[T: JsWriter]: JsWriter[scala.collection.Seq[T]] = {
    val elementWriter = implicitly[JsWriter[T]]

    JsWriter(_.map(elementWriter.toJs).toJSArray)
  }

  implicit def immutableSeqWriter[T: JsWriter]: JsWriter[scala.collection.immutable.Seq[T]] = {
    val elementWriter = implicitly[JsWriter[T]]

    JsWriter((value: scala.collection.immutable.Seq[T]) => js.Array(value.map(e => elementWriter.toJs(e)): _*))
  }

  implicit def mapWriter[T: JsWriter]: JsWriter[Map[String, T]] = {
    val elementWriter = implicitly[JsWriter[T]]

    JsWriter {
      (value: Map[String, T]) =>
        val converted = value.map { case (k, v) => (k, elementWriter.toJs(v)) }
        js.Dictionary(converted.toSeq: _*)
    }
  }

  implicit def futureWriter[A](implicit
    writeA: JsWriter[A],
    executionContext: ExecutionContext
  ): JsWriter[Future[A]] = JsWriter(_.map(writeA.toJs).toJSPromise)

  implicit def vdomElementWriter: JsWriter[VdomElement] = JsWriter(_.rawElement)

  implicit def vdomNodeWriter: JsWriter[VdomNode] = JsWriter(_.rawNode.asInstanceOf[js.Dynamic])

  implicit def reactElementWriter: JsWriter[React.Element] = JsWriter(_.asInstanceOf[js.Dynamic])

  implicit def reactNodeWriter: JsWriter[React.Node] = JsWriter(_.asInstanceOf[js.Dynamic])

  type JsComponentType = Js.ComponentSimple[
    Object,
    CtorType.Summoner.Aux[Object, Children.Varargs, CtorType.PropsAndChildren]#CT,
    Js.UnmountedWithRawType[Object, Null, Js.RawMounted[Object, Null]]
  ]

  def extractPropsAndChildren(attrAndChildren: Seq[TagMod]): (js.Object, List[VdomNode]) = {
    val b = new VdomBuilder.ToJs {}
    attrAndChildren.toTagMod.applyTo(b)
    b.addClassNameToProps()
    b.addStyleToProps()

    (b.props, b.childrenAsVdomNodes)
  }

}
