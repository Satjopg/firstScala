// 引数以外の変数は自身が定義した環境で解決する
// 関数とそれを評価する環境をクロージャと呼ぶ（むずかし）
object Closure {
  def main(args: Array[String]): Unit = {
    val candidate = List(1, 2, 3, 4, 5)

// filter:引数の配列からある条件に一致する要素を抽出する
// predicateはIntを引数に取り、Booleanを返す関数
    val filter = (predicate :Int => Boolean) => {
      (candidate :List[Int] ) => {
        // filterの処理.predicateは判定関数.
        // yieldは新しいコレクションを返す時に使用
        for(x <- candidate ; if(predicate(x))) yield x
      }
    }
// predicate:引数が偶数か奇数かを判定する（自由変数）
    val predicate = (x : Int) => x % 2 == 0

    var oddfilter = filter(predicate)
    oddfilter(candidate).foreach(println)
  }
}
