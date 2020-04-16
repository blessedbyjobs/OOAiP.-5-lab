package adapter.Testing

import adapter.Models.IncomeData

// проще создать класс наследник с готовыми данными, чем пихать это все в адаптер
class Testing : IncomeData {

    override fun getCountryCode(): String = "RU"

    override fun getCountryPhoneCode(): Int = 19

    override fun getCompany(): String = "VSU"

    override fun getContactFirstName(): String = "Test"

    override fun getContactLastName(): String = "Testof"

    override fun getPhoneNumber(): Int = 920442871
}