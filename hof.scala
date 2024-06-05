//higher ordner function

//구구단 함수 
def multiTable(n: Int): String = 
  (1 to 10).map(i => s"$i * $n = ${i* n}").mkString("\n")
  // 범위 생성 : (1 to 10)
  // map 활용?!
  // mkString: 문자열로 결합 후  한줄 띄기 ("\n")

// 문장에서 제일 짧은 단어 찾기 
def findShort(str: String): Int = str.split(" ").map(_.length).min 

//ture counter 
def countSheep(sheep: Array[Boolean]): Int = 
    sheep.filter(_ == true).count(_ == true)

//제일 작은 숫자 두개 in List 합해서 출력하시오. 
def sumTwoSmallest(numbers: List[Int]): Int = 
    numbers.sorted.take(2).sum



// Uebungszettel: 
//Implementiere mit Hilfe der Funktionen höherer Ordnung eine Funktion takeNumbers, 
//welche die ersten n Elemente einer Liste nimmt, deren Quersum- me jeweils einen gegebenen Wert überschreiten.
// Funktion bestimmt ob das Ergebnis einer Funktion einen wert i überschreitet
// und gibt eine Liste der ersten n Werte die dies tun zurück
//Beispiel: List(9,1,8,2,7,3,6,4,5,0),5,6) == List(9,8,7) 처음 5개 원소중 6보다 큰거 
//1)
def takeNumbers(f: Int => Int,n : Int, list : List[Int], i : Int):List[Int]=
  list match
    case Nil => Nil
    case x::xs if n == 0 => Nil
    case x::xs if f(x) > i => x :: takeNumbers(f,n-1,xs,i) // Wenn f(x) größer dem Wert i wird x der Ausgabeliste hinzugefügt
    case x::xs => takeNumbers(f,n,xs,i)//// Wenn f(x) kleiner gleich dem Wert i wird x der Ausgabeliste nicht hinzugefügt

//2) Funktion berechnet die Quersumme einer Zahl
def quersumme( i : Int): Int =
  def help(acc : Int, i: Int): Int =



//Nachklausur 
//Die Funktion sum if bekommt eine ganze Zahl und ein Pra ̈dikat p und summiert alle Ziffern der Zahl auf, die das Pra ̈dikat p erfu ̈llen.
// Beispiel: sum if(27346, <=5) liefert 9, denn 9 = 2 + 3 + 4.
// sum_if( _ <=5, 234516), 5보다 작은 값은 addieren
def sum_if(p: Int => Boolean, num: Int): Int = {
  def loop(n: Int): Int =
    n match {
      case 0 => 0
      case x if p(x % 10) => (x % 10) + loop(x / 10)
      case _ => loop(n / 10)
  }

  loop(math.abs(num))
}
