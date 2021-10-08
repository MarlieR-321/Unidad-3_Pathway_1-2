fun main() {
    val peopleAges = mutableMapOf<String, Int>("Fred" to 30, "Ann" to 23)

    // Agregar al mapa
    peopleAges.put("Barbara", 42)
    // Agregar menos texto
    peopleAges["Joe"] = 51

    peopleAges["Fred"] = 31

    // println(peopleAges)

    println(peopleAges.map { "${it.key} is ${it.value}" }.joinToString(", "))

    val filteredNames = peopleAges.filter { it.key.length < 4 }
    println(filteredNames)
}
