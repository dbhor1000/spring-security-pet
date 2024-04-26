package org.example.controller

import org.example.dto.SingleReceiverRequest
import org.example.service.EmailService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/emails")
class EmailController(private val emailService: EmailService) {
    @PostMapping("/text")
    fun sendTextEmail(@RequestBody request: SingleReceiverRequest) : ResponseEntity<*> {
        emailService.sendTextEmail(request)
        return ResponseEntity.ok("Отправлено тестовое письмо на электронный адрес: " + request.receiver)
    }
}
