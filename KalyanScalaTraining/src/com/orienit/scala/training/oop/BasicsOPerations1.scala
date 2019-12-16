package com.orienit.scala.training.oop

case class User(name: String, loc: String, pincode: Int) {
  override def toString(): String = {
    s"Name is $name, location is $loc, pincode is $pincode"
  }
}

case class Employee(var name: String, loc: String, pincode: Int) {
  override def toString(): String = {
    s"Name is $name, location is $loc, pincode is $pincode"
  }
}

class X(a : Int)

case class Y(a : Int)

object T extends X(1){
  
}

/*
case class A11(var name: String, loc: String, pincode: Int)  extends Employee(var name: String, loc: String, pincode: Int){
  
}
*/

object BasicsOPerations1 extends App {

  var u1 = User("kalyan", "hyd", 123456)
  println("u1: " + u1)

  var u2 = new User("raj", "bang", 123456)
  println("u2: " + u2)

  //  u1.name = "xyz"

  var e1 = Employee("kalyan", "hyd", 123456)
  println("e1: " + e1)

  e1.name = "xyz"
  println("e1: " + e1)
}













