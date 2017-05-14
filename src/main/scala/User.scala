// コンストラクタは不要ってことでとりあえずおけ
// フィールド変数は引数の如く書け、アクセスはインスタンス．フィールド名でいける
// フィールド変数へのアクセスを許したくない時はprivateを引数の前に書けばおけ
class User(val id: Long, val firstname: String, val lastname: String) {
  def getFullname() = this.firstname + " " + this.lastname
}
