import sbt.Keys._
import sbt.plugins.JvmPlugin
import sbt._
import scalajsbundler.sbtplugin.ScalaJSBundlerPlugin.autoImport.npmInstallDependencies

object MuiIconsGeneratorPlugin extends AutoPlugin {
  override def requires = JvmPlugin

  lazy val muiIconsGenerator = taskKey[Seq[File]]("mui-icons-generator")

  override lazy val projectSettings = Seq(
    muiIconsGenerator :=
      muiIcons(
        (Compile / sourceManaged).value / "io" / "kinoplan" / "scalajs" / "react" / "material" / "ui" / "icons",
        (Compile / npmInstallDependencies).value
      ),
    Compile / sourceGenerators += muiIconsGenerator.taskValue
  )

  def muiIcons(src: File, npm: File): Seq[File] = {
    val iconSources = (npm / "node_modules" / "@mui" / "icons-material") * ("*.js" -- "index.js" -- "index.es.js")

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
         |@JSImport("@mui/icons-material", JSImport.Namespace)
         |object MuiIconsModule extends js.Object {
         |  type Value = js.Any
      """.stripMargin.trim + "\n\n" + moduleIcons + "\n" + "}\n"
    )

    Seq(moduleFile)
  }

}
