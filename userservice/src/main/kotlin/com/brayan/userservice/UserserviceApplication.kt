package com.brayan.userservice

import com.brayan.userservice.models.User
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.client.loadbalancer.LoadBalanced
import org.springframework.cloud.netflix.eureka.EnableEurekaClient
import org.springframework.context.annotation.Bean
import org.springframework.web.client.RestTemplate

@SpringBootApplication
@EnableEurekaClient
class UserserviceApplication{

	@Bean
	fun provideUsers():List<User>{
		return listOf(User("Brayan",1,12, listOf(1,2,3,4)),
				User("Ana",2,12, listOf(1)),
				User("Joaquin",3,12, listOf(3,4)))
	}

	@Bean
	@LoadBalanced
	fun provideRestTemplate():RestTemplate{
		return RestTemplate()
	}
}

fun main(args: Array<String>) {
	runApplication<UserserviceApplication>(*args)
}
