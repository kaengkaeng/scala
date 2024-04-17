//higher-order function that can accept other functions as arguments or return functions.
def sum(f: Int => Int, a: Int, b: Int): Int =
  def loop(a: Int, acc: Int): Int =
    if (a > b) acc // anker
    else loop(a + 1, acc + f(a))
  loop(a, 0)


//curried function that utilizes a technique to transform a function that takes multiple arguments
// into a series of functions that each take a single argument.

def sum(f: Int => Int): (Int, Int) => Int =
  def step(a: Int, b: Int): Int =
    (a, b) match
      case (a, b) if a > b => 0
      case _ => f(a) + step(a + 1, b)


  (a: Int, b: Int) => step(a, b)
