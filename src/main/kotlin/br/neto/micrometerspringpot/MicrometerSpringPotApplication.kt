package br.neto.micrometerspringpot

import org.slf4j.LoggerFactory
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
class MicrometerSpringPotApplication

fun main(args: Array<String>) {
    runApplication<MicrometerSpringPotApplication>(*args)
}

@RestController
class HelloController {

    private val logger = LoggerFactory.getLogger(HelloController::class.java)

    @GetMapping("/hello")
    fun hello() = "Oi, mundo".also { logger.info("Returning $it") }
}
