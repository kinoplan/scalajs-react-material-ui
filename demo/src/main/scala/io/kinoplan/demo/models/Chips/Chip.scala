package io.kinoplan.demo.models.Chips

case class Chip(
  key: Int,
  label: String
) {
  val isReact = label == "React"
}

object Chip {

  val default = List(
    Chip(0, "Angular"),
    Chip(1, "jQuery"),
    Chip(2, "Polymer"),
    Chip(3, "React"),
    Chip(4, "Vue.js")
  )

}
