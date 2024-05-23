//higher ordner function

//구구단 함수 
def multiTable(n: Int): String = 
  (1 to 10).map(i => s"$i * $n = ${i* n}").mkString("\n")
  // 범위 생성 : (1 to 10)
  // map 활용?!
  // mkString: 문자열로 결합 후  한줄 띄기 ("\n")

// 문장에서 제일 짧은 단어 찾기 
def findShort(str: String): Int = str.split(" ").map(_.length).min 

//ture counter 
def countSheep(sheep: Array[Boolean]): Int = 
    sheep.filter(_ == true).count(_ == true)

//제일 작은 숫자 두개 in List 합해서 출력하시오. 
def sumTwoSmallest(numbers: List[Int]): Int = 
    numbers.sorted.take(2).sum
