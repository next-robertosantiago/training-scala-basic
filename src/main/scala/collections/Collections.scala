package collections


object Collections {

  case class Person(first: String, last: String, mi: String)

  def show(x: Option[String]) = x match {
    case Some(s) => s
    case None => "?"
  }

  def main(args: Array[String]): Unit = {
    val fred = Person("Fred", "Flintstone", "J")
    val wilma = Person("Wilma", "Flintstone", "A")
    val barney = Person("Barney", "Rubble", "J")
    val betty = Person("Betty", "Rubble", "A")

    // List example (Set --> different elements)
    val peeps = List(fred, wilma, barney, betty)

    println(peeps.filter(_.last == "Flintstone").sortWith(_.first < _.first).map(person => person.first))

    // Empty collection
    val emptyCol: Seq[String] = Seq.empty[String]


    // Map & Option example
    var capitals = Map("France" -> "Paris", "Japan" -> "Tokyo")

    println("Capital of Japan: " + capitals.get( "Japan") + " - " + show(capitals.get( "Japan")) )
    println("Capital of India: " + capitals.get( "India") + " - " + show(capitals.get( "India")) )

    capitals += ("India" -> "New Delhi")
    println("Capital of India: " + capitals.get( "India") + " - " + show(capitals.get( "India")) )

    // Concat maps: ++ or .++

    // Tuple example
    val user = (0, "alberto.perez", "alberto.perez@beeva.com", "Alberto", "Pérez Machado", 1983)
    println("Username: " + user._2)

    val (id, _, mail, _, _, year) = user
    println("User ID: " + id + " - eMail: " + mail + " - Year of born: " + year)
  }

}
