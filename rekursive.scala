
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
