addCommandAlias("restartWDS", "; demo/fastOptJS::stopWebpackDevServer; ~demo/fastOptJS::startWebpackDevServer")

lazy val root = project.in(file(".")).settings(commonSettings).aggregate(core, icons, demo).settings(
  name                 := "scalajs-react-material-ui",
  // No, SBT, we don't want any artifacts for root.
  // No, not even an empty jar.
  publish              := {},
  publishLocal         := {},
  publishArtifact      := false,
  Keys.`package`       := file(""),
).settings(
  aggregate in doc := false
)

lazy val core = (project in file("core")).settings(commonSettings).settings(
  name := "scalajs-react-material-ui-core",
  scalaJSUseMainModuleInitializer  := false,
  npmDependencies in Compile ++= Settings.npmDependencies.value,
  libraryDependencies ++= Settings.scalajsDependencies.value
).enablePlugins(ScalaJSBundlerPlugin)

lazy val muiIconsGenerator = taskKey[Seq[File]]("mui-icons-generator")

lazy val icons = (project in file("icons")).settings(commonSettings).settings(
  name := "scalajs-react-material-ui-icons",
  scalaJSUseMainModuleInitializer  := false,
  npmDependencies in Compile ++= Settings.npmDependencies.value,
  libraryDependencies ++= Settings.scalajsDependencies.value,
  muiIconsGenerator := Settings.generateIcons(
    (sourceManaged in Compile).value / "io" / "kinoplan" / "scalajs" / "react" / "material" / "ui" / "icons",
    (npmInstallDependencies in Compile).value
  ),
  sourceGenerators in Compile += muiIconsGenerator.taskValue
).enablePlugins(ScalaJSBundlerPlugin)

lazy val demo = (project in file("demo")).dependsOn(core)
  .settings(commonSettings).settings(
  scalaJSUseMainModuleInitializer  := true,
  npmDependencies in Compile ++= Settings.npmDependencies.value,
  libraryDependencies ++= Settings.scalajsDependencies.value,
  webpackBundlingMode              := BundlingMode.LibraryOnly(),
  webpackDevServerExtraArgs        := Seq("--inline"),
  yarnExtraArgs                    := Seq("--silent"),
  webpackConfigFile in fastOptJS   := Some(baseDirectory.value / "dev.webpack.config.js"),
  // don't publish the demo
  publish                          := {},
  publishLocal                     := {},
  publishArtifact                  := false,
  Keys.`package`                   := file("")
).enablePlugins(ScalaJSBundlerPlugin)

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
