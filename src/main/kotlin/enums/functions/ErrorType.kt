package enums.functions

enum class ErrorType(
    val message: String
) {
    UNKNOWN_ERROR("unknown error") {
        override val userMessage: String = "unexpected error occurred"
        override fun getCodeError(): String = "UE00"
    },

    CONNECTIVITY_ERROR("connectivity error") {
        override val userMessage: String = "Failure Request"
        override fun getCodeError(): String = "CE003"
        override fun getRetryIntents(): Int = 3
    },

    NOT_LOGGED_IN_ERROR("not logged in error") {
        override val userMessage: String = "user is not logged"
        override fun getCodeError(): String = "LE002"
        override fun getRetryIntents(): Int = 2
    };

    abstract val userMessage: String
    abstract fun getCodeError(): String
    open fun getRetryIntents(): Int = 1
}