fun main(args: Array<String>) {

    val playerOne = Player("Mitchel", 4, 1, 0)
    playerOne.show()

    val brick = Weapon("Baksteen", 15)
    playerOne.currentWeapon = brick

//    println(playerOne.name + "'s current weapon: " + playerOne.currentWeapon.name + " with damage: " + playerOne.currentWeapon.damageInflicted)

    val playerTwo = Player("Taif", 2, 1, 10)
    val cookware = Weapon("Wokpan", 18)
    playerTwo.currentWeapon = cookware
    playerOne.currentWeapon = playerTwo.currentWeapon

//    println(playerOne.name + "'s current new weapon: " + playerOne.currentWeapon.name + " with damage: " + playerOne.currentWeapon.damageInflicted)

    playerOne.show()

}