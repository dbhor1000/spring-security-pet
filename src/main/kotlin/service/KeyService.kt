package org.example.service

import org.example.dto.KeyDto
import org.example.dto.KeyDto.Companion.toEntity
import org.example.dto.LockDto.Companion.toEntity
import org.example.entity.KeyEntity
import org.example.repository.KeyRepository
import org.springframework.stereotype.Service

@Service
open class KeyService(
    private val keyRepository: KeyRepository,
) {
    fun create(keyDto: KeyDto): KeyEntity = keyRepository.save(keyDto.toEntity())
}
