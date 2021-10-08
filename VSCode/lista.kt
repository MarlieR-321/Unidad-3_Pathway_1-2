fun main() {
    val numbers = listOf(0, 3, 6, 4, 2, 7, 8, 86, 2)
    println("list: ${numbers}")
    println("list: ${numbers.sorted()}")

    val setOfNumbers = numbers.toSet()
    println("set: ${setOfNumbers}")

    // Ver si son iguales estos sets
    val set1 = setOf(1, 2, 3)
    val set2 = mutableSetOf(3, 2, 1)

    println("$set1 == $set2: ${set1 == set2}")
    println("contains 7: ${setOfNumbers.contains(7)}")
}
