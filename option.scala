// 등차수열 구하기 sum = 1n+2n+3n+..kn
// 등차수열 합 공식 sum = n + k(k+1)/2 
// k = (m - 1) / n

def sumMul(n: Int, m: Int): Option[Int] = 
  (n,m)match
    case (_, _) if(n <= 0 || m <= 0) => None 
    case (_,_) => 
      val k = (m - 1) / n 
      val sum = n * k * (k + 1) / 2 
      Some(sum)



// 정수 값이 있는 시퀀스에서 첫 번째 비연속 정수를 찾는 함수입니다.
// 비연속 정수가 발견되면 해당 값을 Some으로 감싸서 반환하고,
// 발견되지 않으면 None을 반환합니다.
def firstNonConsecutive(values: Seq[Int]): Option[Int] = {
    // 시퀀스의 각 요소에 대해 반복합니다.
  for (i <- 1 until values.length) {
      // 현재 요소와 이전 요소를 비교하여 연속성을 확인합니다.
    if (values(i) != values(i - 1) + 1) {
        // 비연속 정수가 발견되면 해당 값을 Some으로 감싸서 반환합니다.
        // Some은 값이 있음을 나타내는 옵션입니다.
      return Some(values(i))
      }
    }
    // 비연속 정수가 발견되지 않으면 None을 반환합니다.
    // None은 값이 없음을 나타내는 옵션입니다.
  None
  }

