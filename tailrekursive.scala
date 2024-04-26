def number(busStops: List[(Int, Int)]): Int =
  def help(busStops: List[(Int, Int)], acc1:Int, acc2:Int) :Int =
    busStops match
      case Nil => acc1 - acc2
      case (a, b) :: tail =>
            if (a < 0 || b < 0) throw new Exception()
            else help(tail, acc1 + a, acc2 + b)
  help(busStops, 0,0)
