package edu.vikalp2

object App16Set {

  def main(args:Array[String]): Unit ={

    val set1:Set[Int]=Set(1,2,1,3,4,5,5);
    println(set1);
    println(set1 + 10);
    println(set1);


    val set2=scala.collection.mutable.Set (50,10,20,10,30,40,40,50,1,2);
    println(set2);

    println(set2+10);
    println(set2);

    println(set1(5));

    println(set1.head);
    println(set1.tail);

    println(set1.isEmpty);

    println(set1++set2);
    println(set1.++(set2));

    println(set1.&(set2));
    println(set1.intersect(set2));
    println(set1.max);
    println(set1.min);

    set1.foreach(print);
    println();

    for(i<-set1){
      println(i);
    }


  }

}
