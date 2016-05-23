package cot

class Student (school: String, subject: String) extends Worker {
  def workGreeting = "I'm studying " + subject + " at " + school + "!"
}
