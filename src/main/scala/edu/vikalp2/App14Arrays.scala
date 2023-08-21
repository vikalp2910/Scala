package edu.vikalp2
import Array._;
object App14Arrays {

  val arr1:Array[Int]=new Array[Int](5);
  val arr2=new Array[Int](5);
  val arr3=Array(1,2,3,4,5);


  def main(args:Array[String]): Unit = {
    println("Vikalp");

    arr1(0)=10;
    arr1(1)=20;
    arr1(2)=30;
    arr1(3)=40;
    arr1(4)=50;

    for(x<- arr1){
      println(x);
    }
    println("--------------");

    for(x<- 0.to(arr1.length-1)){
      println(arr1(x));
    }
    println("--------------");

    for (x <- 0.to(arr3.length - 1)) {
      println(arr3(x));
    }
    println("--------------");

    var result=concat(arr1,arr3);
    for (x <- 0.to(result.length - 1)) {
      println(result(x));
    }
    println("--------------");

  }
}
