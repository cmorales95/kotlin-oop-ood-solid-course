package constructors

import java.time.LocalDateTime

class Post(
    val name: String,
    val author: String,
    val date: LocalDateTime
) {
    private var content: String = ""
    private var category: String = ""

    constructor(
        name: String,
        author: String,
        date: LocalDateTime,
        content: String,
        category: String,
    ) : this(name, author, date) {
        this.content = content
        this.category = category
    }

    fun publish(): String {
        return """
            Post Name: $name
            Author: $author
            Date: $date
            ${getCategorySection()}
            ${getContent()}
        """.trimIndent()
    }

    private fun getContent(): String {
        return if (content.isNotBlank() && content.isNotEmpty()) {
            """ Content: $content
            """.trimIndent()
        } else ""
    }

    private fun getCategorySection(): String {
        return if (category.isNotBlank() && category.isNotEmpty()) {
            """ Category: $category
            """.trimIndent()
        } else ""
    }
}