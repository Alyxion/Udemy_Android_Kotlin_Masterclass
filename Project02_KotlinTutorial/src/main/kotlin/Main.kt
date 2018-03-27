// -------------------------------------------------------------------------------------------------

fun helloWorld()
{
    println("Hello World, are you?")
    println("My first Kotlin program")

    // --- variable basics ---

    val michael = "Michael Ikemann"
    println(michael)

    val miWeeklySalary = 32 // variable
    val factor = 4
    val monthly = factor*miWeeklySalary
    println("$miWeeklySalary per week sums up to $monthly per month")

    val apples = 5 // constant
    val oranges = 7

    val fruit = apples+oranges

    println(fruit)
    println("A quarter of the apple is ${apples/4.0}")
    println("We bought $apples apples, $oranges oranges and overall $fruit fruits.")

    val weeks = 130
    val years : Double = weeks/52.0
    println(years)

    // --- Strings ---

    println("$weeks weeks is $years years.")

    println("My name is $michael" )
}

// -------------------------------------------------------------------------------------------------

fun checkAge()
{
    println("How old are you?: ")
    val age = readLine()!!.toInt()
    println("You are age is $age")

    val message : String;
    message = when {
        age<18 -> "You'e too young to vote"
        age==100 -> "Congratulations"
        else -> "You can vote"
    }

//    message = if (age<18) {
//        "You'e too young to vote"
//    } else
//    if (age==100) {
//        "Congratulations" }
//    else {
//        "You can vote" }

    println(message)
}

// -------------------------------------------------------------------------------------------------

fun lifeCheck()
{
    val lives = 3
    val isGameOver = (lives < 1)
    println(isGameOver)

    if(isGameOver)
    {
        println("Game over")
    }
    else
    {
        println("You're still alive")
    }

}

// -------------------------------------------------------------------------------------------------

/**
 * This function demonstrates the usage of object creation, assignment and modification
 */
fun setupPlayers()
{
    val tim = Player(name = "Michael")
    tim.show()

    val louise = Player(name = "Louise", level = 5)
    louise.show()

    val walter = Player(name = "Walter", level = 10, lives = 2, score = 300)
    walter.show()

    val hubert = Player(name = "Hubert", level = 11, lives = 1, score = 5000)
    hubert.show()

    println(walter.weapon.name.toUpperCase())
    println(walter.weapon.damageInflicted)

    val axe = Weapon(name = "Axe", damageInflicted = 12)
    hubert.weapon = axe

    println(hubert.weapon.name.toUpperCase())
    println(hubert.weapon.damageInflicted)

    axe.damageInflicted = 24

    println(hubert.weapon.name.toUpperCase())
    println(hubert.weapon.damageInflicted)

    tim.weapon = Weapon(name = "Sword", damageInflicted = 10)
    println(tim.weapon.name)

    val redPotion = Loot( "Red Potion", LootType.POTION, 7.50)

    tim.inventory.add(redPotion)
    tim.showInventory()
    println(tim)
}

// -------------------------------------------------------------------------------------------------ß

fun main(args: Array<String>)
{
    // helloWorld()
    // lifeCheck()
    // checkAge()

    setupPlayers()
}