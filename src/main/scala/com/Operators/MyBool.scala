package com.Operators

case class MyBool(x: Double, y: Double) {
  def +(that: MyBool) = MyBool(this.x + that.x, this.y + that.y)
}

