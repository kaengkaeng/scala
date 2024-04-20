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
