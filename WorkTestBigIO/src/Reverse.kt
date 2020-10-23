fun main(){
    print("Enter Text: ")
    val sentences = readLine()
    val result = recursiveReverse(sentences.toString())
    println("Result : $result")
}

//referensi kode geeksforgeeks

private fun recursiveReverse(sentences:String):String{
    if (sentences.isEmpty()) return sentences
    return recursiveReverse(sentences.substring(1)) + sentences[0] //pengulanagan setiap
    // iterasi menggabungkan hasil fungsi recursive berikutnya ke karakter pertamaa dari kalimat dengan
    // sentence[0]
}
