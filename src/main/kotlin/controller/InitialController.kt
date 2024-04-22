package org.example.controller

import org.example.dto.KeyDto
import org.example.dto.KeyDto.Companion.toDto
import org.example.dto.LockDto
import org.example.dto.LockDto.Companion.toDto
import org.example.service.KeyService
import org.example.service.LockService
import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@Controller
@RequestMapping("/initial")
class InitialController(private val lockService: LockService,
    private val keyService: KeyService) {

    @PostMapping(
        "/lock",
        consumes = [MediaType.APPLICATION_JSON_VALUE],
        produces = [MediaType.APPLICATION_JSON_VALUE]
    )
    fun addLock(@RequestBody request: LockDto): ResponseEntity<*> {
        return ResponseEntity.ok(lockService.create(request).toDto())
    }

    @PostMapping(
        "/key",
        consumes = [MediaType.APPLICATION_JSON_VALUE],
        produces = [MediaType.APPLICATION_JSON_VALUE]
    )
    fun addKey(@RequestBody request: KeyDto): ResponseEntity<*> {
        return ResponseEntity.ok(keyService.create(request).toDto())
    }
}