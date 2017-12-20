package lesson7

class Accounts{
  private var balance = 0.0
  private def Test()={
    val t = Accounts.lastNumber +1
  }
  class Test{

  }

}

object Accounts {
  private var lastNumber = 0
  def newUniqueNumber() = { lastNumber += 1; lastNumber }

  def main(args: Array[String]): Unit = {
    val t = new Accounts
    //t.test()
  }
}