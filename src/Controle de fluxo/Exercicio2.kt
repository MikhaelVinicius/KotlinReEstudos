import java.util.Scanner

fun main() {
triangulo()
}

fun quadrado() {
     val n1 = Scanner(System.`in`).nextInt()
     val n2 = Scanner(System.`in`).nextInt()
    if (n1 == n2) {
        println("Eh um quadrado, pois $n1 é a medida de todos os lados")
    } else {
        println("Não é um quadrado pois ambos lados são diferentes, no caso $n1 e $n2 ")

    }
}

fun triangulo(){

    println("Escreva o primeiro Número x: ")
    val n1 = readLine()
    println("Escreva o segundo Número y: ")
    val n2 = readLine()
    println("Escreva o terceiro Número z: ")
    val n3 = readLine()

  val x = n1?.toInt()
  val y = n2?.toInt()
  val z = n3?.toInt()

  if(x == z && y == x){
      println("É um trinagulo equilatero já que todos os lados medem $x")
  } else {
      println("Não é um triangulo por terem lados diferentes")
      println("x = $x, y = $y,z = $z ")
  }


}