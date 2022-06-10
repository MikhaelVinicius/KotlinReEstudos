import java.util.Scanner
fun main(){
inicioIdade()
}

fun inicioIdade(){
    println("Ola, qual eh sua idade?")
    val idade = Scanner(System.`in`).nextInt()
    if(idade < 18){
        println("Negado, menores de idade não são permitidos!")
    } else { convite() }
}

fun convite() {
    println("Qual é o seu tipo de convite: Luxo, Comum ou Premium?")
    var conviteTipo = readLine()
    if (conviteTipo != null) {
        conviteTipo = conviteTipo.lowercase()

    var Premium = "premium"
    var Comum = "comum"
    var Luxo = "luxo"

    if (conviteTipo == Premium || conviteTipo == Comum || conviteTipo == Luxo) {
        println("Por favor, digite seu codigo.")
        var codigo = readLine()
        if (codigo != null) {
            codigo = codigo.lowercase()
            if (conviteTipo == Comum && codigo.startsWith("xt")) {
                println("Bem-vindo!")
            } else if (conviteTipo == Premium || conviteTipo == Luxo && codigo.startsWith("xl")) {
                println("Seja bem vindo, rico!")
            } else {
                println("Codigo invalido!")
            }


        } else {
            println("Convite invalido!")
        }
    }
}
}