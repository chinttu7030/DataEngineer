package com.PatternMatching

import scala.util.Random

object example extends App {

def example(x:Int): String=
  x match {
    case 0=>"zero"
    case 1=>"one"
    case 2=>"other"


  }
example(2)
}
