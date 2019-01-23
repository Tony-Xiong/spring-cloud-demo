package com.xyz.rest

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.client.discovery.EnableDiscoveryClient

@SpringBootApplication
@EnableDiscoveryClient
class RestWebApplication

fun main(args: Array<String>) {
    runApplication<RestWebApplication>(*args)
}


