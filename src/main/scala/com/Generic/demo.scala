package com.Generic

import scala.collection.mutable

object demo extends App {


  val stack = new mutable.Stack[Fruit]
  val apple = new Apple
  val banana = new Banana

  stack.push(apple)
  stack.push(banana)


}
