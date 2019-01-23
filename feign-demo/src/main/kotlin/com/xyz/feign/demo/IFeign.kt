package com.xyz.feign.demo

import org.springframework.cloud.openfeign.FeignClient
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam

@FeignClient("rest")
interface IFeign{

    @GetMapping("/test")
    fun info(): String

    @GetMapping("/get")
    fun get(@RequestParam info:String): String
}
