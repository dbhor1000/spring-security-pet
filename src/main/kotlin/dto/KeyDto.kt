package org.example.dto

import org.example.entity.KeyEntity

data class KeyDto (
    val id: Long? = null,
    val keyType: String?,
    val keyColor: String?
) {
    companion object {
        fun KeyEntity.toDto() = KeyDto(
            id = id,
            keyType = keyType,
            keyColor = keyColor,
        )

        fun KeyDto.toEntity() = KeyEntity(
            id = id,
            keyType = keyType,
            keyColor = keyColor
        )
    }
}