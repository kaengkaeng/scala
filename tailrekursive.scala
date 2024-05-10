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




def number(busStops: List[(Int, Int)]): Int =
  def help(busStops: List[(Int, Int)], acc1:Int, acc2:Int) :Int =
    busStops match
      case Nil => acc1 - acc2
      case (a, b) :: tail =>
            if (a < 0 || b < 0) throw new Exception()
            else help(tail, acc1 + a, acc2 + b)
  help(busStops, 0,0)
