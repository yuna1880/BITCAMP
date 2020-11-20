package main;

import cls.AbstractClass;
import cls.NormalClass;

public class mainClass {

	public static void main(String[] args) {
		
		
		/*
		
		abstract : 추상
				      완전체는 아닌 선언만 되어있는 메소드를 포함하고 있는 클래스.
				      
				      추상메소드 + 일반메소드 + 변수 = 추상클래스. (추상클래스가 하나라도 속해있으면 추상.)
		
				      생성은 불가능하다. 상속 후 추상메소드 작성한 후에 생성이 가능.
				   instance로 생성은 가능하다.
				   abstract를 클래스, 메소드 앞에 붙인다.
				   
				   abstract class{
				   
				   void method(){
				   
				   }
				   
				   abstract void func();
				   
				   
				   }
				   //비어있는 메소드...?
		*/

		
		
		//AbstractClass acls = new AbstractClass();
		
		
		NormalClass nc = new NormalClass();
		
		nc.method();
		
		nc.abstractMethod();
		
		
		//부모 -> 자식
		//인스턴스 용으로만 사용 가능하다.
		AbstractClass ac = new NormalClass();
		ac.method();
		ac.abstractMethod();
		
		
		
		//그때그때 정의내려서 생성하도록 가능하다.
		AbstractClass ac1 = new AbstractClass() {
			
			@Override
			public void abstractMethod() {
				System.out.println("AbstractClass abstractMethod()");
				
			}
		};
		
		ac1.abstractMethod();
		ac.method();
		
		
	}

}
