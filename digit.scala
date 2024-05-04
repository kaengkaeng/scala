def persistence(n: Int): Int = {
  // 주어진 숫자가 한 자릿수인 경우 곱셈 횟수는 0
  if (n < 10) 0
  var count = 0 // 곱셈 횟수를 나타내는 변수 초기화
  var res = n // 현재 처리해야 할 수

  // 주어진 숫자의 각 자릿수를 곱하여 한 자릿수가 될 때까지 반복
  while (res / 10 != 0) {
    var prod = 1 // 각 자릿수의 곱을 저장하는 변수 초기화
    // 현재 숫자의 각 자릿수를 곱하여 곱셈 결과를 계산
    while (res > 0) {
      prod *= res % 10 // 현재 자릿수를 곱하여 곱셈 결과에 곱함
      res /= 10 // 다음 자릿수를 처리하기 위해 현재 숫자를 10으로 나눔
    }
    count += 1 // 곱셈 횟수 증가
    res = prod // 현재 곱셈 결과를 새로운 숫자로 설정
  }
  count // 최종적으로 곱셈 횟수 반환
}



/*27042024*/
// 정수 배열을 입력받아 홀수 번 등장하는 숫자를 찾아 반환하는 함수
def findOdd(xs: Seq[Int]): Int = 
    
    var oddNum = 0 // 홀수 번 등장하는 숫자를 저장할 변수
    for (x <- xs) { // 배열의 각 요소를 반복합니다.
      
      val oddCount = xs.count(_ == x) // 현재 숫자가 배열에서 등장하는 횟수를 세어 oddCount에 할당
      
      if (oddCount % 2 != 0) // 만약 현재 숫자가 홀수 번 등장한다면
        oddNum = x // 홀수 번 등장하는 숫자를 oddNum에 할당
    } 
    
    oddNum // 홀수 번 등장하는 숫자 반환



/*23042024*/

// A function that calculates the amount of water Nathan will drink during the given time.
def litres(time: Double): Int = {
  // Multiply the time by 0.5, round down the result, and convert it to an integer.
  //소수부분 버리기 scala.math.floor 
  //소수 반올림 scala.math.round
  scala.math.floor(time * 0.5).toInt
}

// A function that validates whether a pin, provided as a string, is valid or not.
def validatePin(pin: String): Boolean =
  // Check if the input string consists entirely of letters or digits,
  // and whether its length is either 4 or 6, to determine its validity.
  if ((pin.forall(_.isLetter) || pin.forall(_.isDigit)) && (pin.length == 4 || pin.length == 6)) true
  else false



/*Convert number to reversed array of digits. 
  Given a random non-negative number, you have to return the digits of this number within an array in reverse order*/

def digitize(n: Long): Seq[Int] =

  def step(acc:List[Int], n:Long):Seq[Int] =
    n match
      case _ if n < 0 =>  Nil
      case 0 => if (acc.isEmpty) List(0) else acc.reverse
      case _ =>  step(((n % 10).toInt):: acc, n /10 )

  step(Nil,n)

/*
Given an array of integers.

Return an array, where the first element is the count of positives numbers and the second element is sum of negative numbers. 0 is neither positive nor negative.

If the input is an empty array or is null, return an empty array.
 */

def countPositivesSumNegatives(integers: Array[Int]): (Int, Int) = {
  var psum = 0
  var nega = 0

  if (integers.isEmpty || integers.forall(_ == 0)) (0,0)
  else {
    for (i <- 0 until integers.length) {
      if (integers(i) > 0) psum += 1
      else if (integers(i) < 0) nega += integers(i)
    }
    (psum, nega)
  }
  }
