import sbt._
import org.portablescala.sbtplatformdeps.PlatformDepsPlugin.autoImport._

object Dependencies {

  object Versions {
    val scalaCssV = "0.6.1"
    val scalaJsReactV = "1.7.6"
  }

  import Versions._

  //A -> Z
  val catsCore             = Def.setting("org.typelevel"                     %%% "cats-core"             % "2.1.1")
  val scalaCssCore         = Def.setting("com.github.japgolly.scalacss"      %%% "core"                  % scalaCssV)
  val scalaCssExtReact     = Def.setting("com.github.japgolly.scalacss"      %%% "ext-react"             % scalaCssV)
  val scalaCssExtScalatags = Def.setting("com.github.japgolly.scalacss"       %% "ext-scalatags"         % scalaCssV)
  val scalaJsDom           = Def.setting("org.scala-js"                      %%% "scalajs-dom"           % "1.1.0")
  val scalaJsReactCore     = Def.setting("com.github.japgolly.scalajs-react" %%% "core"                  % scalaJsReactV)
  val scalaJsReactExtra    = Def.setting("com.github.japgolly.scalajs-react" %%% "extra"                 % scalaJsReactV)
  val scalablyTypedRuntime = Def.setting("com.olvind"                        %%% "scalablytyped-runtime" % "2.1.0")
}
