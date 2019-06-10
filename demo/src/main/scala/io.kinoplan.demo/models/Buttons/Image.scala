package io.kinoplan.demo.models.Buttons

import io.kinoplan.demo.utils.Constants.HOST

case class Image(
  url: String,
  title: String,
  width: String
)

object Image {
  val default = List(
    Image(
      url = s"$HOST/static/images/grid-list/breakfast.jpg",
      title = "Breakfast",
      width = "40%"
    ),
    Image(
      url = s"$HOST/static/images/grid-list/burgers.jpg",
      title = "Burgers",
      width = "30%"
    ),
    Image(
      url = s"$HOST/static/images/grid-list/camera.jpg",
      title = "Camera",
      width = "30%"
    )
  )
}
