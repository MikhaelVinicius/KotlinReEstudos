import java.util.Scanner
fun main(){
    convite()
}

fun inicioIdade(){
    println("Ola, qual eh sua idade?")
    val idade = Scanner(System.`in`).nextInt()
    if(idade < 18){
        println("Negado, menores de idade não são permitidos!")
    } else { convite() }
}

fun convite(){
    println("Qual é o seu tipo de convite: Luxo, Comum ou Premium?")
    var conviteTipo = readLine()
    var Premium = "Premium"
    var Comum = "Comum"
    var Luxo = "Luxo"
    if(conviteTipo == Premium || conviteTipo == Comum || conviteTipo == Luxo){
       code()
    }else{ println("Convite invalido!")}
}

fun code(){
    println("Por favor, digite seu codigo.")
    var codigo = readLine()
    if (codigo != null){
        codigo.lowercase()
    }



}