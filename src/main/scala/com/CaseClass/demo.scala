package com.CaseClass

object demo extends App {


  val message1 = Message("devender", "reddy", "chappidi")
  val message2 = Message("devender", "reddy", "reddy")

  val messagesAreSame = message1 == message2
  println(messagesAreSame)


}
