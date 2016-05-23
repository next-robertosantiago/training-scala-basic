package cot

class Person (val firstName: String, val lastName: String, val age: Int, val occupation: String) {
  def fullName: String = firstName + " " + lastName

  def greet (formal: Boolean): String = {
    if (formal)
      "Hello, my name is " + fullName + ". I'm a " + occupation + "."
    else
      "Hi, I'm " + firstName + "!"
  }
}
