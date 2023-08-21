package edu.vikalp2

object App19Options {

  def main(args:Array[String]): Unit ={

    val list=List(1,2,3,4,5);
    val map=Map(1->"vikalp",2->"anita",3->"sonkar");

    println(list);
    println(map);

    val o1=list.find(_>4);
    println(o1.get);

    val o2 = list.find(_ > 10);
    println(o2);

    println(map.get(1));
    println(map.get(11).getOrElse("no findings"));


  }
}
