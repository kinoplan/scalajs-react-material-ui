package io.kinoplan.demo.models.Tables

case class SpanningItem(
  id: Int,
  desc: String,
  qty: Int,
  unit: Double
) {
  val price = qty * unit
}

object SpanningItem {

  val rows = List(
    SpanningItem(0, "Paperclips (Box)", 100, 1.15),
    SpanningItem(1, "Paper (Case)", 10, 45.99),
    SpanningItem(2, "Waste Basket", 2, 17.99)
  )

}
