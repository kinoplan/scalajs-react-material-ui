<h1 align="center">scalajs-react-material-ui</h1>

<div align="center">

[scalajs-react](https://github.com/japgolly/scalajs-react) facade for [@material-ui/core](https://github.com/mui-org/material-ui/tree/v3.x/packages/material-ui), [@material-ui/icons](https://github.com/mui-org/material-ui/tree/v3.x/packages/material-ui-icons), [@material-ui/lab](https://github.com/mui-org/material-ui/tree/v3.x/packages/material-ui-lab)

![build](https://github.com/kinoplan/scalajs-react-material-ui/workflows/build/badge.svg)
[![Maven Central](https://img.shields.io/maven-central/v/io.kinoplan/scalajs-react-material-ui-core_sjs0.6_2.12.svg?label=Maven%20Central)](https://search.maven.org/search?q=g:%22io.kinoplan%22%20AND%20(a:%22scalajs-react-material-ui-core_sjs0.6_2.12%22%20OR%20a:%22scalajs-react-material-ui-icons_sjs0.6_2.12%22%20OR%20a:%22scalajs-react-material-ui-lab_sjs0.6_2.12%22))
[![Scala.js](https://www.scala-js.org/assets/badges/scalajs-1.1.0.svg)](https://www.scala-js.org/)
[![Scala.js](http://scala-js.org/assets/badges/scalajs-0.6.29.svg)](http://scala-js.org)
[![react](https://img.shields.io/badge/react-16.13.1-61DAFB.svg?logo=React)](https://ru.reactjs.org/)
[![scalajs-react](https://img.shields.io/static/v1?label=scalajs-react&message=1.7.6&color=blue)](https://github.com/japgolly/scalajs-react)
[![material-ui](https://img.shields.io/static/v1?label=material-ui&message=3.9.0&color=ff69b4)](https://v3.material-ui.com/)

</div>

## Usage
The scalajs-react-material-ui libraries is currently available for Scala.js 0.6.33/1.1.1 and Scala 2.12.x/2.13.x.

1. Add `libraryDependencies` to your [scalajs-react](https://github.com/japgolly/scalajs-react) project:

    ```scala
    libraryDependencies ++= Seq(
      "io.kinoplan" %%% "scalajs-react-material-ui-core"  % "0.2.1",
      "io.kinoplan" %%% "scalajs-react-material-ui-icons" % "0.2.1",
      "io.kinoplan" %%% "scalajs-react-material-ui-lab"   % "0.2.1"
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
- [scalablytyped](https://scalablytyped.org/docs/readme.html)

Start:
1. `sbt dev`
2. Open in browser `localhost:8080`

## License

This project is licensed under the terms of the [MIT license](/LICENSE).
