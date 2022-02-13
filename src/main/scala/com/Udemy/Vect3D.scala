//package com.Udemy
//
//case class Vect3D(x: Double, y: Double, z: Double) {
//  def apply(i: Int): Double = i match {
//    case 0 => x   //apply method allows you to treat the object like a function
//    case 1 => y
//    case 2 => z
//  }
//
//  def +(v: Vect3D) = Vect3D(x + v.x, y + v.y, z + v.z)
//
//  def -(v: Vect3D) = Vect3D(x - v.x, y - v.y, z - v.z)
//
//  def *(c: Double) = Vect3D(c * x, c * y, c * z)
//
//  def /(c: Double) = Vect3D(x / c, y / c, z / c)
//
//  def dot(v: Vect3D) = x * v.x + y * v.y + z * v.z
//
//  def cross(v: Vect3D) = Vect3D(
//  {
//
//    y * v.z - z * v.y
//    z * v.x - x * v.z
//    x * v.y - y * v.x
//
//    def magnitude() = math.sqrt(x * x + y * y + z * z)
//    )
//  }
//
//
//
//}
