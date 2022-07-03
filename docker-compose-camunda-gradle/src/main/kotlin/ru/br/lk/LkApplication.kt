package ru.br.lk

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class LkApplication

fun main(args: Array<String>) {
	runApplication<LkApplication>(*args)
		val DB_SERVER_NAMES = System.getenv("DB_SERVER_NAMES")
		println("DB_SERVER_NAMES = $DB_SERVER_NAMES")
		val DS_PORT_NUMBERS = System.getenv("DS_PORT_NUMBERS")
		println("DS_PORT_NUMBERS = $DS_PORT_NUMBERS")
		val DS_DATABASE_NAME = System.getenv("DS_DATABASE_NAME")
		println("DS_DATABASE_NAME = $DS_DATABASE_NAME")	
		val DS_USER = System.getenv("DS_USER")
		println("DS_USER = $DS_USER")
		val DS_PASSWORD = System.getenv("DS_PASSWORD")
		println("DS_PASSWORD = $DS_PASSWORD")
		val DS_SCHEMA = System.getenv("DS_SCHEMA")
		println("DS_SCHEMA = $DS_SCHEMA")
}
