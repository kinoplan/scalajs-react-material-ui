// Unmanaged jars in client/lib are used until the LTS version of sbt-scalablytyped appears
//resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
//
//addSbtPlugin("org.scalablytyped" % "sbt-scalablytyped" % "201912120707")

addSbtPlugin("org.scala-js" % "sbt-scalajs" % "0.6.31")

addSbtPlugin("ch.epfl.scala" % "sbt-scalajs-bundler-sjs06" % "0.16.0")

addSbtPlugin("com.lihaoyi" % "workbench" % "0.4.1")