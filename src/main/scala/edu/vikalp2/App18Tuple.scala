package edu.vikalp2

object App18Tuple {

  def main(args:Array[String]): Unit ={

    val tuple1=(1,2,"vikalp",true);
    val tuple2=new Tuple4(10,20,"xyz",false);
    println(tuple1);
    println(tuple2);

    println(tuple1._3);
    println(tuple1._4);

    println("===============");
    tuple1.productIterator.foreach(println);
    println("===============");

    tuple2.productIterator.foreach{
      i=>println(i);
    }
    println("===============");
  }

}
