package adapter.StringUtils

// нормальная длина номера
const val NORMAL_PHONE_LENGTH = 10

// разделитель для имени/названия
const val NAME_DELIMITER = ", "

// название страны по умолчанию
const val DEFAULT_COUNTRY_NAME = "Undefined Country"

// защита на случай, если n < 0
fun String.overtextingProtection(n: Int): String = this.takeIf { n < 0 } ?: repeat(n)