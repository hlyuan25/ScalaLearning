package lesson6

class Person (val name: String){ out=>
  var age = 0
  def description = s"${out.name} is $age years old."

}

object Person{
  def main(args: Array[String]): Unit = {
    val p = new Person("Ian")
  }
}
