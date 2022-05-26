import org.scalablytyped.converter.plugin.ScalablyTypedPluginBase.autoImport._
import org.scalajs.sbtplugin.ScalaJSPlugin.autoImport._
import sbt.Keys._
import sbt._
import scalajsbundler.sbtplugin.ScalaJSBundlerPlugin.autoImport._

object Modules {

  lazy val coreProfile: Project => Project = _
    .configure(ProjectSettings.commonProfile)
    .settings(name := "scalajs-react-material-ui-core")
    .settings(scalaJSUseMainModuleInitializer := false)
    .settings(
      libraryDependencies ++= Seq(Dependencies.scalaJsReactCore.value),
      Compile / npmDependencies ++=
        Seq(
          DependenciesNPM.react,
          DependenciesNPM.reactDom,
          DependenciesNPM.materialUiCore
        ),
      Compile / npmResolutions ++=
        (Compile / npmDependencies).value.toMap
    )

  lazy val iconsProfile: Project => Project = _
    .configure(ProjectSettings.commonProfile)
    .settings(name := "scalajs-react-material-ui-icons")
    .settings(scalaJSUseMainModuleInitializer := false)
    .settings(
      libraryDependencies ++= Seq(Dependencies.scalaJsReactCore.value),
      Compile / npmDependencies ++=
        Seq(
          DependenciesNPM.react,
          DependenciesNPM.reactDom,
          DependenciesNPM.materialUiCore,
          DependenciesNPM.materialUiIcons
        ),
      Compile / npmResolutions ++=
        (Compile / npmDependencies).value.toMap
    )

  lazy val labProfile: Project => Project = _
    .configure(ProjectSettings.commonProfile)
    .settings(name := "scalajs-react-material-ui-lab")
    .settings(scalaJSUseMainModuleInitializer := false)
    .settings(
      libraryDependencies ++= Seq(Dependencies.scalaJsReactCore.value),
      Compile / npmDependencies ++=
        Seq(
          DependenciesNPM.react,
          DependenciesNPM.reactDom,
          DependenciesNPM.materialUiCore,
          DependenciesNPM.materialUiLab
        ),
      Compile / npmResolutions ++=
        (Compile / npmDependencies).value.toMap
    )

  lazy val bridgeProfile: Project => Project = _
    .configure(ProjectSettings.commonProfile)
    .settings(name := "scalajs-react-bridge")
    .settings(scalaJSUseMainModuleInitializer := false)
    .settings(
      libraryDependencies ++= Seq(Dependencies.scalaJsReactCore.value),
      Compile / npmDependencies ++= Seq(DependenciesNPM.react, DependenciesNPM.reactDom),
      Compile / npmResolutions ++=
        (Compile / npmDependencies).value.toMap
    )

  lazy val demoProfile: Project => Project = _
    .configure(ProjectSettings.commonProfile)
    .settings(
      scalaJSUseMainModuleInitializer := true,
      scalaJSLinkerConfig ~= (_.withSourceMap(false)),
      fastOptJS / webpackDevServerExtraArgs := Seq("--hot"),
      yarnExtraArgs := Seq("--silent"),
      fastOptJS / webpackConfigFile := Some(baseDirectory.value / "dev.webpack.config.js"),
      stUseScalaJsDom := false,
      stFlavour := Flavour.ScalajsReact,
      stIgnore ++=
        List(
          "react-dom",
//          "@mui/material",
          "@mui/icons-material",
          "@mui/lab",
          "@mui/types",
//          "@material-ui/types",
          "@mui/system"
        ),
      stOutputPackage := "io.kinoplan.scalajs.react.libs.external"
    )
    .settings(
      libraryDependencies ++=
        Seq(
          Dependencies.catsCore.value,
          Dependencies.scalaCssCore.value,
          Dependencies.scalaCssExtReact.value,
          Dependencies.scalaJsDom.value,
          Dependencies.scalaJsReactCore.value,
          Dependencies.scalaJsReactExtra.value
        ),
      Compile / npmDependencies ++=
        Seq(
          DependenciesNPM.emotionCore,
          DependenciesNPM.emotionReact,
          DependenciesNPM.emotionStyled,
          DependenciesNPM.react,
          DependenciesNPM.reactDom,
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
        ),
      Compile / npmResolutions ++=
        (Compile / npmDependencies).value.toMap
    )
    .settings(publish / skip := true)

}
