object WallService {
    var posts = emptyArray<Post>()
    private var postId: Int = 1
    fun add(post: Post): Post {
      val newPost = post.copy(id = postId)
        posts += newPost
        postId ++
        return posts.last()
    }
}