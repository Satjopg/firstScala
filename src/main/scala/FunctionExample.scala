object FunctionExample {
    def main(args: Array[String]): Unit = {
      var calculate =(x: Int) => x + 5 : Int
      println("y="+calculate(1))
      println("y="+calculate(2))
    }
}
