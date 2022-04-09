package com.maz.kotlinmvctest.web.model

import java.math.BigDecimal

data class ProductDto(
    val id: Long?,
    val name: String,
    val price: BigDecimal,
    val orders: List<OrdersDto>
)
