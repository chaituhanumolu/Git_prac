package com.orienit.scala.training.oop

class Student(val name: String, val id: Int, val course: String = "Spark") {

  def this(name: String, course: String) = {
    this(name, 1, course)
  }

  def this(name: String, id: Int) = {
    this(name, id, "")
  }

  def this(name: String) = {
    this(name, 1)
  }

  def this() = {
    this("")
  }

  override def toString() = {
    "Student [name=" + name + ", id=" + id + ", course=" + course + "]"
  }
}