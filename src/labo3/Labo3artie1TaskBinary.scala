package labo3

object Labo3artie1TaskBinary extends App {
  var a: Int = 89 // Dönüştürülecek sayı
  var temp: String = "" // Binary sonucu saklayacak değişken

  while (a > 0) { // a sıfır olana kadar döngü devam eder
    val rest: Int = a % 2 // 2'ye bölümden kalan
    temp = rest.toString + temp // Kalanı başa ekleyerek sırayı düzelt
    a /= 2 // a'yı 2'ye bölerek azalt
  }

  println(temp) // Doğru sırada binary çıktısı
}
