package org.example

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.ConfigurationPropertiesScan

@SpringBootApplication
open class Application

fun main(args: Array<String>) {
        println("starting application...")
        SpringApplication.run(Application::class.java, *args)
}