package lesson9

object Test {
  val ch: Char = '+'
  var sign : Int = _
  var digit: Int = _

  def main(args: Array[String]): Unit = {

    val i = Map("a" -> 1)
   val test = i match {
     // case m: Map[String, Int] =>1
      case m: Map[_, _] => 2
    }
    println(test)
  }

}
