package com.brayan.carservice.resources;


import com.brayan.carservice.models.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/car")
public class CarListResource {


    @Autowired
    private List<Car> cars;
    @RequestMapping("/allCar")
    public List<Car> getListCar() {
        return  cars;
    }

    @RequestMapping("/findCar/{carId}")
    public Car getCarService(@PathVariable int carId)
    {
        return cars.stream().filter(item -> item.getCarId()==carId).findFirst().get();
    }
}