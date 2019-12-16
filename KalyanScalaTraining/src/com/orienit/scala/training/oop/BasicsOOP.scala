package com.orienit.scala.training.oop

class A(x: Int, y: Double) {

}

class A1(x: Int, y: Double) extends A(x, y) {

}

class A2(x: Int, y: Double) extends A(x = x, y = y) {

}

class A3(x: Int, y: Double) extends A(y = y, x = x) {

}

class A4(x: Int, y: Double, z: Long) extends A(x, y) {

}

class A5(x: Int, y: Double, z: Long) extends A(x: Int, y: Double) {

}

class B {

}

class B1 extends B {

}

object BasicsOOP extends App {

}








