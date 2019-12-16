package com.orienit.scala.training

import scala.collection.mutable.ListBuffer

object CollectionsPractice extends App {
  val l1 = List(1, 2, 3)

  val l2 = 0 +: l1

  var l3 = ListBuffer(1, 2, 3)
  l3 = 0 +: l3

  println("l1: " + l1)
  println("l2: " + l2)
  println("l3: " + l3)

  val l4 = l1.drop(1)
  println("l4: " + l4)

  l3 = l3 - 0
  println("l3: " + l3)

  val l5 = l3.toList
  println("l5: " + l5)

  /*********************************/

  var m1 = Map(1 -> "aaa", 2 -> "bbb")
  var m2 = scala.collection.mutable.Map(1 -> "aaa", 2 -> "bbb")

  m1 = m1 + { 3 -> "ccc" }

  m2 = m2 + { 3 -> "ccc" }

  m1 = m1 - 1

  m2 = m2 - 1

  var t1 = scala.collection.immutable.TreeMap(2 -> "bbb", 1 -> "aaa", 3 -> "ccc")

}






























