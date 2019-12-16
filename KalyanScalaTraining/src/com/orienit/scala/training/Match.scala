package com.orienit.scala.training

object Match extends App {
  val list = List(1, 2.5, "aaa", 1l, true)

  println("---------------------------")

  for (x <- list) println(x)

  println("---------------------------")

  for (data <- list) {
    data match {
      case 1     => println("data is : " + 1)
      case 2.5   => println("data is : " + 2.5)
      case "aaa" => println("data is : " + "aaa")
      case 1l    => println("data is : " + 1l)
      case _     => println("data is not defined")
    }

  }

  println("---------------------------")

  for (data <- list) {
    data match {
      case data: Int    => println("data is : Int")
      case data: Double => println("data is : Double")
      case data: String => println("data is : String")
      case data: Long   => println("data is : Long")
      case _            => println("data is not defined")
    }

  }

  println("---------------------------")

  val days = List("mon", "tue", "wed", "thur", "fri", "sat", "sun")
  for (day <- days) {
    day match {
      case "mon"  => println("Day is WeekDay")
      case "tue"  => println("Day is WeekDay")
      case "wed"  => println("Day is WeekDay")
      case "thur" => println("Day is WeekDay")
      case "fri"  => println("Day is WeekDay")
      case "sat"  => println("Day is WeekEnd")
      case "sun"  => println("Day is WeekEnd")
      case _      => println("Day is not defined")
    }

  }

  println("---------------------------")

  for (day <- days) {
    day match {
      case "mon" | "tue" | "wed" | "thur" | "fri" => println("Day is WeekDay")
      case "sat" | "sun"                          => println("Day is WeekEnd")
      case _                                      => println("Day is not defined")
    }
  }

  println("---------------------------")

  val nums = List(1, 2, 3, 4, 5, 6)

  for (num <- nums) {
    num match {
      case num if num > 2 && num < 5 => println("Number is " + num)
      case _                         => println("Number is not defined")
    }
  }
  println("---------------------------")

  def factorial(num: Int): Int = {
    num match {
      case x if x == 1 => 1
      case x if x > 1  => x * factorial(x - 1)
      case _           => 1
    }
  }

  val fact = factorial(5)
  println("factorial(5) : " + fact)
  println("---------------------------")
}












