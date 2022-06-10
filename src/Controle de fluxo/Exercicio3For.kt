fun main(){
    terceiro()
}

fun primeiro(){
    for(i in 1..50)
        print("$i ")
}
fun segundo(){
    for(i in 50 downTo 1)
        print("$i ")
}
fun terceiro(){

    val i = 0
    val j = i % 5
    for(i in 1..50 step j )

        print("$i ")
}
fun quarto(){
    for(i in 1..500)
        
}

