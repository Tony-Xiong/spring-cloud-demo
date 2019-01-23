package com.xyz.logic.controller

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class DemoController
{
    @RequestMapping("/")
    fun hello(): String {
        return "{'name':'Hello World!'}"
    }
}
