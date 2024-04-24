package org.example.dto

data class AuthenticationResponse(
    val accessToken: String? = "",
    val refreshToken: String? = ""
)