package enums

import enums.constructor.Color
import enums.functions.ErrorType

fun main() {
    val connectionType = ConnectionType.WIFI
    println(connectionType)

    val whiteHex = Color.WHITE.hexa
    println(whiteHex)

    val attempts = ErrorType.NOT_LOGGED_IN_ERROR.getRetryIntents()
    println(attempts)
}