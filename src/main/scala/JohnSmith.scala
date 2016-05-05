/**
  * Created by roberto.santiago on 5/5/16.
  */
object JohnSmith {
  val firstName = "John"
  val lastName = "Smith"
  val age = 37
  val occupation = "linguist"

  def fullName: String = firstName + " " + lastName

  def greet (formal: Boolean): String = {
    if (formal)
      "Hello, my name is " + fullName + ". I'm a " + occupation + "."
    else
      "Hi, I'm " + firstName + "!"
  }

}
