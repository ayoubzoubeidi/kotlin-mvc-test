package com.maz.kotlinmvctest.web.controller

import com.maz.kotlinmvctest.service.CustomerService
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping

@Controller
@RequestMapping("/api/v1/customers")
class CustomerController(
    val customerService: CustomerService
) {

    @GetMapping
    fun getAllCustomer() =
        ResponseEntity.ok().body(customerService.getAll())

    @GetMapping("/{customerId}")
    fun getCustomerById(@PathVariable("customerId") customerId: Long) =
        ResponseEntity.ok().body(customerService.getById(customerId))


}