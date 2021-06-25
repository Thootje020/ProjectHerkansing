
fun loadLevel(username: String) {
    if (Levels.JUNGLE.completed == 0 && Levels.JUNGLE.unlocked == 1) {
        loadJungle(username)
    }
    if (Levels.SNEEUW.completed == 0 && Levels.SNEEUW.unlocked == 1) {
        loadSneeuw(username)
    }
}


fun loadJungle(username: String) {
    println("Je loopt door de jungle...")
    getRandomEnemie(username)
    Thread.sleep(2_000)
    println("Welk wapen kies je?")


    if (readLine() == Items.Vuist.itemname && Items.Vuist.ininventory == 1) {
        println("Je hebt je vuist geselecteerd. Wil je slaan?")
        if (readLine() == "ja") {
            println("HIT>>>")
        } else {
            println("Gameover..")
        }
    }
    if (readLine() == Items.PISTOOL.itemname && Items.PISTOOL.ininventory == 1) {
    }
    if (readLine() == Items.STOK.itemname && Items.STOK.ininventory == 1) {
    }

}

fun loadSneeuw(username: String) {
    println("Je loopt door de sneeuw. Opeent komt er een wolf op je af")
    Thread.sleep(1_000)
    println("Welk wapen kies je?")

    if (readLine() == Items.Vuist.itemname && Items.Vuist.ininventory == 1) {
        println("Je hebt je vuist geselecteerd. Wil je slaan?")
        if (readLine() == "ja") {
            println("HIT>>>")
        } else {
           cancelBattle(username)
        }
    }
    if (readLine() == Items.PISTOOL.itemname && Items.PISTOOL.ininventory == 1) {
    }
    if (readLine() == Items.STOK.itemname && Items.STOK.ininventory == 1) {
    }
}