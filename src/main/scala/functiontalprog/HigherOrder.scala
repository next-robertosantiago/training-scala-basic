package functiontalprog


object HigherOrder {

  class Decorator(left: String, right: String) {
    def layout[A](x: A) = left + x.toString() + right
  }

  def isEqualToFour(a:Int) = a == 4

  def main(args: Array[String]): Unit = {
    val list = List(1, 2, 3, 4)
    val resultExists4 = list.exists(isEqualToFour) // higher order function
    println("Exists 4: " + resultExists4)

    val resultForall4 = list.forall(isEqualToFour) // higher order function
    println("All 4: " + resultForall4)

    def apply(f: Int => String, v: Int) = f(v*2) // higher order function
    val decorator = new Decorator("[", "]")
    println(apply(decorator.layout, 7))
  }

}
