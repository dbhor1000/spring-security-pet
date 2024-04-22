package org.example.entity

import jakarta.persistence.Entity
import jakarta.persistence.Table
import jakarta.persistence.Id
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType

@Entity
@Table(name = "keys")
class KeyEntity(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,
    val keyType: String? = null,
    val keyColor: String? = null
)
