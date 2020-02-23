<h1 align="center">scalajs-react-material-ui</h1>

<div align="center">

[scalajs-react](https://github.com/japgolly/scalajs-react) facade developed with [scalajs-react-bridge](https://github.com/payalabs/scalajs-react-bridge) for [@material-ui/core](https://github.com/mui-org/material-ui/tree/v3.x/packages/material-ui), [@material-ui/icons](https://github.com/mui-org/material-ui/tree/v3.x/packages/material-ui-icons), [@material-ui/lab](https://github.com/mui-org/material-ui/tree/v3.x/packages/material-ui-lab)

![Scala CI](https://github.com/kinoplan/scalajs-react-material-ui/workflows/Scala%20CI/badge.svg?branch=master)
[![Maven Central](https://img.shields.io/maven-central/v/io.kinoplan/scalajs-react-material-ui-core_sjs0.6_2.12.svg?label=Maven%20Central)](https://search.maven.org/search?q=g:%22io.kinoplan%22%20AND%20(a:%22scalajs-react-material-ui-core_sjs0.6_2.12%22%20OR%20a:%22scalajs-react-material-ui-icons_sjs0.6_2.12%22%20OR%20a:%22scalajs-react-material-ui-lab_sjs0.6_2.12%22))
[![Scala](https://img.shields.io/badge/Scala-2.12.10-red.svg?logo=Scala&logoColor=red)](https://www.scala-lang.org/)
[![Scala.js](https://img.shields.io/badge/Scala.js-0.6.32-orange.svg?logo=Scala&logoColor=orange)](https://www.scala-js.org/)
[![react](https://img.shields.io/badge/react-16.7.0-61DAFB.svg?logo=React)](https://ru.reactjs.org/)
[![scalajs-react](https://img.shields.io/static/v1?label=scalajs-react&message=1.6.0&color=blue)](https://github.com/japgolly/scalajs-react)
[![material-ui](https://img.shields.io/static/v1?label=material-ui&message=3.9.0&color=ff69b4)](https://v3.material-ui.com/)

</div>

## Usage
1. Add `libraryDependencies` to your [scalajs-react](https://github.com/japgolly/scalajs-react) project:

    ```scala
    libraryDependencies ++= Seq(
      "io.kinoplan" %%% "scalajs-react-material-ui-core"  % "0.0.1",
      "io.kinoplan" %%% "scalajs-react-material-ui-icons" % "0.0.1",
      "io.kinoplan" %%% "scalajs-react-material-ui-lab"   % "0.0.1"
    )
    ```

2. Add `npmDependencies` using [scalajs-bundler](https://scalacenter.github.io/scalajs-bundler/):

    ```scala
    npmDependencies in Compile ++= Seq(
      "@material-ui/core"  -> "3.9.0",
      "@material-ui/icons" -> "3.0.2",
      "@material-ui/lab"   -> "3.0.0-alpha.30"
    )
    ```

## Demo

See the [demo](/demo) project.

The project has almost all the examples in the js
[Component Demos](https://v3.material-ui.com/getting-started/installation/) written in Scala!

In the demo you can also find very detailed examples of using a bunch of: 

- [scala.js](http://scala-js.org)
- [scalajs-dom](http://scala-js.github.io/scala-js-dom/)
- [scalajs-react](https://github.com/japgolly/scalajs-react)
- [scalacss](https://github.com/japgolly/scalacss)
- [scalajs-react-material-ui](https://github.com/kinoplan/scalajs-react-material-ui)
- [ScalablyTyped/Distribution](https://github.com/ScalablyTyped/Distribution)

Start:
1. `sbt`
2. `restartWDS`
3. Open in browser `localhost:8080`

## License

This project is licensed under the terms of the [MIT license](/LICENSE).
