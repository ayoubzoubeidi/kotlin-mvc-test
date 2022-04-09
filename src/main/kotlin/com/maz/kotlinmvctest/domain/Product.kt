package com.maz.kotlinmvctest.domain

import org.hibernate.annotations.CreationTimestamp
import org.hibernate.annotations.UpdateTimestamp
import java.math.BigDecimal
import java.sql.Timestamp
import javax.persistence.*

@Entity
class Product(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    var id: Long?,

    var name: String,
    var price: BigDecimal,

    @ManyToMany(mappedBy = "products")
    val orders: Set<Orders>,

    @field:CreationTimestamp
    var createdDate: Timestamp?,
    @field:UpdateTimestamp
    var lastModifiedDate: Timestamp?,
    @field:Version
    var version: Integer?
) {

}
