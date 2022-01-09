<h1 align="center">scalajs-react-material-ui</h1>

<div align="center">

[scalajs-react](https://github.com/japgolly/scalajs-react) facade for [@material-ui/core](https://github.com/mui-org/material-ui/tree/v3.x/packages/material-ui), [@material-ui/icons](https://github.com/mui-org/material-ui/tree/v3.x/packages/material-ui-icons), [@material-ui/lab](https://github.com/mui-org/material-ui/tree/v3.x/packages/material-ui-lab)

![build](https://github.com/kinoplan/scalajs-react-material-ui/workflows/build/badge.svg)
[![Mergify Status](https://img.shields.io/endpoint.svg?url=https://api.mergify.com/v1/badges/kinoplan/utils?style=flat)](https://mergify.com)
[![Scala Steward badge](https://img.shields.io/badge/Scala_Steward-helping-blue.svg?style=flat\&logo=data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAA4AAAAQCAMAAAARSr4IAAAAVFBMVEUAAACHjojlOy5NWlrKzcYRKjGFjIbp293YycuLa3pYY2LSqql4f3pCUFTgSjNodYRmcXUsPD/NTTbjRS+2jomhgnzNc223cGvZS0HaSD0XLjbaSjElhIr+AAAAAXRSTlMAQObYZgAAAHlJREFUCNdNyosOwyAIhWHAQS1Vt7a77/3fcxxdmv0xwmckutAR1nkm4ggbyEcg/wWmlGLDAA3oL50xi6fk5ffZ3E2E3QfZDCcCN2YtbEWZt+Drc6u6rlqv7Uk0LdKqqr5rk2UCRXOk0vmQKGfc94nOJyQjouF9H/wCc9gECEYfONoAAAAASUVORK5CYII=)](https://scala-steward.org)
[![Scala.js](https://www.scala-js.org/assets/badges/scalajs-1.8.0.svg)](https://www.scala-js.org/)
[![react](https://img.shields.io/badge/react-17.0.2-61DAFB.svg?logo=React)](https://ru.reactjs.org/)
[![scalajs-react](https://img.shields.io/static/v1?label=scalajs-react&message=2.0.0&color=blue)](https://github.com/japgolly/scalajs-react)
[![material-ui](https://img.shields.io/static/v1?label=material-ui&message=3.9.4&color=e52b50)](https://v3.material-ui.com/)
[![Maven Central](https://img.shields.io/maven-central/v/io.kinoplan/scalajs-react-material-ui-core_sjs1_2.13.svg?label=Maven%20Central)](https://search.maven.org/search?q=g:%22io.kinoplan%22%20AND%20(a:%22scalajs-react-material-ui-core_sjs1_2.13%22%20OR%20a:%22scalajs-react-material-ui-icons_sjs1_2.13%22%20OR%20a:%22scalajs-react-material-ui-lab_sjs1_2.13%22))

</div>

## Usage
The scalajs-react-material-ui libraries is currently available for Scala.js 1.8.0+ and Scala 2.13.x.

1. Add `libraryDependencies` to your [scalajs-react](https://github.com/japgolly/scalajs-react) project:

    ```scala
    libraryDependencies ++= Seq(
      "io.kinoplan" %%% "scalajs-react-material-ui-core"  % ${version},
      "io.kinoplan" %%% "scalajs-react-material-ui-icons" % ${version},
      "io.kinoplan" %%% "scalajs-react-material-ui-lab"   % ${version}
    )
    ```

2. Add `npmDependencies` using [scalajs-bundler](https://scalacenter.github.io/scalajs-bundler/):

    ```scala
    npmDependencies in Compile ++= Seq(
      "@material-ui/core"  -> "3.9.4",
      "@material-ui/icons" -> "3.0.2",
      "@material-ui/lab"   -> "3.0.0-alpha.30"
    )
    ```

## Demo

See the [demo](/demo) project.

The project has almost all the examples in the js
[Component Demos](https://v3.mui.com/getting-started/installation/) written in Scala!

In the demo you can also find very detailed examples of using a bunch of: 

- [scala.js](http://scala-js.org)
- [scalajs-dom](http://scala-js.github.io/scala-js-dom/)
- [scalajs-react](https://github.com/japgolly/scalajs-react)
- [scalacss](https://github.com/japgolly/scalacss)
- [scalajs-react-material-ui](https://github.com/kinoplan/scalajs-react-material-ui)
- [scalablytyped](https://scalablytyped.org/docs/readme.html)

Start:[^1]
1. `sbt dev`
2. Open in browser `localhost:8080`

## Contributing

See [CONTRIBUTING.md](/CONTRIBUTING.md) for more details about how to contribute.

## License

This project is licensed under the terms of the [Apache License, Version 2.0](/LICENSE).

[^1]: (See [CONTRIBUTING.md](/CONTRIBUTING.md) for installing the necessary tools to run)
