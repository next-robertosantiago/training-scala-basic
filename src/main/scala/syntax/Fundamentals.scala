package syntax

object Fundamentals {
  class Person(val name: String, val age: Int) {

  }

  def main(args: Array[String]) {
    val person = new Person("Kumar", 12)
    //TODO - Error: Assign to a 'val' attribute
    //person.age = 20
    println(person.name + " is " + person.age + " years old")
  }
}
