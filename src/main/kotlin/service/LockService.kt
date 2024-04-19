package org.example.service

import mu.KotlinLogging
import org.example.dto.LockDto
import org.example.dto.LockDto.Companion.toEntity
import org.example.repository.LockRepository
import org.springframework.stereotype.Service

@Service
class LockService(
    val lockRepository: LockRepository
) {

    fun create(lockDto: LockDto) {

        lockRepository.save(lockDto.toEntity()).let {
            logger.info { "Added a new key of type: '${it.lockType}' with color: '${it.lockColor}'" }
            it
        }
    }

    companion object {
        private val logger = KotlinLogging.logger {  }
    }
}