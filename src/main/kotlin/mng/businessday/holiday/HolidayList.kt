package mng.businessday.holiday

interface HolidayList {
    fun list(): Set<Hollyday>
}


class HolidayListFactory(var country: Country) {

    fun create(): HolidayList {
        when (country) {
            Country.BR -> return HolidayListBR()
            else -> return HolidayListUSA()

        }
    }


}