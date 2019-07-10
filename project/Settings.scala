import sbt._
import org.portablescala.sbtplatformdeps.PlatformDepsPlugin.autoImport._

object Settings {
  val version = "0.0.1"

  val organization = "io.kinoplan"

  val description = "scalajs-react facade for material-ui"

  object versions {
    val scala = "2.12.8"

    object bundler {
      val webpack = "4.33.0"
      val webpackDev = "3.7.0"
      val webpackCli = "3.3.2"
    }

    object scalajs {
      val scalajsReact = "1.4.2"
      val scalaCss = "0.5.6"
      val scalajsDom = "0.9.7"
      val catsCore = "2.0.0-M1"
      val scalajsReactBridge = "0.8.0"
    }

    object npm {
      val react = "16.7.0"
      val reactSwipeableViews = "0.13.3"

      val materialUi = "3.9.0"
      val materialUiIcons = "3.0.2"
    }
  }

  val scalajsDependencies = Def.setting(Seq(
    "com.github.japgolly.scalajs-react" %%% "core"                 % versions.scalajs.scalajsReact,
    "com.github.japgolly.scalajs-react" %%% "extra"                % versions.scalajs.scalajsReact,
    "com.github.japgolly.scalacss"      %%% "core"                 % versions.scalajs.scalaCss,
    "com.github.japgolly.scalacss"      %%% "ext-react"            % versions.scalajs.scalaCss,
    "com.github.japgolly.scalacss"      %% "ext-scalatags"         % versions.scalajs.scalaCss,
    "org.scala-js"                      %%% "scalajs-dom"          % versions.scalajs.scalajsDom,
    "org.typelevel"                     %%% "cats-core"            % versions.scalajs.catsCore,
    "com.payalabs"                      %%% "scalajs-react-bridge" % versions.scalajs.scalajsReactBridge
  ))

  val npmDependencies = Def.setting(Seq(
    "react"                       -> versions.npm.react,
    "react-dom"                   -> versions.npm.react,
    "react-swipeable-views"       -> versions.npm.reactSwipeableViews,
    "react-swipeable-views-utils" -> versions.npm.reactSwipeableViews,
    "@material-ui/core"           -> versions.npm.materialUi,
    "@material-ui/icons"          -> versions.npm.materialUiIcons,
  ))

  def generateColors(src: File, npm: File): Seq[File] = {
    val path = npm / "node_modules" / "@material-ui" / "core" / "colors"
    val extensions = "*.js" -- "index.js" -- "index.es.js" -- "common.js"

    val colorSources = path * extensions

    val colorsPackageFile = src / "package.scala"

    val colorsPackage = colorSources.get.sortBy(_.getName).map(file => {
      val name = file.getName.stripSuffix(".js")

      s"""    @JSImport("@material-ui/core/colors/$name", JSImport.Default)
         |    @js.native
         |    object $name extends Color
         |""".stripMargin
    }).mkString(
      start =
        """package io.kinoplan.scalajs.react.material.ui.core
          |
          |import scala.scalajs.js
          |import scala.scalajs.js.annotation.JSImport
          |
          |package object colors {
          |
          |""".stripMargin,
      sep = "\n",
      end =
        """
          |    @JSImport("@material-ui/core/colors/common", JSImport.Default)
          |    @js.native
          |    object common extends CommonColors
          |}
          |""".stripMargin
    )

    IO.write(colorsPackageFile, colorsPackage)

    Seq(colorsPackageFile)
  }

  def generateIcons(src: File, npm: File): Seq[File] = {
    val iconSources = (npm / "node_modules" / "@material-ui" / "icons" ) * ("*.js" -- "index.js" -- "index.es.js")

    val files: Seq[File] = iconSources.get.map(f => {
      val name = f.getName.stripSuffix(".js")
      val file = src / s"Mui${name}Icon.scala"

      IO.write(
        file,
        s"""package io.kinoplan.scalajs.react.material.ui.icons
           |
           |import com.payalabs.scalajs.react.bridge.{ReactBridgeComponent, WithProps}
           |
           |import scala.scalajs.js
           |import scala.scalajs.js.annotation.JSImport
           |import scala.scalajs.js.|
           |
           |object Mui${name}Icon extends ReactBridgeComponent with SvgIconExtensions {
           |
           |  override protected lazy val componentValue: js.Object = RawComponent
           |
           |  @JSImport("@material-ui/icons/$name", JSImport.Default)
           |  @js.native
           |  object RawComponent extends js.Object
           |
           |  def apply(
           |    classes: Map[ClassKey.ClassKey, String] = Map.empty,
           |    color: Color.Value = Color.inherit,
           |    component: Option[String | js.Function] = Some("svg"),
           |    fontSize: FontSize.Value = FontSize.default,
           |    nativeColor: Option[String] = None,
           |    shapeRendering: Option[String] = None,
           |    titleAccess: Option[String] = None,
           |    viewBox: String = "0 0 24 24"
           |  ): WithProps = auto
           |}
          """.stripMargin.trim
      )

      file
    })

    files
  }

