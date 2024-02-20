package com.hw2.model.dto;

public class TV implements ElectronicDevice{
	
	private String brand;
    private int size;

    public TV(String brand, int size) {
        this.brand = brand;
        this.size = size;
    }

	@Override
	public void turnOn() {
		System.out.println(brand + " TV를 켭니다.");
		
	}

	@Override
	public void turnOff() {
		 System.out.println(brand + " TV를 끕니다.");
		
	}

}