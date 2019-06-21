package com.brayan.userservice.models

class User() {

    var name: String? = null
    var id: Int = 0
    var age: Int = 0
    var carId: List<Int> = ArrayList()


    constructor(name: String, id:Int, age:Int, carId:List<Int>):this(){
        this.name = name
        this.id = id
        this.age = age
        this.carId = carId
    }

}
