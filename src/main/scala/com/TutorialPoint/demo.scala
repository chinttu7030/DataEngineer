package com.TutorialPoint

object demo extends App {

  //Class is a blue print of objects

  val pt = new Point(1, 2)
  pt.move(1, 2)

  println(pt)
  val pts = new Point(10, 20)

  // Move to a new location
  pts.move(10, 10)




  //Syntax for the implicit class
  // Implicit classes allow implicit conversations with class’s primary constructor when the class is in scope. Implicit class is a class marked with ‘implicit’ keyword.
  //  object <object name> {
  //    implicit class <class name>(<Variable>: Data type) {
  //      def <method>(): Unit =
  //        }
  //        }

}
