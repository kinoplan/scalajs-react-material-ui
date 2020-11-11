import sbt._

object Generator {
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

  def muiColors(src: File, npm: File): Seq[File] = {
    val path = npm / "node_modules" / "@material-ui" / "core" / "colors"
    val extensions = "*.js" -- "index.js" -- "index.es.js" -- "common.js"

    val colorSources = path * extensions

    val colorsPackageFile = src / "package.scala"

    val colorsPackage = colorSources.get.sortBy(_.getName).map(file => {
      val name = file.getName.stripSuffix(".js")

      s"""    @JSImport("@material-ui/core/colors/$name", JSImport.Default)
         |    @js.native
         |    object $name extends Color
         |""".stripMargin
    }).mkString(
      start =
        """package io.kinoplan.scalajs.react.material.ui.core
          |
          |import scala.scalajs.js
          |import scala.scalajs.js.annotation.JSImport
          |
          |package object colors {
          |
          |""".stripMargin,
      sep = "\n",
      end =
        """
          |    @JSImport("@material-ui/core/colors/common", JSImport.Default)
          |    @js.native
          |    object common extends CommonColors
          |}
          |""".stripMargin
    )

    IO.write(colorsPackageFile, colorsPackage)

    Seq(colorsPackageFile)
  }

  def muiIcons(src: File, npm: File): Seq[File] = {
    val iconSources = (npm / "node_modules" / "@material-ui" / "icons") * ("*.js" -- "index.js" -- "index.es.js")

    val iconNames = iconSources.get.map(_.getName.stripSuffix(".js")).sorted

    val moduleFile: File = src / "MuiIconsModule.scala"

    val moduleIcons = iconNames.map(name => s"""|  def $name: js.Any = js.native""".stripMargin).mkString("\n")

    IO.write(
      moduleFile,
      s"""package io.kinoplan.scalajs.react.material.ui.icons
        |
        |import scala.scalajs.js
        |import scala.scalajs.js.annotation.JSImport
        |
        |@js.native
        |@JSImport("@material-ui/icons", JSImport.Namespace)
        |object MuiIconsModule extends js.Object {
        |  type Value = js.Any
      """.stripMargin.trim + "\n\n" + moduleIcons + "\n" + "}\n"
    )

    Seq(moduleFile)
  }
}
