
// 리스트 뒤집기 mit pattern matching
def reverseList[A](list: List[A]): List[A] ={
  list match
    case Nil => Nil
    case x :: xs => reverseList(xs) :::List(x)
}

// 리스트 뒤집기 mit for 
def reverseFor[A](list: List[A]): List[A] = {
  var buffer = List[A]()
  for (elem <- list) {
    buffer = elem :: buffer
  }
  buffer
}

/////////////////////////////////////////////////////

// Klausur 
// 두개 리스트 받아서 다른 원소만 출력, 즉 원소가 같을 경우 weg!
// for 문으로 구현

def xors(list1: List[Int], list2: List[Int]): List[Int] = {
  var erg: List[Int] = List()
  for (i <- 0 until list1.length) {
    if (!list2.contains(list1(i))) erg = list1(i) :: erg
  }
  for (j <- 0 until list2.length) {
    if (!list1.contains(list2(j))) erg = list2(j) :: erg
  }
  erg 


/////////////////////////////////////////////////////

// uebungszettel: 입력받은 정수의 자릿수를 계산하는 문제 
def countDigit(n: Int): Int = {
  var count = 0
  var remaining = n  // 입력값을 임시 변수에 저장

  while (remaining > 0) {
    val digit = remaining % 10  // 현재 자릿수를 계산
    if (digit >= 0 && digit < 10) // digit이 0에서 9 사이에 있는지 확인
      count += 1
    remaining = remaining / 10  // 다음 자릿수로 이동
  }

  count
}


// uebungszettel : 입력받은 숫자의 자릿수들의 합을 출력하는 함수 
// mit While
def quersumme(n: Int): Int = {
  var summe = 0
  var rest = n
  while (rest > 0) {
    val digit = rest % 10
    if (digit < 10) // digit이 0에서 9 사이에 있는지 확인
      summe += digit
    rest = rest / 10
  }
  summe // while 루프 밖에서 반환
}

//mit Tailrekursion 
def quersummeP(n:Int):Int =
  def step(acc:Int, n:Int):Int =
    n match
      case 0 => acc
      case _ if (n%10) < 10 => step(acc+(n%10), n/10)
      case _ => step(acc, n/10)
  step(0,n)





//24042024
// 이진수 => 십진수
def binSeqToInt(xs: Seq[Int]): Int =
  var num = 0

  //역순으로 List를 loop 할때 표현식
  for (x <- xs.length - 1 to 0 by -1) {
    if (xs(x) != 0) {
      //"xs.length - x - 1"은 해당 자릿수의 위치를 나타내는데, 이는 오른쪽에서부터 왼쪽으로 갈수록 증가
      num = math.pow(2, xs.length - x - 1).toInt + num
  }
}
  num

// meine loesung
def reverseWords(text: String): String = {
  val words = text.split(" ")
  val reversedWords = words.map(_.reverse)
  val newOne = reversedWords.mkString(" ")
  newOne
}

// andere loesung
def reverseWords2(text: String): String = text.split(" ").map(_.reverse).mkString(" ")



//22042024 
 def filterList(list: List[Any]): List[Int] =

  var num :List[Int] = List()
  var cha :List[String] = List()
  
  //isInstanceOf[Int] => Int class의 하위 클래스 
  //isInstanceOf[String]=> String class의 하위 클래스 
  for (x <-  list)
     if (x.isInstanceOf[Int]) num = num :+ x.asInstanceOf[Int]
     else if (x.isInstanceOf[String]) cha = cha :+ x.asInstanceOf[String]

  num 


//Ausdruck: ganze Zahl in List und danach List ist umgedreht geliefert wie python
def reverseSeq(n: Int): Seq[Int] = {
  (n to 1 by -1).toList
}


// String wie eine List head/tail  :meine loesung 
def areYouPlayingBanjo1(name: String): String = {
  for (x <- 0 until name.length) {
    val char = name(x)
    if (char.toLower == 'r' && x == 0) (s"$name plays banjo")
  }
  s"$name does not play banjo"

}



// String wie eine List head/tail  :andere Loesung aus codewars
def areYouPlayingBanjo2(name: String): String = {
    name.head match
        case 'R' | 'r' => name + " plays banjo"
        case _ => name + " does not play banjo"
    
 }


