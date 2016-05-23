package cot

class Linguist (firstName: String, lastName: String, age: Int, val speciality: String, val favoriteLanguage: String)
  extends Person(firstName, lastName, age, "linguist") with Worker{

  def workGreeting =
    "As a " + occupation + ", I am a " + speciality + " who likes to study the language " + favoriteLanguage + "."

}
