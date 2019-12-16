package com.orienit.scala.training.oop

trait Maths {
  def add(x: Int, y: Int): Int
  def mul(x: Int, y: Int): Int
  def sub(x: Int, y: Int): Int
  def min(x: Int, y: Int): Int
  def max(x: Int, y: Int): Int
}

trait Stats {
  def avg(x: Int, y: Int): Double
}

trait Calculations extends Maths with Stats {

}

class AA extends Maths {
  def add(x: Int, y: Int): Int = {
    x + y
  }
  def max(x: Int, y: Int): Int = {
    if (x > y) x else y
  }
  def min(x: Int, y: Int): Int = {
    if (x < y) x else y
  }
  def mul(x: Int, y: Int): Int = {
    x * y
  }
  def sub(x: Int, y: Int): Int = {
    x - y
  }
}

class BB extends Stats {
  def avg(x: Int, y: Int): Double = {
    x + y / 2.0
  }
}

class CC extends Calculations {
  def add(x: Int, y: Int): Int = {
    x + y
  }
  def max(x: Int, y: Int): Int = {
    if (x > y) x else y
  }
  def min(x: Int, y: Int): Int = {
    if (x < y) x else y
  }
  def mul(x: Int, y: Int): Int = {
    x * y
  }
  def sub(x: Int, y: Int): Int = {
    x - y
  }

  def avg(x: Int, y: Int): Double = {
    x + y / 2.0
  }
}

class D extends AA with Calculations {
  def avg(x: Int, y: Int): Double = {
    x + y / 2.0
  }
}

abstract class E extends Maths {

}
object TraitExamples extends App {

}




























