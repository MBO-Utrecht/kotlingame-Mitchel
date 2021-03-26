fun main(args: Array<String>) {

    val playerOne = Player("Mitchel", 4, 1, 0)
    playerOne.show()

    val brick = Weapon("Brick", 15)
    playerOne.currentWeapon = brick

//    println(playerOne.name + "'s current weapon: " + playerOne.currentWeapon.name + " with damage: " + playerOne.currentWeapon.damageInflicted)

    val playerTwo = Player("Taif", 2, 1, 10)
    val cookware = Weapon("Cookware", 18)
    playerTwo.currentWeapon = cookware
    playerOne.currentWeapon = playerTwo.currentWeapon

//    println(playerOne.name + "'s current new weapon: " + playerOne.currentWeapon.name + " with damage: " + playerOne.currentWeapon.damageInflicted)

    playerOne.show()

    val redPotion = Loot("Red Potion", LootType.POTION, 7.50)
    playerOne.inventory.add(redPotion)
    val chestArmor = Loot("+3 Chest Armor", LootType.ARMOR, 14.00)
    playerOne.inventory.add(chestArmor)
    playerOne.showInventory()

    println(playerOne)

}