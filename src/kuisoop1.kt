fun main() {
    println("Hendra 2322510009 Soal UTS OOP 1")
    val kelas: String
    val makul: String
    val jmlMhs: Int

    print("Input Kelas Perkuliahan: ")
    kelas = readLine()!!
    print("Input Mata Kuliah: ")
    makul = readLine()!!
    print("Input Jumlah Mahasiswa: ")
    jmlMhs = readLine()!!.toInt()

    showDisplay(kelas, makul, jmlMhs)
    println("DONE")
}

fun showDisplay (kelas: String, makul: String, jmlMhs: Int) {
    println("\nDAFTAR HADIR MAHASISWA")
    println("MATA KULIAH $makul")
    println("KELAS: $kelas")

    renderTable(jmlMhs)
}

fun renderTable (length: Int) {
    val headers = listOf("No", "NIM", "NAMA")
    val rowCount = length
    val columnWidth = 12

    printSeparator(headers, columnWidth)

    println("| ${headers[0].padEnd(columnWidth - 2)}| ${headers[1].padEnd(columnWidth - 2)}| ${headers[2].padEnd(columnWidth - 2)}|")

    printSeparator(headers, columnWidth)

    for (i in 1..rowCount) {
        printRow(i, "", "", columnWidth)
        printSeparator(headers, columnWidth)
    }
}

fun printSeparator(headers: List<String>, columnWidth: Int) {
    headers.forEach {
        print("+".padEnd(columnWidth, '-'))
    }
    println("+")
}

fun printRow(no: Int, nim: String = "", name: String = "", columnWidth: Int) {
    println("| ${no.toString().padEnd(columnWidth - 2)}| ${nim.padEnd(columnWidth - 2)}| ${name.padEnd(columnWidth - 2)}|")
}