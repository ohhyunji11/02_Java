package com.hw2.model.dto;

public class Smartphone implements ElectronicDevice {

	 private String brand;
	 private String model;

	 public Smartphone(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    @Override
    public void turnOn() {
        System.out.println(brand + " " + model + "를 켭니다.");
    }

    @Override
    public void turnOff() {
        System.out.println(brand + " " + model + "를 끕니다.");
    }

}