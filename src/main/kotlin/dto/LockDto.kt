package org.example.dto

import org.example.entity.LockEntity

data class LockDto (
    val id: Long? = null,
    val lockType: String?,
    val lockColor: String?
) {
    companion object {
        fun LockEntity.toDto() = LockDto(
            id = id,
            lockType = lockType,
            lockColor = lockColor,
        )

        fun LockDto.toEntity() = LockEntity(
            id = id,
            lockType = lockType,
            lockColor = lockColor
        )
    }
}