package com.maz.kotlinmvctest.repository

import com.maz.kotlinmvctest.domain.Customer
import org.springframework.data.jpa.repository.JpaRepository

interface CustomerRepository: JpaRepository<Customer, Long> {
}