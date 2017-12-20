package lesson7

object TrafficLightColor extends Enumeration{
  val Red, Yellow, Green = Value

  def main(args: Array[String]): Unit = {
    for(c <- TrafficLightColor.values)
      println(s"${c.id}: $c")

    println(TrafficLightColor(0).toString)
    println(TrafficLightColor.withName("Yellow").toString)
  }
}
