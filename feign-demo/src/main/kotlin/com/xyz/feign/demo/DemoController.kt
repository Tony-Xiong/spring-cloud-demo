package com.xyz.feign.demo

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import javax.websocket.server.PathParam

@RestController
class DemoController{

    @Autowired
    lateinit var ifeign : IFeign

    @RequestMapping("/info")
    fun info(): String {
        return "demo get info: ${ifeign.info()}"
    }

    @RequestMapping("/get/{info}")
    fun get(@PathVariable("info") info : String) : String{
        val result = ifeign.get(info)
        println(result)
        return "demo get : $result"
    }
}