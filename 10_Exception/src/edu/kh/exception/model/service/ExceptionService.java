package edu.kh.exception.model.service;

import java.util.Scanner;
import java.io.IOException;
import java.net.Socket;
import java.util.InputMismatchException;

public class ExceptionService {
	
	// 예외 (Exception) : 소스 코드의 수정으로 해결 가능한 오류
	
	// 예외는 두 종류로 구분됨
	// 1) Unchecked Exception : 선택적으로 예외 처리. (ex.Runtime Exception..)
	// 2) Checked Exception : 필수적으로 예외 처리. (ex.IOException, 나머지..)
	
	private Scanner sc = new Scanner(System.in);
	
	public void ex1() {
		
		System.out.println("두 정수를 입력받아 나누기한 몫을 출력");
		
		System.out.println("정수 1 입력");
		int input1 = sc.nextInt();
		
		System.out.println("정수 2 입력");
		int input2 = sc.nextInt();
		
		
		try {
			System.out.println("결과 : " + input1 / input2);
			// java.lang.ArithmetiException : 산술적 예외(0으로 나눌 수 없다)
			
		} catch(ArithmeticException e) {
			// try 에서 던져진 예외를 catch문의 매개변수 e로 잡음.
			
			System.out.println("infinity"); // 처리코드
			
		}
		
		
		if(input2 !=0) {
			System.out.println("결과 : " + input1/ input2);
		} else {
			System.out.println("infinity");
		}
		
		// 발생하는 예외 중 일부 예외 try-catch 구문 사용 안해도
		// 예외 상황 방지할 수 있다! (if-else 사용)
		// 일부예외 == 대부분 Unchecked Exception
	
	
	
	
	
	}

	
	public void ex2() { 
		// 여러가지 예외에 대한 처리 방법
		try {
		System.out.println("입력 1 :"); // InputMismatchException
		int num1 = sc.nextInt();
		
		System.out.println("입력 2"); // InputMismatchException
		int num2 = sc.nextInt();
		
		System.out.println("결과 : " + num1 / num2); // ArithmeticException
	
		
		String str = null;
		
		System.out.println(str.charAt(0) ); // NullPointerException
	 
		} catch(InputMismatchException e) {
			System.out.println("타입에 맞는 값만 넣어주세요");
			
		} catch(ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다");
			
		} catch(Exception e) {
			// Exception 클래스 : 모든 예외의 최상위 부모
			// 다형성 - 업캐스팅 : 부모타입 참조변수로 자식개체 참조
			
			// ** 상위 타입의 예외 클래스를 catch문에 작성하면
			// 다형성 업캐스팅에 의해 모두 잡아서 처리 가능!! **
		
			System.out.println("뭔지 모르겠으나 예외가 발생해서 처리함..");
			e.printStackTrace(); 
			// 발생한 예외에 대한 메서드와 모든 내용을 출력
			// 예외 발생 지점 추적
			
			
		}
		
		
			
	}



	public void ex3() {
		
		// try - catch finally
		// finally : try 구문에서 예외가 발생 하든 말든 무조건 마지막에 수행
		
	try {System.out.println("입력 1 :"); // InputMismatchException
	int num1 = sc.nextInt();
	
	System.out.println("입력 2"); // InputMismatchException
	int num2 = sc.nextInt();
	
	System.out.println("결과 : " + num1 / num2); // ArithmeticException

		
	
	} catch(ArithmeticException e) {
		System.out.println("예외 처리 됨");
		
		// catch문 매개변수 활용
		// 매개변수 e : 예외 관련된 정보 + 예외 관련 기능
		
        System.out.println(e.getClass()); // 어떤 예외 클래스인가?
	   // class java.lang.Arithmeticexception
        
        System.out.println(e.getMessage()); // 예외 발생시 출력된 내용
        //  by zero
        
        System.out.println(e); // e.toString()
        // java.lang.Arithmeticexception // by zero
	
	
	
	} finally {
		
		System.out.println("무조건 수행 됨");
		sc.close(); // 스캐너 통로 닫기 : 메모리 누수 방지
	}
		
		
		
		
  }


	public void ex4() {
		
		
		// throws : 호출한 메서드에게 예외를 던짐
		//			-> 호출한 메서드에게 예외를 처리하라고 위임하는 행위
		
		
		
		
		
		// throw : 예외 강제 발생 구문
		try {
			
		} methodA(); {
		
	} catch(Exception e) {
		// Exception : 모든 예외의 최상위부모
		// == 예외 종류 상관없이 모두 처리
		
	
	System.out.println("methodC 에서부터 발생한 예외를 ex4에서 잡아 처리함");
	
	
	}


	
	public void methodA()  throws IOException {
		methodB();
	}
	
	public void methodB()  throws IOException{
		methodC();
	}
	
	public void methodC()  throws IOException{
		// 예외 강제 발생
	   /*
	     try {	   
	    
	     throw new IOException();
	     
	   }  catch(IOException e) {
		   e.printStackTrack();
		 */  
	
		
		
		
		
		
	   
	}
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
}



















