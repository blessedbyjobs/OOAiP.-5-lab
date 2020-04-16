package adapter.Models

interface IncomeData {

    fun getCountryCode(): String

    fun getCompany(): String

    fun getContactFirstName(): String

    fun getContactLastName(): String

    fun getCountryPhoneCode(): Int

    fun getPhoneNumber(): Int
}