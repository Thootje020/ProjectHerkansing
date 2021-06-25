
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
    getRandomEnemie()
}

fun loadSneeuw(username: String) {
    println("Je loopt door de sneeuw. Opeent komt er een wolf op je af")
}