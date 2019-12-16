package com.orienit.scala.training

object Functions extends App {

  (x: Int) => { x + 1 };
  
  val f = (x: Int) => { x + 1 };
  
  f(1);
  
  f(2);
  
  
  def sum (a : Int, b : Int) : Long = { a + b }
  
  def mul (a : Int, b : Int ) : Long = { a * b }
  
  def squares ( a: Int, b : Int ) : Long = { a * a +  b * b }
  
  def squares1 ( a: Int, b : Int ) : Long = { 
    sum ( mul(a,a).toInt, mul(b, b).toInt)
   }
  
}














