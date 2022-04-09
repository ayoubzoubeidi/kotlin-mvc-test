package com.maz.kotlinmvctest.service

import com.maz.kotlinmvctest.web.model.CustomerDto

interface CustomerService {

    fun createCustomer(customerDto: CustomerDto)

    fun getById(customerId: Long): CustomerDto

    fun getAll(): List<CustomerDto>

    fun deleteCustomerById(customerId: Long)

}