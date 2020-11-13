package main;

public class mainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 
		 Object Oriented Programming 객체 지향
		 
		 
		 절차지향
		 
		 
		 선언(변수, 배열) 50000 line 넘어가면... 한계 <- 분산처리하자.
		 										1. 분산 -> 함수
		 										2. 변수 -> number
		 										3. 크기 -> 한계
		 1. 초기화
		 2. 랜덤
		 	1)
		 	2)
		 	
		 3. 입력
		 	1)
		 	2)
		 4. 처리
		 5. 결과
		 
		 //학생 성적 관리
		 int student[?][4]={ 
		 
		 }
		 
		 student
		 	name
		 	lang
		 	math
		 	eng
		 
		 클래스 정의
		 class 클래스명 {
		 	변수들
		 	
		 	함수들(메소드들)
		 }
		 	  stack		heap
		 클래스명 변수 = new 클래스명();
		 	  (instance) == 주체
		 	   object == 객체
		 	  
		
		 */
	
		
		MyClass cls = new MyClass();//(생성)
		System.out.println(cls);
		
		cls.c = 'A';
		cls.n = 123;
		cls.str = "hello";
		
		
		MyClass cls2 = new MyClass();
		
		cls2.c = 'B';
		cls2.n = 234;
		cls.str = "world";
		
		
		// TV -> 2대
		String name[] = new String[2];
		int channel[] =  new int[2];
		boolean power[] = new boolean[2];
		
		name[0] = "sam";
		name[1] = "lg";
		channel[0] = 11;
		channel[1] = 24;
		power[0] = true;
		power[1] = false;
		
		System.out.println("메이커:" +name[0]+" "+channel[0]+" "+power[0]);
		System.out.println("메이커:" +name[1]+" "+channel[1]+" "+power[1]);
		
		TV tv1, tv2;
		tv1 = new TV();
		tv2 = new TV();
		
		tv1.name = "LG";
		tv1.channel = 11;
		tv1.power = true;
		tv1.print();
		
		tv2.name = "samsung";
		tv2.channel =23;
		tv2.power = true;
		tv2.print();
		
	}///////////////////////////////////////////
	
	
}

class MyClass{
	
	char c;
	int n;
	String str;
	
	
}

class TV{ //member 변수
	
	String name;
	int channel;
	boolean power;
	
	void print() {
		System.out.println("메이커"+ name + " " + channel + " " + power);
	}
	
}


