package com.md5service.service

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class Md5ServiceTest {

    private val md5Service = Md5Service()

    @Test
    fun `should calculate correct MD5 hash`() {
        val text = "hello"
        val expected = "5d41402abc4b2a76b9719d911017c592"
        val result = md5Service.calculateMd5(text)
        assertEquals(expected, result)
    }

    @Test
    fun `should calculate MD5 for empty string`() {
        val text = ""
        val expected = "d41d8cd98f00b204e9800998ecf8427e"
        val result = md5Service.calculateMd5(text)
        assertEquals(expected, result)
    }

    @Test
    fun `should calculate MD5 for complex text`() {
        val text = "The quick brown fox jumps over the lazy dog"
        val expected = "9e107d9d372bb6826bd81d3542a419d6"
        val result = md5Service.calculateMd5(text)
        assertEquals(expected, result)
    }
}
