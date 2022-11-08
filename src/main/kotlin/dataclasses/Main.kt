package dataclasses

fun main() {
    val firstSong = Song(
        "SOLO",
        "Jennie"
    )

    val secondSong = Song(
        "SOLO",
        "Jennie"
    )

    println("${firstSong == secondSong}")

    val firstSongDC = DataClassSong(
        "SOLO",
        "Jennie"
    )

    val secondSongDC = DataClassSong(
        "SOLO",
        "Jennie"
    )

    println("${firstSongDC == secondSongDC}")
}