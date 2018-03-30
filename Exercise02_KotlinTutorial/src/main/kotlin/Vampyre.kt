/**
 * Created by mikemann on 30.03.18.
 */
open class Vampyre(name: String) : Enemy(name, 20, 3)
{
    override fun takeDamage(amount: Int) {
        super.takeDamage(amount/2)
    }
}