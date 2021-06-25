
public fun showInventory(username: String) {
    println("Je hebt de volgende items in je inventory: \n")

    Thread.sleep(1_000)
    showItems(username)

}


public fun showItems(username: String) {
    if (Items.Vuist.ininventory == 1) {
        println(Items.Vuist.itemname)
    }
    if (Items.STOK.ininventory == 1) {
        println(Items.STOK.itemname)
    }
    if (Items.PISTOOL.ininventory == 1) {
        println(Items.PISTOOL.itemname)
    }
}