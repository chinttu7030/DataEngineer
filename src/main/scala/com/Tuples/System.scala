package com.Tuples


object System extends App {

  val ingredient = (("sugar", 25), ("redbull", 28))
  println(ingredient._1)
  println(ingredient._2)

  val (name, quantity) = ingredient
  print(name)
  print(quantity)


  val planets = List(("mercury", 1234), ("earth", 4649573), ("venus", 86456), ("pluto", 987097))

  planets.foreach {
    case ("earth", distance) =>
      println(s"our planet is $distance million kilometers from the sun")
    case _ =>


  }


}
