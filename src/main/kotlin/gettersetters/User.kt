package gettersetters

import java.time.LocalDate

class User(
    email: String,
    password: String,
) {
    private val dateNow = LocalDate.now()
    private val gendersEnum = listOf('F', 'M')

    var isValid: Boolean = true
    var email: String = ""
        set(value) {
            field = value.lowercase()
        }

    var password: String = password
        set(value) {
            field = if (value.length == 6) {
                value
            } else {
                isValid = false
                ""
            }
        }

    var birthday: LocalDate = dateNow
        set(value) {
            val age = dateNow.year - value.year
            field = if (age > 18) {
                value
            } else {
                isValid = false
                dateNow
            }
        }

    var gender: Char = 'N'
        set(value) {
            field = if (gendersEnum.contains(value)) {
                value
            } else {
                isValid = false
                'N'
            }
        }

    init {
        this.email = email
        this.password = password
    }


    constructor(
        email: String,
        password: String,
        birthday: LocalDate,
        gender: Char,
    ) : this(email, password) {
        this.birthday = birthday
        this.gender = gender
    }

}