import sbt.Keys._
import sbt.plugins.JvmPlugin
import sbt._
import scalajsbundler.sbtplugin.ScalaJSBundlerPlugin.autoImport.npmInstallDependencies

object MuiColorsGeneratorPlugin extends AutoPlugin {
  override def requires = JvmPlugin

  lazy val muiColorsGenerator = taskKey[Seq[File]]("mui-colors-generator")

  override lazy val projectSettings = Seq(
    muiColorsGenerator :=
      muiColors(
        (Compile / sourceManaged).value / "io" / "kinoplan" / "scalajs" / "react" / "material" / "ui" / "core" /
          "colors",
        (Compile / npmInstallDependencies).value
      ),
    Compile / sourceGenerators += muiColorsGenerator.taskValue
  )

  def muiColors(src: File, npm: File): Seq[File] = {
    val path = npm / "node_modules" / "@mui" / "material" / "colors"
    val extensions = "*.js" -- "index.js" -- "index.es.js" -- "common.js"

    val colorSources = path * extensions

    val colorsPackageFile = src / "package.scala"

    val colorsPackage = colorSources
      .get
      .sortBy(_.getName)
      .map { file =>
        val name = file.getName.stripSuffix(".js")

        s"""    @JSImport("@mui/material/colors/$name", JSImport.Default)
           |    @js.native
           |    object $name extends Color
           |""".stripMargin
      }
      .mkString(
        start = """package io.kinoplan.scalajs.react.material.ui.core
                  |
                  |import scala.scalajs.js
                  |import scala.scalajs.js.annotation.JSImport
                  |
                  |package object colors {
                  |
                  |""".stripMargin,
        sep = "\n",
        end = """
                |    @JSImport("@mui/material/colors/common", JSImport.Default)
                |    @js.native
                |    object common extends CommonColors
                |}
                |""".stripMargin
      )

    IO.write(colorsPackageFile, colorsPackage)

    Seq(colorsPackageFile)
  }

}
