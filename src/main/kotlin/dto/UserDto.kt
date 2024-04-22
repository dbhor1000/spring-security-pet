package org.example.dto

import lombok.NoArgsConstructor
import org.example.entity.Role
import org.example.entity.UserEntity

@NoArgsConstructor
data class UserDto (

    val id: Long? = null,
    val username: String? = "",
    val password: String? = "",
    val fullName: String? = "",
    val role: Role? = null
) {
    companion object {
        fun UserEntity.toDto() = UserDto(
            id = id,
            username = username,
            password = password,
            fullName = fullName,
            role = role
        )

        fun UserDto.toEntity() = UserEntity(
            id = id,
            username = username,
            password = password,
            fullName = fullName,
            role = role
        )
    }
}