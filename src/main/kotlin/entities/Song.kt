package entities

class Song(
    val title: String,
    val artist: String
) {
    fun play() {
        println("Playing Song: $title - $artist")
    }

    fun stop() {
        println("Stopping Song: $title")
    }
}