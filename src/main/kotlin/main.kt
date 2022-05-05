fun main() {
    WallService.add(Post(45, "про", "еоу"))
    WallService.add(Post(22, "кен", "ах2"))
    WallService.add(Post(65, "rom", "Ok"))
    for (post in WallService.posts) {
        println(post)
    }
}