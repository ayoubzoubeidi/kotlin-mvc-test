package com.maz.kotlinmvctest.web.model

import java.math.BigDecimal

data class OrdersDto(
    val id: Long?,
    val products: List<ProductDto>,
    val totalPrice: BigDecimal
)
