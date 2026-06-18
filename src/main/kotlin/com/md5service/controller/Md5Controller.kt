package com.md5service.controller

import com.md5service.service.Md5Service
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/md5")
open class Md5Controller(private val md5Service: Md5Service) {

    @PostMapping("/calculate")
    open fun calculateMd5(@RequestBody request: Md5Request): Md5Response {
        val hash = md5Service.calculateMd5(request.text)
        return Md5Response(input = request.text, hash = hash)
    }

    @GetMapping("/calculate")
    open fun calculateMd5FromQuery(@RequestParam text: String): Md5Response {
        val hash = md5Service.calculateMd5(text)
        return Md5Response(input = text, hash = hash)
    }

    @GetMapping("/health")
    open fun health(): Map<String, String> {
        return mapOf("status" to "UP", "service" to "MD5 Service")
    }
}

data class Md5Request(
    val text: String = ""
)

data class Md5Response(
    val input: String,
    val hash: String
)
