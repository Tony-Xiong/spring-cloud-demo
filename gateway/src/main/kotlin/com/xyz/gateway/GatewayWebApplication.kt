package com.xyz.gateway

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.client.discovery.EnableDiscoveryClient
import org.springframework.stereotype.Controller

@SpringBootApplication
@EnableDiscoveryClient
@Controller
class GatewayWebApplication

fun main(args: Array<String>) {
    runApplication<GatewayWebApplication>(*args)
}