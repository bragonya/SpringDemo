package com.brayan.carservice;

import com.brayan.carservice.models.Car;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
@EnableEurekaClient
public class CarServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CarServiceApplication.class, args);
	}


	@Bean
	public List<Car> getListCar()
	{
		return Arrays.asList(
				new Car("Toyota", 2019, 1),
				new Car("Honda", 2017, 2),
				new Car("Isuzu", 2011, 3),
				new Car("Mazda", 2010, 4)
		);
	}
}
