package myCls;

public class myClass {
	
	private int number; // 클래스 내부에서만 접근가능!
	
	public String name; // 어디서든 접근 가능.
	
	protected char c;
	


	// variable 90% -> private
	
	// setter
	public int getNumber() {
		return number;
	}

	
	public void setNumber(int number) {
		this.number = number;   // 멤버변수, 매개변수 구분해주기 위해서 this 붙임.
	}
	
	
	// this -> 자기 참조 / 자기 자신의 주소 (heap)
	// 0번째 매개변수로, 자기자신을 가리키는 주소이다.
	
	public myClass getThis(){
		return this;
	}
	
	public void method() {
		
		number = 12;
		this.number = 14;
		this.setNumber(23);
		
	}
	
	
	

}
