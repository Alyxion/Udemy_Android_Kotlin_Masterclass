/**
 * Created by mikemann on 27.03.18.
 */

enum class LootType
{
    POTION,
    RING,
    ARMOR
}

class Loot(val name: String, val type: LootType, val value: Double) {}