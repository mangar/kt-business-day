package mng.businessday.holiday

import java.time.LocalDate
import java.time.format.DateTimeFormatter


data class Hollyday(
    var day: LocalDate,
    val country: Country,
    val name: String = "",
    val city: City = City.NATIONAL,
    val flagNational: Boolean = true
) {

    fun code(): String {
        return day.format(DateTimeFormatter.ofPattern("yymmdd"))
    }

}

enum class Country(code: String, name: String) {
    BR("BR", "Brazil"),
    US("USA", "United States")
}


enum class City(code: String, name: String) {
    NATIONAL("NATIONAL", "NATIONAL"),
    SP("SP", "São Paulo"),
    NY("NYC", "New York")
}
