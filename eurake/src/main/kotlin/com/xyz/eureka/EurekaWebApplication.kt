package com.xyz.eureka

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer

@SpringBootApplication
@EnableEurekaServer
class EurekaWebApplication

fun main(args: Array<String>) {
    runApplication<EurekaWebApplication>(*args)
}