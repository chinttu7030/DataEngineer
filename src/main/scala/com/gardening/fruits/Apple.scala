package com.gardening.fruits

package object fruits

object Apples extends App {


  {
    val planted = List(Apple, Plum, Banana)

    def showFruit(fruit: Fruits): Unit = {
      println(s"${fruit.name}s are ${fruit.colour}")
    }
  }


}
