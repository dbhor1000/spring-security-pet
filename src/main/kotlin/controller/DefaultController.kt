package org.example.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@Controller
@RequestMapping("/")
class DefaultController() {

    @GetMapping()
    fun welcomeMessage(): String {
        return "Abusus non tollit usum."
    }
}