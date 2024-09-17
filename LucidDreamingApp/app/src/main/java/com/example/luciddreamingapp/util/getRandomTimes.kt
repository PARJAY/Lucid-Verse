package com.example.luciddreamingapp.util

import java.util.Calendar
import kotlin.random.Random

fun main() {
    print(getRandomTimes())
}

fun getRandomTimes(): List<Calendar> {
    val startHour = 8
    val endHour = 20
    val randomTimes = mutableListOf<Calendar>()
    val calendar = Calendar.getInstance()
    for (i in 1..10) { // Adjust the number of random times you want
        val randomHour = Random.nextInt(endHour - startHour) + startHour
        val randomMinute = Random.nextInt(60)
        calendar.set(Calendar.HOUR_OF_DAY, randomHour)
        calendar.set(Calendar.MINUTE, randomMinute)
        randomTimes.add(calendar.clone() as Calendar)
    }
    return randomTimes
}