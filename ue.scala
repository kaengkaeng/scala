/* diese aufgabe kommen aus codewars */


// s,m convert sekunde
def past(h: Int, m: Int, s: Int): Int = {
    val hm = 3600000
    val mm = 60000
    val sm = 1000
    
    val calcul = h * hm + m * mm + s * sm
    
    calcul
  }



// addiere positive zahlen in Array
def positiveSum(xs: Seq[Int]): Int = 
  
  var erg = 0

  for x <- xs do 
    if (x > 0 )(erg += x)

  erg


//ueberpreufe ob ziffer gross alphabet ist danach gross alphabet ist geliefert 
//fall alphabet klein ist, convert gross Alphabet. 
def makeUpperCase(xs: String): String = 
  
  var str = ""
  for (x <- xs) do 
    if (x.isUpper) str += x
    else 
      str += x.toUpper
  
  str
