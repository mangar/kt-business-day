package mng.businessday.holiday

import java.time.LocalDate

class HolidayListUSA : HolidayList {
    override fun list(): Set<Hollyday> {
        return setOf(
            Hollyday(
                day = LocalDate.parse("2020-01-01"),
                country = Country.US,
                name = "USA Confraternização Universal"
            ),
            Hollyday(
                day = LocalDate.parse("2020-12-25"),
                country = Country.US,
                name = "USA Natal"
            )
        )
    }

}