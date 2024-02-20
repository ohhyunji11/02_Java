package com.hw2.run;

import com.hw2.model.dto.ElectronicDevice;
import com.hw2.model.dto.Smartphone;
import com.hw2.model.dto.TV;

public class Run {
	public static void main(String[] args) {
		// 다양한 종류의 전자제품 객체 생성
        ElectronicDevice[] devices = new ElectronicDevice[2];
        devices[0] = new TV("Samsung", 55);
        devices[1] = new Smartphone("Apple", "iPhone 13");

        // 모든 전자제품 켜기
        for (ElectronicDevice device : devices) {
            device.turnOn();
        }

        // 모든 전자제품 끄기
        for (ElectronicDevice device : devices) {
            device.turnOff();
        }
	}
}