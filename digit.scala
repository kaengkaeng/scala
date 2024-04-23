/*23042024*/

// A function that calculates the amount of water Nathan will drink during the given time.
def litres(time: Double): Int = {
  // Multiply the time by 0.5, round down the result, and convert it to an integer.
  scala.math.floor(time * 0.5).toInt
}

// A function that validates whether a pin, provided as a string, is valid or not.
def validatePin(pin: String): Boolean =
  // Check if the input string consists entirely of letters or digits,
  // and whether its length is either 4 or 6, to determine its validity.
  if ((pin.forall(_.isLetter) || pin.forall(_.isDigit)) && (pin.length == 4 || pin.length == 6)) true
  else false



//Convert number to reversed array of digits

//Given a random non-negative number, you have to return the digits of this number within an array in reverse order.

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