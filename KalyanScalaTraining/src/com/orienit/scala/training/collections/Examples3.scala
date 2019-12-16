package com.orienit.scala.training.collections

import scala.collection.mutable.ListBuffer
import java.util.ArrayList
import scala.collection.JavaConversions

object Examples3 extends App {
  println("-------------------------------------------------------")

  var l1 = List(1, 2, 3, 4, 5)
  println(l1)

  var l2 = ListBuffer(1, 2, 3, 4, 5)
  println(l2)

  var j1 = new ArrayList[Int]
  j1.add(1)
  j1.add(2)
  j1.add(3)
  j1.add(4)
  j1.add(5)

  println(j1)

  println("-------------------------------------------------------")

  var l11 = l1.map { x => x + 1 }
  println(l11)

  var l22 = l2.map { x => x + 1 }
  println(l22)

  // not allowed on Java List
  /*
  var j11 = j1.map { x => x + 1 }
  println(j11)

  var s1 = j1.toList
  println(s1)

  var s2 = j1.toBuffer
  println(s2)

  */

  println("-------------------------------------------------------")

  import scala.collection.JavaConversions._

  // now allowed on Java List
  var j11 = j1.map { x => x + 1 }
  println(j11)

  var s1 = j1.toList
  println(s1)

  var s2 = j1.toBuffer
  println(s2)

  println("-------------------------------------------------------")

  // not allowed on List
  /*
  l1.add(0)
  println(l1)

  l1.remove(1)
  println(l1)
	*/

  // allowed on ListBuffer
  l2.add(0)
  println(l2)

  l2.remove(1)
  println(l2)

  println("-------------------------------------------------------")

  var sj1 = JavaConversions.asJavaCollection(l1)
  println(sj1)

  var sj2 = JavaConversions.asJavaCollection(l2)
  println(sj2)

  println("-------------------------------------------------------")

  println("-------------------------------------------------------")

}