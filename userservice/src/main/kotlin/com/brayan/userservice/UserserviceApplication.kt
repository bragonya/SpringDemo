package com.brayan.userservice

import com.brayan.userservice.models.User
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean

@SpringBootApplication
class UserserviceApplication{

	@Bean
	fun provideUsers():List<User>{
		return listOf(User("Brayan",1,12, listOf(1,2,3,4)),
				User("Ana",1,12, listOf(1)),
				User("Joaquin",1,12, listOf(3,4)))
	}
}

fun main(args: Array<String>) {
	runApplication<UserserviceApplication>(*args)
}
