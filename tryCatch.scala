def problem(a: String): String = 

  try { 프로그램 실행 good
    val result = (a.toInt * 50 + 6).toString // 입력된 문자열을 정수로 변환하고 50을 곱하고 6을 더한 후 다시 문자열로 변환하여 result 변수에 할당합니다.
    result // result 변수를 반환합니다.
  } catch { // 프로그램 예외 발생tl error  처리 블록 
    case _: NumberFormatException => "Error" // NumberFormatException이 발생했을 때 "Error" 문자열을 반환
  }
