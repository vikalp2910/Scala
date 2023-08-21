package edu.vikalp

object Basics1Variables extends  App {

  //Int, Float, Double, Char, Boolean


  val numberValue1: Int =10;   //const int numberValue1=100;
  val numberValue2=20;

  println(numberValue1); println(numberValue2);

  val floatValue1: Float=100.00f;
  val floatValue2=200.00f
  println(floatValue1); println(floatValue2);

  val doubleVlaue1: Double=1000.00;
  val doubleValue2=2000.00;
  println(doubleVlaue1); println(doubleValue2);

  val charValue1: Char='v';
  val charValue2='s';
  println(charValue1); println(charValue2);


  val booleanValue1: Boolean = true;
  val booleanValue2=false;
  println(booleanValue1); println(booleanValue2);

  val stringValue1="vikalp";
  val stringValue2="my"+"name"+"is"+"vikalp";
  val stringValue3=s"my number is $numberValue2";

  println(stringValue1);  println(stringValue2); println(stringValue3);


}
