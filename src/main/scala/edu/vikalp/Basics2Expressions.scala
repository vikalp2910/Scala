package edu.vikalp

object Basics2Expressions extends  App {

  val expressions1=2+3;
  println(expressions1);

  //// in other languages: meaningOfLife > 25 ? 50 : 100
  val numberValue1=29;
  val ifExpressions1=if(numberValue1>25)50 else 100;
  println(ifExpressions1);

  val numberValue2=45;
  val ifExpressions2=if(numberValue2<20)200
  else if(numberValue2<30)300
  else if (numberValue2<40)400
  else 500;
  println(ifExpressions2);




}
