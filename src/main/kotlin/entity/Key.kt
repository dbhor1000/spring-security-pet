package org.example.entity

import jakarta.persistence.Entity
import jakarta.persistence.Table
import jakarta.persistence.Id
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import lombok.Data
import lombok.NoArgsConstructor
import org.intellij.lang.annotations.Identifier

@Entity
@Table(name = "keys")
@NoArgsConstructor
class KeyEntity(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = 0L,
    val keyType: String? = null,
    val keyColor: String? = null
)
