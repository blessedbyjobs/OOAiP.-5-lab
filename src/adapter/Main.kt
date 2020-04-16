package adapter

import adapter.Adapter.IncomeDataAdapter
import adapter.Testing.Testing
import adapter.Models.Contact
import adapter.Models.Customer

fun main() {
    val adapter = IncomeDataAdapter(Testing())

    val contact = adapter as Contact
    println(contact.getName())
    println(contact.getPhoneNumber())

    println()

    val customer = adapter as Customer
    println(customer.getCompanyName())
    println(customer.getCountryName())
}