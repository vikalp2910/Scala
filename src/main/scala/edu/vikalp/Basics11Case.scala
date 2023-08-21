package edu.vikalp

object Basics11Case extends App{

  case class Person(name:String,age:Int){

  }

  val p1:Person=new Person("vikalp",29);
  println(p1);


}
