package com.orienit.scala.training.oop

object StudentApp {
  def main(args: Array[String]): Unit = {
    val s1 = new Student("kalyan", 1, "spark")
    println("Scala: Student1: " + s1)

    val s2 = new Student("venkat", 2)
    println("Scala: Student2: " + s2)

    val s3 = new Student("raj")
    println("Scala: Student3: " + s3)

    val s11 = new Student(name = "kalyan", id = 1, "spark")
    println("Scala: Student11: " + s11)

    val s12 = new Student(id = 1, name = "kalyan", course = "spark")
    println("Scala: Student12: " + s12)

    val s13 = new Student(name = "kalyan", id = 1)
    println("Scala: Student13: " + s13)

  }
}














