object FunctionExample {
  def main(args: Array[String]): Unit = {
    var calculate =(x: Int) => x + 5
    println("y="+calculate(1))
    println("y="+calculate(2))
    val add = (x: Int) => {
      val _add = (y: Int) => y + 1
      _add(x)
    }
    println("add result:"+add(1))
  }
}
