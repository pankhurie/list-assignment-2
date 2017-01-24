import scala.collection.mutable.ListBuffer

object ConcateLists extends App{
  type A=Int
  val list1 = List[A](1,2,3,4)
  val list2 = List[A](5,6,7,8,9,10)
  println(s"Concatenated List is : ${concateList(list1,list2)}")
  def concateList[A](l1:List[A],l2:List[A]):List[A]={

    val tryBuffer = new ListBuffer[A]
    for (a<-l1) tryBuffer+=a
    for (b<-l2) tryBuffer+=b

    tryBuffer.toList

  }

}
