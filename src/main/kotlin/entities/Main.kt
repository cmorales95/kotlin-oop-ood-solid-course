package entities

fun main() {
    val firstSong = Song(
        title = "SOLO",
        artist = "Jennie"
    )

    val secondSong = Song(
        title = "Whistle",
        artist = "Blackpink"
    )

    val thirdSong = Song(
        title = "No Roots",
        artist = "Alice Merton"
    )

    secondSong.play()
    secondSong.stop()
    thirdSong.play()
}