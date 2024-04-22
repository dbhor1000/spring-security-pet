package org.example.controller

import org.example.dto.UserDto
import org.example.dto.UserDto.Companion.toDto
import org.example.service.UserService
import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@Controller
@RequestMapping("/user")
class UserController(private val userService: UserService
) {

    @PostMapping(
        "/register",
        consumes = [MediaType.APPLICATION_JSON_VALUE],
        produces = [MediaType.APPLICATION_JSON_VALUE]
    )
    fun registerUser(@RequestBody request: UserDto): ResponseEntity<*> {
        return ResponseEntity.ok(userService.create(request).toDto())
    }
}