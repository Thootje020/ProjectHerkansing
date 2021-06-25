
public fun loadBattle(username: String) {
}

public fun cancelBattle(username: String) {
    println("Oei! Slechte keuze...")
    if (readLine() == "ja") {

    }

}

public fun getRandomEnemie(username: String) {
    if ((0..1).random() == 1) {
        spawnSlang(username)
    } else {
        spawnWolf(username)
    }
}