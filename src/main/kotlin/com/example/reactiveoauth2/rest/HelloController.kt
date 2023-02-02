package com.example.reactiveoauth2.rest

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Mono

@RestController
class HelloController {
//	@GetMapping("hello")
//	fun helloWorld(): String {
//		return "Hello World"
//	}
	@GetMapping("hello")
	fun helloWorld(): Mono<String> {
		return Mono.just("Hello World")
	}
}
