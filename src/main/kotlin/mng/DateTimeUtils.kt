package mng

import java.time.DayOfWeek
import java.time.LocalDateTime
import java.time.LocalTime


object DateTimeUtils {

    /**
     * Business Day: MONDAY to FRIDAY from 9h00m00 to 18h000m00
     */
    fun isBusinessDay(dia: LocalDateTime, startHour: Int = 9, endHour: Int = 18, endMinute: Int = 0, endSecond: Int = 0): Boolean {
        if (dia.dayOfWeek.value >= DayOfWeek.MONDAY.value && dia.dayOfWeek.value <= DayOfWeek.FRIDAY.value) {
            if (dia.hour >= startHour) {
                if (dia.hour <= endHour && dia.minute <= endMinute && dia.second <= endSecond) {
                    return true
                }
            }
        }
        return false
    }


    /**
     *
     */
    fun nextBusinessDay(dia: LocalDateTime): LocalDateTime {
        (1..3).forEach {
            var nextDay = LocalDateTime.of(dia.plusDays(it.toLong()).toLocalDate(), LocalTime.of(9,0,0))
            if (isBusinessDay(nextDay)) {
                return nextDay
            }
        }
        return dia
    }


}