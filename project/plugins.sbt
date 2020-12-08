val scalaJSVersion = Option(System.getenv("SCALAJS_VERSION")).getOrElse("1.1.1")

resolvers += Resolver.bintrayRepo("oyvindberg", "converter")

addSbtPlugin("org.scalablytyped.converter" % s"sbt-converter${if (scalaJSVersion.startsWith("0.6")) "06" else ""}" % "1.0.0-beta28")

addSbtPlugin("org.scala-js" % "sbt-scalajs" % scalaJSVersion)

addSbtPlugin("ch.epfl.scala" % s"sbt-scalajs-bundler${if (scalaJSVersion.startsWith("0.6")) "-sjs06" else ""}" % s"0.${if (scalaJSVersion.startsWith("0.6")) "18" else "20"}.0")

addSbtPlugin("io.github.davidgregory084" % "sbt-tpolecat" % "0.1.16")

addSbtPlugin("ch.epfl.scala" % "sbt-scalafix" % "0.9.24")

addSbtPlugin("com.geirsson" % "sbt-ci-release" % "1.5.5")
