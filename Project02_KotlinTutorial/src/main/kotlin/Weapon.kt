/**
 * Created by mikemann on 27.03.18.
 */
class Weapon(val name: String, var damageInflicted: Int)
{
    override fun toString(): String {
        return "$name (inflicts $damageInflicted points of damage)"
    }
}
