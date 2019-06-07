package io.kinoplan.scalajs.react.material.ui

class CyclicEnumeration extends Enumeration {

  lazy val prevOf = {
    val list = values.toList
    val map = list.tail.zip(list.map(Some(_))).toMap + (list.head -> None)
    map
  }
  lazy val nextOf = {
    val list = values.toList
    val map = list.zip(list.tail.map(Some(_)) :+ None).toMap
    map
  }
}
