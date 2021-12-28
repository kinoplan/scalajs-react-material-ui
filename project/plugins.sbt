val scalaJSVersion = Option(System.getenv("SCALAJS_VERSION")).getOrElse("1.8.0")

addSbtPlugin("org.scalablytyped.converter" % "sbt-converter" % "1.0.0-beta33")

addSbtPlugin("org.scala-js" % "sbt-scalajs" % scalaJSVersion)

addSbtPlugin("ch.epfl.scala" % "sbt-scalajs-bundler" % "0.20.0")

addSbtPlugin("io.github.davidgregory084" % "sbt-tpolecat" % "0.1.20")

addSbtPlugin("ch.epfl.scala" % "sbt-scalafix" % "0.9.33")

addSbtPlugin("com.github.sbt" % "sbt-ci-release" % "1.5.10")
