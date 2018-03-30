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
    tim.getLoot(redPotion)

    val chestArmor = Loot( "+3 Chest Armor", LootType.ARMOR, 80.00)
    tim.getLoot(chestArmor)

    tim.getLoot(Loot("Ring of Protection +2", LootType.RING, 40.25))
    tim.getLoot(Loot("Invisibility Potion", LootType.POTION, 35.95))

    tim.showInventory()

    if(tim.dropLoot(redPotion))
    {
        tim.showInventory()
    }
    else
    {
        println("You don't have a ${redPotion.name}")
    }

    val bluePotion = Loot("Blue Potion", LootType.POTION, 6.0)
    if(tim.dropLoot(bluePotion))
    {
        tim.showInventory()
    }
    else
    {
        println("You don't have a ${bluePotion.name}")
    }

    if(! tim.dropLoot("Invisibility Potion") )
    {
        println("You don't have an Invisibility Potion")
    }
    tim.showInventory()

    println(tim)
}

// -------------------------------------------------------------------------------------------------

fun showLoops()
{
    for(i in 1..10) // including last element
    {
        println("$i squared is ${i * i}")
    }

    for(i in 1 until 10) // excluding last element
    {
        println("$i squared is ${i * i}")
    }

    for(i in 10 downTo 0) // including last element, 10 -> 0
    {
        println("$i squared is ${i * i}")
    }

    for(i in 1 until 10 step 2) // excluding last element, 2 steps
    {
        println("$i squared is ${i * i}")
    }

    for(i in 0..100 step 3) // all numbers dividable by three and five
    {
        if(i%5==0)
        {
            println("$i is dividable by 3 and 5")
        }
    }
}

// -------------------------------------------------------------------------------------------------

fun testInheritance()
{
    val enemy = Enemy("Test Enemy", 10, 3)
    println(enemy)

    enemy.takeDamage(4)
    println(enemy)

    enemy.takeDamage(11)
    println(enemy)

    val uglyTroll = Troll("Ugly Troll")
    println(uglyTroll)
    uglyTroll.takeDamage(30)
    println(uglyTroll)

    val vlad = Vampyre("Vlad")
    println(vlad)
    vlad.takeDamage(8)
    println(vlad)

    val dracula = VampyreKing("Dracula")
    println(dracula)

    while(dracula.lives>0) {
        if(dracula.dodges()) {
            continue
        }

        if(dracula.runAway()) {
            println("Dracula ran away")
            break
        }
        else {
            dracula.takeDamage(12)
        }
    }
}


// -------------------------------------------------------------------------------------------------

fun main(args: Array<String>)
{
    // helloWorld()
    // lifeCheck()
    // checkAge()
    // setupPlayers()
    // showLoops()
    testInheritance()
}