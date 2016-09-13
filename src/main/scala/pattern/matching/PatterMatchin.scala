package pattern.matching

object PatterMatchin {

  sealed abstract class Expression
  case class X() extends Expression
  case class Const(value : Int) extends Expression
  case class Add(left : Expression, right : Expression) extends Expression
  case class Mult(left : Expression, right : Expression) extends Expression
  case class Neg(expr : Expression) extends Expression

  def main(args: Array[String]): Unit = {
    println("Pattern Matchin...")

    println("toYerOrNo")
    println(toYesOrNo(1))
    println(toYesOrNo(0))
    println(toYesOrNo(2))

    println("toYerOrNo2")
    println(toYesOrNo2(3))
    println(toYesOrNo2(0))
    println(toYesOrNo2(4))

    println("f()")
    println(f(3))
    println(f(0.43))
    println(f("hola"))
    
    println("factorial")
    println(fact(3))
    
    println("length")
    println(length(List(1,2,3)))
    
    println("case")
    val expr = Add(Const(1), Mult(Const(2), Mult(X(), X()))) //1 + (2 * (X*X)) = 19
    println(eval(expr, 3))
  }

  //tradicional
  def toYesOrNo(choice: Int): String = choice match {
    case 1 => "yes"
    case 0 => "no"
    case _ => "error"
  }

  def toYesOrNo2(choice: Int): String = choice match {
    case 1 | 2 | 3 => "yes"
    case 0 => "no"
    case _ => "error"
  }

  // typed pattern
  def f(x: Any): String = x match {
    case i:Int => "integer: " + i
    case _:Double => "a double"
    case s:String => "I want to say " + s
  }

  // funcional
  def fact(n: Int): Int = n match {
    case 0 => 1
    case n => n * fact(n - 1)
  }
  
  //coleciones
  def length[A](list : List[A]) : Int = list match {
    case _ :: tail => 1 + length(tail)
    case Nil => 0
  }
  
  //case class


  def eval(expression : Expression, xValue : Int) : Int = expression match {
    case X() => xValue
    case Const(cst) => cst
    case Add(left, right) => eval(left, xValue) + eval(right, xValue)
    case Mult(left, right) => eval(left, xValue) * eval(right, xValue)
    case Neg(expr) => - eval(expr, xValue)
  }

}
