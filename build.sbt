lazy val root =
  if (Settings.isDemoEnabled)
    project.in(file(".")).aggregate(core, icons, lab, bridge, demo).configure(Settings.rootProject)
  else
    project.in(file(".")).aggregate(core, icons, lab, bridge).configure(Settings.rootProject)

inThisBuild(
  List(
    organization := Settings.organization,
    homepage := Some(url("https://github.com/kinoplan/scalajs-react-material-ui")),
    licenses := Seq("MIT" -> url("http://opensource.org/licenses/MIT")),
    developers := List(
      Developer(
        "kinoplan",
        "Kinoplan",
        "job@kinoplan.ru",
        url("https://kinoplan.tech")
      )
    ),
    scmInfo := Some(
      ScmInfo(
        url("https://github.com/kinoplan/scalajs-react-material-ui"),
        "scm:git:git@github.com:kinoplan/scalajs-react-material-ui.git"
      )
    )
  )
)

lazy val muiColorsGenerator = taskKey[Seq[File]]("mui-colors-generator")

lazy val core = (project in file("core"))
  .dependsOn(bridge)
  .configure(Settings.publishArtifactSettings)
  .settings(commonSettings).settings(
  name := "scalajs-react-material-ui-core",
  scalaJSUseMainModuleInitializer := false,
  npmDependencies in Compile ++= Settings.npmDependenciesCore.value,
  npmResolutions in Compile ++= (npmDependencies in Compile).value.toMap,
  libraryDependencies ++= Settings.scalajsDependenciesLib.value,
  muiColorsGenerator := Generator.muiColors(
    (sourceManaged in Compile).value / "io" / "kinoplan" / "scalajs" / "react" / "material" / "ui" / "core" / "colors",
    (npmInstallDependencies in Compile).value
  ),
  sourceGenerators in Compile += muiColorsGenerator.taskValue
).enablePlugins(ScalaJSBundlerPlugin)

lazy val muiIconsGenerator = taskKey[Seq[File]]("mui-icons-generator")

lazy val icons = (project in file("icons"))
  .dependsOn(bridge)
  .configure(Settings.publishArtifactSettings)
  .settings(commonSettings).settings(
  name := "scalajs-react-material-ui-icons",
  scalaJSUseMainModuleInitializer := false,
  npmDependencies in Compile ++= Settings.npmDependenciesIcons.value,
  npmResolutions in Compile ++= (npmDependencies in Compile).value.toMap,
  libraryDependencies ++= Settings.scalajsDependenciesLib.value,
  muiIconsGenerator := Generator.muiIcons(
    (sourceManaged in Compile).value / "io" / "kinoplan" / "scalajs" / "react" / "material" / "ui" / "icons",
    (npmInstallDependencies in Compile).value
  ),
  sourceGenerators in Compile += muiIconsGenerator.taskValue
).enablePlugins(ScalaJSBundlerPlugin)

lazy val lab = (project in file("lab"))
  .dependsOn(bridge)
  .configure(Settings.publishArtifactSettings)
  .settings(commonSettings).settings(
  name := "scalajs-react-material-ui-lab",
  scalaJSUseMainModuleInitializer := false,
  npmDependencies in Compile ++= Settings.npmDependenciesLab.value,
  npmResolutions in Compile ++= (npmDependencies in Compile).value.toMap,
  libraryDependencies ++= Settings.scalajsDependenciesLib.value
).enablePlugins(ScalaJSBundlerPlugin)

lazy val demo = (project in file("demo")).dependsOn(core, lab, bridge)
  .settings(commonSettings).settings(
  scalaJSUseMainModuleInitializer := true,
  scalaJSLinkerConfig ~= (_.withSourceMap(false)),
  stUseScalaJsDom := false,
  stFlavour := Flavour.Japgolly,
  stIgnore ++= Settings.stIgnore,
  stOutputPackage := "io.kinoplan.scalajs.react.libs.external",
  npmDependencies in Compile ++= Settings.npmDependenciesDemo.value,
  npmResolutions in Compile ++= (npmDependencies in Compile).value.toMap,
  libraryDependencies ++= Settings.scalajsDependenciesDemo.value,
  webpackDevServerExtraArgs := Seq("--inline"),
  yarnExtraArgs := Seq("--silent"),
  webpackConfigFile in fastOptJS := Some(baseDirectory.value / "dev.webpack.config.js"),
  skip in publish := true
).enablePlugins(ScalaJSBundlerPlugin, ScalablyTypedConverterPlugin)

lazy val bridge = (project in file("utils/bridge"))
  .configure(Settings.publishArtifactSettings)
  .settings(commonSettings).settings(
  name := "scalajs-react-bridge",
  scalaJSUseMainModuleInitializer := false,
  npmDependencies in Compile ++= Settings.npmDependenciesBridge.value,
  npmResolutions in Compile ++= (npmDependencies in Compile).value.toMap,
  libraryDependencies ++= Settings.scalajsDependenciesBridge.value
).enablePlugins(ScalaJSBundlerPlugin, BridgeGeneratorPlugin)

lazy val commonSettings = Seq(
  crossScalaVersions := Seq("2.12.11", "2.13.3"),
  scalaVersion := crossScalaVersions.value.last,
  description := Settings.description,
  webpackBundlingMode := BundlingMode.LibraryOnly(),
  useYarn := true,
  version in webpack := Settings.versions.bundler.webpack,
  version in startWebpackDevServer := Settings.versions.bundler.webpackDev,
  webpackCliVersion := Settings.versions.bundler.webpackCli,
  javacOptions ++= Settings.javacOptions,
  scalacOptions ++= Settings.scalacOptions,
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

onLoad in Global := (
  "project bridge" ::
  "bridgeImplicitsGenerator" ::
  "project root" ::
  (_: State)
) compose (onLoad in Global).value
