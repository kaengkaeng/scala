//higher ordner function

// 문장에서 제일 짧은 단어 찾기 
def findShort(str: String): Int = str.split(" ").map(_.length).min 

//ture counter 
def countSheep(sheep: Array[Boolean]): Int = 
    sheep.filter(_ == true).count(_ == true)

//제일 작은 숫자 두개 in List 합해서 출력하시오. 
def sumTwoSmallest(numbers: List[Int]): Int = 
    numbers.sorted.take(2).sum
