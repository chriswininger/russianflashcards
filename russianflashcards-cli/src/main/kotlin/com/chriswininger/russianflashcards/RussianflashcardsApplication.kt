package com.chriswininger.russianflashcards

import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class RussianflashcardsApplication: CommandLineRunner {

	override fun run(args: Array<String>) {
		println("!!! hello world")
	}
}

fun main(args: Array<String>) {
	println("!!! this far")
	runApplication<RussianflashcardsApplication>(*args)
}
