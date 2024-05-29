
// 주어진 숫자 n을 확장된 형태로 반환하는 함수 : (input "12" -> output "10+2") 

def expandedForm(n: Long): String =      
  def step(n: Long, acc: Long): String = { // 내부 헬퍼 함수 step 정의. n과 현재 자리수를 추적하는 acc를 매개변수로 가짐
    (n, acc) match                          //  (n, acc)에 대한 패턴 매칭 시작
      case (0, _) => ""                     //  n이 0인 경우, 빈 문자열을 반환
      case (_, _) =>                        //  그 외의 경우에 대해 처리
        val next = step(n / 10, acc * 10)   //  재귀 호출: n을 10으로 나눈 값과 acc에 10을 곱한 값을 인수로 사용
        val current = (n % 10) * acc        //  현재 자리수의 값을 계산
        if (current == 0) next              // 현재 자리수가 0이면 next 반환
        else if (next.isEmpty) s"$current"  // next가 빈 문자열이면 현재 자리수의 값을 문자열로 반환
        else s"$next + $current"            // next가 빈 문자열이 아니면 현재 자리수의 값을 next에 덧붙여 반환
  }

  if (n == 0) "0"                           // n이 0이면 "0"을 반환
  else step(n, 1)                           // 그렇지 않으면, step 함수 호출. acc 초기값은 1


// 내림차순 정렬 함수 만들기 
def descendingOrder(num: Int): Int = {
    def step(num: Int, acc: Int): Int =
      num match {
        case 0 => acc
        case _ => step(num / 10, acc * 10 + num % 10)
    }
    val result = step(num, 0)
    result.toString.sortWith(_ > _).toInt
  }

/*
def descendingOrder(num: Int): Int = {
    num.toString.sortWith(_>_).toInt
    */ 

// 리스트 뒤집기 
def reverseList(xs: List[Int]): List[Int] = 
  def step(xs: List[Int], acc: List[Int]): List[Int] =
    xs match {
      case Nil => acc // anker
      case x :: xs => step(xs, x :: acc) // 이 부분 순서 중요 
    }
  step(xs, Nil)


def number(busStops: List[(Int, Int)]): Int =
  def help(busStops: List[(Int, Int)], acc1:Int, acc2:Int) :Int =
    busStops match
      case Nil => acc1 - acc2
      case (a, b) :: tail =>
            if (a < 0 || b < 0) throw new Exception()
            else help(tail, acc1 + a, acc2 + b)
  help(busStops, 0,0)
