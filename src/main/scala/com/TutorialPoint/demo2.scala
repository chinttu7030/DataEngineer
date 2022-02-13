package com.TutorialPoint

object demo2 extends App {

  //Private Members:A private member is visible only inside the class or object that contains the member definition.
  //Protected Members:A protected member is only accessible from subclasses of the class in which the member is defined.
  //Public Members:Unlike private and protected members, it is not required to specify Public keyword for Public members. There is no explicit modifier for public members. Such members can be accessed from anywhere
  //Scope of protection:Access modifiers in Scala can be augmented with qualifiers. A modifier of the form private[X] or protected[X] means that access is private or protected "up to" X, where X designates some enclosing package, class or singleton object.


  var x = 10
  if (x < 20) {
    println("This is tutorial point")
  }
  var string = "match"
  if (string.length < 2) {
    println("this is big!!!")
  }
  else {
    println("Not Big!")

  }


  var y = 30

  if (y == 10) println("Value of X is 10")
  else if (y == 20) println("Value of y is 20")
  else if (y == 30) println("Value of y is 30")
  else println("This is else statement")

  val a = 30
  val b = 10

  if (a == 30) if (b == 10) println("X = 30 and Y = 10")


}
