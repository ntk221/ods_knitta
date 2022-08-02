package arraystack.adt

import scala.reflect.ClassTag

class ArrayStack[A: ClassTag] extends ArrayStack[A] // Stack トレイトを継承しているので、このクラスは Stack のインターフェースを実装しなくてはならない
{
	private var top = 0 // Stack の先頭を指すインデックス
	private var data = new Array[A](10) // 最初は 10 個データが入るように配列を宣言しておく
	
	def push(obj: A) = {
		if (top >= data.length) { //スタックに obj を追加するスペースがないときは、 data 配列を 2 倍の大きさにする
			val tmp = new Array[A](data.length * 2)
			Array.copy(data, 0, tmp, data.length)
			data = tmp
		}
		data(top) = obj // スタックの先頭に データを追加する
		top += 1
	}

	def pop(): A = {
		assert(!isEmpty, "空のスタックに対して呼び出されています") // スタックが空の時には 失敗
	  top -= 1
		data(top)
	}

	def get(i: Int) = {

	}
}