addCommandAlias("fix", "+scalafixAll")
addCommandAlias("fmt", "+scalafmtAll; +demo/scalafmt; +scalafmtSbt;")
addCommandAlias("format", "fix;fmt;")

addCommandAlias(
  "dev",
  "; demo/fastOptJS::stopWebpackDevServer; ~demo/fastOptJS::startWebpackDevServer"
)
