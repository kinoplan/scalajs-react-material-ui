addCommandAlias("restartWDS", "; demo/fastOptJS::stopWebpackDevServer; ~demo/fastOptJS::startWebpackDevServer")

val root = project.in(file(".")).settings(commonSettings).aggregate(facade, demo).settings(
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

lazy val muiIconsGenerator = taskKey[Seq[File]]("mui-icons-generator")

lazy val facade = (project in file("facade")).settings(commonSettings).settings(
  name := "scalajs-react-material-ui",
  scalaJSUseMainModuleInitializer  := false,
  npmDependencies in Compile ++= Settings.npmDependencies.value,
  libraryDependencies ++= Settings.scalajsDependencies.value,
  muiIconsGenerator := Settings.generateIcons(
    (sourceManaged in Compile).value / "io" / "kinoplan" / "scalajs" / "react" / "material" / "ui" / "icons",
    (npmInstallDependencies in Compile).value
  ),
  sourceGenerators in Compile += muiIconsGenerator.taskValue
).enablePlugins(ScalaJSBundlerPlugin)

lazy val demo = (project in file("demo"))//.dependsOn(facade)
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
  version in webpack := "4.29.3",
  version in startWebpackDevServer := "3.1.14",
  webpackCliVersion := "3.2.3",
  emitSourceMaps := false,
  javacOptions ++= Settings.javacOptions,
  scalacOptions in ThisBuild ++= Settings.scalacOptions
)
