package edu.vikalp2

object App5ForLoop {

  def main(args: Array[String]): Unit = {

     for ( i <- 1 to(5)){
       println(s" i1 value is ${i}");
     }

    for(i<- 1.to(5)){
      println(s" i2 == ${i}");
    }

    for(i<- 1.until(5)){
      println(s"i3 value is ${i}");
    }

    for (i <- 1.until(4); j<-1.to(2)) {
      println(s"i == ${i} && j == $j");
    }

    val list=List(1,4,7,9,25,29);
    for (i<- list){
      println(s"i using list value ${i}");
    }

    for (i <- list ;if(i<5)) {
      println(s"i using list value with if condition is ${i}");
    }

    val result=for{i<-list; if(i<5)}yield {
       i*i;
    }
    println(result);

    val result2 = for {i <- list
                       if (i > 5)} yield {
      i * i;
    }
    println(result2);

  }

}
