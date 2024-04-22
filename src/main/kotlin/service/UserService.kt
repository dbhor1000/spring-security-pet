package org.example.service

import org.example.dto.UserDto
import org.example.dto.UserDto.Companion.toEntity
import org.example.entity.UserEntity
import org.example.repository.UserRepository
import org.springframework.stereotype.Service

@Service
class UserService(
    private val userRepository: UserRepository
) {
    fun create(userDto: UserDto): UserEntity =
        userRepository.save(userDto.toEntity())
}