package com.maz.kotlinmvctest.domain

import org.hibernate.annotations.CreationTimestamp
import org.hibernate.annotations.UpdateTimestamp
import java.sql.Timestamp
import javax.persistence.*
import javax.persistence.GenerationType.AUTO

@Entity
class Customer(
    @Id
    @GeneratedValue(strategy = AUTO)
    var id: Long?,
    var firstName: String,
    var lastName: String,
    var email: String,

    @OneToMany(mappedBy = "customer")
    val orders: Set<Orders>,

    @field:CreationTimestamp
    var createdDate: Timestamp?,
    @field:UpdateTimestamp
    var lastModifiedDate: Timestamp?,
    @field:Version
    var version: Integer?

) {
}