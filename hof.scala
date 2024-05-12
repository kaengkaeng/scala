//higher ordner function

//ture counter 
def countSheep(sheep: Array[Boolean]): Int = 
    sheep.filter(_ == true).count(_ == true)

//제일 작은 숫자 두개 in List 합해서 출력하시오. 
def sumTwoSmallest(numbers: List[Int]): Int = 
    numbers.sorted.take(2).sum
