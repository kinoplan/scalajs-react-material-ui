package io.kinoplan.demo.models.TextFields

case class Currency(
  value: String,
  label: String
)

object Currency {
  val commons = List(
    Currency(value = "USD", label = "$"),
    Currency(value = "EUR", label = "€"),
    Currency(value = "BTC", label = "฿"),
    Currency(value = "JPY", label = "¥")
  )
}
