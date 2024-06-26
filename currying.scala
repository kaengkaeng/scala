def multiplyAll(arr: Array[Int]): Int => Array[Int] =
    (n: Int) => arr.map(_ * n)

//주어진 코드에서 multiplyAll 함수는 배열을 받아서 함수를 반환합니다. 반환된 함수는 정수를 받아서 배열의 각 요소를 해당 정수와 곱한 새로운 배열을 반환합니다. 
//이렇게 함수가 여러 개의 인수를 받는 것이 아니라 단일 인수를 받는 함수를 반환하도록 변경되었으므로 이는 커링의 예입니다.

//이런 방식으로 함수를 구성하면, 인자를 부분적으로 적용하여 더 유연하게 사용할 수 있습니다. 
//예를 들어, multiplyAll 함수를 호출하여 반환된 함수를 다른 변수에 할당하고, 나중에 필요할 때 정수를 인자로 전달하여 호출할 수 있습니다. 이렇게 하면 코드의 재사용성이 향상되고, 코드가 더 간결해집니다.
