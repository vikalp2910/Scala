package edu.vikalp2

object App17Map {

  def main(args:Array[String]): Unit ={

    val map1:Map[Int,String]=Map(29 ->"vikson",29 ->"vikalp", 1->"Anita",100->"sonkar" );

    val map2:Map[Int,String]=Map(100 ->"abc",200 ->"xyz",300->"pqr" );

    println(map1);
    println(map1(29));
    //println(map1(25));

    println(map1.keys);
    println(map1.values);
    println(map1.isEmpty);

    map1.keys.foreach(println);
    println("=========")

    map1.keys.foreach{
      key=>
      println(s"key is $key");
      println("value is "+map1(key));
      println("=========")
    }

    println(map1.contains(25));
    println(map1++map2);
  }

}
