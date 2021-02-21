fun fullName(
        firstName: String,
        lastName: String,
        nickName: String
) {
    println("Hallo $firstName \"$nickName\" $lastName")
}

fun main() {
    fullName("Martinus","Rombe", "In")
    fullName(
            lastName = "Rombe",
            firstName = "Martinus",
            nickName = "Inu"

    )
}

