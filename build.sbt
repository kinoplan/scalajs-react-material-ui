addCommandAlias("restartWDS", "; demo/fastOptJS::stopWebpackDevServer; ~demo/fastOptJS::startWebpackDevServer")

lazy val root = project.in(file(".")).settings(commonSettings).aggregate(core, icons, lab, demo).settings(
  name                 := "scalajs-react-material-ui",
  // No, SBT, we don't want any artifacts for root.
  // No, not even an empty jar.
  publish              := {},
  publishLocal         := {},
  publishArtifact      := false,
  Keys.`package`       := file("")
).settings(
  aggregate in doc := false
)

lazy val muiColorsGenerator = taskKey[Seq[File]]("mui-colors-generator")

lazy val core = (project in file("core")).settings(commonSettings).settings(
  name := "scalajs-react-material-ui-core",
  scalaJSUseMainModuleInitializer  := false,
  npmDependencies in Compile ++= Settings.npmDependenciesCore.value,
  libraryDependencies ++= Settings.scalajsDependenciesLib.value,
  muiColorsGenerator := Settings.generateColors(
    (sourceManaged in Compile).value / "io" / "kinoplan" / "scalajs" / "react" / "material" / "ui" / "core" / "colors",
    (npmInstallDependencies in Compile).value
  ),
  sourceGenerators in Compile += muiColorsGenerator.taskValue
).enablePlugins(ScalaJSBundlerPlugin)

lazy val muiIconsGenerator = taskKey[Seq[File]]("mui-icons-generator")

lazy val icons = (project in file("icons")).settings(commonSettings).settings(
  name := "scalajs-react-material-ui-icons",
  scalaJSUseMainModuleInitializer  := false,
  npmDependencies in Compile ++= Settings.npmDependenciesIcons.value,
  libraryDependencies ++= Settings.scalajsDependenciesLib.value,
  muiIconsGenerator := Settings.generateIcons(
    (sourceManaged in Compile).value / "io" / "kinoplan" / "scalajs" / "react" / "material" / "ui" / "icons",
    (npmInstallDependencies in Compile).value
  ),
  sourceGenerators in Compile += muiIconsGenerator.taskValue
).enablePlugins(ScalaJSBundlerPlugin)

lazy val lab = (project in file("lab")).settings(commonSettings).settings(
  name := "scalajs-react-material-ui-lab",
  scalaJSUseMainModuleInitializer  := false,
  npmDependencies in Compile ++= Settings.npmDependenciesLab.value,
  libraryDependencies ++= Settings.scalajsDependenciesLib.value
).enablePlugins(ScalaJSBundlerPlugin)

lazy val demo = (project in file("demo")).dependsOn(core, lab)
  .settings(commonSettings).settings(
  scalaJSUseMainModuleInitializer  := true,
  npmDependencies in Compile ++= Settings.npmDependenciesDemo.value,
  libraryDependencies ++= Settings.scalajsDependenciesDemo.value,
  webpackDevServerExtraArgs        := Seq("--inline"),
  yarnExtraArgs                    := Seq("--silent"),
  webpackConfigFile in fastOptJS   := Some(baseDirectory.value / "dev.webpack.config.js"),
  // don't publish the demo
  publish                          := {},
  publishLocal                     := {},
  publishArtifact                  := false,
  Keys.`package`                   := file("")
).enablePlugins(ScalaJSBundlerPlugin, WorkbenchPlugin)

lazy val commonSettings = Seq(
  version := Settings.version,
  scalaVersion := Settings.versions.scala,
  organization := Settings.organization,
  description := Settings.description,
  webpackBundlingMode := BundlingMode.LibraryOnly(),
  useYarn := true,
  version in webpack := Settings.versions.bundler.webpack,
  version in startWebpackDevServer := Settings.versions.bundler.webpackDev,
  webpackCliVersion := Settings.versions.bundler.webpackCli,
  emitSourceMaps := false,
  javacOptions ++= Settings.javacOptions,
  scalacOptions in ThisBuild ++= Settings.scalacOptions
)
