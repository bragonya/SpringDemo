package com.brayan.userservice.resources

import com.brayan.userservice.models.Car
import com.brayan.userservice.models.User
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.client.RestTemplate
@RestController
@RequestMapping("/carsbyuser")
class CarsByUserResource {

    @Autowired
    private lateinit var restTemplate: RestTemplate

    @Autowired
    private lateinit var users:List<User>
    @RequestMapping("/getCarsOfUsesr/{userId}")
    fun getCarsByUser(@PathVariable("userId") userId:Int):List<Car?>?{

        return users.find { it.id == userId }?.carId?.map {
            restTemplate.getForObject("http://car-service/car/findCar/"+it,Car::class.java)
        }

    }


}