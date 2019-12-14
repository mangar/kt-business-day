package mng


import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test
import java.time.LocalDate
import java.time.LocalDateTime


class DateTimeUtils_isBusinessDayTest {

    @Test
    fun testDiasUteis() {
        for (day in 9 until 13) {
            assertTrue(DateTimeUtils.isBusinessDay(LocalDateTime.of(LocalDate.now().year, LocalDate.now().month, day, 9,0,0)), "FAIL testing Day: $day")
        }
    }


    @Test
    fun testDiasNaoUteis() {
        assertFalse(DateTimeUtils.isBusinessDay(LocalDateTime.of(LocalDate.now().year, LocalDate.now().month, 8, 9,0,0)))
        assertFalse(DateTimeUtils.isBusinessDay(LocalDateTime.of(LocalDate.now().year, LocalDate.now().month, 14, 9,0,0)))
    }


    @Test
    fun testHorasUteis() {
        for (hour in 9 until 18) {
            assertTrue(DateTimeUtils.isBusinessDay(LocalDateTime.of(LocalDate.now().year, LocalDate.now().month, 9, hour,0,0)), "FAIL Testing Hour: $hour")
        }
    }

    @Test
    fun testHorasNaoUteis() {

        for (hour in 19 until 23) {
            assertFalse(DateTimeUtils.isBusinessDay(LocalDateTime.of(LocalDate.now().year, LocalDate.now().month, 9, hour,0,0)), "FAIL Testing Hour: $hour")
        }
        for (hour in 0 until 8) {
            assertFalse(DateTimeUtils.isBusinessDay(LocalDateTime.of(LocalDate.now().year, LocalDate.now().month, 9, hour,0,0)), "FAIL Testing Hour: $hour")
        }
        assertFalse(DateTimeUtils.isBusinessDay(LocalDateTime.of(LocalDate.now().year, LocalDate.now().month, 9, 8,59,59)))
        assertFalse(DateTimeUtils.isBusinessDay(LocalDateTime.of(LocalDate.now().year, LocalDate.now().month, 9, 18,1, 0)))
        assertFalse(DateTimeUtils.isBusinessDay(LocalDateTime.of(LocalDate.now().year, LocalDate.now().month, 9, 18,0,1)))

    }



}