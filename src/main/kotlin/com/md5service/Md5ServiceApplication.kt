package com.md5service

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
open class Md5ServiceApplication

fun main(args: Array<String>) {
    runApplication<Md5ServiceApplication>(*args)
}
