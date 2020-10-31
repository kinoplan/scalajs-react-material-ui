import sbt.Keys._
import sbt._
import sbt.plugins._

object BridgeGeneratorPlugin extends AutoPlugin {
  override def requires = JvmPlugin

  lazy val bridgeImplicitsGenerator = taskKey[Seq[File]]("bridge-implicits-generator")

  override lazy val projectSettings = Seq(
    bridgeImplicitsGenerator := Generator.bridgeImplicits(
      (sourceManaged in Compile).value / "io" / "kinoplan" / "scalajs" / "react" / "bridge"
    ),
    sourceGenerators in Compile += bridgeImplicitsGenerator.taskValue
  )
}
