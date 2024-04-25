//25042024

def xo(str: String): Boolean = 
  var o = 0 
  var x = 0 

  for (char <- str) { 
    if (char == 'o' || char == 'O') {
      o += 1 
    } else if (char == 'x' || char == 'X') { 
      x += 1 
    }
  }
  o == x // 'o'와 'x'의 개수가 같으면 참을 반환하고, 그렇지 않으면 거짓을 반환합니다.


/* 이름 받아서 이니셜로 반환하기
  - String => Array
  - element auf Array 축출해서 조합 
*/

def abbrevName(name: String): String = 
  // 주어진 이름 문자열을 문자 배열로 변환합니다.
  val newName = name.toCharArray
  
  // 첫 번째 이름의 이니셜과 두 번째 이름의 이니셜을 저장할 변수를 초기화합니다.
  var first = ""
  var second = ""

  // 문자열의 각 문자에 대해 반복합니다.
  for (x <- 0 until newName.length) 
    // 첫 번째 이름의 이니셜을 찾습니다.
    if (newName(x).isLetter && first.isEmpty) {
      // 현재 문자가 문자이고, 아직 첫 번째 이름의 이니셜이 설정되지 않았다면,
      // 해당 문자를 대문자로 변환하여 first 변수에 저장합니다.
      first = newName(x).toUpper.toString
    } 
    // 두 번째 이름의 이니셜을 찾습니다.
    else if (newName(x).isWhitespace && x < newName.length - 1 && newName(x + 1).isLetter && second.isEmpty) {
      // 현재 문자가 공백이고, 다음 문자가 문자이며, 아직 두 번째 이름의 이니셜이 설정되지 않았다면,
      // 다음 문자를 대문자로 변환하여 second 변수에 저장합니다.
      second = newName(x + 1).toUpper.toString
    }
  

  // 첫 번째 이름과 두 번째 이름의 이니셜을 조합하여 초기화한 문자열을 반환합니다.
  val init = s"$first.$second"
  init

