package com.orienit.scala.training.oop

class Training(course: String, fee: Long) {
  override def toString(): String = {
    s"Course name is $course, Fee is $fee"
  }
}

class ClassRoom(course: String, fee: Long, timings: String) extends Training(course, fee) {
  var _timings: String = _

  def updateTimings() = {
    _timings = timings
  }

  override def toString(): String = {
    s"Course name is $course, Fee is $fee, Class timings is $timings"
  }
}

class Online(course: String, fee: Long, duration: Int) extends Training(course, fee) {
  var _duration: Int = _

  def updateTimings() = {
    _duration = duration
    _duration = _duration + 10
  }

  override def toString(): String = {
    // s"Course name is $course, Fee is $fee, Class duration is ${duration + 10}"
    s"Course name is $course, Fee is $fee, Class duration is ${_duration}"
  }
}



object BasicsOperations extends App {
  val c1 = new ClassRoom("Spark", 10000, "WeekEnd")
  println("c1: " + c1)

  val o1 = new Online("Spark", 10000, 60)
  println("o1: " + o1)
  
  o1.updateTimings()
  println("o1: " + o1)
}




















