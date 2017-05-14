object HelloWorld {
  def main(args: Array[String]): Unit = {
    if(args.size == 0) {
      val strs = Array("Hello", "World")
      output(strs)
    } else {
      println("Invalid args")
    }
  }
  def output(strs: Array[String]): Unit = {
    strs.foreach(printf("%s", _))
    println()
  }
}
