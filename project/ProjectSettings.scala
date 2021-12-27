import sbt.Keys._
import sbt._
import scalafix.sbt.ScalafixPlugin
import scalajsbundler.BundlingMode
import scalajsbundler.sbtplugin.ScalaJSBundlerPlugin
import scalajsbundler.sbtplugin.ScalaJSBundlerPlugin.autoImport._

object ProjectSettings {

  val isDemoEnabled: Boolean = Option(System.getenv("DEMO_ENABLED")).getOrElse("1").startsWith("1")

  lazy val commonProfile: Project => Project = _
    .enablePlugins(ScalaJSBundlerPlugin, ScalafixPlugin)
    .settings(
      crossScalaVersions := Seq("2.12.15", "2.13.7"),
      scalaVersion := crossScalaVersions.value.last,
      webpackBundlingMode := BundlingMode.LibraryOnly(),
      useYarn := true,
      webpack / version := "4.41.5",
      startWebpackDevServer / version := "3.10.2",
      webpackCliVersion := "3.3.10",
      scalacOptions ~= (_.filterNot(
        Set(
          "-Wdead-code",
          "-Wunused:params",
          "-Ywarn-dead-code",
          "-Ywarn-unused:params",
          "-Ywarn-unused:patvars",
          "-Wunused:explicits"
        )
      ))
    )

  lazy val rootProfile: Project => Project = _
    .settings(
      name := "scalajs-react-material-ui",
      publish / skip  := true,
      publishLocal / skip := true,
      publishArtifact / skip := true,
      Keys.`package` := file("")
    )
}
