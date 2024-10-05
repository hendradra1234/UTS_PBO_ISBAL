fun main() {
    println("Hendra 2322510009 Soal UTS OOP 2\n")
    val inputLoop: Int;
    print("Input Jumlah perulangan: ")
    inputLoop = readLine()!!.toInt()

    inputLoopHandler(inputLoop)
}

fun inputLoopHandler (length: Int) {
    val arryInput = IntArray(length)
    for (i in 1..length) {
        print("Input Angka ke-$i: ")
        arryInput[i - 1] = readLine()!!.toInt()
    }

    countOddEven(arryInput)
}

fun countOddEven (input: IntArray) {
    var odd: Int = 0;
    var even: Int = 0;

    for (i in input.indices) {
        if ((input[i] % 2) == 1) {
            ++odd
            continue
        }
        ++even
    }

    println("\nJumlah angka Genap yang di Input: $even")
    println("Jumlah angka Ganjil yang di Input: $odd")
}