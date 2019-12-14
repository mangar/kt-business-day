package mng.businessday.holiday

import java.time.LocalDate

class HolidayListBR : HolidayList {
    override fun list(): Set<Hollyday> {
        return setOf(
            Hollyday(
                day = LocalDate.parse("2020-01-01"),
                country = Country.BR,
                name = "Confraternização Universal"
            ),
            Hollyday(
                day = LocalDate.parse("2020-02-24"),
                country = Country.BR,
                name = "Carnaval"
            ),
            Hollyday(
                day = LocalDate.parse("2020-02-25"),
                country = Country.BR,
                name = "Carnaval"
            ),
            Hollyday(
                day = LocalDate.parse("2020-04-10"),
                country = Country.BR,
                name = "Paixão de Cristo"
            ),
            Hollyday(
                day = LocalDate.parse("2020-04-21"),
                country = Country.BR,
                name = "Tiradentes"
            ),
            Hollyday(
                day = LocalDate.parse("2020-05-01"),
                country = Country.BR,
                name = "Dia do Trabalho"
            ),
            Hollyday(
                day = LocalDate.parse("2020-09-07"),
                country = Country.BR,
                name = "Independencia do Brasil"
            ),
            Hollyday(
                day = LocalDate.parse("2020-10-12"),
                country = Country.BR,
                name = "Nossa Senhora"
            ),
            Hollyday(
                day = LocalDate.parse("2020-11-02"),
                country = Country.BR,
                name = "Finados"
            ),
            Hollyday(
                day = LocalDate.parse("2020-11-15"),
                country = Country.BR,
                name = "Proclamação da Republica"
            ),
            Hollyday(
                day = LocalDate.parse("2020-11-25"),
                country = Country.BR,
                name = "Natal"
            )
        )
    }

}