package com.maz.kotlinmvctest.web.mapper

import com.maz.kotlinmvctest.domain.Customer
import com.maz.kotlinmvctest.web.model.CustomerDto
import org.mapstruct.Mapper

@Mapper
interface CustomerMapper {

    fun customerDtoToCustomer(customerDto: CustomerDto): Customer

    fun customerToCustomerDto(customer: Customer): CustomerDto

}