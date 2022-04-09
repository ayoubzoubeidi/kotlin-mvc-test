package com.maz.kotlinmvctest.web.mapper

import com.maz.kotlinmvctest.domain.Product
import com.maz.kotlinmvctest.web.model.ProductDto
import org.mapstruct.Mapper

@Mapper
interface ProductMapper {

    fun productDtoToProduct(productDto: ProductDto): Product

    fun productToProductDto(product: Product): ProductDto

}