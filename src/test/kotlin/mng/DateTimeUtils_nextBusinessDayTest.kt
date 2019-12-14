package mng


import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import java.time.DayOfWeek
import java.time.LocalDate
import java.time.LocalDateTime


class DateTimeUtils_nextBusinessDayTest {

    @Test
    fun testNextBusinessDay_0912_Monday() {

        var today = LocalDateTime.of(LocalDate.now().year, LocalDate.now().month, 9, 9,0,0)
        assertEquals(DayOfWeek.MONDAY, today.dayOfWeek)

        var next = DateTimeUtils.nextBusinessDay(today)
        assertEquals(10, next.dayOfMonth)
        assertEquals(DayOfWeek.TUESDAY, next.dayOfWeek)

    }

    @Test
    fun testNextBusinessDay_Friday() {

        var today = LocalDateTime.of(LocalDate.now().year, LocalDate.now().month, 13, 9,0,0)
        assertEquals(DayOfWeek.FRIDAY, today.dayOfWeek, "Today should be a Friday")

        var next = DateTimeUtils.nextBusinessDay(today)
        assertEquals(16, next.dayOfMonth, "Next Businessday should be Monday (16)")
        assertEquals(DayOfWeek.MONDAY, next.dayOfWeek, "Next Businessday should be Monday")
    }

    @Test
    fun testNextBusinessDay_Saturday() {

        var today = LocalDateTime.of(LocalDate.now().year, LocalDate.now().month, 14, 9,0,0)
        assertEquals(DayOfWeek.SATURDAY, today.dayOfWeek, "Today should be a Saturday")

        var next = DateTimeUtils.nextBusinessDay(today)
        assertEquals(16, next.dayOfMonth, "Next Businessday should be Monday (16)")
        assertEquals(DayOfWeek.MONDAY, next.dayOfWeek, "Next Businessday should be Monday")
    }

    @Test
    fun testNextBusinessDay_Sunday() {

        var today = LocalDateTime.of(LocalDate.now().year, LocalDate.now().month, 15, 9,0,0)
        assertEquals(DayOfWeek.SUNDAY, today.dayOfWeek, "Today should be Sunday")

        var next = DateTimeUtils.nextBusinessDay(today)
        assertEquals(16, next.dayOfMonth, "Next Businessday should be Monday (16)")
        assertEquals(DayOfWeek.MONDAY, next.dayOfWeek, "Next Businessday should be Monday")
    }



}