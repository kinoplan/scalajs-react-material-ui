package io.kinoplan.demo.models.Tables

import scala.scalajs.js.|

case class Row(
  id: String,
  numeric: Boolean,
  disablePadding: Boolean,
  label: String
) {
  val align = if (numeric) "right" else "left"

  val padding = if (disablePadding) "none" else "default"

  val placement = if (numeric) "bottom-end" else "bottom-start"

  def sortDirection(orderBy: String, order: String): String | Boolean = if (orderBy == id) order else false

  def isActive(orderBy: String) = orderBy == id
}

object Row {
  val commons = List(
    Row("name", false, true, "Dessert (100g serving)"),
    Row("calories", true, false, "Calories"),
    Row("fat", true, false, "Fat (g)"),
    Row("carbs", true, false, "Carbs (g)"),
    Row("protein", true, false, "Protein (g)")
  )
}