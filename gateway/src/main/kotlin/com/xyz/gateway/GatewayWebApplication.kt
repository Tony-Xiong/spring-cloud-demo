package com.xyz.gateway

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.client.discovery.EnableDiscoveryClient

@SpringBootApplication
@EnableDiscoveryClient
class GatewayWebApplication

fun main(args: Array<String>) {
    runApplication<GatewayWebApplication>(*args)
}