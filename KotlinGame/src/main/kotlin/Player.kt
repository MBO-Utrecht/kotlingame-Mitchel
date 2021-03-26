class Player(val name: String, var life: Int = 3, var level: Int = 1, var score: Int = 0) {

    var currentWeapon = Weapon("Vuisten", 10)
    val inventory = ArrayList<Loot>()

    fun show() {
        if (life < 0) {
            println("$name is dead!")
        } else {
            println("$name is still alive!")
        }
    }

    override fun toString(): String {
        return """
            name:  $name
            life:  $life
            level: $level
            score: $score
            weapon: $currentWeapon
            """
    }

    fun showInventory() {
        println("$name's Inventory:")
        println("- " + inventory.get(0))
//        println("--------------------")
    }
}