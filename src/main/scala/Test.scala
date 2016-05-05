import java.io._

class Point(val xc: Int, val yc: Int) {
  var x: Int = xc
  var y: Int = yc
  def move(dx: Int, dy: Int) {
    x = x + dx
    y = y + dy
    println ("Point");
    println ("Point x location : " + x);
    println ("Point y location : " + y);
  }
}

class Location(override val xc: Int, override val yc: Int,
               val zc :Int) extends Point(xc, yc){
  var z: Int = zc

  def move(dx: Int, dy: Int, dz: Int) {
    x = x + dx
    y = y + dy
    z = z + dz
    println ("Location");
    println ("Point x location : " + x);
    println ("Point y location : " + y);
    println ("Point z location : " + z);
  }
}

object Test {
  def main(args: Array[String]) {
    val pt = new Point(10, 20);
    val lo = new Location(5, 10, 15);

    // Move to a new location
    pt.move(10, 10);
    lo.move(10, 10, 10);
  }
}