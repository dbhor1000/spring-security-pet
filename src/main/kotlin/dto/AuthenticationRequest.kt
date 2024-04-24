package org.example.dto

data class AuthenticationRequest(
    val username: String? = "",
    val password: String? = "",
)