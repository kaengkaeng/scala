def predictAge(age1: Int, age2: Int, age3: Int, age4: Int, age5: Int, age6: Int, age7: Int, age8: Int): Int = {
    
    val newList: List[Int] = List(age1, age2, age3, age4, age5, age6, age7, age8)
    var newSum = 0
    
    for (age <- newList) {
      newSum += age * age
  }

    val squareRoot = Math.sqrt(newSum)
    (squareRoot / 2).toInt
    }

//defalut value als parameter 

def twofer(name: String = "you"): String =
  name match {
    case _ => s"One for $name, one for me."
  }   

