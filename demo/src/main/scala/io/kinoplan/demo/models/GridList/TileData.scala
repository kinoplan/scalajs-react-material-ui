package io.kinoplan.demo.models.GridList

case class TileData(
  image: String,
  title: String,
  author: String,
  cols: Option[Int] = None,
  featured: Boolean = false
) {
  val defaultCols = cols.getOrElse(1)

  val featuredValue = if (featured) 2 else 1
}

object TileData {

  val default = List(
    TileData(
      image = "/static/images/grid-list/breakfast.jpg",
      title = "Breakfast",
      author = "jill111",
      cols = Some(2),
      featured = true
    ),
    TileData(
      image = "/static/images/grid-list/burgers.jpg",
      title = "Tasty burger",
      author = "director90"
    ),
    TileData(
      image = "/static/images/grid-list/camera.jpg",
      title = "Camera",
      author = "Danson67"
    ),
    TileData(
      image = "/static/images/grid-list/morning.jpg",
      title = "Morning",
      author = "fancycrave1",
      featured = true
    ),
    TileData(
      image = "/static/images/grid-list/hats.jpg",
      title = "Hats",
      author = "Hans"
    ),
    TileData(
      image = "/static/images/grid-list/honey.jpg",
      title = "Honey",
      author = "fancycravel"
    ),
    TileData(
      image = "/static/images/grid-list/vegetables.jpg",
      title = "Vegetables",
      author = "jill111",
      cols = Some(2)
    ),
    TileData(
      image = "/static/images/grid-list/plant.jpg",
      title = "Water plant",
      author = "BkrmadtyaKarki"
    ),
    TileData(
      image = "/static/images/grid-list/mushroom.jpg",
      title = "Mushrooms",
      author = "PublicDomainPictures"
    ),
    TileData(
      image = "/static/images/grid-list/olive.jpg",
      title = "Olive oil",
      author = "congerdesign"
    ),
    TileData(
      image = "/static/images/grid-list/star.jpg",
      title = "Sea star",
      author = "821292",
      cols = Some(2)
    ),
    TileData(
      image = "/static/images/grid-list/bike.jpg",
      title = "Bike",
      author = "danfador"
    )
  )

}
