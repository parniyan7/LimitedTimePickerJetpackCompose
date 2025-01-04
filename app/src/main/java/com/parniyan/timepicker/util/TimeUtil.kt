package com.parniyan.timepicker.util


/**
 ** Created by Parniyan on 1/3/2025.
 **
 */
object TimeUtil {
    fun convertTimeToDuration(time: String): Int {
        val t = time.substringBeforeLast(':').split(':').map { it.toInt() }
        return t[0] * 3600 + t[1] * 60
    }
    internal fun convertSecondToDuration(seconds: Int?): Pair<Int, Int> {
        if (seconds == null) return 0 to 0
        return seconds / 3600 to (seconds / 60) % 60
    }

}



