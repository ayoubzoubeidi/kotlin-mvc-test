package com.maz.kotlinmvctest.web.mapper

import com.maz.kotlinmvctest.domain.Orders
import com.maz.kotlinmvctest.web.model.OrdersDto
import org.mapstruct.Mapper

@Mapper
interface OrdersMapper {

    fun ordersDtoToOrders(ordersDto: OrdersDto): Orders

    fun ordersToOrdersDto(orders: Orders): OrdersDto

}