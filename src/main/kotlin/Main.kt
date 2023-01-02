fun main() {
    print(solution(mutableListOf(1, 2, 1), 1, 3))
}

fun solution(inputArray: MutableList<Int>, elemToReplace: Int, substitutionElem: Int): MutableList<Int> {
    for (i in 0 until inputArray.size) {
        if (inputArray[i] == elemToReplace)
            inputArray[i] = substitutionElem
    }
    return inputArray
}
