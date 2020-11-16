package main;

import myCls.myClass;

public class mainClass {

	public static void main(String[] args) {
		
		
		/*
		
			Object oriented programming
			
			(절차지향)			  (객체지향)(분산처리)
			
			초기화 (변수 선언)
								 (처리에 따라서 변수 처리)
			처리1				   처리1, 처리2, 처리3
			처리2
			처리3
								class - [ 변수, 함수 (메소드) ]
			결과
			
			
			1. 은닉성 (클래스의 캡슐화)
			
			: !! 외부와의 접근 차단으로 변수를 관리할 수 있다.!!
			
			class의 내부에서 접근을 제어하도록 접근지정자로 지정한다.
			
			private(개인적인) -> 멤버변수
			
			public (대중적인) -> 멤버메소드
			(외부에서 접근해줘야 한다)
			protected (특정) -> 상속에 관련되어 있는 지정자
			
			
			2. 상속성
			
			3. 다형성
		
		
		*/
		
		myClass cls = new myClass();
		
		cls.name = "홍길동";
	
		cls.setNumber(12);
		int n = cls.getNumber();
		
		System.out.println("int n  = " + n);
		
		System.out.println("cls heap 주소 :" + cls);
		System.out.println(cls.getThis());
		
		
		
		
		
		
		

	}
	
	
	
	
	
	
	
	
	
	
	

}
