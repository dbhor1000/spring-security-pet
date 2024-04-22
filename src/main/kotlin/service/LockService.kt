package org.example.service

import org.example.dto.LockDto
import org.example.dto.LockDto.Companion.toEntity
import org.example.entity.LockEntity
import org.example.repository.LockRepository
import org.springframework.stereotype.Service

@Service
open class LockService(
    private val lockRepository: LockRepository
) {
    fun create(lockDto: LockDto): LockEntity =
        lockRepository.save(lockDto.toEntity())
}