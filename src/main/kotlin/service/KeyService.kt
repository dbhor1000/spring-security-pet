package org.example.service

import org.example.dto.KeyDto
import org.example.dto.KeyDto.Companion.toEntity
import org.example.repository.KeyRepository
import org.springframework.stereotype.Service
import mu.KotlinLogging
import org.springframework.transaction.annotation.Transactional

@Service
class KeyService(
    val keyRepository: KeyRepository,
) {

    fun create(keyDto: KeyDto) {

        keyRepository.save(keyDto.toEntity()).let {
            logger.info { "Added a new key of type: '${it.keyType}' with color: '${it.keyColor}'" }
            it
        }
    }

    companion object {
        private val logger = KotlinLogging.logger {  }
    }
}