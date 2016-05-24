package game.of.thrones2

// Legacy
abstract class Lannister {
  def payTheirDebts: Boolean
  def trueLannister = payTheirDebts
}

//Father
trait Tywin extends Lannister{
  override def payTheirDebts = true
  def debt: Int
  def addToDebt(amount: Int) = debt + amount
}

// Son #1
trait Jamie extends Tywin {
  override def payTheirDebts = true
  override def addToDebt(amount: Int) = super.addToDebt(2*amount)
}

// Son #2
trait Tyrion extends Tywin {
  override def payTheirDebts = true
  override def addToDebt(amount: Int) = amount
}

// Daughter #1
trait Cersei extends Tywin {
  override def payTheirDebts = false
  override def addToDebt(amount: Int) = super.addToDebt(amount/4)
}

class Joffrey extends Lannister with Jamie with Cersei{
  def debt = 100
  override def addToDebt(amount: Int) = debt * 10
}

class Tommen extends Lannister with Cersei with Jamie{
  def debt = 200
}

// My imaginative Tyrion's son
class Leon extends Tyrion {
  def debt = 300
}

object GameOfThrones2 extends App{
  val joffrey = new Joffrey
  //llamada directa a su metodo
  println(joffrey.addToDebt(100)) // 1000

  val tommen = new Tommen
  // no tiene metodos hace los de su herencia de derecha a izq
  println(tommen.addToDebt(100)) // 250

  val leon = new Leon with Jamie
  // no tiene metodo hace su herencia pero tambien la de su padre
  println(leon.addToDebt(100)) // 200
}
