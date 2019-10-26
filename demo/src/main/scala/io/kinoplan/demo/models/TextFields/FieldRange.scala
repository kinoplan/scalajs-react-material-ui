package io.kinoplan.demo.models.TextFields

case class FieldRange(
  value: String,
  label: String
)

object FieldRange {
  val commons = List(
    FieldRange(
      value = "0-20",
      label = "0 to 20"
    ),
    FieldRange(
      value = "21-50",
      label = "21 to 50"
    ),
    FieldRange(
      value = "51-100",
      label = "51 to 100"
    )
  )
}
