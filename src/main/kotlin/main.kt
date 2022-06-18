import kotlin.math.max

fun main() {
    val collection = mutableMapOf("x" to 1, "y" to 2, "z" to 3)
    for ((key, value) in collection) {
        println("Key is $key, value is $value")
    }
    println(collection.containsKey("x"))
    println(collection.containsValue(2))
    println(collection.get("y"))
    println(collection["a"])
    println(collection.getValue("z"))
    println(collection.entries)
    println(collection.keys)
    println(collection.values)
    println(collection.size)
    println(collection.isEmpty())

//    collection.put("a", 4)
//    collection["b"] = 5
//    println(collection.entries)
//
//    val otherCollection = mapOf("c" to 6, "d" to 7)
//    collection.putAll(otherCollection)
//    println(collection.entries)
//
//    collection.remove("x")
//    collection.remove("z", 4)
//    println(collection.entries)

    val collectionList = collection.toList()
    println(collectionList)

    val collectionSet = collection.values.toSet()
    println(collectionSet)

//   collection.clear()
    println(collection.isEmpty())
    println(collection.values.random())
    println(collection.values.maxOrNull())
    println(collection.keys.minOrNull())
}


