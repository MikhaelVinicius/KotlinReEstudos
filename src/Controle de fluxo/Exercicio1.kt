fun salario(cargo: String, valor: Float, anos: Int) {
    if (cargo == "Gerente") {
        val s = (valor + 2000.00)
        if (anos < 2) {
            println(s)
        } else {
            println(valor + 3000)
        }
    }
    if (cargo == "Coordenador") {
        val s = (valor + 1500.0)
        if (anos < 1) {
            println(s)
        } else {
            println(valor + 1800.0)
        }
    }
    if (cargo == "Engenheiro") {
        val s = (valor + 1000.00)
        println(s)
    }
    if (cargo == "Estagiario") {
        val s = (valor + 500.00)
        println(s)
    }
}

fun bonusWhen(cargo: String, valor: Float){
    var valor = 0f
    when(cargo){
        "Gerente" -> {
            valor = 2000f
        }
    }
}


fun main() {
    salario("Gerente", 1000.00F, 3)

}


