package com.brayan.userservice.resources

import com.brayan.userservice.models.User
import com.netflix.discovery.converters.Auto
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.client.RestTemplate

@RestController
@RequestMapping("/user")
class UserListResource {

    @Autowired
    private lateinit var users:List<User>

    @RequestMapping("/allUser")
    fun allUsers():List<User>{

        return users
    }

    @RequestMapping("/findUser/{userId}")
    fun findUser(@PathVariable("userId") id:Int):User?{
        return users.find { it.id == id }
    }
}