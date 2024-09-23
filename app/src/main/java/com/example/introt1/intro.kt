package com.example.introt1

//LEQUELEQUE CONDORI OMAR 20200271

fun main() {
    //VARIABLES
    val count: Int = 2
    println(count)  //NÚMERO
    println("You have $count unread messages.") //MENSAJE MÁS NÚMERO

    val unreadCount = 5
    val readCount = 100
    println("You have ${unreadCount + readCount} total messages in your inbox.")

    val numberOfPhotos = 100
    val photosDeleted = 10
    println("$numberOfPhotos photos")
    println("$photosDeleted photos deleted")
    println("${numberOfPhotos - photosDeleted} photos left")

    //ACTUALIZAR VARIABLES
    var cartTotal = 0
    cartTotal = 20
    println("Total: $cartTotal")

    var number: Int = 10
    println("You have $number unread messages.")
    number = number + 1
    println("You have $number unread messages.")
    number++
    println("You have $number unread messages.")
    number--
    println("You have $number unread messages.")

    //TIPOS DE DATOS
    //DOUBLE
    val trip1 = 3.20
    val trip2 = 4.10
    val trip3 = 1.72
    val totalTripLength = trip1 + trip2 + trip3
    println("$totalTripLength miles left to destination")

    //STRING
    val nextMeeting = "Next meeting is: "
    val date = "January 1"
    val reminder = nextMeeting + date + " at work"
    println(reminder)

    println("Say \"hello\"")

    //BOOLEAN
    val notificationsEnabled: Boolean = false
    println("Are notifications enabled? " + notificationsEnabled)

    //FUNCIONES
    println(birthday())
    println(birthdayGreeting("Rover",5))
    println(birthdayGreeting("Rex",2))
}

fun birthday(): String {
    val name = "Happy Birthday, Rover!"
    val age = "You are now 5 years old!"
    return "$name\n$age"
}

fun birthdayGreeting(name: String, age: Int): String {
    val nameGreeting = "Happy Birthday, $name!"
    val ageGreeting = "You are now $age years old!"
    return "$nameGreeting\n$ageGreeting"
}

