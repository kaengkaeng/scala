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
