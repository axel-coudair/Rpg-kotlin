fun main(args: Array<String>) {


    println("Bienvenue")
    println("Quel est ton pseudo")
    println("\n")
    var playerName:  String? = readLine()

    // playerName? avec le ? peut être nul
    var a = playerName?.length;

    // playerName!! avec le !! crash si nul
    var a2 = playerName!!.length;

    // ?: = if(playerName = null) return "Default"
    playerName = playerName ?: "Default"


    // val équivaut à const en js
    val a3 = 4;

    println("\n")
    println("${playerName}... quel nom étrange !")
    println("Veux tu entrer dans le donjon ?")
    println("\n")
    println("'y' -> Pour commencer")
    println("'n' -> Pour quitter")
    println("\n")

    var answer:  String? = readLine()

}