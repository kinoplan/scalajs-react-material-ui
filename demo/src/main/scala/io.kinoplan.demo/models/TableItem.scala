package io.kinoplan.demo.models

case class TableItem(
  idx: Long,
  name: String,
  calories: Int,
  fat: Double,
  carbs: Int,
  protein: Double
)

object TableItem {
  def default = List(
    TableItem(1, "Frozen yoghurt", 159, 6.0, 24, 4.0),
    TableItem(2, "Ice cream sandwich", 237, 9.0, 37, 4.3),
    TableItem(3, "Eclair", 262, 16.0, 24, 6.0),
    TableItem(4, "Cupcake", 305, 3.7, 67, 4.3),
    TableItem(5, "Gingerbread", 356, 16.0, 49, 3.9)
  )
}