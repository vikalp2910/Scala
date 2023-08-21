package edu.vikalp

object Basics13Option extends App{

  var value1:String="sonkar";

  var result=Option(value1).get;


  var stringProcess =result match {
    case "sonkar" => s"this is $result test";
    case "vikalp" => s"this is $result test";
 //  case None => "this is none match test";
  }
  println(stringProcess);

}
