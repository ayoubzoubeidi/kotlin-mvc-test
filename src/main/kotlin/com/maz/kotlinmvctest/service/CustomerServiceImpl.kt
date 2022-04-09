package com.maz.kotlinmvctest.service

import com.maz.kotlinmvctest.repository.CustomerRepository
import com.maz.kotlinmvctest.web.mapper.CustomerMapper
import com.maz.kotlinmvctest.web.model.CustomerDto
import org.springframework.stereotype.Service
import kotlin.streams.toList

@Service
class CustomerServiceImpl(
    val customerRepository: CustomerRepository,
    val customerMapper: CustomerMapper
) : CustomerService {

    override fun createCustomer(customerDto: CustomerDto) {

        val customer = customerMapper.customerDtoToCustomer(customerDto)
        customerRepository.saveAndFlush(customer)

    }

    override fun getById(customerId: Long): CustomerDto {

        return customerMapper.customerToCustomerDto(
            customerRepository.findById(customerId).get()
        )
    }

    override fun getAll(): List<CustomerDto> {
        return customerRepository.findAll()
            .stream()
            .map(customerMapper::customerToCustomerDto)
            .toList()
    }

    override fun deleteCustomerById(customerId: Long) {

        customerRepository.deleteById(customerId)

    }
}