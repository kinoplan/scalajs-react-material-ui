import sbt._
import org.portablescala.sbtplatformdeps.PlatformDepsPlugin.autoImport._

object Dependencies {

  object Versions {
    val catsCoreV = "2.6.1"
    val scalaCssV = "0.7.0"
    val scalaJsDomV = "1.2.0"
    val scalaJsReactV = "1.7.7"
  }

  import Versions._

  //A -> Z
  val catsCore             = Def.setting("org.typelevel"                     %%% "cats-core"             % catsCoreV)
  val scalaCssCore         = Def.setting("com.github.japgolly.scalacss"      %%% "core"                  % scalaCssV)
  val scalaCssExtReact     = Def.setting("com.github.japgolly.scalacss"      %%% "ext-react"             % scalaCssV)
  val scalaCssExtScalatags = Def.setting("com.github.japgolly.scalacss"       %% "ext-scalatags"         % scalaCssV)
  val scalaJsDom           = Def.setting("org.scala-js"                      %%% "scalajs-dom"           % scalaJsDomV)
  val scalaJsReactCore     = Def.setting("com.github.japgolly.scalajs-react" %%% "core"                  % scalaJsReactV)
  val scalaJsReactExtra    = Def.setting("com.github.japgolly.scalajs-react" %%% "extra"                 % scalaJsReactV)
}
