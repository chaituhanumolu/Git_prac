package com.orienit.scala.training.collections

import scala.collection.mutable.ListBuffer

object Examples1 extends App {

  println("-------------------------------------------------------")

  var l1 = List(1, 2, 3, 4)
  println(l1)

  l1 = 0 +: l1 :+ 5
  println(l1)

  var l11 = l1.toBuffer
  println(l11)

  println("-------------------------------------------------------")

  var l2 = ListBuffer(1, 2, 3, 4)
  println(l2)

  l2 = 0 +: l2 :+ 5
  println(l2)

  l2 = l2 - 1
  println(l2)

  l2.remove(1)
  println(l2)

  l2.remove(1, 2)
  println(l2)

  var l22 = l2.toList
  println(l22)

  println("-------------------------------------------------------")

}