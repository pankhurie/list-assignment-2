/**
  * Write a function that concatenates a list of lists into a single list.
  * Its runtime should be linear in the total length of all lists.
  * The signature of the method should be:
  * def concateList[A](l1:List[A],l2:List[A]):List[A]
  **/

import scala.collection.mutable.ListBuffer

object ConcateLists extends App {
  type A = Int
  val list1 = List[A](1, 2, 3, 4)
  val list2 = List[A](5, 6, 7, 8, 9, 10)
  println(s"Concatenated List is : ${concateList(list1, list2)}")

  def concateList[A](l1: List[A], l2: List[A]): List[A] = {

    val tempBuffer = new ListBuffer[A]
    for (a <- l1) tempBuffer += a
    for (b <- l2) tempBuffer += b

    tempBuffer.toList

  }

}
