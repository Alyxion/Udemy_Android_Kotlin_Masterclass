/**
 * Created by mikemann on 30.03.18.
 */
open class Enemy(val name: String, var hitPoints: Int, var lives: Int)
{
    open fun takeDamage(amount: Int)
    {
        val remainingHitPoints = hitPoints-amount
        if(remainingHitPoints>0)
        {
            hitPoints = remainingHitPoints
            println("$name took $amount damage and has $hitPoints hitpoints left")
        }
        else
        {
            lives -= 1
            if(lives>0) {
                println("$name lost a life")
            }
            else
            {
                println("No lives left, $name is dead")
            }
        }
    }

    override fun toString(): String
    {
        return "Name: $name, Hitpoints: $hitPoints, Lives: $lives"
    }

}