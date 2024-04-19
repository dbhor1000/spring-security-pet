package org.example.controller

import mu.KotlinLogging
import org.example.dto.LockDto
import org.example.service.LockService
import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/initial/")
class MainController(private val lockService: LockService) {

    @PostMapping(
        "/lock",
        consumes = [MediaType.APPLICATION_JSON_VALUE],
        produces = [MediaType.APPLICATION_JSON_VALUE]
    )
    fun addLock(@RequestBody request: LockDto): ResponseEntity<*> {
        logger.trace { "God add lock request with body: '$request'" }
        return ResponseEntity.ok(lockService.create(request))
    }

    companion object {
        private val logger = KotlinLogging.logger { }
    }
}