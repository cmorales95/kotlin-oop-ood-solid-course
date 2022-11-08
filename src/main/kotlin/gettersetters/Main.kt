package gettersetters

import java.time.LocalDate
import java.time.Month

fun main() {
    val user1 = User(
        "EMAIL.com",
        "123abc"
    )

    val userRegistered: User? = RegisterUser().invoke(user1)
    if (userRegistered != null) {
        println("email: ${userRegistered.email}")
        println("password: ${userRegistered.password}")
    } else {
        println("user not registered")
    }

    println()
    val myUser = User(
        email = "cris@email.com",
        password = "123abc",
        birthday = LocalDate.of(
            1995,
            Month.AUGUST,
            17
        ),
        gender = 'M'
    )

    val myUserRegistered: User? = RegisterUser().invoke(myUser)
    if (myUserRegistered != null) {
        println("email: ${myUserRegistered.email}")
        println("password: ${myUserRegistered.password}")
        println("birthday: ${myUserRegistered.birthday}")
        println("gender: ${myUserRegistered.gender}")
    } else {
        println("user ${myUser.email} not registered")
    }
}