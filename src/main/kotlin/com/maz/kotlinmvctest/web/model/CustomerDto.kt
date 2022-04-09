package com.maz.kotlinmvctest.web.model

data class CustomerDto(
    val id: Long?,
    val firstName: String,
    val lastName: String,
    val email: String,
    val orders: List<OrdersDto>
)
