package com.yosep.mock

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class YosepMvcFinancialMockServerApplication

fun main(args: Array<String>) {
	runApplication<YosepMvcFinancialMockServerApplication>(*args)
}
