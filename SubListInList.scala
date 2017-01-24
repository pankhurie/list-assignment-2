
object SubListInList extends App {
type A=Int
  val srcList = List[A](1, 2, 3, 4, 5)
  val subList = List[A](1, 2)
  val subList2 = List[A](5, 3, 4)


  println(s"$subList is a subsequence of $srcList : ${hasSubsequence(srcList, subList)} ")
  println(s"$subList2 is a subsequence of $srcList : ${hasSubsequence(srcList, subList2)} ")

  def hasSubsequence[A](src: List[A], sub: List[A]): Boolean = {
    (for (i <- 0 to src.length - 1) yield (src.slice(i, i + sub.length)) == sub).contains(true)
  }
}
