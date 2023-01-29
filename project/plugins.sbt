val scalaJSVersion = Option(System.getenv("SCALAJS_VERSION")).getOrElse("1.13.0")

addSbtPlugin(
  "org.scalablytyped.converter" % "sbt-converter" % "1.0.0-beta37"
)

addSbtPlugin("org.scala-js" % "sbt-scalajs" % scalaJSVersion)

addSbtPlugin("ch.epfl.scala" % "sbt-scalajs-bundler" % "0.21.0-RC1")

addSbtPlugin("io.github.davidgregory084" % "sbt-tpolecat" % "0.3.1")

addSbtPlugin("ch.epfl.scala" % "sbt-scalafix" % "0.10.0")

addSbtPlugin("org.scalameta" % "sbt-scalafmt" % "2.4.6")

addSbtPlugin("com.github.sbt" % "sbt-ci-release" % "1.5.10")
