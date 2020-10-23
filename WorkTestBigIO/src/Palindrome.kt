fun main(){
    print("Enter Text: ")
    val sentences = readLine()
    val result = palindrome(sentences.toString())
    println("Result : $result")
}

//logika dari fungsi dibawah ini saya dapatkan dari sebuah fungsi reverse biasa bukan dari algoritma palindrome,
//dikarenakan requirement yang diminta meminta sebuah kata menjadi sebuah kalimat palindrom yang artinya tinggal melakukan reverse dari
//kata yang dimasukan, tetapi untuk akhir abjad dari kata yang dimasukan akan dihapus menggunakan substring.
private fun palindrome(sentences :String):String{
    var reverse = ""
    val length = sentences.length
    for(i in length-1 downTo 0) reverse += sentences[i]
    val original = sentences.substring(0,sentences.length-1)
    return original+reverse
}