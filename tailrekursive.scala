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
