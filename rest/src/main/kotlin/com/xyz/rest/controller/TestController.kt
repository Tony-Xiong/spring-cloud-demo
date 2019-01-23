package com.xyz.rest.controller

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class TestController {
    @RequestMapping("/test")
    fun testCloud(): String {
        return "test information!"
    }

    @RequestMapping("/get")
    fun getSome(@RequestParam info : String): String {
        return "get : $info"
    }

    @RequestMapping("/")
    fun hello(): String {
        return "hello world!"
    }
}


