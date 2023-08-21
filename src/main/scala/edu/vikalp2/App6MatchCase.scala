package edu.vikalp2

object App6MatchCase {

  def main(args:Array[String]): Unit = {

    val age=20;

    age match {
      case 20=>println(age);
      case 30=>println(age);
      case 40=>println(age);
      case 50=>println(age);
      case _=>println("default value 100");
    }

    val result = age match {
      case 20 => age;
      case 30 => age;
      case 40 => age;
      case 50 => age;
      case _ => "default";
    }
    println(s"result= $result");

    val i=6;

    val result2=i match {
      case 1|3|5|7|9 => "odd";
      case 2|4|6|8|10 =>"even"
    }

    println(s"result2 is $result2");


  }

}
