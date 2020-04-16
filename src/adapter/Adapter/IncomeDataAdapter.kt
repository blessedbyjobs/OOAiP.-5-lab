package adapter.Adapter

import adapter.StringUtils.NAME_DELIMITER
import adapter.StringUtils.NORMAL_PHONE_LENGTH
import adapter.Models.*
import adapter.StringUtils.overtextingProtection

class IncomeDataAdapter(private val incomeData: IncomeData) : Contact, Customer {

    override fun getName(): String {
        return incomeData.getContactLastName()
            .plus(NAME_DELIMITER)
            .plus(incomeData.getContactFirstName())
    }

    override fun getPhoneNumber(): String = incomeData.getPhoneNumber().toString()
            .let { "0".overtextingProtection(NORMAL_PHONE_LENGTH - it.length) + it }
            .let { "+" + incomeData.getCountryPhoneCode() + validatePhone(it) }

    override fun getCompanyName(): String = incomeData.getCompany()

    override fun getCountryName(): String = Country().getCountryByCode(incomeData.getCountryCode())

    // валидируем телефон
    private fun validatePhone(phone: String): String {
        return "(" + phone.substring(0, 3) + ") " + phone.substring(3, 6) + "-" + phone.substring(6, 8) + "-" + phone.substring(8, 10)
    }
}