package com.orienit.scala.training.collections

object Examples2 extends App {
  println("-------------------------------------------------------")

  var m1 = Map(1 -> "aa", 2 -> "bb", 4 -> "dd", 3 -> "cc")
  //println(m1)

  //m1 = m1 - 1
 // println(s" m1 -1 :  $m1")

  //m1 = m1 + (1 -> "xx")
  //println(s" m1 + (1->x) : $m1")

  //m1 = m1 - (1, 2)
  //println(s" m1 - (1,2):   $m1")

  //m1 = m1 + (1 -> "xx", 2 -> "yy")
  //println(s" m1 = (1->xx, 2 ->yy :  $m1")

  //m1 = m1 -- List(1, 2)
  //println(s" m1 - List(1,2) :  $m1")

  println("-------------------------------------------------------")

  var m2 = scala.collection.mutable.Map(1 -> "aa", 2 -> "bb", 4 -> "dd", 3 -> "cc")
  println(m2)

  m2 = m2 - 1
  println(m2)

  m2 = m2 + (1 -> "xx")
  println(m2)

  m2 = m2 - (1, 2)
  println(m2)

  m2 = m2 + (1 -> "xx", 2 -> "yy")
  println(m2)

  m2 = m2 -- List(1, 2)
  println(m2)

  m2 = m2 + (1 -> "xxx", 2 -> "yyy")
  println(m2)

  
  
  m2.remove(1)
  println(m2)

  println("-------------------------------------------------------")

}