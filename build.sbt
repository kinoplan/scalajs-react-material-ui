lazy val root =
  if (ProjectSettings.isDemoEnabled) project
    .in(file("."))
    .aggregate(core, icons, lab, bridge, demo)
    .configure(ProjectSettings.rootProfile)
  else project
    .in(file("."))
    .aggregate(core, icons, lab, bridge)
    .configure(ProjectSettings.rootProfile)

lazy val core = project
  .in(file("core"))
  .enablePlugins(MuiColorsGeneratorPlugin)
  .configure(Modules.coreProfile)
  .dependsOn(bridge)

lazy val icons = project
  .in(file("icons"))
  .enablePlugins(MuiIconsGeneratorPlugin)
  .configure(Modules.iconsProfile)
  .dependsOn(bridge)

lazy val lab = project
  .in(file("lab"))
  .configure(Modules.labProfile)
  .dependsOn(bridge)

lazy val demo = project
  .in(file("demo"))
  .enablePlugins(ScalablyTypedConverterPlugin)
  .configure(Modules.demoProfile)
  .dependsOn(core, icons, lab, bridge)

lazy val bridge = project
  .in(file("utils/bridge"))
  .enablePlugins(BridgeGeneratorPlugin)
  .configure(Modules.bridgeProfile)

// format: off
inThisBuild(
  List(
    sonatypeCredentialHost := Sonatype.sonatype01,
    versionScheme := Some(VersionScheme.EarlySemVer),
    organization := "io.kinoplan",
    homepage := Some(url("https://github.com/kinoplan/scalajs-react-material-ui")),
    licenses := Seq("Apache-2.0" -> url("https://opensource.org/licenses/Apache-2.0")),
    developers := List(Developer("kinoplan", "Kinoplan", "job@kinoplan.ru", url("https://kinoplan.tech"))),
    scmInfo := Some(
      ScmInfo(
        url("https://github.com/kinoplan/scalajs-react-material-ui"),
        "scm:git:git@github.com:kinoplan/scalajs-react-material-ui.git"
      )
    )
  )
)
// format: on

onLoad in Global :=
  ("project bridge" :: "bridgeImplicitsGenerator" :: "project root" :: (_: State))
    .compose((onLoad in Global).value)
