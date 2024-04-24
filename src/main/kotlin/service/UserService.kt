package org.example.service

import org.example.dto.UserDto
import org.example.dto.UserDto.Companion.toEntity
import org.example.entity.UserEntity
import org.example.repository.UserRepository
import org.springframework.security.crypto.password.PasswordEncoder
import org.springframework.stereotype.Service

@Service
class UserService(
    private val userRepository: UserRepository,
    private val passwordEncoder: PasswordEncoder
) {
    fun create(userDto: UserDto): UserEntity {

        val encodedPassword = passwordEncoder.encode(userDto.password)
        val userDtoEncodedPassword = userDto.copy(password = encodedPassword)

        userRepository.save(userDtoEncodedPassword.toEntity())
        return userDto.toEntity()
    }

}