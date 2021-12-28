import sbt.Keys._
import sbt.plugins.JvmPlugin
import sbt._

object BridgeGeneratorPlugin extends AutoPlugin {
  override def requires = JvmPlugin

  lazy val bridgeImplicitsGenerator = taskKey[Seq[File]]("bridge-implicits-generator")

  override lazy val projectSettings = Seq(
    bridgeImplicitsGenerator := bridgeImplicits(
      (Compile / sourceManaged).value / "io" / "kinoplan" / "scalajs" / "react" / "bridge"
    ),
    Compile / sourceGenerators += bridgeImplicitsGenerator.taskValue
  )

  def bridgeImplicits(src: File) = {
    val moduleFile: File = src / "GeneratedImplicits.scala"

    val functions = (0 to 22).map { arity =>
      val indices = 1 to arity
      val types = indices.map(i => s"T$i") :+ "R"
      val tParams = types.mkString(", ")
      val params = indices.map(i => s"x$i: T$i").mkString(", ")
      val args = indices.map(i => s"x$i").mkString(", ")

      s"""
         |  implicit def function${arity}Writer[$tParams](implicit writerR: JsWriter[R]): JsWriter[Function$arity[$tParams]] = {
         |    new JsWriter[Function$arity[$tParams]] {
         |      override def toJs(value: Function$arity[$tParams]): js.Any =
         |        fromFunction$arity(($params) => writerR.toJs(value($args)))
         |    }
         |  }""".stripMargin
    }.mkString("\n")

    IO.write(
      moduleFile,
      s"""
         |package io.kinoplan.scalajs.react.bridge
         |
         |import scala.scalajs.js
         |import scala.scalajs.js.Any._
         |
         |trait GeneratedImplicits {
         |  $functions
         |}
      """.stripMargin.trim
    )

    Seq(moduleFile)
  }
}