  val javacOptions = Seq(
    "-source", "1.8",
    "-target", "1.8",
    "-Xlint"
  )

  val scalacOptions = Seq(
    "-target:jvm-1.8",
    "-deprecation",                      // Emit warning and location for usages of deprecated APIs.
    "-encoding", "utf-8",                // Specify character encoding used by source files.
    "-explaintypes",                     // Explain type errors in more detail.
    "-feature",                          // Emit warning and location for usages of features that should be imported explicitly.
    "-language:existentials",            // Existential types (besides wildcard types) can be written and inferred
    "-language:experimental.macros",     // Allow macro definition (besides implementation and application)
    "-language:higherKinds",             // Allow higher-kinded types
    "-language:implicitConversions",     // Allow definition of implicit functions called views
    "-unchecked",                        // Enable additional warnings where generated code depends on assumptions.
    "-Xcheckinit",                       // Wrap field accessors to throw an exception on uninitialized access.
    "-Xfatal-warnings",                  // Fail the compilation if there are any warnings.
    "-Xfuture",                          // Turn on future language features.
    "-Xlint:adapted-args",               // Warn if an argument list is modified to match the receiver.
    "-Xlint:by-name-right-associative",  // By-name parameter of right associative operator.
    "-Xlint:constant",                   // Evaluation of a constant arithmetic expression results in an error.
    "-Xlint:delayedinit-select",         // Selecting member of DelayedInit.
    "-Xlint:doc-detached",               // A Scaladoc comment appears to be detached from its element.
    "-Xlint:inaccessible",               // Warn about inaccessible types in method signatures.
    "-Xlint:infer-any",                  // Warn when a type argument is inferred to be `Any`.
    "-Xlint:missing-interpolator",       // A string literal appears to be missing an interpolator id.
    "-Xlint:nullary-override",           // Warn when non-nullary `def f()' overrides nullary `def f'.
    "-Xlint:nullary-unit",               // Warn when nullary methods return Unit.
    "-Xlint:option-implicit",            // Option.apply used implicit view.
    "-Xlint:package-object-classes",     // Class or object defined in package object.
    "-Xlint:poly-implicit-overload",     // Parameterized overloaded implicit methods are not visible as view bounds.
    "-Xlint:private-shadow",             // A private field (or class parameter) shadows a superclass field.
    "-Xlint:stars-align",                // Pattern sequence wildcard must align with sequence component.
    "-Xlint:type-parameter-shadow",      // A local type parameter shadows a type already in scope.
    "-Xlint:unsound-match",              // Pattern match may not be typesafe.
    "-Yno-adapted-args",                 // Do not adapt an argument list (either by inserting () or creating a tuple) to match the receiver.
    "-Ypartial-unification",             // Enable partial unification in type constructor inference
    "-Ywarn-extra-implicit",             // Warn when more than one implicit parameter section is defined.
    "-Ywarn-inaccessible",               // Warn about inaccessible types in method signatures.
    "-Ywarn-infer-any",                  // Warn when a type argument is inferred to be `Any`.
    "-Ywarn-nullary-override",           // Warn when non-nullary `def f()' overrides nullary `def f'.
    "-Ywarn-nullary-unit",               // Warn when nullary methods return Unit.
    "-Ywarn-numeric-widen",              // Warn when numerics are widened.
    "-Ywarn-unused:implicits",           // Warn if an implicit parameter is unused.
    "-Ywarn-unused:imports",             // Warn if an import selector is not referenced.
    "-Ywarn-unused:locals",              // Warn if a local definition is unused.
    // "-Ywarn-unused:params",              // Warn if a value parameter is unused.
    // "-Ywarn-unused:patvars",             // Warn if a variable bound in a pattern is unused.
    "-Ywarn-unused:privates",            // Warn if a private member is unused.
    "-Ywarn-value-discard",              // Warn when non-Unit expression results are unused.
    "-P:scalajs:sjsDefinedByDefault",
    "-Yrangepos"
  )
}
