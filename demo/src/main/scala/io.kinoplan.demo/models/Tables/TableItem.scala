package io.kinoplan.demo.models.Tables

case class TableItem(
  id: Int,
  name: String,
  calories: Int,
  fat: Double,
  carbs: Int,
  protein: Double
)

object TableItem {
  val simples = List(
    TableItem(0, "Frozen yoghurt", 159, 6.0, 24, 4.0),
    TableItem(1, "Ice cream sandwich", 237, 9.0, 37, 4.3),
    TableItem(2, "Eclair", 262, 16.0, 24, 6.0),
    TableItem(3, "Cupcake", 305, 3.7, 67, 4.3),
    TableItem(4, "Gingerbread", 356, 16.0, 49, 3.9)
  )

  val paginations = List(
    TableItem(0, "Cupcake", 305, 3.7, 67, 4.3),
    TableItem(1, "Donut", 452, 25.0, 51, 4.9),
    TableItem(2, "Eclair", 262, 16.0, 24, 6.0),
    TableItem(3, "Frozen yoghurt", 159, 6.0, 24, 4.0),
    TableItem(4, "Gingerbread", 356, 16.0, 49, 3.9),
    TableItem(5, "Honeycomb", 408, 3.2, 87, 6.5),
    TableItem(6, "Ice cream sandwich", 237, 9.0, 37, 4.3),
    TableItem(7, "Jelly Bean", 375, 0.0, 94, 0.0),
    TableItem(8, "KitKat", 518, 26.0, 65, 7.0),
    TableItem(9, "Lollipop", 392, 0.2, 98, 0.0),
    TableItem(10, "Marshmallow", 318, 0, 81, 2.0),
    TableItem(11, "Nougat", 360, 19.0, 9, 37.0),
    TableItem(12, "Oreo", 437, 18.0, 63, 4.0)
  )
}
