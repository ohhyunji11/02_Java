package com.kh.playList.model.dto;

import java.io.Serializable;
import java.time.LocalDateTime;

// DTO (Data Transfer Object) : (관련된 값의 묶음)값 전달 역할
// == VO (Value Object)

// 스트림 입출력을 위한 직렬화
public class Play implements Serializable{
	
	private String title; // 노래 제목
	private String name; // 그룹 이름
	private boolean complete; // 완료 여부
	private LocalDateTime regDate; // 등록 날짜 java.time 패키지
	// LocalDateTime : 날짜, 시간을 나타내는 클래스
	// LocalDateTime.now() : 현재 시간 반환
	
	public Play() {} 
	
	
	
	
	
	
	
	
}
