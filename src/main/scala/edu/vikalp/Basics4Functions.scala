package edu.vikalp

object Basics4Functions extends App {

  //String myFunction(int x,String y)
  def myFunction1(x:Int,y:String):String= x+" "+y;
  println(myFunction1(29,"vikalp"));

  def factorial(n:Int):Int={
    if(n<=1)1
    else n*factorial(n-1);
  }
  /*
      factorial(5) = 5 * factorial(4) = 5 * 24 = 120
      factorial(4) = 4 * factorial(3) = 4 * 6
      factorial(3) = 3 * factorial(2) = 3 * 2
      factorial(2) = 2 * factorial(1) = 2 * 1
      factorial(1) = 1
     */
  println(factorial(5));

  // In Scala we don't use loops or iteration, we use RECURSION!

  // the Unit type = no meaningful value === "void" in other languages
  println("vikalp sonkar");  //System.out.println

  def myFunction2(i:Int):Unit={
    println("value="+i);
  }
  myFunction2(29);
}
