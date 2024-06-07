
// 입력받은 숫자의 각 자릿수를 더하기 
def sumDigits(n: Int): Int = 
  def step(n: Int, acc: Int): Int = // 내부 보조 함수 step 선언. n과 acc라는 두 개의 Int 타입 인수를 받음.
    n match // n의 값을 기준으로 패턴 매칭을 시작.
      case 0 => 0 + acc // n이 0인 경우, acc를 반환. (0 + acc는 acc와 동일)
      case _ => step(n / 10, acc + math.abs(n % 10)) // n이 0이 아닌 경우:
        // n을 10으로 나누어 자리수를 줄이고, 현재 n의 마지막 자릿수의 절대값을 acc에 더하여 step 함수를 재귀 호출.
  step(math.abs(n), 0) // step 함수를 절대값으로 변환한 n과 초기 acc 값 0으로 호출.


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




//유전자 알파벳 바꾸기
def makeComplement(dna: String): String = {
     def step(acc: String, dna: String): String = 
        dna match {
          case "" => acc
          case _ if dna.head == 'A' => step(acc + "T", dna.tail)
          case _ if dna.head == 'T' => step(acc + "A", dna.tail)
          case _ if dna.head == 'C' => step(acc + "G", dna.tail)
          case _ if dna.head == 'G' => step(acc + "C", dna.tail)
          case _ => acc 
    }
     step("", dna)
}

//////////////////////////////////////////////////////////

// Probeklausur 
// "42"가 들어 있는지 확인하는 함수 
//1) tailrekursion :scala version
def universe(num: Int): Boolean = {
  def step(acc: Boolean, num: Int): Boolean =
    num match {
      case 0 => acc
      case _ if (num % 100 == 42) => step(true, num / 10)
      case _ => step(acc, num / 10)
    }
  step(false, num)
}

//2)Imperative version
def forUni(n: Int): Boolean = {
  var num = math.abs(n) // 변경 가능하도록 var로 선언
  var erg = false // 변경 가능하도록 var로 선언
  while (num >= 42) { 
    if (num % 100 == 42) {
      return true // 조건이 참이면 true 반환하고 함수 종료
    }
    num = num / 10 // num을 업데이트, also next 
  }
  erg // 최종 결과 반환
}


//////////////////////////////////////////////////////////

// addiere von 1 bis n 
// 1)Rekursion
def summation(n: Int): Int =
  n match
    case 0 => 0
    case _ => n + summation(n - 1)

//2)tail_Rekursion 
def tailSum(n:Int):Int = 
  def step(acc:Int, n:Int):Int =
    n match
      case 0 => acc
      case _ => step(acc +n, n-1)
  step(0,n) // initial Aufruf


// n 의 자릿수의 합을 구하는 함수 aus uebungszettel
// "%" 를 이용해서 digit (각자릿 수) 구하기 (역순으로 구해짐)
// "/" 를 이용해서 next로 넘어가기
def quersum(n:Int): Int =
  def help(acc:Int, n:Int):Int =
    n match
      case 0 => acc //anker
      case _ => help(acc+n%10, n/10) //rekursionsschritte
  help(0,n)

// Uni aus uebungszettel
// zahlen sind umgedrehte zahlen liefert.
// Int -> String (toString) ->Int (toInt)
def reverseZahl(n: Int): Int =
  def step(acc: String, n: Int): String =
    n match
      case 0 if acc.isEmpty => "0" // n이 처음부터 0인 경우 처리 // (1)Anker
      case 0 => acc // (2)Anker
      case _ => step(acc + (n % 10).toString, n / 10) //Rekursionsschritte

  step("", n).toInt

//Uebungszettel
// 리스트 안에 원소에 f 함수 식을 적용했을때 최대값이 나오는 원소 출력
def argmax(xsl: List[Int], f: Int => Int): Int = {
  def help(list: List[Int], f: Int => Int, max: Int): Int =
    list match {
      case Nil => max
      case x :: xs if f(x) > f(max) => help(xs, f, x)
      case _ :: xs => help(xs, f, max)
    }
  help(xsl, f, Int.MinValue) // 초기 max 값을 Int의 최솟값으로 설정합니다.
}

/////////////////////////////////////////////////////////////////////////


// 두수 합(Int)을 구해서 이진수(string)로 출력하기  
def addBinary(a: Int, b: Int): String = {
  def step(acc: String, sum: Int): String = {
    sum match {
      case 0 => acc
      case _ => step(((sum % 2).toString) + acc, sum / 2)
    }
  }
  step("", a + b)
}
