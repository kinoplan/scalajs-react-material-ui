ThisBuild / semanticdbEnabled := true

ThisBuild / semanticdbVersion := "4.4.22"

ThisBuild / scalafixScalaBinaryVersion := CrossVersion.binaryScalaVersion(scalaVersion.value)

ThisBuild / scalafixDependencies ++= Seq(
  "com.github.liancheng" %% "organize-imports" % "0.6.0"
)
