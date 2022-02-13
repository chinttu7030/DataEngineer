package com.Basics

object Factory extends App {
  //OBJECT
  private var counter = 0

  def Create(): Int = {
    counter += 1
    counter
  }

  val newId: Int = Factory.Create()
  println(newId)
  val newerId: Int = Factory.Create()
  println(newerId)

}

