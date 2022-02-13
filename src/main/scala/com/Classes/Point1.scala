package com.Classes

object Point1 extends App {




  //  val point1 = new Point
  //  print(point1.x)
  //  point1.x= 99
  //  print(point1.x)
  //  point1.y = 101 // prints the warning

  class Point(val x: Int, y: Int)

  val point = new Point(1, 2)
  point.x // <-- does not compile

  //  class Point(val x: Int, val y: Int)
  //  val point = new Point(1, 2)
  //  point.x = 3


}
