ThisBuild / semanticdbEnabled := true

ThisBuild / semanticdbVersion := scalafixSemanticdb.revision

ThisBuild / scalafixScalaBinaryVersion := "2.13"

ThisBuild / scalafixDependencies ++= Seq("com.github.liancheng" %% "organize-imports" % "0.6.0")
