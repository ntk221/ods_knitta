package stack.adt

trait Stack[A] {

	/**
	 * スタックに、 A 型の obj を追加するメソッド
	 * tparam push メソッドの引数 obj の型 A は スタックが格納するデータの型である
	 */
	def push(obj: A)
	
	/**
   * スタックの直近に追加された要素を取り出すメソッド
   * @return としてそれを返す
   */
	def pop(): A

}
