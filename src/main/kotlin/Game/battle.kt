
public fun loadBattle(username: String) {
}

public fun cancelBattle(username: String) {
    println("Weet je zeker dat je niet wilt vechten?")
    if (readLine() == "ja") {

    }

}

public fun getRandomEnemie() {
    if ((0..1).random() == 1) {
        spawnSlang()
    } else {
        spawnWolf()
    }
}