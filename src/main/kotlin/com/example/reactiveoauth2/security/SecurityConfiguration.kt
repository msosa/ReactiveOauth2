package com.example.reactiveoauth2.security

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.security.config.annotation.web.reactive.EnableWebFluxSecurity
import org.springframework.security.config.web.server.ServerHttpSecurity
import org.springframework.security.web.server.SecurityWebFilterChain

@Configuration
@EnableWebFluxSecurity
//@EnableWebSecurity
class SecurityConfiguration {
	@Bean
	fun configureMine(
		httpSecurity: ServerHttpSecurity,
	): SecurityWebFilterChain {
		httpSecurity
			.authorizeExchange {
				it.anyExchange().authenticated()
			}
			.oauth2Login()
		return httpSecurity.build()
	}
//
//	@Bean
//	fun configureMine(
//		httpSecurity: HttpSecurity,
//	): SecurityFilterChain {
//		httpSecurity
//			.csrf().disable() // dont authenticate this particular request
//			.authorizeHttpRequests {
//				it.anyRequest().authenticated()
//			}
//			.oauth2Login()
//		return httpSecurity.build()
//	}
}
