/** Compute the length of a list using method foldRight.
  * The signature of the method should be:
  * def length[A](l: List[A]): Int      */

object LengthOfList extends App {
  type A = Int
  val l: List[A] = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
  print("Length of List is : " + length(l))

  def length[A](l: List[A]): Int = {
    (l.map(x => 1)).foldRight(0)(_ + _)
  }
}
