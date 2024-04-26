package org.example.service

import org.example.dto.SingleReceiverRequest
import org.springframework.beans.factory.annotation.Value
import org.springframework.mail.SimpleMailMessage
import org.springframework.mail.javamail.JavaMailSender
import org.springframework.stereotype.Service

@Service
class EmailService(
    private val javaMailSender: JavaMailSender,
    @Value("\${spring.mail.sender.email}") private val senderEmail: String,
    @Value("\${spring.mail.sender.text}") private val senderText: String
) {
    fun sendTextEmail(request: SingleReceiverRequest) {
        val message = SimpleMailMessage()
        message.setFrom(senderEmail)
        message.setTo(request.receiver)
        message.setSubject("Тестовое письмо")
        message.setText("Текстовое сообщение в тестовом письме.\nВторая строка.")
        javaMailSender.send(message)
    }
}
