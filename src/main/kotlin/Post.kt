data class Post(
    val id: Int = 0,
    val nik: String = "ник",
    val text: String = "текст"
) {
    var activities = arrayOf("Walks")
    var gaf = "dfa"
    init {
        if (id != 0)
        println("New post")
    }
}
