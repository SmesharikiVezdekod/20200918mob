package ru.smeshariki.emotions.data

class PostsRepository {
    fun getAllPosts(): ArrayList<Post>{
        val posts = ArrayList<Post>()
        posts.add(Post("Иван Петров", "", "Только что",
            "«Убийство Роджера Экройда» (англ. The Murder of Roger Ackroyd) — детективный роман Агаты Кристи, опубликованный в 1926 году. Является шестым изданным романом писательницы и третьим, в котором фигурирует детектив Эркюль Пуаро. ",
        65, 19, 3, 258))
        posts.add(Post("Иван Петров2", "", "Только что",
            "«Убийство Роджера Экройда» (англ. The Murder of Roger Ackroyd) — детективный роман Агаты Кристи, опубликованный в 1926 году. Является шестым изданным романом писательницы и третьим, в котором фигурирует детектив Эркюль Пуаро. ",
            65, 19, 3, 258))
        posts.add(Post("Иван Петров3", "", "Только что",
            "«Убийство Роджера Экройда» (англ. The Murder of Roger Ackroyd) — детективный роман Агаты Кристи, опубликованный в 1926 году. Является шестым изданным романом писательницы и третьим, в котором фигурирует детектив Эркюль Пуаро. ",
            65, 19, 3, 258))
        posts.add(Post("Иван Петров4", "", "Только что",
            "«Убийство Роджера Экройда» (англ. The Murder of Roger Ackroyd) — детективный роман Агаты Кристи, опубликованный в 1926 году. Является шестым изданным романом писательницы и третьим, в котором фигурирует детектив Эркюль Пуаро. ",
            65, 19, 3, 258))
        return posts
    }
}