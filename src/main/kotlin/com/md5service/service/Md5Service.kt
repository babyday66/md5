package com.md5service.service

import org.springframework.stereotype.Service
import java.security.MessageDigest

@Service
class Md5Service {

    fun calculateMd5(text: String): String {
        val md = MessageDigest.getInstance("MD5")
        val messageDigest = md.digest(text.toByteArray())
        return messageDigest.joinToString("") { "%02x".format(it) }
    }
}
