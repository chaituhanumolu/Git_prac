package com.orienit.scala.training.oop

class Test1(a: String, b: Int)

case class Test2(a: String, b: Int)

case class Test3(a: String, b: Int) extends Test1(a, b)

class Test4(a: String, b: Int) extends Test1(a, b)

class Test5(a: String, b: Int) extends Test2(a, b)

object Sample3 {

}