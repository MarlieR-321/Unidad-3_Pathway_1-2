fun main() {
    // Lambdas
    val triple: (Int) -> Int = { it * 3 }
    println(triple(5))

    // Orden Superior
    val peopleNames = listOf("Fred", "Ann", "Barbara", "Joe")
    println(peopleNames.sorted())
    println(peopleNames.sortedWith { str1: String, str2: String -> str1.length - str2.length })
}
