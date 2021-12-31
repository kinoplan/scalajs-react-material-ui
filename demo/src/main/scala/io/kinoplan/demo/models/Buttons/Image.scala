package io.kinoplan.demo.models.Buttons

case class Image(
  url: String,
  title: String,
  width: String
)

object Image {

  val default = List(
    Image(
      url = "/static/images/grid-list/breakfast.jpg",
      title = "Breakfast",
      width = "40%"
    ),
    Image(
      url = "/static/images/grid-list/burgers.jpg",
      title = "Burgers",
      width = "30%"
    ),
    Image(
      url = "/static/images/grid-list/camera.jpg",
      title = "Camera",
      width = "30%"
    )
  )

}
