/**
 * Created by mikemann on 27.03.18.
 */
class Player(val name: String, val level: Int = 1, var lives : Int = 3, var score : Int = 0)
{
    var weapon: Weapon = Weapon("Fist", damageInflicted = 1)

    val inventory = ArrayList<Loot>()

    fun show()
    {
        if ( lives>=1 )
        {
            println("Alive")
        }
        else
        {
            println("Dead")
        }

    }

    override fun toString(): String
    {
        return """
            name: $name
            lives: $lives
            level: $level
            score: $score
            Weapon: ${weapon.name}
            Damage: ${weapon.damageInflicted}
            """
    }

    fun showInventory()
    {
        println("$name's inventory")
        println(inventory.get(0))
        println("=========================")
    }

}