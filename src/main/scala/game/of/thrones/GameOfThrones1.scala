package game.of.thrones

import _root_.game.of.thrones2
import _root_.game.of.thrones2.{Tommen, Joffrey}


abstract class Lannister {
  def payTheirDebts: Boolean
  def trueLannister = payTheirDebts
}

//Father
trait Tywin extends thrones2.Lannister{
  override def payTheirDebts = true
}

// Son #1
trait Jamie extends thrones2.Tywin {
  override def payTheirDebts = true
}

// Son #2
trait Tyrion extends thrones2.Tywin {
  override def payTheirDebts = true
}

// Daughter #1
trait Cersei extends thrones2.Tywin {
  override def payTheirDebts = false
}


object GameOfThrones1 extends App{
  val joffrey = new Joffrey
  println(joffrey.trueLannister) // false

  val tommen = new Tommen
  println(tommen.trueLannister) // true
}
