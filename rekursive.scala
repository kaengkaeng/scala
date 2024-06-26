// 입력된 Long 정수의 자릿수(digit) 를 반환하는 함수
def digits(n: Long): Int = {
  def step(n: Long, acc: Int): Int = 
    n match {      
      case 0 => acc // 입력값이 0인 경우, 누적된 자릿수(acc) 반환
      case _ => step(n / 10, acc + 1)// 입력값이 0이 아닌 경우, 자릿수를 하나 증가시키고 재귀적으로 호출
    }

  // 만약 입력값이 0이면, 최소 한 자릿수가 있으므로 1 반환
  // 그렇지 않으면, 절댓값을 취한 후 재귀 함수 호출
  if (n == 0) 1 else step(n.abs, 0)
}


/*대소문자 섞인 회문 프로그램*/ 
def isPalindrome(s: String): Boolean = {
  // 문자열을 대문자로 변환하여 대소문자를 무시하고 처리
  val neustr = s.toUpperCase
  (neustr) match {    
    case _ if neustr.length <= 1 => true // 문자열의 길이가 1 이하인 경우, 회문으로 간주하여 true 반환
    // 문자열의 첫 번째 문자와 마지막 문자가 같은 경우,
    // 문자열의 첫 번째와 마지막 문자를 제외한 부분에 대해 재귀적으로 isPalindrome 함수 호출
    case _ if neustr.head == neustr.last => isPalindrome(neustr.tail.init)
    // str.tail 은 앞머리를 제외한 나머지 부분이고, str.init 맨뒷부분을 제외한 나머지 부분이다. 
    case _ => false
  }
}



def summation(n: Int): Int = 
    n match 
      case 0 => 0 
      case _ => n + summation(n - 1)


def distinct(xs: Seq[Int]): Seq[Int] = 
 xs match { 
   case Nil => List() // 만약 입력이 빈 리스트인 경우, 빈 리스트를 반환합니다.
   case x :: tail => x +: distinct(tail.filter(_ != x)) 
   // x를 결과 리스트에 추가, tail에서 x와 같지 않은 요소들로 재귀적으로 함수를 호출, "+:" 리스트 원소 append :) 
}




/*test
 (0, ""),
    (1, "1 sheep..."),
    (2, "1 sheep...2 sheep..."),
    (3, "1 sheep...2 sheep...3 sheep...")*/

def countingSheep(num: Int): String = {
    num match {
      case 0 => ""
      case _ => countingSheep(num - 1)+s"$num sheep..." 
    }
  }
