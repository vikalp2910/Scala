package edu.vikalp

object Basics10Companion extends  App {
  val value1: Int = 10;
  def myDef(): Int=20;
  def apply(i:Int):Int=i+1;

  println(value1);
  println(myDef());
  println(apply(99));


  println(Basics10Companion.value1);
  println(Basics10Companion.myDef());
  println(Basics10Companion(99));

  class Home{
    val homeVal1:String="50 lacs";

  }

  object Home{  //companion Object
  val homeVal2:String="1 cr";
  }

  val result1: String = new Home().homeVal1;
  println(result1);

  val result2: String = Home.homeVal2;
  println(Basics10Companion.result2);

}
