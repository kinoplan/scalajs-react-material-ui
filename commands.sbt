addCommandAlias("fix", ";+scalafixAll")
addCommandAlias("fixCheck", ";scalafixAll --check")

addCommandAlias("dev", "; demo/fastOptJS::stopWebpackDevServer; ~demo/fastOptJS::startWebpackDevServer")
