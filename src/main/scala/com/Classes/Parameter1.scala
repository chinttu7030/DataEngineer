package com.Classes

import java.util.jar.Attributes.Name

object Parameter1 extends App {
  def text(message: String, level: String = "info") =
    println(s"$level: $message")

  text("string system ")
  text("Error", "Output")


  val text1 = new Parameter(y = 1)
  println(text1.y, text1.x)


  def Name(fname: String, lname: String): Unit =
    println(fname + " " + lname)

  Name("John", "Smith")
  Name(lname = "Smith", fname = "john")


}
