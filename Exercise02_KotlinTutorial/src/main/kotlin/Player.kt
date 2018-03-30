import java.awt.event.InvocationEvent

/**
 * Created by mikemann on 27.03.18.
 */
class Player(val name: String, val level: Int = 1, var lives : Int = 3, var score : Int = 0)
{
    var weapon: Weapon = Weapon("Fist", damageInflicted = 1)

    private val inventory = ArrayList<Loot>()

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
            Weapon: ${weapon}
            """
    }

    fun getLoot(item: Loot)
    {
        inventory.add(item)
    }

    fun dropLoot(item: Loot): Boolean
    {
        return if(inventory.contains(item))
        {
            inventory.remove(item)
            true
        }
        else
        {
            false
        }
    }

    fun dropLoot(name: String): Boolean
    {
        println("$name will be dropped")
        return inventory.removeIf { it.name == name }
    }



    fun showInventory()
    {
        println("$name's inventory:")
        for(item in inventory)
        {
            println(item)
        }
        println("=========================")
    }

}