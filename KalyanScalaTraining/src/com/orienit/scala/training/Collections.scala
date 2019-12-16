package com.orienit.scala.training

import scala.collection.immutable.Stack
import scala.collection.immutable.Queue

object Collections extends App {
  val list = List(1, 2, 3, 4, 5, 6)
  val set = Set(1, 2, 3, 4, 5, 6)
  val seq = Seq(1, 2, 3, 4, 5, 6)
  val vec = Vector(1, 2, 3, 4, 5, 6)
  val stack = Stack(1, 2, 3, 4, 5, 6)
  val queue = Queue(1, 2, 3, 4, 5, 6)
  val arr = Array(1, 2, 3, 4, 5, 6)

  for (l <- list) println(l)

  val data = for (l <- list) yield l
  val data1 = for (l <- list if l % 2 == 0) yield l

  val r1 = 1 to 10
  val r2 = 1 to 10 by 2
  val r3 = 1 until 10
  val r4 = 1 until 10 by 3
  
  println("--------------------------------")
  
  val map = Map(1 -> "aaa", 2 -> "bbb", 3 -> "ccc")
  
  val l1 = List(1,2,3)
  val l2 = List("aaa","bbb","ccc")
  
  // these are not allowed in scala
  // map.put
  // l1.add
  
  import scala.collection.JavaConversions._
  import scala.collection.JavaConverters._
  
  map.put(4, "ddd")
  l1.add(4)
  
  val jl1 = new java.util.ArrayList[Int]()
  jl1.add(1)
  jl1.add(2)
  jl1.add(3)
  
  
  val sl1 = jl1.asScala
  
  
}












