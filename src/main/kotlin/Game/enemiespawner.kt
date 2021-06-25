
public fun spawnWolf(username: String) {
    println("Pas! Er komt een " + Enemies.Wolf.enemiename + " op je af.")
    Thread.sleep(1_000)
    showInventory(username)
}

public fun spawnSlang(username: String) {
    println("Sssssttt... Owjee wat hoor je nu? HET IS EEN " + Enemies.Slang.enemiename + ".")
    Thread.sleep(1_000)
    showInventory(username)

}