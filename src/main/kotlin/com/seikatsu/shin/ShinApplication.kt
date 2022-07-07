package com.seikatsu.shin

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.client.discovery.EnableDiscoveryClient

@SpringBootApplication
@EnableDiscoveryClient
class ShinApplication

fun main(args: Array<String>) {
    runApplication<ShinApplication>(*args)
}
