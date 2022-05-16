data class Post(val id: Int = 0, val text: String = "текст") {

    init {
        if (id != 0)
            println("Новый пост создан \nУра!")

    }

    override fun toString(): String {
        return "$text №$id"
    }
}
