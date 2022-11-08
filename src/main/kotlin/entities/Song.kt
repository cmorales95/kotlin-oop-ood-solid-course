package entities

class Song(
    val title: String,
    val artist: String
) {
    private val artistUpper = artist.uppercase()
    init {
       println("Song $title created")
    }

    constructor(
        title: String,
        artist: String,
        duration: Long,
    ) : this(title, artist)

    fun play() {
        println("Playing Song: $title - $artistUpper")
    }

    fun stop() {
        println("Stopping Song: $title")
    }
}