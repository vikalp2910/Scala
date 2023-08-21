package edu.vikalp2

object App15List {

  var list1:List[Int]=List(1,2,3,4,5);
  var list2:List[String]=List("vikalp","sonkar")

  def main(args:Array[String]): Unit ={
    println(list1);
    println(list2);

    println(0 :: list1);
    println(list1);
    println(Nil);
    println(1::2::Nil);

    println(list1.head);
    println(list1.tail);
    println(list1.isEmpty);
    println(list1.reverse);
    println(List.fill(5)(2));
    println(list1.max);
    println("--------------");
    println(list1.foreach(println));
    println("--------------");

    for(i<-list1){
      println(i)
    }

  }

}
