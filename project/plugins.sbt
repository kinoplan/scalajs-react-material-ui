val scalaJSVersion = Option(System.getenv("SCALAJS_VERSION")).getOrElse("0.6.32")

// Unmanaged jars in client/lib are used until the LTS version of sbt-scalablytyped appears
//resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
//
//addSbtPlugin("org.scalablytyped" % "sbt-scalablytyped" % "201912120707")

addSbtPlugin("org.scala-js" % "sbt-scalajs" % scalaJSVersion)

addSbtPlugin("ch.epfl.scala" % "sbt-scalajs-bundler-sjs06" % "0.16.0")

addSbtPlugin("com.geirsson" % "sbt-ci-release" % "1.5.2")