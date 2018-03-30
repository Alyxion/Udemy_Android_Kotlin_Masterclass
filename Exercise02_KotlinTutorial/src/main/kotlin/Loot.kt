/**
 * Created by mikemann on 27.03.18.
 */

class Loot(val name: String, val type: LootType, val value: Double)
{
    override fun toString(): String {
        return "$name is $type and is worth $value"
    }
}

enum class LootType
{
    POTION,
    RING,
    ARMOR
}