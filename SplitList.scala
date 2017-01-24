import scala.collection.mutable.ListBuffer

object SplitList extends App {
  type A = Int
  type B = Any
  val srcList = List[A](1, 2, 3, 4, 5)
  val listTuple = splitList(srcList, (x: A) => x < 3)
  println("The Tuple of Lists After Splitting is : " + listTuple)

  def splitList[A](l: List[A], f: A => Boolean): (List[A], List[B]) = {


    val tempBuffer1= new ListBuffer[A]()
    val tempBuffer2= new ListBuffer[B]()
    l.map(x => if (f(x)) tempBuffer1+=x else  tempBuffer2+=x)
    (tempBuffer1.toList,tempBuffer2.toList)

  }
}
