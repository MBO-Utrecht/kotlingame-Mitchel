enum class LootType {
    PHONE, BANKCARD, KEYS, RING, ARMOR, POTION
}

class Loot(val name: String, val lootType: LootType, val value: Double) {

    override fun toString(): String {
        return "$name is a $lootType and is worth $$value"
    }

}