package com.ImplicitConversion

object demo extends App {
  implicit val z: Int = 10

  //Doesnot depend on variable name i.e. y or z it implicitly looks for
  // Int type within the block or file...
  def multiply(x: Int)(implicit y: Int) = x * y

  println(multiply(3))
  println(multiply(4))


}
