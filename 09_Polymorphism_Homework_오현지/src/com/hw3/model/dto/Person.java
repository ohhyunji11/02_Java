package com.hw3.model.dto;

public abstract class Person { // 추상클래스
	
	protected String id; // 고유번호
    protected String name; // 이름

    public Person(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public abstract String getInfo(); // Person 정보를 문자열로 리턴

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

    
}