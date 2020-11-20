package main;

import write.Writer;

public class myClass {

	
	Writer w; //추상클래스 불러오기.
	
	
	// 생성자를 사용해서 무엇을 사용할지 지정.
	public myClass(Writer w) {
		
		this.w = w;
		
	}
	
	
	
	public void method() {
		
		w.write();
		w.erase();
		
	}
	
	
	
	
}
