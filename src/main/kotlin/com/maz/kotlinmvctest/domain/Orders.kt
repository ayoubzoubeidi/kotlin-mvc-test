package com.maz.kotlinmvctest.domain

import org.hibernate.annotations.CreationTimestamp
import org.hibernate.annotations.UpdateTimestamp
import java.sql.Timestamp
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.JoinColumn
import javax.persistence.JoinTable
import javax.persistence.ManyToMany
import javax.persistence.ManyToOne
import javax.persistence.Version

@Entity
class Orders(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    var id: Long?,

    @ManyToMany
    @JoinTable(
        name = "orders_product",
        joinColumns = [JoinColumn(name = "orders_id")],
        inverseJoinColumns = [JoinColumn(name = "product_id")]
    )
    val products: Set<Product> = HashSet(),

    @ManyToOne
    @JoinColumn(name = "customer_id")
    var customer: Customer,

    @field:CreationTimestamp
    var createdDate: Timestamp?,

    @field:UpdateTimestamp
    var lastModifiedDate: Timestamp?,

    @field:Version
    var version: Integer?
) {
}