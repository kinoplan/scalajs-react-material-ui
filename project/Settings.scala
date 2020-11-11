import sbt.Keys._
import sbt._

object Settings {
  val organization = "io.kinoplan"

  val description = "scalajs-react facade for material-ui"

  val isScalaJSVersion06 = Option(System.getenv("SCALAJS_VERSION")).exists(_.startsWith("0.6"))

  val isDemoEnabled = Option(System.getenv("DEMO_ENABLED")).getOrElse("1").startsWith("1")

  val isPublishVersion = Option(System.getenv("PUBLISH_VERSION")).getOrElse("0").startsWith("1")

  object versions {
    object bundler {
      val webpack = "4.41.5"
      val webpackDev = "3.10.2"
      val webpackCli = "3.3.10"
    }
  }

  val scalajsDependenciesLib = Def.setting(Seq(
    Dependencies.scalaJsReactCore.value
  ))

  val scalajsDependenciesDemo = Def.setting(Seq(
    Dependencies.catsCore.value,
    Dependencies.scalaCssCore.value,
    Dependencies.scalaCssExtReact.value,
    Dependencies.scalaCssExtScalatags.value,
    Dependencies.scalaJsDom.value,
    Dependencies.scalaJsReactCore.value,
    Dependencies.scalaJsReactExtra.value
  ))

  val reactDependencies = Seq(
    DependenciesNPM.react,
    DependenciesNPM.reactDom
  )

  val npmDependenciesCore = Def.setting(reactDependencies ++ Seq(
    DependenciesNPM.materialUiCore
  ))

  val npmDependenciesIcons = Def.setting(reactDependencies ++ Seq(
    DependenciesNPM.materialUiCore,
    DependenciesNPM.materialUiIcons
  ))

  val npmDependenciesLab = Def.setting(reactDependencies ++ Seq(
    DependenciesNPM.materialUiCore,
    DependenciesNPM.materialUiLab
  ))

  val npmDependenciesDemo = Def.setting(reactDependencies ++ Seq(
    DependenciesNPM.materialUiCore,
    DependenciesNPM.materialUiIcons,
    DependenciesNPM.materialUiLab,
    DependenciesNPM.reactSwipeableViews,
    DependenciesNPM.reactSwipeableViewsUtils,
    DependenciesNPM.typesReactSwipeableViewsUtils,
    DependenciesNPM.typesReactSwipeableViews,
    DependenciesNPM.typesReactSwipeableViewsUtils,
    DependenciesNPM.typesReact,
    DependenciesNPM.typesReactDom
  ))

  val npmDependenciesBridge = Def.setting(reactDependencies)

  val javacOptions = Seq(
    "-source", "1.8",
    "-target", "1.8",
    "-Xlint"
  )

  val scalacOptions = if (isScalaJSVersion06) Seq("-P:scalajs:sjsDefinedByDefault") else Nil

  val stIgnore = List(
    "react-dom",
    "@material-ui/core",
    "@material-ui/icons",
    "@material-ui/lab",
    "@material-ui/types"
  )

  lazy val rootProject: Project => Project = _.settings(
    name := "scalajs-react-material-ui",
    skip in publish := true,
    skip in publishLocal := true,
    skip in publishArtifact := true,
    Keys.`package` := file("")
  )
}
