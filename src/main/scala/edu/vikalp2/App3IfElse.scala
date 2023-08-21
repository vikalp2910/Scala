package edu.vikalp2

object App3IfElse {

  def main(args: Array[String]): Unit = {
    val v1 = 10;
    val v2 = 20;

    if (v1 == 10) {
      println(s"x is $v1")
    }
      else
      {
        println(s"x is $v2");
      }

    val result=if(v1==10)s"x value is $v1" else s"x value is $v2";
    println(result);

    val x=10;
    val y=20;

    val result2=if(x<15 || y>25) s"x or y $x and $y" else " x and y undefined";
    val result3=if(x<15 && y>15) s"x and y $x and $y" else " x and y undefined";
    println(result2);
    println(result3);

    }
  }
