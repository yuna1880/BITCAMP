package main;

import cls.myClass;

public class mainClass {

	public static void main(String[] args) {
		
		/*

		Constructor : 생성자
					    메소드
					  return 값이 없다.
					  overLoad (같은 이름의 메소드/ 매개변수로 구분)이 가능하다.
					    클래스명과 같은 이름이다.
					    자동 호출된다. (callback) -  자동적으로 호출되는 함수.
					    클래스 생성시에 호출된다.
					    생략이 가능하다.
					    
					  (궁극적인 목적 - 초기화)
	
	
		Destructor : 소멸자 
					  반드시 한개
					 java에는 없음.
					    
		*/
		
		
		
		int array[] = { 1, 2, 3 }; //초기화
		
		/*
		Student stu = new Student();
		stu.setName("홍길동");
		stu.setNumber(123);
		*/
		
		
		myClass cls = new myClass();
		
		cls.setNumber(1001);
		cls.setName("홍길동");
		
		myClass cls1 = new myClass(12);
		
		myClass cls2 = new myClass(13,"낭낭");
		
		
		// final 
		
		final int num = 12; // 변수 -> 상수
		
		//num = 24; //(변수 -> 상수로 바뀌어서 변경 불가!!!!)
		
		int n;
		n = num; // (대입용으로만 쓸 수 있다.)
		
		
		
		
	}

}
