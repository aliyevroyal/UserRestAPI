package com.thealiyev.userrestapi.model

import jakarta.persistence.*

@Entity
@Table(name = "users")
data class User(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long,
    var name: String,
    var email: String,
    var age: Int,
    var phoneNumber: String
) {
    constructor() : this(0, "", "", 0, "")
}