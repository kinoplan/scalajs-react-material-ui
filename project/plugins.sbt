val scalaJSVersion = Option(System.getenv("SCALAJS_VERSION")).getOrElse("1.7.0")

addSbtPlugin("org.scalablytyped.converter" % "sbt-converter" % "1.0.0-beta33")

addSbtPlugin("org.scala-js" % "sbt-scalajs" % scalaJSVersion)

addSbtPlugin("ch.epfl.scala" % s"sbt-scalajs-bundler" % s"0.20.0")

addSbtPlugin("io.github.davidgregory084" % "sbt-tpolecat" % "0.1.20")

addSbtPlugin("ch.epfl.scala" % "sbt-scalafix" % "0.9.30")

addSbtPlugin("com.geirsson" % "sbt-ci-release" % "1.5.7")
