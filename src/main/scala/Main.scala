/**
  * Created by roberto.santiago on 5/5/16.
  */
object Main {
  def main(args: Array[String]) {
    println(JohnSmith.greet(true))

    val johnDoe = new Person("John", "Doe", 43, "philosopher")
    println(johnDoe.greet(false))

    val janeDoe = new Person("Jane", "Doe", 34, "computer scientist")
    println(janeDoe.greet(true))

    val johnBrown = new Person("John", "Brown", 28, "mathematician")

    val people = List(johnDoe, janeDoe, johnBrown)

    val ages = people.map(person => person.age)
    println(ages)

    val avg = people.map(person => person.age).sum/people.length.toDouble
    println("Age average: " + avg)

    val ageSortedPeople = people.sortBy(_.age)
    println(ageSortedPeople.map(person => person.fullName + ":" + person.age))

    val noamChomsky = new Linguist("Noam", "Chomsky", 83, "syntactician", "English")
    println(noamChomsky.greet(true))
    println(noamChomsky.workGreeting)
  }
}
