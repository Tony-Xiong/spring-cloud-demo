package com.xyz.config

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.config.server.EnableConfigServer

@SpringBootApplication
@EnableConfigServer
class ConfigWebApplication

fun main(args: Array<String>) {
    runApplication<ConfigWebApplication>(*args)
}