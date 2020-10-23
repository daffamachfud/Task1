fun main(){
    print("Enter Text: ")
    val sentences = readLine()
    print("Enter Number: ")
    val number = readLine()

    val result = number?.toInt()?.let { cipherArray(sentences.toString(), it) }
    println("Result : $result")

}

//Referensi kode berasal dari algoritma caesar cipher geekforgeeks
private fun cipher(sentences: String, number: String) {
    val result = StringBuffer()
    val num = number.toInt()
    for (element in sentences) {
        val ch = ((element.toInt() + num - 97) % 26 + 97).toChar()
        result.append(ch)
    }
}

//Fungsi ini merupakan modifikasi dari kode di atas dimana mengubah penggunaan jenis data(StringBuffer)
private fun cipherArray(message: String, number: Int): String? {
    val chars = message.toCharArray()
    for (i in chars.indices) {
        val c = chars[i]
        if (c in 'A'..'Z') chars[i] =
                ((c - 'A' + number) % 26 + 'A'.toInt()).toChar() else if (c in 'a'..'z') chars[i] =
                ((c - 'a' + number) % 26 + 'a'.toInt()).toChar()
    }
    return String(chars)
}