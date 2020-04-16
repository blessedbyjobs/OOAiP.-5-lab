package adapter.Models

import adapter.StringUtils.DEFAULT_COUNTRY_NAME

class Country {
    private val countries = mapOf(
        "UA" to "Ukraine",
        "RU" to "Russia",
        "CA" to "Canada"
    )

    fun getCountryByCode(code: String): String = countries.getOrDefault(code, DEFAULT_COUNTRY_NAME)
}