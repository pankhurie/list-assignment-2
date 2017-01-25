/**
  * Write a function that splits a list elements into a pair of lists on the basis of given boolean function.
  * The signature of the method should be:
  * def splitList[A](l:List[A],f:A=>Boolean):(List[A],List[B])  **/

import scala.collection.mutable.ListBuffer

object SplitList extends App {
  type A = Int
  type B = Any
  val srcList = List[A](1, 2, 3, 4, 5)
  val listTuple = splitList(srcList, (x: A) => x < 3)
  println("The Tuple of Lists After Splitting is : " + listTuple)

  def splitList[A](l: List[A], f: A => Boolean): (List[A], List[B]) = {

    //USING LIST BUFFER   :
      // val tempBuffer1 = new ListBuffer[A]()
      //val tempBuffer2 = new ListBuffer[B]()
      //  l.map(x => if (f(x)) tempBuffer1 += x else tempBuffer2 += x)
      // (tempBuffer1.toList, tempBuffer2.toList)

    //WITHOUT LIST BUFFER :

      val l1 = (for (i <- 0 to l.length - 1 if (f(l(i)))) yield l(i)).toList
      val l2 = (for (i <- 0 to l.length - 1 if (!f(l(i)))) yield l(i)).toList

      (l1, l2)
  }
}
