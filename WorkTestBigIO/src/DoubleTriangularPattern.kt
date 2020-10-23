fun main() {

    //referensi kode saya dapatkan dari javainterviewpoint
    //direferensikan mencontohkan sebuah bentuk segitiga tetapi hanya yang bagian atas nya saja(untuk gambaran pada bagian perulangan segitiga bagian bawah bisa di comment)
    //dan sebelum saya convert menjadi bahasa kotlin, saya menggunakan bahasa java untuk solving untuk memudahkan dikarenakan kode referensi menggunakan bahasa java
    //dan untuk kode java yang saya kerjakan terletak di file DoubleTriangularPatternJava

    var j:Int
    var k:Int
    var l:Int
    val rows = 5
    var i = 1

    //segitiga bagian atas
    while (i <= rows) {
        j = 1
        while (j <= i) {
            print(j)
            j++
        }
        k = i * 2
        while (k < rows * 2 - 1){
            print(" ")
            k++
        }
        l = i
        while (l >= 1) {
            if (l != rows)
                print(l)
            l-- }
        println()
        i++
    }

    //segitiga bagian bawah
    i = rows - 1
    while (i >= 1)
    {
        j = 1
        while (j <= i)
        {
            print(j)
            j++
        }
        k = i * 2
        while (k < rows * 2 - 1)
        {
            print(" ")
            k++
        }
        l = i
        while (l >= 1)
        {
            if (l != rows)
                print(l)
            l--
        }
        println()
        i--
    }

}