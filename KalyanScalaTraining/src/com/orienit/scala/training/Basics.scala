package com.orienit.scala.training

object Basics extends App {
  val name = "kalyan"

  // name = "xyz"

  println("name: " + name)
  println(s"name: $name")

  var id = 1

  id = 2

  println("id: " + id)
  println(s"id: $id")

  var id1 = id.toLong
  var id2 = id.asInstanceOf[Long]
  var is = id.isInstanceOf[Long]

  println(s"id1: $id1")
  println(s"id2: $id2")

  println(s"id.isInstanceOf[Long]: $is")
}


















