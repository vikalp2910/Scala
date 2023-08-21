package edu.vikalp2

object App13Strings {

  val num1=75;
  val num2=100.25;

  val str1:String="vikalpSonkar29";
  val str2:String=" Scala";
  def main(args:Array[String]): Unit ={
    println(str1.length());
    println(str1.concat(str2));
    println(str1+str2);

    val result=printf("(%d -- %f -- %s)",num1,num2,str1);
    println();
    printf("(%d -- %f -- %s)".format(num1,num2,str1));



  }
}
