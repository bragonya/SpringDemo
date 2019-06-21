package com.brayan.userservice.models;

public class Car {
    private String brand;
    private int model;
    private int    carId;

    public Car(){

    }
    public Car(String brand, int model, int carId)
    {
        this.brand = brand;
        this.model = model;
        this.carId = carId;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getModel() {
        return model;
    }

    public void setModel(int model) {
        this.model = model;
    }

    public int getCarId() {
        return carId;
    }

    public void setCarId(int carId) {
        this.carId = carId;
    }
}
