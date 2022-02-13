package com.PatternMatching

object demo extends App {

  def showNotification(notification: Notification): Unit = {
    //    notification match {
    //      case Email(sender, title, _) =>
    //        s"You got an email from $sender with title: $title"
    //      case SMS(number, message) =>
    //        s"You got an SMS from $number! Message: $message"
    //      case VoiceRecording(name, link) =>
    //        s"You received a Voice Recording from $name! Click the link to hear it: $link"
    //    }
    //  }
    //  val someSms = SMS("12345", "Are you there?")
    //  val someVoiceRecording = VoiceRecording("Tom", "voicerecording.org/id/123")
    //
    // println(showNotification(someSms))
    //
    //  println(showNotification(someVoiceRecording))

    def showImportantNotification(notification: Notification, importantPeopleInfo: Seq[String]): Unit = {
      notification match {
        case Email(sender, _, _) if importantPeopleInfo.contains(sender) =>
          "You got an email from special someone!"
        case SMS(number, _) if importantPeopleInfo.contains(number) =>
          "You got an SMS from special someone!"
        case other =>

          showNotification(other)

      }
    }

    val importantPeopleInfo = Seq("867-5309", "jenny@gmail.com")

    val someSms = SMS("123-4567", "Are you there?")
    val someVoiceRecording = VoiceRecording("Tom", "voicerecording.org/id/123")
    val importantEmail = Email("jenny@gmail.com", "Drinks tonight?", "I'm free after 5!")
    val importantSms = SMS("867-5309", "I'm here! Where are you?")

    println(showImportantNotification(someSms, importantPeopleInfo))
    println(showImportantNotification(someVoiceRecording, importantPeopleInfo))
    println(showImportantNotification(importantEmail, importantPeopleInfo))

    println(showImportantNotification(importantSms, importantPeopleInfo))
  }
}
