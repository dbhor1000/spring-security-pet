package org.example

import mu.KotlinLogging
import org.springframework.boot.Banner
import org.springframework.boot.WebApplicationType
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
open class Application

fun main(args: Array<String>) {
    runCatching {
        runApplication<Application>(*args) {
            webApplicationType = WebApplicationType.NONE
            setBannerMode(Banner.Mode.OFF)
        }
    }.onFailure {
        KotlinLogging.logger { }.error(it) { "death on start: ${it.message}" }
    }
}