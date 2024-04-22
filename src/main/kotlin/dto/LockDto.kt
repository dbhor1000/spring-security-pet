package org.example.dto

import lombok.NoArgsConstructor
import org.example.entity.LockEntity

@NoArgsConstructor
data class LockDto (
    val id: Long? = null,
    val lockType: String? = "",
    val lockColor: String? = ""
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