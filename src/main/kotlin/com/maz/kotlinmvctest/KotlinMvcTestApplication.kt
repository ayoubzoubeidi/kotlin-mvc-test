package com.maz.kotlinmvctest

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KotlinMvcTestApplication

fun main(args: Array<String>) {
    runApplication<KotlinMvcTestApplication>(*args)
}
