package constructors

import java.time.LocalDateTime
import java.time.Month

fun main() {
    val post = Post(
        name = "Kotlin Course",
        author = "Cristian Morales",
        date = LocalDateTime.of(
            2022,
            Month.JANUARY,
            12,
            13,
            55
        )
    )

    println(post.publish())

    val fullPost = Post(
        name = "Kotlin Classes",
        author = "Cristian Morales",
        date = LocalDateTime.of(
            2022,
            Month.JANUARY,
            12,
            13,
            55
        ),
        content = "Lorem Impsum Dolor Set",
        category = "Kotlin"
    )

    println(fullPost.publish())
}